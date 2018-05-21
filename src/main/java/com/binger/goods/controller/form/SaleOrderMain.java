package com.binger.goods.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/16
 * Time: 下午2:29
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel("订单主表")
public class SaleOrderMain {
    /**
     * 订单ID
     */
    @ApiModelProperty(value="订单ID",required = true)
    private Integer id;

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
     * 汇率
     */
    @ApiModelProperty(value="汇率",required = false)
    private BigDecimal exchangeRate;

    /**
     * 订单金额（原币）
     */
    @ApiModelProperty(value="订单金额（原币）",required = false)
    private BigDecimal orderOriMny;

    /**
     * 店铺
     */
    @ApiModelProperty(value="店铺",required = false)
    private Integer storeId;

    /**
     * 订单金额（本币）,合并订单要将数额加起来
     */
    @ApiModelProperty(value="订单金额（本币）,合并订单要将数额加起来",required = false)
    private BigDecimal orderLocMny;

    /**
     * 订单状态,0未付款 100已付款 200缺货 300等待派单 310已派单 400已转仓库 410未拣货 420已拣货未核单 430已核单未包装 500已揽收 900退货 910取消单 920退款 990其他异常
     */
    @ApiModelProperty(value="订单状态,0未付款 100已付款 200缺货 300等待派单 310已派单 400已转仓库 410未拣货 420已拣货未核单 430已核单未包装 500已揽收 900退货 910取消单 920退款 990其他异常",required = false)
    private Integer orderStatus;

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
     * 客户邮件
     */
    @ApiModelProperty(value="客户邮件",required = false)
    private String customerEmail;

    /**
     * 国家编码
     */
    @ApiModelProperty(value="国家编码",required = false)
    private String countryCode;

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
     * 城市,不一致不允许合并
     */
    @ApiModelProperty(value="城市,不一致不允许合并",required = false)
    private String city;

    /**
     * 邮编,不一致不允许合并
     */
    @ApiModelProperty(value="邮编,不一致不允许合并",required = false)
    private String zipCode;

    /**
     * 邮寄地址1,不一致不允许合并
     */
    @ApiModelProperty(value="邮寄地址1,不一致不允许合并",required = false)
    private String address1;

    /**
     * 邮寄地址2,不一致不允许合并
     */
    @ApiModelProperty(value="邮寄地址2,不一致不允许合并",required = false)
    private String address2;

    /**
     * 邮寄地址3,不一致不允许合并
     */
    @ApiModelProperty(value="邮寄地址3,不一致不允许合并",required = false)
    private String address3;

    /**
     * 电话,不一致不允许合并
     */
    @ApiModelProperty(value="电话,不一致不允许合并",required = false)
    private String phoneNumber;

    /**
     * 物流公司名称
     */
    @ApiModelProperty(value="物流公司名称",required = false)
    private String logistCompanyName;

    /**
     * 仓库id
     */
    @ApiModelProperty(value="仓库id",required = false)
    private Integer warehouseId;

    /**
     * 仓库编号
     */
    @ApiModelProperty(value="仓库编号",required = false)
    private String warehouseCode;

    /**
     * 仓库名称
     */
    @ApiModelProperty(value="仓库名称",required = false)
    private String warehouseName;

    /**
     * 物流跟踪号,只能是一个，多次发货拆分
     */
    @ApiModelProperty(value="物流跟踪号,只能是一个，多次发货拆分",required = false)
    private String trackNumber;

    /**
     * 获取物流跟踪号时间,用于自动标记策略
     */
    @ApiModelProperty(value="获取物流跟踪号时间,用于自动标记策略",required = false)
    private Date trackTime;

    /**
     * 币种
     */
    @ApiModelProperty(value="币种",required = false)
    private String currencyCode;

    /**
     * 包裹重量
     */
    @ApiModelProperty(value="包裹重量",required = false)
    private BigDecimal weight;

    /**
     * 备注1（基本信息）
     */
    @ApiModelProperty(value="备注1（基本信息）",required = false)
    private String remark1;

    /**
     * 备注2（客户信息）
     */
    @ApiModelProperty(value="备注2（客户信息）",required = false)
    private String remark2;

    /**
     * 运费
     */
    @ApiModelProperty(value="运费",required = false)
    private BigDecimal shippingFee;

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

}
