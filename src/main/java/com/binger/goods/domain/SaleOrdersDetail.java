package com.binger.goods.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 订单详细信息表
 */
@ApiModel(value="订单详细信息表")
public class SaleOrdersDetail implements Serializable {
    /**
     * 订单详细ID
     */
    @ApiModelProperty(value="订单详细ID",required = true)
    private Integer id;

    /**
     * 订单销售id
     */
    @ApiModelProperty(value="订单销售id",required = true)
    private Integer orderSaleId;

    /**
     * 订单销售编码
     */
    @ApiModelProperty(value="订单销售编码",required = false)
    private String orderSaleCode;

    /**
     * 订单详细信息编码
     */
    @ApiModelProperty(value="订单详细信息编码",required = false)
    private String ordersSaleDetailCode;

    /**
     * 卖家SKU
     */
    @ApiModelProperty(value="卖家SKU",required = false)
    private String sellerSku;

    /**
     * 商品ID
     */
    @ApiModelProperty(value="商品ID",required = false)
    private Integer goodsId;

    /**
     * sku id
     */
    @ApiModelProperty(value="sku id",required = false)
    private Integer skuId;

    /**
     * SKU图片ID
     */
    @ApiModelProperty(value="SKU图片ID",required = false)
    private Integer goodsImgId;

    /**
     * 数量
     */
    @ApiModelProperty(value="数量",required = false)
    private Integer quantity;

    /**
     * 
     */
    @ApiModelProperty(value="",required = false)
    private BigDecimal weight;

    /**
     * 本币单价
     */
    @ApiModelProperty(value="本币单价",required = false)
    private BigDecimal localPrice;

    /**
     * 本币金额
     */
    @ApiModelProperty(value="本币金额",required = false)
    private BigDecimal localAmount;

    /**
     * 手续费
     */
    @ApiModelProperty(value="手续费",required = false)
    private BigDecimal expense;

    /**
     * 
     */
    @ApiModelProperty(value="",required = false)
    private Boolean isGift;

    /**
     * 备注
     */
    @ApiModelProperty(value="备注",required = false)
    private String remark;

    /**
     * 成本价
     */
    @ApiModelProperty(value="成本价",required = false)
    private BigDecimal costPrice;

    /**
     * 
     */
    @ApiModelProperty(value="",required = false)
    private Boolean isOutOfStock;

    /**
     * 1可用，0删除
     */
    @ApiModelProperty(value="1可用，0删除",required = false)
    private Boolean status;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间",required = false)
    private Date insertTime;

    /**
     * 修改时间
     */
    @ApiModelProperty(value="修改时间",required = false)
    private Date updateTime;

    /**
     * sale_orders_detail
     */
    private static final long serialVersionUID = 1L;

    /**
     * 订单详细ID
     * @return id 订单详细ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 订单详细ID
     * @param id 订单详细ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 订单销售id
     * @return order_sale_id 订单销售id
     */
    public Integer getOrderSaleId() {
        return orderSaleId;
    }

    /**
     * 订单销售id
     * @param orderSaleId 订单销售id
     */
    public void setOrderSaleId(Integer orderSaleId) {
        this.orderSaleId = orderSaleId;
    }

    /**
     * 订单销售编码
     * @return order_sale_code 订单销售编码
     */
    public String getOrderSaleCode() {
        return orderSaleCode;
    }

    /**
     * 订单销售编码
     * @param orderSaleCode 订单销售编码
     */
    public void setOrderSaleCode(String orderSaleCode) {
        this.orderSaleCode = orderSaleCode == null ? null : orderSaleCode.trim();
    }

    /**
     * 订单详细信息编码
     * @return orders_sale_detail_code 订单详细信息编码
     */
    public String getOrdersSaleDetailCode() {
        return ordersSaleDetailCode;
    }

    /**
     * 订单详细信息编码
     * @param ordersSaleDetailCode 订单详细信息编码
     */
    public void setOrdersSaleDetailCode(String ordersSaleDetailCode) {
        this.ordersSaleDetailCode = ordersSaleDetailCode == null ? null : ordersSaleDetailCode.trim();
    }

    /**
     * 卖家SKU
     * @return seller_sku 卖家SKU
     */
    public String getSellerSku() {
        return sellerSku;
    }

    /**
     * 卖家SKU
     * @param sellerSku 卖家SKU
     */
    public void setSellerSku(String sellerSku) {
        this.sellerSku = sellerSku == null ? null : sellerSku.trim();
    }

    /**
     * 商品ID
     * @return goods_id 商品ID
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 商品ID
     * @param goodsId 商品ID
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * sku id
     * @return sku_id sku id
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * sku id
     * @param skuId sku id
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * SKU图片ID
     * @return goods_img_id SKU图片ID
     */
    public Integer getGoodsImgId() {
        return goodsImgId;
    }

    /**
     * SKU图片ID
     * @param goodsImgId SKU图片ID
     */
    public void setGoodsImgId(Integer goodsImgId) {
        this.goodsImgId = goodsImgId;
    }

