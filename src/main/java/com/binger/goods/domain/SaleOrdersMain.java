package com.binger.goods.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 订单表主表
 */
@ApiModel(value="订单表主表")
public class SaleOrdersMain implements Serializable {
    /**
     * 订单ID,自增
     */
    @ApiModelProperty(value="订单ID,自增",required = true)
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
     * 下单日期,取最早时间
     */
    @ApiModelProperty(value="下单日期,取最早时间",required = false)
    private Date orderTime;

    /**
     * 付款日期,合并订单取最早时间
     */
    @ApiModelProperty(value="付款日期,合并订单取最早时间",required = false)
    private Date payTime;

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
     * 订单类型,1正常 2信用卡刷单 3预售 不一致不允许合并
     */
    @ApiModelProperty(value="订单类型,1正常 2信用卡刷单 3预售 不一致不允许合并",required = false)
    private Integer orderCate;

    /**
     * 标记发货状态，0未标记发货，1处理中，2标记成功，-1标记失败
     */
    @ApiModelProperty(value="标记发货状态，0未标记发货，1处理中，2标记成功，-1标记失败",required = false)
    private Integer shipMark;

    /**
     * 标记发货时间
     */
    @ApiModelProperty(value="标记发货时间",required = false)
    private Date shipMarkTime;

    /**
     * 标记次数
     */
    @ApiModelProperty(value="标记次数",required = true)
    private Integer shipMarkQty;

    /**
     * 派单日期
     */
    @ApiModelProperty(value="派单日期",required = false)
    private Date assignDate;

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
     * 国家ID
     */
    @ApiModelProperty(value="国家ID",required = false)
    private Integer countryId;

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
     * 物流公司ID
     */
    @ApiModelProperty(value="物流公司ID",required = false)
    private Integer logistCompanyId;

    /**
     * 物流公司编号
     */
    @ApiModelProperty(value="物流公司编号",required = false)
    private String logistCompanyCode;

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
     * 未开票金额
     */
    @ApiModelProperty(value="未开票金额",required = false)
    private BigDecimal reinvoiceMny;

    /**
     * 店铺运输方式,不同的方式不允许合并
     */
    @ApiModelProperty(value="店铺运输方式,不同的方式不允许合并",required = false)
    private String shippingWay;

    /**
     * 运费
     */
    @ApiModelProperty(value="运费",required = false)
    private BigDecimal shippingFee;

    /**
     * 付款方式
     */
    @ApiModelProperty(value="付款方式",required = false)
    private String paymentMethod;

    /**
     * 派单时间
     */
    @ApiModelProperty(value="派单时间",required = false)
    private Date assignTime;

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

    /**
     * 创建人
     */
    @ApiModelProperty(value="创建人",required = false)
    private String creator;

    /**
     * 修改人
     */
    @ApiModelProperty(value="修改人",required = false)
    private String modifier;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间",required = false)
    private Date createTime;

    /**
     * 修改时间
     */
    @ApiModelProperty(value="修改时间",required = false)
    private Date modifyTime;

    /**
     * 标记发货失败原因
     */
    @ApiModelProperty(value="标记发货失败原因",required = false)
    private String shipMarkFailReason;

    /**
     * sale_orders_main
     */
    private static final long serialVersionUID = 1L;

    /**
     * 订单ID,自增
     * @return id 订单ID,自增
     */
    public Integer getId() {
        return id;
    }

    /**
     * 订单ID,自增
     * @param id 订单ID,自增
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 销售订单编码
     * @return order_sale_code 销售订单编码
     */
    public String getOrderSaleCode() {
        return orderSaleCode;
    }

    /**
     * 销售订单编码
     * @param orderSaleCode 销售订单编码
     */
    public void setOrderSaleCode(String orderSaleCode) {
        this.orderSaleCode = orderSaleCode == null ? null : orderSaleCode.trim();
    }

