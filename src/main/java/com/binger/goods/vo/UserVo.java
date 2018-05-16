package com.binger.goods.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(value = "用户VO")
@Data
public class UserVo {
    /**
     * ID
     */
    @ApiModelProperty(value="ID",required = true)
    private Integer id;

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
     * 人员表id
     */
    @ApiModelProperty(value="人员表id",required = false)
    private Integer personId;

    /**
     * 人员名称
     */
    @ApiModelProperty(value = "人员名称", required = false)
    private String personName;

    /**
     * 0禁用, 1启用, 2锁定
     */
    @ApiModelProperty(value="0禁用, 1启用, 2锁定",required = true)
    private Integer status;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间",required = false)
    private Date createTime;

}
