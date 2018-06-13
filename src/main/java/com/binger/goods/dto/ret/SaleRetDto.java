package com.binger.goods.dto.ret;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: yb
 * Date: 2018/6/13
 * Time: 11:14
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class SaleRetDto {

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

    private BigDecimal averageSale;
}