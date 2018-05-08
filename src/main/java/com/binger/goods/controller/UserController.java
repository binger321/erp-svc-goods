package com.binger.goods.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.goods.controller.form.UserForm;
import com.binger.goods.controller.query.UserQuery;
import com.binger.goods.domain.User;
import com.binger.goods.domain.UserExample;
import com.binger.goods.service.UserService;
import com.binger.goods.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(value = "用户管理", description = "用户管理", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController("user")
@RequestMapping(value = "erp-svc-goods/user")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "用户列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ServerResponse<List<UserVo>> list(@RequestBody(required = false) UserQuery userQuery,
                                             @RequestParam(value = "pageNo", required = false) Integer pageNo,
                                             @RequestParam(value = "pageSize", required = false) Integer pageSize){
        UserExample userExample =new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();

        if(null != userQuery) {
            if (null != userQuery.getId()) {
                criteria.andIdEqualTo(userQuery.getId());
            }
            if (StringUtils.isNotBlank(userQuery.getUserCode())) {
                criteria.andUserCodeLike(userQuery.getUserCode());
            }
            if (StringUtils.isNotBlank(userQuery.getUserName())) {
                criteria.andUserNameLike(userQuery.getUserName());
            }
        }

        if (pageNo != null) {
            long total = userService.count(userExample);
            Page page = new Page(pageNo, pageSize, total);
            userExample.setOffset(page.getOffset());
            userExample.setLimit(page.getPageSize());
            List<UserVo> userVoList = userService.listByExample(userExample);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, userVoList);
        }else {
            List<UserVo> userVoList = userService.listByExample(userExample);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, userVoList);
        }
    }

    @ApiOperation(value = "根据ID查找用户信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ServerResponse<UserVo> findById(@PathVariable Integer id){
        UserVo userVo = userService.findById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, userVo);
    }

    @ApiOperation(value = "根据ID更新用户数据")
    @RequestMapping(value = "update/{id}",method = RequestMethod.POST)
    public ServerResponse<UserVo> update(@PathVariable Integer id,
                                         @RequestBody UserForm userForm){
        User user = DozerUtils.convert(userForm,User.class);
        UserVo userVo = userService.updateById(user,id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG,userVo);
    }


    @ApiOperation(value = "增加人员")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ServerResponse<UserVo> add(@RequestBody UserForm userForm){
        User user = DozerUtils.convert(userForm,User.class);
        if (StringUtils.isBlank(user.getUserName())) {
            return ServerResponse.createByError("用户名不能为空");
        }
        if (StringUtils.isBlank(user.getUserCode())) {
            return ServerResponse.createByError("用户编号不能为空");
        }
        if (user.getPersonId() == null) {
            return ServerResponse.createByError("人员不能为空");
        }
        UserVo userVo = userService.add(user);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, userVo);
    }

    @ApiOperation(value = "根据ID删除人员")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ServerResponse<Integer> delete(@PathVariable Integer id){
        Integer result = userService.deleteById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG,result);
    }
}
