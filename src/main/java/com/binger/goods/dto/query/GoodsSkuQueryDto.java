package com.binger.goods.dto.query;

import com.binger.common.QueryDtoBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/10
 * Time: 上午9:12
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("商品SkuQuery")
public class GoodsSkuQueryDto extends QueryDtoBase{
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
