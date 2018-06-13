package com.binger.goods.vo;

import com.xuxueli.poi.excel.annotation.ExcelField;
import com.xuxueli.poi.excel.annotation.ExcelSheet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.poi.hssf.util.HSSFColor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/17
 * Time: 下午2:34
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ExcelSheet(name = "订单详情", headColor = HSSFColor.HSSFColorPredefined.LIGHT_GREEN)
public class SaleOrderDetailExcelVo {
    /**
     * 订单详细ID
     */
 @ExcelField(name="订单详细ID"  )
    private Integer id;

    /**
     * 订单销售编码
     */
 @ExcelField(name="订单销售编码"   )
    private String orderSaleCode;

    /**
     * 订单详细信息编码
     */
 @ExcelField(name="订单详细信息编码"   )
    private String ordersSaleDetailCode;


    /**
     * 商品ID
     */
 @ExcelField(name="商品ID"   )
    private Integer goodsId;

    /**
     * 商品编号
     */
 @ExcelField( name = "商品编号")
    private String goodsCode;

    /**
     * sku id
     */
 @ExcelField(name="sku id"   )
    private Integer skuId;

    /**
     * sku code
     */
 @ExcelField( name = "skuCode")
    private String skuCode;

    /**
     * 颜色编码
     */
 @ExcelField( name = "颜色编码")
    private String colorCode;

    /**
     * 颜色
     */
 @ExcelField( name = "颜色")
    private String colorName;


    /**
     * 尺寸编码
     */
 @ExcelField( name = "尺寸编码")
    private String sizeCode;

    /**
     * 尺寸编码
     */
 @ExcelField( name = "尺寸")
    private String sizeName;

    /**
     * 数量
     */
 @ExcelField(name="数量"   )
    private Integer quantity;

    /**
     *
     */
 @ExcelField(name=""   )
    private BigDecimal weight;

    /**
     * 本币单价
     */
 @ExcelField(name="本币单价"   )
    private BigDecimal localPrice;

    /**
     * 本币金额
     */
 @ExcelField(name="本币金额"   )
    private BigDecimal localAmount;


    /**
     * 备注
     */
 @ExcelField(name="备注"   )
    private String remark;

    /**
     * 成本价
     */
 @ExcelField(name="成本价"   )
    private BigDecimal costPrice;


    /**
     * 1可用，0删除
     */
 @ExcelField(name="1可用，0删除"   )
    private Boolean status;

    /**
     * 创建时间
     */
 @ExcelField(name="创建时间"   )
    private Date insertTime;

    /**
     * 修改时间
     */
 @ExcelField(name="修改时间"   )
    private Date updateTime;

}
