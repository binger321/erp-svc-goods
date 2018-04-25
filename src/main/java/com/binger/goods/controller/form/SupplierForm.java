package com.binger.goods.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/4/24
 * Time: 下午3:57
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel(value = "供应商form")
@Data
public class SupplierForm {

    /**
     * ID
     */
    @ApiModelProperty(value="ID",required = true)
    private Integer id;

    /**
     * 供应商代码
     */
    @ApiModelProperty(value="供应商代码",required = true)
    private String supplierCode;

    /**
     * 供应商名称
     */
    @ApiModelProperty(value="供应商名称",required = true)
    private String supplierName;

    /**
     * 供应商简称
     */
    @ApiModelProperty(value="供应商简称",required = false)
    private String supplierShortName;

    /**
     * 供应商分类
     */
    @ApiModelProperty(value="供应商分类",required = false)
    private String supplierCategory;

    /**
     * 联系人
     */
    @ApiModelProperty(value="联系人",required = false)
    private String contact;

    /**
     * 超收比例(%)
     */
    @ApiModelProperty(value="超收比例(%)",required = false)
    private BigDecimal overchargeRate;

    /**
     * 联系电话
     */
    @ApiModelProperty(value="联系电话",required = false)
    private String phoneNumber;

    /**
     * 国家ID
     */
    @ApiModelProperty(value="国家ID",required = false)
    private Integer countryId;

    /**
     * 国家
     */
    @ApiModelProperty(value="国家",required = false)
    private String country;

    /**
     * 省份ID
     */
    @ApiModelProperty(value="省份ID",required = false)
    private Integer stateId;

    /**
     * 省份
     */
    @ApiModelProperty(value="省份",required = false)
    private String state;

    /**
     * 城市ID
     */
    @ApiModelProperty(value="城市ID",required = false)
    private Integer cityId;

    /**
     * 城市
     */
    @ApiModelProperty(value="城市",required = false)
    private String city;

    /**
     * 地址
     */
    @ApiModelProperty(value="地址",required = false)
    private String address;

    /**
     * 邮编
     */
    @ApiModelProperty(value="邮编",required = false)
    private String zip;

    /**
     * 银行类别
     */
    @ApiModelProperty(value="银行类别",required = false)
    private String bankCategory;

    /**
     * 开户银行
     */
    @ApiModelProperty(value="开户银行",required = false)
    private String bank;

    /**
     * 银行账号
     */
    @ApiModelProperty(value="银行账号",required = false)
    private String bankAccount;

    /**
     * 税号/身份证号
     */
    @ApiModelProperty(value="税号/身份证号",required = false)
    private String taxNumber;

    /**
     * 信用额度
     */
    @ApiModelProperty(value="信用额度",required = false)
    private String credit;

    /**
     * 是否黑名单
     */
    @ApiModelProperty(value="是否黑名单",required = false)
    private Boolean isBlackList;

    /**
     * 结算id
     */
    @ApiModelProperty(value="结算id",required = false)
    private Integer settlementId;

    /**
     * 状态（启用、停用）
     */
    @ApiModelProperty(value="状态（启用、停用）",required = false)
    private Boolean status;
}
