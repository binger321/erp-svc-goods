package com.binger.goods.controller;

import com.binger.common.Const;
import com.binger.common.ServerResponse;
import com.binger.goods.service.BillCodeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/16
 * Time: 下午3:27
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Api(value = "单据编号生成器", description = "商品品牌接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "编号生成API")
@RequestMapping(value = "/erp-svc-goods/billCode")
public class BillCodeBuilderController {
    @Autowired
    private BillCodeService billCodeService;

    @ApiOperation(value = "生产单据编号")
    @RequestMapping(value = "/generateBill", method = RequestMethod.POST)
    public ServerResponse<String> generateBill(@RequestBody String billType) {
        String billCode = billCodeService.generateBill(billType);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, billCode);
    }
}
