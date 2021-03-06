package com.binger.goods.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("用户form")
@Data
public class UserForm {
    /**
     * 用户代码
     */
    @ApiModelProperty(value="用户代码",required = false)
    private String userCode;

    /**
     * 用户名称
     */
    @ApiModelProperty(value="用户名称",required = false)
    private String userName;

    /**
     * 用户密码
     */
    @ApiModelProperty(value="用户密码",required = true)
    private String userPassword;

    /**
     * 人员表id
     */
    @ApiModelProperty(value="人员表id",required = false)
    private Integer personId;

    /**
     * 0禁用, 1启用, 2锁定
     */
    @ApiModelProperty(value="0禁用, 1启用, 2锁定",required = false)
    private Integer status;

}
