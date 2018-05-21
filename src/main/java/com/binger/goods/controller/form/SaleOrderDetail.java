package com.binger.goods.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/16
 * Time: 下午2:30
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("订单子表")
public class SaleOrderDetail {
    /**
     * 订单详细ID
     */
    @ApiModelProperty(value="订单详细ID",required = true)
    private Integer id;

    /**
     * 订单销售id
     */
    @ApiModelProperty(value="订单销售id",required = true)
    private Integer orderSaleId;

    /**
     * 订单销售编码
     */
    @ApiModelProperty(value="订单销售编码",required = false)
    private String orderSaleCode;

    /**
     * 订单详细信息编码
     */
    @ApiModelProperty(value="订单详细信息编码",required = false)
    private String ordersSaleDetailCode;

    /**
     * 卖家SKU
     */
    @ApiModelProperty(value="卖家SKU",required = false)
    private String sellerSku;

    /**
     * 商品ID
     */
    @ApiModelProperty(value="商品ID",required = false)
    private Integer goodsId;

    /**
     * sku id
     */
    @ApiModelProperty(value="sku id",required = false)
    private Integer skuId;

    /**
     * SKU图片ID
     */
    @ApiModelProperty(value="SKU图片ID",required = false)
    private Integer goodsImgId;

    /**
     * 数量
     */
    @ApiModelProperty(value="数量",required = false)
    private Integer quantity;

    /**
     *
     */
    @ApiModelProperty(value="",required = false)
    private BigDecimal weight;

    /**
     * 本币单价
     */
    @ApiModelProperty(value="本币单价",required = false)
    private BigDecimal localPrice;

    /**
     * 本币金额
     */
    @ApiModelProperty(value="本币金额",required = false)
    private BigDecimal localAmount;

    /**
     * 手续费
     */
    @ApiModelProperty(value="手续费",required = false)
    private BigDecimal expense;

    /**
     *
     */
    @ApiModelProperty(value="",required = false)
    private Boolean isGift;

    /**
     * 备注
     */
    @ApiModelProperty(value="备注",required = false)
    private String remark;

    /**
     * 成本价
     */
    @ApiModelProperty(value="成本价",required = false)
    private BigDecimal costPrice;


}
