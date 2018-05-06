package com.binger.goods.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel("用户form")
@Data
public class UserForm {
    /**
     * 用户代码
     */
    @ApiModelProperty(value="用户代码",required = true)
    private String userCode;

    /**
     * 用户名称
     */
    @ApiModelProperty(value="用户名称",required = true)
    private String userName;

    /**
     * 用户密码
     */
    @ApiModelProperty(value="用户密码",required = true)
    private String userPassword;

    /**
     * 密码错误累计次数(解锁前)
     */
    @ApiModelProperty(value="密码错误累计次数(解锁前)",required = false)
    private Integer pwdTryTimes;

    /**
     * 人员表id
     */
    @ApiModelProperty(value="人员表id",required = false)
    private Integer personId;

    /**
     * 0禁用, 1启用, 2锁定
     */
    @ApiModelProperty(value="0禁用, 1启用, 2锁定",required = true)
    private Integer status;

    /**
     * 停用时间
     */
    @ApiModelProperty(value="停用时间",required = false)
    private Date blockTime;

    /**
     * 创建人
     */
    @ApiModelProperty(value="创建人",required = false)
    private String creator;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间",required = false)
    private Date createTime;

    /**
     * 修改人
     */
    @ApiModelProperty(value="修改人",required = false)
    private String modifier;

    /**
     * 修改时间
     */
    @ApiModelProperty(value="修改时间",required = false)
    private Date modifyTime;
}
