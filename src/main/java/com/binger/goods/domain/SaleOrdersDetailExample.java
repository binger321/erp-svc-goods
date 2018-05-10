package com.binger.goods.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SaleOrdersDetailExample {
    /**
     * sale_orders_detail
     */
    protected String orderByClause;

    /**
     * sale_orders_detail
     */
    protected boolean distinct;

    /**
     * sale_orders_detail
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    private SelectiveField selectiveField;

    public SaleOrdersDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
        selectiveField = SelectiveField.select();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public SelectiveField getSelectiveField() {
        return this.selectiveField;
    }

    public void setSelectiveField(SelectiveField selectiveField) {
        this.selectiveField = selectiveField;
    }

    /**
     * sale_orders_detail 2018-05-10
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderSaleIdIsNull() {
            addCriterion("order_sale_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderSaleIdIsNotNull() {
            addCriterion("order_sale_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSaleIdEqualTo(Integer value) {
            addCriterion("order_sale_id =", value, "orderSaleId");
            return (Criteria) this;
        }

        public Criteria andOrderSaleIdNotEqualTo(Integer value) {
            addCriterion("order_sale_id <>", value, "orderSaleId");
            return (Criteria) this;
        }

        public Criteria andOrderSaleIdGreaterThan(Integer value) {
            addCriterion("order_sale_id >", value, "orderSaleId");
            return (Criteria) this;
        }

        public Criteria andOrderSaleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_sale_id >=", value, "orderSaleId");
            return (Criteria) this;
        }

        public Criteria andOrderSaleIdLessThan(Integer value) {
            addCriterion("order_sale_id <", value, "orderSaleId");
            return (Criteria) this;
        }

        public Criteria andOrderSaleIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_sale_id <=", value, "orderSaleId");
            return (Criteria) this;
        }

        public Criteria andOrderSaleIdIn(List<Integer> values) {
            addCriterion("order_sale_id in", values, "orderSaleId");
            return (Criteria) this;
        }

        public Criteria andOrderSaleIdNotIn(List<Integer> values) {
            addCriterion("order_sale_id not in", values, "orderSaleId");
            return (Criteria) this;
        }

        public Criteria andOrderSaleIdBetween(Integer value1, Integer value2) {
            addCriterion("order_sale_id between", value1, value2, "orderSaleId");
            return (Criteria) this;
        }

        public Criteria andOrderSaleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_sale_id not between", value1, value2, "orderSaleId");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeIsNull() {
            addCriterion("order_sale_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeIsNotNull() {
            addCriterion("order_sale_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeEqualTo(String value) {
            addCriterion("order_sale_code =", value, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeNotEqualTo(String value) {
            addCriterion("order_sale_code <>", value, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeGreaterThan(String value) {
            addCriterion("order_sale_code >", value, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_sale_code >=", value, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeLessThan(String value) {
            addCriterion("order_sale_code <", value, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeLessThanOrEqualTo(String value) {
            addCriterion("order_sale_code <=", value, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeLike(String value) {
            addCriterion("order_sale_code like", value, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeNotLike(String value) {
            addCriterion("order_sale_code not like", value, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeIn(List<String> values) {
            addCriterion("order_sale_code in", values, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeNotIn(List<String> values) {
            addCriterion("order_sale_code not in", values, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeBetween(String value1, String value2) {
            addCriterion("order_sale_code between", value1, value2, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrderSaleCodeNotBetween(String value1, String value2) {
            addCriterion("order_sale_code not between", value1, value2, "orderSaleCode");
            return (Criteria) this;
        }

        public Criteria andOrdersSaleDetailCodeIsNull() {
            addCriterion("orders_sale_detail_code is null");
            return (Criteria) this;
        }

        public Criteria andOrdersSaleDetailCodeIsNotNull() {
            addCriterion("orders_sale_detail_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersSaleDetailCodeEqualTo(String value) {
            addCriterion("orders_sale_detail_code =", value, "ordersSaleDetailCode");
            return (Criteria) this;
        }

        public Criteria andOrdersSaleDetailCodeNotEqualTo(String value) {
            addCriterion("orders_sale_detail_code <>", value, "ordersSaleDetailCode");
            return (Criteria) this;
        }

        public Criteria andOrdersSaleDetailCodeGreaterThan(String value) {
            addCriterion("orders_sale_detail_code >", value, "ordersSaleDetailCode");
            return (Criteria) this;
        }

        public Criteria andOrdersSaleDetailCodeGreaterThanOrEqualTo(String value) {
            addCriterion("orders_sale_detail_code >=", value, "ordersSaleDetailCode");
            return (Criteria) this;
        }

        public Criteria andOrdersSaleDetailCodeLessThan(String value) {
            addCriterion("orders_sale_detail_code <", value, "ordersSaleDetailCode");
            return (Criteria) this;
        }

        public Criteria andOrdersSaleDetailCodeLessThanOrEqualTo(String value) {
            addCriterion("orders_sale_detail_code <=", value, "ordersSaleDetailCode");
            return (Criteria) this;
        }

        public Criteria andOrdersSaleDetailCodeLike(String value) {
            addCriterion("orders_sale_detail_code like", value, "ordersSaleDetailCode");
            return (Criteria) this;
        }

        public Criteria andOrdersSaleDetailCodeNotLike(String value) {
            addCriterion("orders_sale_detail_code not like", value, "ordersSaleDetailCode");
            return (Criteria) this;
        }

        public Criteria andOrdersSaleDetailCodeIn(List<String> values) {
            addCriterion("orders_sale_detail_code in", values, "ordersSaleDetailCode");
            return (Criteria) this;
        }

        public Criteria andOrdersSaleDetailCodeNotIn(List<String> values) {
            addCriterion("orders_sale_detail_code not in", values, "ordersSaleDetailCode");
            return (Criteria) this;
        }

        public Criteria andOrdersSaleDetailCodeBetween(String value1, String value2) {
            addCriterion("orders_sale_detail_code between", value1, value2, "ordersSaleDetailCode");
            return (Criteria) this;
        }

        public Criteria andOrdersSaleDetailCodeNotBetween(String value1, String value2) {
            addCriterion("orders_sale_detail_code not between", value1, value2, "ordersSaleDetailCode");
            return (Criteria) this;
        }

        public Criteria andSellerSkuIsNull() {
            addCriterion("seller_sku is null");
            return (Criteria) this;
        }

        public Criteria andSellerSkuIsNotNull() {
            addCriterion("seller_sku is not null");
            return (Criteria) this;
        }

        public Criteria andSellerSkuEqualTo(String value) {
            addCriterion("seller_sku =", value, "sellerSku");
            return (Criteria) this;
        }

        public Criteria andSellerSkuNotEqualTo(String value) {
            addCriterion("seller_sku <>", value, "sellerSku");
            return (Criteria) this;
        }

        public Criteria andSellerSkuGreaterThan(String value) {
            addCriterion("seller_sku >", value, "sellerSku");
            return (Criteria) this;
        }

        public Criteria andSellerSkuGreaterThanOrEqualTo(String value) {
            addCriterion("seller_sku >=", value, "sellerSku");
            return (Criteria) this;
        }

        public Criteria andSellerSkuLessThan(String value) {
            addCriterion("seller_sku <", value, "sellerSku");
            return (Criteria) this;
        }

        public Criteria andSellerSkuLessThanOrEqualTo(String value) {
            addCriterion("seller_sku <=", value, "sellerSku");
            return (Criteria) this;
        }

        public Criteria andSellerSkuLike(String value) {
            addCriterion("seller_sku like", value, "sellerSku");
            return (Criteria) this;
        }

        public Criteria andSellerSkuNotLike(String value) {
            addCriterion("seller_sku not like", value, "sellerSku");
            return (Criteria) this;
        }

        public Criteria andSellerSkuIn(List<String> values) {
            addCriterion("seller_sku in", values, "sellerSku");
            return (Criteria) this;
        }

        public Criteria andSellerSkuNotIn(List<String> values) {
            addCriterion("seller_sku not in", values, "sellerSku");
            return (Criteria) this;
        }

        public Criteria andSellerSkuBetween(String value1, String value2) {
            addCriterion("seller_sku between", value1, value2, "sellerSku");
            return (Criteria) this;
        }

        public Criteria andSellerSkuNotBetween(String value1, String value2) {
            addCriterion("seller_sku not between", value1, value2, "sellerSku");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Integer value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Integer value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Integer value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Integer value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Integer value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Integer> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Integer> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Integer value1, Integer value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdIsNull() {
            addCriterion("goods_img_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdIsNotNull() {
            addCriterion("goods_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdEqualTo(Integer value) {
            addCriterion("goods_img_id =", value, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdNotEqualTo(Integer value) {
            addCriterion("goods_img_id <>", value, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdGreaterThan(Integer value) {
            addCriterion("goods_img_id >", value, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_img_id >=", value, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdLessThan(Integer value) {
            addCriterion("goods_img_id <", value, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_img_id <=", value, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdIn(List<Integer> values) {
            addCriterion("goods_img_id in", values, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdNotIn(List<Integer> values) {
            addCriterion("goods_img_id not in", values, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_img_id between", value1, value2, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_img_id not between", value1, value2, "goodsImgId");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andLocalPriceIsNull() {
            addCriterion("local_price is null");
            return (Criteria) this;
        }

        public Criteria andLocalPriceIsNotNull() {
            addCriterion("local_price is not null");
            return (Criteria) this;
        }

        public Criteria andLocalPriceEqualTo(BigDecimal value) {
            addCriterion("local_price =", value, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceNotEqualTo(BigDecimal value) {
            addCriterion("local_price <>", value, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceGreaterThan(BigDecimal value) {
            addCriterion("local_price >", value, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("local_price >=", value, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceLessThan(BigDecimal value) {
            addCriterion("local_price <", value, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("local_price <=", value, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceIn(List<BigDecimal> values) {
            addCriterion("local_price in", values, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceNotIn(List<BigDecimal> values) {
            addCriterion("local_price not in", values, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("local_price between", value1, value2, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("local_price not between", value1, value2, "localPrice");
            return (Criteria) this;
        }

        public Criteria andLocalAmountIsNull() {
            addCriterion("local_amount is null");
            return (Criteria) this;
        }

        public Criteria andLocalAmountIsNotNull() {
            addCriterion("local_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLocalAmountEqualTo(BigDecimal value) {
            addCriterion("local_amount =", value, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountNotEqualTo(BigDecimal value) {
            addCriterion("local_amount <>", value, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountGreaterThan(BigDecimal value) {
            addCriterion("local_amount >", value, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("local_amount >=", value, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountLessThan(BigDecimal value) {
            addCriterion("local_amount <", value, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("local_amount <=", value, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountIn(List<BigDecimal> values) {
            addCriterion("local_amount in", values, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountNotIn(List<BigDecimal> values) {
            addCriterion("local_amount not in", values, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("local_amount between", value1, value2, "localAmount");
            return (Criteria) this;
        }

        public Criteria andLocalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("local_amount not between", value1, value2, "localAmount");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNull() {
            addCriterion("expense is null");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNotNull() {
            addCriterion("expense is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseEqualTo(BigDecimal value) {
            addCriterion("expense =", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotEqualTo(BigDecimal value) {
            addCriterion("expense <>", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThan(BigDecimal value) {
            addCriterion("expense >", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expense >=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThan(BigDecimal value) {
            addCriterion("expense <", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expense <=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseIn(List<BigDecimal> values) {
            addCriterion("expense in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotIn(List<BigDecimal> values) {
            addCriterion("expense not in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expense between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expense not between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNull() {
            addCriterion("is_gift is null");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNotNull() {
            addCriterion("is_gift is not null");
            return (Criteria) this;
        }

        public Criteria andIsGiftEqualTo(Boolean value) {
            addCriterion("is_gift =", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotEqualTo(Boolean value) {
            addCriterion("is_gift <>", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThan(Boolean value) {
            addCriterion("is_gift >", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_gift >=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThan(Boolean value) {
            addCriterion("is_gift <", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThanOrEqualTo(Boolean value) {
            addCriterion("is_gift <=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftIn(List<Boolean> values) {
            addCriterion("is_gift in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotIn(List<Boolean> values) {
            addCriterion("is_gift not in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftBetween(Boolean value1, Boolean value2) {
            addCriterion("is_gift between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_gift not between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andIsOutOfStockIsNull() {
            addCriterion("is_out_of_stock is null");
            return (Criteria) this;
        }

        public Criteria andIsOutOfStockIsNotNull() {
            addCriterion("is_out_of_stock is not null");
            return (Criteria) this;
        }

        public Criteria andIsOutOfStockEqualTo(Boolean value) {
            addCriterion("is_out_of_stock =", value, "isOutOfStock");
            return (Criteria) this;
        }

        public Criteria andIsOutOfStockNotEqualTo(Boolean value) {
            addCriterion("is_out_of_stock <>", value, "isOutOfStock");
            return (Criteria) this;
        }

        public Criteria andIsOutOfStockGreaterThan(Boolean value) {
            addCriterion("is_out_of_stock >", value, "isOutOfStock");
            return (Criteria) this;
        }

        public Criteria andIsOutOfStockGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_out_of_stock >=", value, "isOutOfStock");
            return (Criteria) this;
        }

        public Criteria andIsOutOfStockLessThan(Boolean value) {
            addCriterion("is_out_of_stock <", value, "isOutOfStock");
            return (Criteria) this;
        }

        public Criteria andIsOutOfStockLessThanOrEqualTo(Boolean value) {
            addCriterion("is_out_of_stock <=", value, "isOutOfStock");
            return (Criteria) this;
        }

        public Criteria andIsOutOfStockIn(List<Boolean> values) {
            addCriterion("is_out_of_stock in", values, "isOutOfStock");
            return (Criteria) this;
        }

        public Criteria andIsOutOfStockNotIn(List<Boolean> values) {
            addCriterion("is_out_of_stock not in", values, "isOutOfStock");
            return (Criteria) this;
        }

        public Criteria andIsOutOfStockBetween(Boolean value1, Boolean value2) {
            addCriterion("is_out_of_stock between", value1, value2, "isOutOfStock");
            return (Criteria) this;
        }

        public Criteria andIsOutOfStockNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_out_of_stock not between", value1, value2, "isOutOfStock");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * sale_orders_detail
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sale_orders_detail 2018-05-10
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public static class SelectiveField {
        private Set<String> fields;

        private static String allFields = "id,order_sale_id,order_sale_code,orders_sale_detail_code,seller_sku,goods_id,sku_id,goods_img_id,quantity,weight,local_price,local_amount,expense,is_gift,remark,cost_price,is_out_of_stock,status,insert_time,update_time";

        private SelectiveField() {
            fields = new HashSet<>();
        }

        public static SelectiveField select() {
            return new SelectiveField();
        }

        public SelectiveField id() {
            fields.add("id");
            return this;
        }

        public SelectiveField orderSaleId() {
            fields.add("order_sale_id");
            return this;
        }

        public SelectiveField orderSaleCode() {
            fields.add("order_sale_code");
            return this;
        }

        public SelectiveField ordersSaleDetailCode() {
            fields.add("orders_sale_detail_code");
            return this;
        }

        public SelectiveField sellerSku() {
            fields.add("seller_sku");
            return this;
        }

        public SelectiveField goodsId() {
            fields.add("goods_id");
            return this;
        }

        public SelectiveField skuId() {
            fields.add("sku_id");
            return this;
        }

        public SelectiveField goodsImgId() {
            fields.add("goods_img_id");
            return this;
        }

        public SelectiveField quantity() {
            fields.add("quantity");
            return this;
        }

        public SelectiveField weight() {
            fields.add("weight");
            return this;
        }

        public SelectiveField localPrice() {
            fields.add("local_price");
            return this;
        }

        public SelectiveField localAmount() {
            fields.add("local_amount");
            return this;
        }

        public SelectiveField expense() {
            fields.add("expense");
            return this;
        }

        public SelectiveField isGift() {
            fields.add("is_gift");
            return this;
        }

        public SelectiveField remark() {
            fields.add("remark");
            return this;
        }

        public SelectiveField costPrice() {
            fields.add("cost_price");
            return this;
        }

        public SelectiveField isOutOfStock() {
            fields.add("is_out_of_stock");
            return this;
        }

        public SelectiveField status() {
            fields.add("status");
            return this;
        }

        public SelectiveField insertTime() {
            fields.add("insert_time");
            return this;
        }

        public SelectiveField updateTime() {
            fields.add("update_time");
            return this;
        }

        @Override
        public String toString() {
            if(fields.isEmpty()) return allFields;
            StringBuilder sb = new StringBuilder();
            char seperator = ',';
            Iterator<String> fieldInterator = fields.iterator();
            int i = 0;
            while(fieldInterator.hasNext()){
                if(i>0) sb.append(seperator);
                sb.append(fieldInterator.next());
                i++;
            }
            return sb.toString();
        }
    }
}