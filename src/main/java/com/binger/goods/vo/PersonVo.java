package com.binger.goods.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("人员VO")
public class PersonVo {
    /**
     * ID
     */
    @ApiModelProperty(value="ID",required = true)
    private Integer id;

    /**
     * 工号
     */
    @ApiModelProperty(value="工号",required = false)
    private String personCode;

    /**
     * 姓名
     */
    @ApiModelProperty(value="姓名",required = true)
    private String personName;

    /**
     * 证件类型
     */
    @ApiModelProperty(value="证件类型",required = true)
    private String idType;

    /**
     * 证件号码
     */
    @ApiModelProperty(value="证件号码",required = true)
    private String idCardNo;

    /**
     * 性别,0女,1男
     */
    @ApiModelProperty(value="性别,0女,1男",required = false)
    private Boolean sex;

    /**
     * 联系电话
     */
    @ApiModelProperty(value="联系电话",required = false)
    private String phone;

    /**
     * 人员类型(常量字典编码)
     */
    @ApiModelProperty(value="人员类型(常量字典编码)",required = true)
    private String category;

    /**
     * 0离职, 1在职
     */
    @ApiModelProperty(value="0离职, 1在职",required = false)
    private Integer status;

    /**
     * 离职时间
     */
    @ApiModelProperty(value="离职时间",required = false)
    private Date blockTime;

    /**
     * 入职时间
     */
    @ApiModelProperty(value="入职时间",required = false)
    private Date entryTime;

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
