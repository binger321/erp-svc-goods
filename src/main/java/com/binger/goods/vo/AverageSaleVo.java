package com.binger.goods.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2018/6/13
 * Time: 10:57
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel("平均销量")
@Data
public class AverageSaleVo {

    /**
     * sku
     */
    @ApiModelProperty(value="sku",required = false)
    private Integer skuId;

    /**
     * sku编码
     */
    @ApiModelProperty(value="sku编码",required = false)
    private String skuCode;

    /**
     * sku名称
     */
    @ApiModelProperty(value="sku名称",required = false)
    private String skuName;

    /**
     * 货号id
     */
    @ApiModelProperty(value="货号id",required = false)
    private Integer goodsId;

    /**
     * 货号
     */
    @ApiModelProperty(value="货号",required = false)
    private String goodsCode;

    /**
     * 货号名称
     */
    @ApiModelProperty(value="货号名称",required = false)
    private String goodsName;

    /**
     * 颜色ID
     */
    @ApiModelProperty(value="颜色ID",required = false)
    private Integer colorId;

    /**
     * 颜色编码
     */
    @ApiModelProperty(value="颜色编码",required = false)
    private String colorCode;

    /**
     * 颜色名称
     */
    @ApiModelProperty(value="颜色名称",required = false)
    private String colorName;

    /**
     * 尺寸编码ID
     */
    @ApiModelProperty(value="尺寸编码ID",required = false)
    private Integer sizeId;

    /**
     * 尺寸编码
     */
    @ApiModelProperty(value="尺寸编码",required = false)
    private String sizeCode;

    /**
     * 尺寸名称
     */
    @ApiModelProperty(value="尺寸名称",required = false)
    private String sizeName;


    /**
     * 七天平均销量
     */
    private BigDecimal sevenDaysSale;

    /**
     * 三天平均销量
     */
    private BigDecimal threeDaysSale;
}