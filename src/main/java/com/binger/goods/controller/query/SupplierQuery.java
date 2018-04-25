package com.binger.goods.controller.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/4/24
 * Time: 下午3:20
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel("供应商列表query")
@Data
public class SupplierQuery {

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
     * 供应商分类（暂时不显示）
     */
    @ApiModelProperty(value="供应商分类",required = false)
    private String supplierCategory;

    /**
     * 联系人
     */
    @ApiModelProperty(value="联系人",required = false)
    private String contact;

    /**
     * 国家
     */
    @ApiModelProperty(value="国家",required = false)
    private String country;

    /**
     * 省份
     */
    @ApiModelProperty(value="省份",required = false)
    private String state;
}
