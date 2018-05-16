package com.binger.goods.dto.query;

import com.binger.common.QueryDtoBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/10
 * Time: 下午7:51
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel("销售查询")
@Data
public class SaleOrderQueryDto extends QueryDtoBase{

    /**
     * 销售订单编码
     */
    @ApiModelProperty(value="销售订单编码",required = false)
    private String orderSaleCode;

    /**
     * 订单编号,原始订单编号，多个用/分割。当是合并订单时进行拆分处理
     */
    @ApiModelProperty(value="订单编号,原始订单编号，多个用/分割。当是合并订单时进行拆分处理",required = false)
    private String orderCode;

    /**
     * 店铺
     */
    @ApiModelProperty(value="店铺",required = false)
    private Integer storeId;

    /**
     * 收件人
     */
    @ApiModelProperty(value="收件人",required = false)
    private String customerName;

    /**
     * 平台买家名称(customer_name为收件人)
     */
    @ApiModelProperty(value="平台买家名称(customer_name为收件人)",required = false)
    private String buyerName;

    /**
     * 国家,不一致不允许合并
     */
    @ApiModelProperty(value="国家,不一致不允许合并",required = false)
    private String countryName;

    /**
     * 州或省,不一致不允许合并
     */
    @ApiModelProperty(value="州或省,不一致不允许合并",required = false)
    private String state;

    /**
     * 电话,不一致不允许合并
     */
    @ApiModelProperty(value="电话,不一致不允许合并",required = false)
    private String phoneNumber;

    /**
     * 仓库id
     */
    @ApiModelProperty(value="仓库id",required = false)
    private Integer warehouseId;

    /**
     * 物流跟踪号,只能是一个，多次发货拆分
     */
    @ApiModelProperty(value="物流跟踪号,只能是一个，多次发货拆分",required = false)
    private String trackNumber;

    /**
     * 是否占用库存
     */
    @ApiModelProperty(value="是否占用库存",required = false)
    private Boolean isReserveStock;

    /**
     * 是否预占用库存
     */
    @ApiModelProperty(value="是否预占用库存",required = false)
    private Boolean isOccupy;

    /**
     * 1可用，0删除
     */
    @ApiModelProperty(value="1可用，0删除",required = false)
    private Boolean status;

}
