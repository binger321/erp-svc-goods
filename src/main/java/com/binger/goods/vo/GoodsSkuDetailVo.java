package com.binger.goods.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 16:24
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("SkuCode")
public class GoodsSkuDetailVo {
    /**
     * ID
     */
    @ApiModelProperty(value="ID")
    private Integer id;

    /**
     * 商品ID
     */
    @ApiModelProperty(value="商品ID")
    private Integer goodsId;

    /**
     * 商品编号
     */
    @ApiModelProperty(value = "商品编号")
    private String goodsCode;

    /**
     *
     */
    @ApiModelProperty(value="SKU编号")
    private String skuCode;

    /**
     * SKU名称
     */
    @ApiModelProperty(value="SKU名称")
    private String skuName;

    /**
     * 商品图片ID
     */
    @ApiModelProperty(value="商品图片ID")
    private Integer imgId;

    /**
     * 颜色ID
     */
    @ApiModelProperty(value="颜色ID")
    private Integer colorId;

    /**
     * 颜色编码
     */
    @ApiModelProperty(value = "颜色编号")
    private String colorCode;

    /**
     * 颜色
     */
    @ApiModelProperty(value = "颜色")
    private String colorName;
    /**
     * 尺寸ID
     */
    @ApiModelProperty(value="尺寸ID")
    private Integer sizeId;

    /**
     * 尺码编码
     */
    @ApiModelProperty(value="尺码编码")
    private String sizeCode;

    /**
     * 尺寸
     */
    @ApiModelProperty(value = "尺寸")
    private String sizeName;

    /**
     *
     */
    @ApiModelProperty(value="重量")
    private BigDecimal weight;

    /**
     * 警戒库存数
     */
    @ApiModelProperty(value="警戒库存数")
    private Integer stockAlarmNum;

    /**
     * 是否生产款(100采购款，200生产款，300部分采购，部分生产)
     */
    @ApiModelProperty(value="是否生产款(100采购款，200生产款，300部分采购，部分生产)")
    private Integer isProduction;

    /**
     * 成本价
     */
    @ApiModelProperty(value="成本价")
    private BigDecimal costPrice;

    /**
     * 0禁用, 1启用
     */
    @ApiModelProperty(value="0禁用, 1启用")
    private Boolean status;

    /**
     * 备注
     */
    @ApiModelProperty(value="备注")
    private String comments;

}