    /**
     * 订单编号,原始订单编号，多个用/分割。当是合并订单时进行拆分处理
     * @return order_code 订单编号,原始订单编号，多个用/分割。当是合并订单时进行拆分处理
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * 订单编号,原始订单编号，多个用/分割。当是合并订单时进行拆分处理
     * @param orderCode 订单编号,原始订单编号，多个用/分割。当是合并订单时进行拆分处理
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    /**
     * 下单日期,取最早时间
     * @return order_time 下单日期,取最早时间
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * 下单日期,取最早时间
     * @param orderTime 下单日期,取最早时间
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * 付款日期,合并订单取最早时间
     * @return pay_time 付款日期,合并订单取最早时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 付款日期,合并订单取最早时间
     * @param payTime 付款日期,合并订单取最早时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 汇率
     * @return exchange_rate 汇率
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * 汇率
     * @param exchangeRate 汇率
     */
    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     * 订单金额（原币）
     * @return order_ori_mny 订单金额（原币）
     */
    public BigDecimal getOrderOriMny() {
        return orderOriMny;
    }

    /**
     * 订单金额（原币）
     * @param orderOriMny 订单金额（原币）
     */
    public void setOrderOriMny(BigDecimal orderOriMny) {
        this.orderOriMny = orderOriMny;
    }

    /**
     * 店铺
     * @return store_id 店铺
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 店铺
     * @param storeId 店铺
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 订单金额（本币）,合并订单要将数额加起来
     * @return order_loc_mny 订单金额（本币）,合并订单要将数额加起来
     */
    public BigDecimal getOrderLocMny() {
        return orderLocMny;
    }

    /**
     * 订单金额（本币）,合并订单要将数额加起来
     * @param orderLocMny 订单金额（本币）,合并订单要将数额加起来
     */
    public void setOrderLocMny(BigDecimal orderLocMny) {
        this.orderLocMny = orderLocMny;
    }

    /**
     * 订单状态,0未付款 100已付款 200缺货 300等待派单 310已派单 400已转仓库 410未拣货 420已拣货未核单 430已核单未包装 500已揽收 900退货 910取消单 920退款 990其他异常
     * @return order_status 订单状态,0未付款 100已付款 200缺货 300等待派单 310已派单 400已转仓库 410未拣货 420已拣货未核单 430已核单未包装 500已揽收 900退货 910取消单 920退款 990其他异常
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 订单状态,0未付款 100已付款 200缺货 300等待派单 310已派单 400已转仓库 410未拣货 420已拣货未核单 430已核单未包装 500已揽收 900退货 910取消单 920退款 990其他异常
     * @param orderStatus 订单状态,0未付款 100已付款 200缺货 300等待派单 310已派单 400已转仓库 410未拣货 420已拣货未核单 430已核单未包装 500已揽收 900退货 910取消单 920退款 990其他异常
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 订单类型,1正常 2信用卡刷单 3预售 不一致不允许合并
     * @return order_cate 订单类型,1正常 2信用卡刷单 3预售 不一致不允许合并
     */
    public Integer getOrderCate() {
        return orderCate;
    }

    /**
     * 订单类型,1正常 2信用卡刷单 3预售 不一致不允许合并
     * @param orderCate 订单类型,1正常 2信用卡刷单 3预售 不一致不允许合并
     */
    public void setOrderCate(Integer orderCate) {
        this.orderCate = orderCate;
    }

    /**
     * 标记发货状态，0未标记发货，1处理中，2标记成功，-1标记失败
     * @return ship_mark 标记发货状态，0未标记发货，1处理中，2标记成功，-1标记失败
     */
    public Integer getShipMark() {
        return shipMark;
    }

    /**
     * 标记发货状态，0未标记发货，1处理中，2标记成功，-1标记失败
     * @param shipMark 标记发货状态，0未标记发货，1处理中，2标记成功，-1标记失败
     */
    public void setShipMark(Integer shipMark) {
        this.shipMark = shipMark;
    }

    /**
     * 标记发货时间
     * @return ship_mark_time 标记发货时间
     */
    public Date getShipMarkTime() {
        return shipMarkTime;
    }

    /**
     * 标记发货时间
     * @param shipMarkTime 标记发货时间
     */
    public void setShipMarkTime(Date shipMarkTime) {
        this.shipMarkTime = shipMarkTime;
    }

    /**
     * 标记次数
     * @return ship_mark_qty 标记次数
     */
    public Integer getShipMarkQty() {
        return shipMarkQty;
    }

