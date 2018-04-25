package com.binger.goods.dto.ret;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/4/25
 * Time: 下午3:02
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class SupplierSimpleRetDto {


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
     * 进货价
     */
    @ApiModelProperty(value="进货价",required = false)
    private BigDecimal importPrice;

    /**
     * 联系人
     */
    @ApiModelProperty(value="联系人",required = false)
    private String contact;

    /**
     * 联系电话
     */
    @ApiModelProperty(value="联系电话",required = false)
    private String phoneNumber;

    /**
     * 状态（启用、停用）
     */
    @ApiModelProperty(value="状态（启用、停用）",required = false)
    private Boolean status;
}
