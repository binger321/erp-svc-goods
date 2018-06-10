package com.binger.goods.controller;

import com.binger.common.Const;
import com.binger.common.ServerResponse;
import com.binger.common.security.AbstractBaseController;
import com.binger.common.security.CompositePrincipal;
import com.binger.common.security.MySecurityContextHolder;
import com.binger.common.util.MyEasyJsonUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;
import org.springframework.security.oauth2.provider.token.store.LocalTokenServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.security.KeyPair;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/8
 * Time: 上午11:23
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@Api(value = "common", description = "授权API", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/auth")
public class LoginController extends AbstractBaseController {

    @Autowired
    private LoadBalancerClient loadBalancer;

    @Value("${security.oauth2.client.access-token-uri}")
    private String url;

    static LocalTokenServices tokenServices = new LocalTokenServices();
    static {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        KeyPair keyPair = new KeyStoreKeyFactory(new ClassPathResource("keystore.jks"), "foobar".toCharArray())
                .getKeyPair("test");
        converter.setKeyPair(keyPair);
        tokenServices.setJwtTokenEnhancer(converter);
    }



    @ApiOperation("登录获取token")
    @RequestMapping(value = "/login", method= RequestMethod.POST)
    public ServerResponse<String> doLogin(@RequestParam String userName, @RequestParam String password){
        if(StringUtils.isBlank(userName)||StringUtils.isBlank(password)){
            return ServerResponse.createByError("用户名,密码不能为空");
        }

        final RestTemplate restTemplate = new RestTemplate();
        final String plainCreds = "erp-cloud:erp-cloud";
        final byte[] plainCredsBytes = plainCreds.getBytes();
        final byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
        final String base64Creds = new String(base64CredsBytes);
        final HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic " + base64Creds);
        final HttpEntity<String> request = new HttpEntity<String>(headers);

        ServiceInstance instance = loadBalancer.choose("erp-svc-uaa");
//        String accessTokenUri = String.format("http://%s:%s/oauth/token", instance.getHost(), instance.getPort());
        String accessTokenUri = url;
        String authUrl = accessTokenUri+"?grant_type=password&client_id=erp-cloud&client_secret=erp-cloud&username="+userName+"&password="+password;
        try {
            final ResponseEntity<String> response = restTemplate.exchange(authUrl, HttpMethod.POST, request, String.class);
            Map resMap = MyEasyJsonUtil.string2json(response.getBody(), Map.class);
            String token = (String)resMap.get("access_token");
            //加入登录线程
            setLoginAuthToCurrentThread(token);
            return ServerResponse.createBySuccess("登录成功", token);
        }catch (Exception ex){
            if(ex instanceof HttpClientErrorException){
                HttpClientErrorException hex = (HttpClientErrorException) ex;
                if(hex.getStatusCode().equals(HttpStatus.BAD_REQUEST)) { // 400 密码错误
                    String errorMsgJson = hex.getResponseBodyAsString();
                    Map resMap = MyEasyJsonUtil.string2json(errorMsgJson, Map.class);
                    return ServerResponse.createByError((String)resMap.get("error_description"));
                }
                if(hex.getStatusCode().equals(HttpStatus.UNAUTHORIZED)) { // 401 用户不存在,禁用,锁定
                    String headerStr = hex.getResponseHeaders().get("WWW-Authenticate").get(0);
                    Pattern p = Pattern.compile("error_description=\"(.*?)\"");
                    Matcher m = p.matcher(headerStr);
                    while (m.find()) {
                        String decodeErrMsg = new String(Base64.decodeBase64(m.group(1)));
                        return ServerResponse.createByError(decodeErrMsg);
                    }

                }
            }
            return ServerResponse.createByError("授权服务, 暂不可用");
        }
    }

    private void setLoginAuthToCurrentThread(String token){
        Authentication authentication =  tokenServices.loadAuthentication(token);
        if(authentication instanceof OAuth2Authentication) {
            //设置授权对象
            SecurityContextHolder.getContext().setAuthentication(authentication);
            OAuth2Authentication oAuth2Authentication = (OAuth2Authentication)authentication;
            for(GrantedAuthority grantedAuthority : oAuth2Authentication.getUserAuthentication().getAuthorities()){
                if(grantedAuthority.getAuthority().startsWith("ErpPrincipal")){
                    int idx = grantedAuthority.getAuthority().indexOf(':');
                    String compositePrincipalJson = new String(Base64.decodeBase64(grantedAuthority.getAuthority().substring(idx+1)));
                    CompositePrincipal compositePrincipal = MyEasyJsonUtil.string2json(compositePrincipalJson, CompositePrincipal.class);
                    MySecurityContextHolder.setCompositePrincipal(compositePrincipal);
                    MySecurityContextHolder.setOauth2Authentication(oAuth2Authentication);
                    MySecurityContextHolder.setOauth2AccessToken(tokenServices.readAccessToken(token));
                }
            }
        }
    }

    @ApiOperation("获取当前用户授权信息")
    @RequestMapping(value = "/info", method= RequestMethod.POST)
    public ServerResponse<CompositePrincipal> getAuthInfo(){
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, getPrincipal());
    }
}