    /**
     * 数量
     * @return quantity 数量
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 数量
     * @param quantity 数量
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 
     * @return weight 
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight 
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 本币单价
     * @return local_price 本币单价
     */
    public BigDecimal getLocalPrice() {
        return localPrice;
    }

    /**
     * 本币单价
     * @param localPrice 本币单价
     */
    public void setLocalPrice(BigDecimal localPrice) {
        this.localPrice = localPrice;
    }

    /**
     * 本币金额
     * @return local_amount 本币金额
     */
    public BigDecimal getLocalAmount() {
        return localAmount;
    }

    /**
     * 本币金额
     * @param localAmount 本币金额
     */
    public void setLocalAmount(BigDecimal localAmount) {
        this.localAmount = localAmount;
    }

    /**
     * 手续费
     * @return expense 手续费
     */
    public BigDecimal getExpense() {
        return expense;
    }

    /**
     * 手续费
     * @param expense 手续费
     */
    public void setExpense(BigDecimal expense) {
        this.expense = expense;
    }

    /**
     * 
     * @return is_gift 
     */
    public Boolean getIsGift() {
        return isGift;
    }

    /**
     * 
     * @param isGift 
     */
    public void setIsGift(Boolean isGift) {
        this.isGift = isGift;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 成本价
     * @return cost_price 成本价
     */
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    /**
     * 成本价
     * @param costPrice 成本价
     */
    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * 
     * @return is_out_of_stock 
     */
    public Boolean getIsOutOfStock() {
        return isOutOfStock;
    }

    /**
     * 
     * @param isOutOfStock 
     */
    public void setIsOutOfStock(Boolean isOutOfStock) {
        this.isOutOfStock = isOutOfStock;
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
     * 创建时间
     * @return insert_time 创建时间
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * 创建时间
     * @param insertTime 创建时间
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * 修改时间
     * @return update_time 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        SaleOrdersDetail other = (SaleOrdersDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderSaleId() == null ? other.getOrderSaleId() == null : this.getOrderSaleId().equals(other.getOrderSaleId()))
            && (this.getOrderSaleCode() == null ? other.getOrderSaleCode() == null : this.getOrderSaleCode().equals(other.getOrderSaleCode()))
            && (this.getOrdersSaleDetailCode() == null ? other.getOrdersSaleDetailCode() == null : this.getOrdersSaleDetailCode().equals(other.getOrdersSaleDetailCode()))
            && (this.getSellerSku() == null ? other.getSellerSku() == null : this.getSellerSku().equals(other.getSellerSku()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getGoodsImgId() == null ? other.getGoodsImgId() == null : this.getGoodsImgId().equals(other.getGoodsImgId()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getLocalPrice() == null ? other.getLocalPrice() == null : this.getLocalPrice().equals(other.getLocalPrice()))
            && (this.getLocalAmount() == null ? other.getLocalAmount() == null : this.getLocalAmount().equals(other.getLocalAmount()))
            && (this.getExpense() == null ? other.getExpense() == null : this.getExpense().equals(other.getExpense()))
            && (this.getIsGift() == null ? other.getIsGift() == null : this.getIsGift().equals(other.getIsGift()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCostPrice() == null ? other.getCostPrice() == null : this.getCostPrice().equals(other.getCostPrice()))
            && (this.getIsOutOfStock() == null ? other.getIsOutOfStock() == null : this.getIsOutOfStock().equals(other.getIsOutOfStock()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderSaleId() == null) ? 0 : getOrderSaleId().hashCode());
        result = prime * result + ((getOrderSaleCode() == null) ? 0 : getOrderSaleCode().hashCode());
        result = prime * result + ((getOrdersSaleDetailCode() == null) ? 0 : getOrdersSaleDetailCode().hashCode());
        result = prime * result + ((getSellerSku() == null) ? 0 : getSellerSku().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getGoodsImgId() == null) ? 0 : getGoodsImgId().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getLocalPrice() == null) ? 0 : getLocalPrice().hashCode());
        result = prime * result + ((getLocalAmount() == null) ? 0 : getLocalAmount().hashCode());
        result = prime * result + ((getExpense() == null) ? 0 : getExpense().hashCode());
        result = prime * result + ((getIsGift() == null) ? 0 : getIsGift().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCostPrice() == null) ? 0 : getCostPrice().hashCode());
        result = prime * result + ((getIsOutOfStock() == null) ? 0 : getIsOutOfStock().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getInsertTime() == null) ? 0 : getInsertTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderSaleId=").append(orderSaleId);
        sb.append(", orderSaleCode=").append(orderSaleCode);
        sb.append(", ordersSaleDetailCode=").append(ordersSaleDetailCode);
        sb.append(", sellerSku=").append(sellerSku);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", skuId=").append(skuId);
        sb.append(", goodsImgId=").append(goodsImgId);
        sb.append(", quantity=").append(quantity);
        sb.append(", weight=").append(weight);
        sb.append(", localPrice=").append(localPrice);
        sb.append(", localAmount=").append(localAmount);
        sb.append(", expense=").append(expense);
        sb.append(", isGift=").append(isGift);
        sb.append(", remark=").append(remark);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", isOutOfStock=").append(isOutOfStock);
        sb.append(", status=").append(status);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}