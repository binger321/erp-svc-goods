package com.binger.goods.controller.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 17:12
 * To change this template use File | Settings | File Templates.
 * description:商品Sku2
 */
@Data
@ApiModel(value = "商品SkuQuery", description = "商品Sku")
public class GoodsSkuQuery {
    /**
     * 商品code
     */
    @ApiModelProperty(value="商品Code",required = false)
    private String goodsCode;

    /**
     * sku编码
     */
    @ApiModelProperty(value="SKU编码",required = false)
    private String skuCode;

    /**
     * 颜色code
     */
    @ApiModelProperty(value = "颜色code", required = false)
    private String colorCode;

    /**
     * 尺寸Code
     */
    @ApiModelProperty(value = "尺寸code", required = false)
    private String sizeCode;
}