    /**
     * 标记次数
     * @param shipMarkQty 标记次数
     */
    public void setShipMarkQty(Integer shipMarkQty) {
        this.shipMarkQty = shipMarkQty;
    }

    /**
     * 派单日期
     * @return assign_date 派单日期
     */
    public Date getAssignDate() {
        return assignDate;
    }

    /**
     * 派单日期
     * @param assignDate 派单日期
     */
    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }

    /**
     * 收件人
     * @return customer_name 收件人
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 收件人
     * @param customerName 收件人
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * 平台买家名称(customer_name为收件人)
     * @return buyer_name 平台买家名称(customer_name为收件人)
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * 平台买家名称(customer_name为收件人)
     * @param buyerName 平台买家名称(customer_name为收件人)
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    /**
     * 客户邮件
     * @return customer_email 客户邮件
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * 客户邮件
     * @param customerEmail 客户邮件
     */
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail == null ? null : customerEmail.trim();
    }

    /**
     * 国家ID
     * @return country_id 国家ID
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * 国家ID
     * @param countryId 国家ID
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * 国家编码
     * @return country_code 国家编码
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 国家编码
     * @param countryCode 国家编码
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    /**
     * 国家,不一致不允许合并
     * @return country_name 国家,不一致不允许合并
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 国家,不一致不允许合并
     * @param countryName 国家,不一致不允许合并
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    /**
     * 州或省,不一致不允许合并
     * @return state 州或省,不一致不允许合并
     */
    public String getState() {
        return state;
    }

    /**
     * 州或省,不一致不允许合并
     * @param state 州或省,不一致不允许合并
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 城市,不一致不允许合并
     * @return city 城市,不一致不允许合并
     */
    public String getCity() {
        return city;
    }

    /**
     * 城市,不一致不允许合并
     * @param city 城市,不一致不允许合并
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 邮编,不一致不允许合并
     * @return zip_code 邮编,不一致不允许合并
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 邮编,不一致不允许合并
     * @param zipCode 邮编,不一致不允许合并
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    /**
     * 邮寄地址1,不一致不允许合并
     * @return address1 邮寄地址1,不一致不允许合并
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * 邮寄地址1,不一致不允许合并
     * @param address1 邮寄地址1,不一致不允许合并
     */
    public void setAddress1(String address1) {
        this.address1 = address1 == null ? null : address1.trim();
    }

    /**
     * 邮寄地址2,不一致不允许合并
     * @return address2 邮寄地址2,不一致不允许合并
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * 邮寄地址2,不一致不允许合并
     * @param address2 邮寄地址2,不一致不允许合并
     */
    public void setAddress2(String address2) {
        this.address2 = address2 == null ? null : address2.trim();
    }

    /**
     * 邮寄地址3,不一致不允许合并
     * @return address3 邮寄地址3,不一致不允许合并
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * 邮寄地址3,不一致不允许合并
     * @param address3 邮寄地址3,不一致不允许合并
     */
    public void setAddress3(String address3) {
        this.address3 = address3 == null ? null : address3.trim();
    }

    /**
     * 电话,不一致不允许合并
     * @return phone_number 电话,不一致不允许合并
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 电话,不一致不允许合并
     * @param phoneNumber 电话,不一致不允许合并
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 物流公司ID
     * @return logist_company_id 物流公司ID
     */
    public Integer getLogistCompanyId() {
        return logistCompanyId;
    }

    /**
     * 物流公司ID
     * @param logistCompanyId 物流公司ID
     */
    public void setLogistCompanyId(Integer logistCompanyId) {
        this.logistCompanyId = logistCompanyId;
    }

    /**
     * 物流公司编号
     * @return logist_company_code 物流公司编号
     */
    public String getLogistCompanyCode() {
        return logistCompanyCode;
    }

    /**
     * 物流公司编号
     * @param logistCompanyCode 物流公司编号
     */
    public void setLogistCompanyCode(String logistCompanyCode) {
        this.logistCompanyCode = logistCompanyCode == null ? null : logistCompanyCode.trim();
    }

    /**
     * 物流公司名称
     * @return logist_company_name 物流公司名称
     */
    public String getLogistCompanyName() {
        return logistCompanyName;
    }

    /**
     * 物流公司名称
     * @param logistCompanyName 物流公司名称
     */
    public void setLogistCompanyName(String logistCompanyName) {
        this.logistCompanyName = logistCompanyName == null ? null : logistCompanyName.trim();
    }

    /**
     * 仓库id
     * @return warehouse_id 仓库id
     */
    public Integer getWarehouseId() {
        return warehouseId;
    }

    /**
     * 仓库id
     * @param warehouseId 仓库id
     */
    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    /**
     * 仓库编号
     * @return warehouse_code 仓库编号
     */
    public String getWarehouseCode() {
        return warehouseCode;
    }

    /**
     * 仓库编号
     * @param warehouseCode 仓库编号
     */
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode == null ? null : warehouseCode.trim();
    }

    /**
     * 仓库名称
     * @return warehouse_name 仓库名称
     */
    public String getWarehouseName() {
        return warehouseName;
    }

    /**
     * 仓库名称
     * @param warehouseName 仓库名称
     */
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName == null ? null : warehouseName.trim();
    }

    /**
     * 物流跟踪号,只能是一个，多次发货拆分
     * @return track_number 物流跟踪号,只能是一个，多次发货拆分
     */
    public String getTrackNumber() {
        return trackNumber;
    }

    /**
     * 物流跟踪号,只能是一个，多次发货拆分
     * @param trackNumber 物流跟踪号,只能是一个，多次发货拆分
     */
    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber == null ? null : trackNumber.trim();
    }

    /**
     * 获取物流跟踪号时间,用于自动标记策略
     * @return track_time 获取物流跟踪号时间,用于自动标记策略
     */
    public Date getTrackTime() {
        return trackTime;
    }

    /**
     * 获取物流跟踪号时间,用于自动标记策略
     * @param trackTime 获取物流跟踪号时间,用于自动标记策略
     */
    public void setTrackTime(Date trackTime) {
        this.trackTime = trackTime;
    }

    /**
     * 币种
     * @return currency_code 币种
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 币种
     * @param currencyCode 币种
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode == null ? null : currencyCode.trim();
    }

    /**
     * 包裹重量
     * @return weight 包裹重量
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 包裹重量
     * @param weight 包裹重量
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 备注1（基本信息）
     * @return remark1 备注1（基本信息）
     */
    public String getRemark1() {
        return remark1;
    }

    /**
     * 备注1（基本信息）
     * @param remark1 备注1（基本信息）
     */
    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    /**
     * 备注2（客户信息）
     * @return remark2 备注2（客户信息）
     */
    public String getRemark2() {
        return remark2;
    }

    /**
     * 备注2（客户信息）
     * @param remark2 备注2（客户信息）
     */
    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    /**
     * 未开票金额
     * @return reinvoice_mny 未开票金额
     */
    public BigDecimal getReinvoiceMny() {
        return reinvoiceMny;
    }

    /**
     * 未开票金额
     * @param reinvoiceMny 未开票金额
     */
    public void setReinvoiceMny(BigDecimal reinvoiceMny) {
        this.reinvoiceMny = reinvoiceMny;
    }

    /**
     * 店铺运输方式,不同的方式不允许合并
     * @return shipping_way 店铺运输方式,不同的方式不允许合并
     */
    public String getShippingWay() {
        return shippingWay;
    }

    /**
     * 店铺运输方式,不同的方式不允许合并
     * @param shippingWay 店铺运输方式,不同的方式不允许合并
     */
    public void setShippingWay(String shippingWay) {
        this.shippingWay = shippingWay == null ? null : shippingWay.trim();
    }

    /**
     * 运费
     * @return shipping_fee 运费
     */
    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    /**
     * 运费
     * @param shippingFee 运费
     */
    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    /**
     * 付款方式
     * @return payment_method 付款方式
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * 付款方式
     * @param paymentMethod 付款方式
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod == null ? null : paymentMethod.trim();
    }

    /**
     * 派单时间
     * @return assign_time 派单时间
     */
    public Date getAssignTime() {
        return assignTime;
    }

    /**
     * 派单时间
     * @param assignTime 派单时间
     */
    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    /**
     * 是否占用库存
     * @return is_reserve_stock 是否占用库存
     */
    public Boolean getIsReserveStock() {
        return isReserveStock;
    }

    /**
     * 是否占用库存
     * @param isReserveStock 是否占用库存
     */
    public void setIsReserveStock(Boolean isReserveStock) {
        this.isReserveStock = isReserveStock;
    }

    /**
     * 是否预占用库存
     * @return is_occupy 是否预占用库存
     */
    public Boolean getIsOccupy() {
        return isOccupy;
    }

    /**
     * 是否预占用库存
     * @param isOccupy 是否预占用库存
     */
    public void setIsOccupy(Boolean isOccupy) {
        this.isOccupy = isOccupy;
    }

    /**
     * 1可用，0删除
     * @return status 1可用，0删除
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 1可用，0删除
     * @param status 1可用，0删除
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 创建人
     * @return creator 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 创建人
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 修改人
     * @return modifier 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 修改人
     * @param modifier 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * @return modify_time 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 标记发货失败原因
     * @return ship_mark_fail_reason 标记发货失败原因
     */
    public String getShipMarkFailReason() {
        return shipMarkFailReason;
    }

    /**
     * 标记发货失败原因
     * @param shipMarkFailReason 标记发货失败原因
     */
    public void setShipMarkFailReason(String shipMarkFailReason) {
        this.shipMarkFailReason = shipMarkFailReason == null ? null : shipMarkFailReason.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SaleOrdersMain other = (SaleOrdersMain) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderSaleCode() == null ? other.getOrderSaleCode() == null : this.getOrderSaleCode().equals(other.getOrderSaleCode()))
            && (this.getOrderCode() == null ? other.getOrderCode() == null : this.getOrderCode().equals(other.getOrderCode()))
            && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getExchangeRate() == null ? other.getExchangeRate() == null : this.getExchangeRate().equals(other.getExchangeRate()))
            && (this.getOrderOriMny() == null ? other.getOrderOriMny() == null : this.getOrderOriMny().equals(other.getOrderOriMny()))
            && (this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId()))
            && (this.getOrderLocMny() == null ? other.getOrderLocMny() == null : this.getOrderLocMny().equals(other.getOrderLocMny()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getOrderCate() == null ? other.getOrderCate() == null : this.getOrderCate().equals(other.getOrderCate()))
            && (this.getShipMark() == null ? other.getShipMark() == null : this.getShipMark().equals(other.getShipMark()))
            && (this.getShipMarkTime() == null ? other.getShipMarkTime() == null : this.getShipMarkTime().equals(other.getShipMarkTime()))
            && (this.getShipMarkQty() == null ? other.getShipMarkQty() == null : this.getShipMarkQty().equals(other.getShipMarkQty()))
            && (this.getAssignDate() == null ? other.getAssignDate() == null : this.getAssignDate().equals(other.getAssignDate()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getBuyerName() == null ? other.getBuyerName() == null : this.getBuyerName().equals(other.getBuyerName()))
            && (this.getCustomerEmail() == null ? other.getCustomerEmail() == null : this.getCustomerEmail().equals(other.getCustomerEmail()))
            && (this.getCountryId() == null ? other.getCountryId() == null : this.getCountryId().equals(other.getCountryId()))
            && (this.getCountryCode() == null ? other.getCountryCode() == null : this.getCountryCode().equals(other.getCountryCode()))
            && (this.getCountryName() == null ? other.getCountryName() == null : this.getCountryName().equals(other.getCountryName()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getZipCode() == null ? other.getZipCode() == null : this.getZipCode().equals(other.getZipCode()))
            && (this.getAddress1() == null ? other.getAddress1() == null : this.getAddress1().equals(other.getAddress1()))
            && (this.getAddress2() == null ? other.getAddress2() == null : this.getAddress2().equals(other.getAddress2()))
            && (this.getAddress3() == null ? other.getAddress3() == null : this.getAddress3().equals(other.getAddress3()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getLogistCompanyId() == null ? other.getLogistCompanyId() == null : this.getLogistCompanyId().equals(other.getLogistCompanyId()))
            && (this.getLogistCompanyCode() == null ? other.getLogistCompanyCode() == null : this.getLogistCompanyCode().equals(other.getLogistCompanyCode()))
            && (this.getLogistCompanyName() == null ? other.getLogistCompanyName() == null : this.getLogistCompanyName().equals(other.getLogistCompanyName()))
            && (this.getWarehouseId() == null ? other.getWarehouseId() == null : this.getWarehouseId().equals(other.getWarehouseId()))
            && (this.getWarehouseCode() == null ? other.getWarehouseCode() == null : this.getWarehouseCode().equals(other.getWarehouseCode()))
            && (this.getWarehouseName() == null ? other.getWarehouseName() == null : this.getWarehouseName().equals(other.getWarehouseName()))
            && (this.getTrackNumber() == null ? other.getTrackNumber() == null : this.getTrackNumber().equals(other.getTrackNumber()))
            && (this.getTrackTime() == null ? other.getTrackTime() == null : this.getTrackTime().equals(other.getTrackTime()))
            && (this.getCurrencyCode() == null ? other.getCurrencyCode() == null : this.getCurrencyCode().equals(other.getCurrencyCode()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getRemark1() == null ? other.getRemark1() == null : this.getRemark1().equals(other.getRemark1()))
            && (this.getRemark2() == null ? other.getRemark2() == null : this.getRemark2().equals(other.getRemark2()))
            && (this.getReinvoiceMny() == null ? other.getReinvoiceMny() == null : this.getReinvoiceMny().equals(other.getReinvoiceMny()))
            && (this.getShippingWay() == null ? other.getShippingWay() == null : this.getShippingWay().equals(other.getShippingWay()))
            && (this.getShippingFee() == null ? other.getShippingFee() == null : this.getShippingFee().equals(other.getShippingFee()))
            && (this.getPaymentMethod() == null ? other.getPaymentMethod() == null : this.getPaymentMethod().equals(other.getPaymentMethod()))
            && (this.getAssignTime() == null ? other.getAssignTime() == null : this.getAssignTime().equals(other.getAssignTime()))
            && (this.getIsReserveStock() == null ? other.getIsReserveStock() == null : this.getIsReserveStock().equals(other.getIsReserveStock()))
            && (this.getIsOccupy() == null ? other.getIsOccupy() == null : this.getIsOccupy().equals(other.getIsOccupy()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getShipMarkFailReason() == null ? other.getShipMarkFailReason() == null : this.getShipMarkFailReason().equals(other.getShipMarkFailReason()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderSaleCode() == null) ? 0 : getOrderSaleCode().hashCode());
        result = prime * result + ((getOrderCode() == null) ? 0 : getOrderCode().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getExchangeRate() == null) ? 0 : getExchangeRate().hashCode());
        result = prime * result + ((getOrderOriMny() == null) ? 0 : getOrderOriMny().hashCode());
        result = prime * result + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        result = prime * result + ((getOrderLocMny() == null) ? 0 : getOrderLocMny().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getOrderCate() == null) ? 0 : getOrderCate().hashCode());
        result = prime * result + ((getShipMark() == null) ? 0 : getShipMark().hashCode());
        result = prime * result + ((getShipMarkTime() == null) ? 0 : getShipMarkTime().hashCode());
        result = prime * result + ((getShipMarkQty() == null) ? 0 : getShipMarkQty().hashCode());
        result = prime * result + ((getAssignDate() == null) ? 0 : getAssignDate().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getBuyerName() == null) ? 0 : getBuyerName().hashCode());
        result = prime * result + ((getCustomerEmail() == null) ? 0 : getCustomerEmail().hashCode());
        result = prime * result + ((getCountryId() == null) ? 0 : getCountryId().hashCode());
        result = prime * result + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        result = prime * result + ((getCountryName() == null) ? 0 : getCountryName().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getZipCode() == null) ? 0 : getZipCode().hashCode());
        result = prime * result + ((getAddress1() == null) ? 0 : getAddress1().hashCode());
        result = prime * result + ((getAddress2() == null) ? 0 : getAddress2().hashCode());
        result = prime * result + ((getAddress3() == null) ? 0 : getAddress3().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getLogistCompanyId() == null) ? 0 : getLogistCompanyId().hashCode());
        result = prime * result + ((getLogistCompanyCode() == null) ? 0 : getLogistCompanyCode().hashCode());
        result = prime * result + ((getLogistCompanyName() == null) ? 0 : getLogistCompanyName().hashCode());
        result = prime * result + ((getWarehouseId() == null) ? 0 : getWarehouseId().hashCode());
        result = prime * result + ((getWarehouseCode() == null) ? 0 : getWarehouseCode().hashCode());
        result = prime * result + ((getWarehouseName() == null) ? 0 : getWarehouseName().hashCode());
        result = prime * result + ((getTrackNumber() == null) ? 0 : getTrackNumber().hashCode());
        result = prime * result + ((getTrackTime() == null) ? 0 : getTrackTime().hashCode());
        result = prime * result + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getRemark1() == null) ? 0 : getRemark1().hashCode());
        result = prime * result + ((getRemark2() == null) ? 0 : getRemark2().hashCode());
        result = prime * result + ((getReinvoiceMny() == null) ? 0 : getReinvoiceMny().hashCode());
        result = prime * result + ((getShippingWay() == null) ? 0 : getShippingWay().hashCode());
        result = prime * result + ((getShippingFee() == null) ? 0 : getShippingFee().hashCode());
        result = prime * result + ((getPaymentMethod() == null) ? 0 : getPaymentMethod().hashCode());
        result = prime * result + ((getAssignTime() == null) ? 0 : getAssignTime().hashCode());
        result = prime * result + ((getIsReserveStock() == null) ? 0 : getIsReserveStock().hashCode());
        result = prime * result + ((getIsOccupy() == null) ? 0 : getIsOccupy().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getShipMarkFailReason() == null) ? 0 : getShipMarkFailReason().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderSaleCode=").append(orderSaleCode);
        sb.append(", orderCode=").append(orderCode);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", payTime=").append(payTime);
        sb.append(", exchangeRate=").append(exchangeRate);
        sb.append(", orderOriMny=").append(orderOriMny);
        sb.append(", storeId=").append(storeId);
        sb.append(", orderLocMny=").append(orderLocMny);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", orderCate=").append(orderCate);
        sb.append(", shipMark=").append(shipMark);
        sb.append(", shipMarkTime=").append(shipMarkTime);
        sb.append(", shipMarkQty=").append(shipMarkQty);
        sb.append(", assignDate=").append(assignDate);
        sb.append(", customerName=").append(customerName);
        sb.append(", buyerName=").append(buyerName);
        sb.append(", customerEmail=").append(customerEmail);
        sb.append(", countryId=").append(countryId);
        sb.append(", countryCode=").append(countryCode);
        sb.append(", countryName=").append(countryName);
        sb.append(", state=").append(state);
        sb.append(", city=").append(city);
        sb.append(", zipCode=").append(zipCode);
        sb.append(", address1=").append(address1);
        sb.append(", address2=").append(address2);
        sb.append(", address3=").append(address3);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", logistCompanyId=").append(logistCompanyId);
        sb.append(", logistCompanyCode=").append(logistCompanyCode);
        sb.append(", logistCompanyName=").append(logistCompanyName);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", warehouseCode=").append(warehouseCode);
        sb.append(", warehouseName=").append(warehouseName);
        sb.append(", trackNumber=").append(trackNumber);
        sb.append(", trackTime=").append(trackTime);
        sb.append(", currencyCode=").append(currencyCode);
        sb.append(", weight=").append(weight);
        sb.append(", remark1=").append(remark1);
        sb.append(", remark2=").append(remark2);
        sb.append(", reinvoiceMny=").append(reinvoiceMny);
        sb.append(", shippingWay=").append(shippingWay);
        sb.append(", shippingFee=").append(shippingFee);
        sb.append(", paymentMethod=").append(paymentMethod);
        sb.append(", assignTime=").append(assignTime);
        sb.append(", isReserveStock=").append(isReserveStock);
        sb.append(", isOccupy=").append(isOccupy);
        sb.append(", status=").append(status);
        sb.append(", creator=").append(creator);
        sb.append(", modifier=").append(modifier);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", shipMarkFailReason=").append(shipMarkFailReason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}