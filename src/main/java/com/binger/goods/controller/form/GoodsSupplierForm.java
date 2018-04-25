package com.binger.goods.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 17:24
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("供应商Form")
public class GoodsSupplierForm {

    /**
     * 商品ID
     */
    @ApiModelProperty(value="商品ID",required = true)
    private Integer goodsId;

    /**
     * 供应商ID
     */
    @ApiModelProperty(value="供应商ID",required = true)
    private Integer supplierId;

    /**
     *
     */
    @ApiModelProperty(value="进价",required = false)
    private BigDecimal importPrice;


    /**
     * 供应商货号
     */
    @ApiModelProperty(value="供应商货号",required = false)
    private String supplierGoodsCode;

    /**
     * 是否同款
     */
    @ApiModelProperty(value="是否同款",required = false)
    private Boolean isSame;


}