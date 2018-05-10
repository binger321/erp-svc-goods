package com.binger.goods.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SaleOrdersMainExample {
    /**
     * sale_orders_main
     */
    protected String orderByClause;

    /**
     * sale_orders_main
     */
    protected boolean distinct;

    /**
     * sale_orders_main
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    private SelectiveField selectiveField;

    public SaleOrdersMainExample() {
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
     * sale_orders_main 2018-05-10
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

        public Criteria andOrderCodeIsNull() {
            addCriterion("order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("order_code like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("order_code not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("order_code not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIsNull() {
            addCriterion("exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIsNotNull() {
            addCriterion("exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateEqualTo(BigDecimal value) {
            addCriterion("exchange_rate =", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotEqualTo(BigDecimal value) {
            addCriterion("exchange_rate <>", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThan(BigDecimal value) {
            addCriterion("exchange_rate >", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate >=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThan(BigDecimal value) {
            addCriterion("exchange_rate <", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate <=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIn(List<BigDecimal> values) {
            addCriterion("exchange_rate in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotIn(List<BigDecimal> values) {
            addCriterion("exchange_rate not in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_rate between", value1, value2, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_rate not between", value1, value2, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andOrderOriMnyIsNull() {
            addCriterion("order_ori_mny is null");
            return (Criteria) this;
        }

        public Criteria andOrderOriMnyIsNotNull() {
            addCriterion("order_ori_mny is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOriMnyEqualTo(BigDecimal value) {
            addCriterion("order_ori_mny =", value, "orderOriMny");
            return (Criteria) this;
        }

        public Criteria andOrderOriMnyNotEqualTo(BigDecimal value) {
            addCriterion("order_ori_mny <>", value, "orderOriMny");
            return (Criteria) this;
        }

        public Criteria andOrderOriMnyGreaterThan(BigDecimal value) {
            addCriterion("order_ori_mny >", value, "orderOriMny");
            return (Criteria) this;
        }

        public Criteria andOrderOriMnyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_ori_mny >=", value, "orderOriMny");
            return (Criteria) this;
        }

        public Criteria andOrderOriMnyLessThan(BigDecimal value) {
            addCriterion("order_ori_mny <", value, "orderOriMny");
            return (Criteria) this;
        }

        public Criteria andOrderOriMnyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_ori_mny <=", value, "orderOriMny");
            return (Criteria) this;
        }

        public Criteria andOrderOriMnyIn(List<BigDecimal> values) {
            addCriterion("order_ori_mny in", values, "orderOriMny");
            return (Criteria) this;
        }

        public Criteria andOrderOriMnyNotIn(List<BigDecimal> values) {
            addCriterion("order_ori_mny not in", values, "orderOriMny");
            return (Criteria) this;
        }

        public Criteria andOrderOriMnyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_ori_mny between", value1, value2, "orderOriMny");
            return (Criteria) this;
        }

        public Criteria andOrderOriMnyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_ori_mny not between", value1, value2, "orderOriMny");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andOrderLocMnyIsNull() {
            addCriterion("order_loc_mny is null");
            return (Criteria) this;
        }

        public Criteria andOrderLocMnyIsNotNull() {
            addCriterion("order_loc_mny is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLocMnyEqualTo(BigDecimal value) {
            addCriterion("order_loc_mny =", value, "orderLocMny");
            return (Criteria) this;
        }

        public Criteria andOrderLocMnyNotEqualTo(BigDecimal value) {
            addCriterion("order_loc_mny <>", value, "orderLocMny");
            return (Criteria) this;
        }

        public Criteria andOrderLocMnyGreaterThan(BigDecimal value) {
            addCriterion("order_loc_mny >", value, "orderLocMny");
            return (Criteria) this;
        }

        public Criteria andOrderLocMnyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_loc_mny >=", value, "orderLocMny");
            return (Criteria) this;
        }

        public Criteria andOrderLocMnyLessThan(BigDecimal value) {
            addCriterion("order_loc_mny <", value, "orderLocMny");
            return (Criteria) this;
        }

        public Criteria andOrderLocMnyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_loc_mny <=", value, "orderLocMny");
            return (Criteria) this;
        }

        public Criteria andOrderLocMnyIn(List<BigDecimal> values) {
            addCriterion("order_loc_mny in", values, "orderLocMny");
            return (Criteria) this;
        }

        public Criteria andOrderLocMnyNotIn(List<BigDecimal> values) {
            addCriterion("order_loc_mny not in", values, "orderLocMny");
            return (Criteria) this;
        }

        public Criteria andOrderLocMnyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_loc_mny between", value1, value2, "orderLocMny");
            return (Criteria) this;
        }

        public Criteria andOrderLocMnyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_loc_mny not between", value1, value2, "orderLocMny");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderCateIsNull() {
            addCriterion("order_cate is null");
            return (Criteria) this;
        }

        public Criteria andOrderCateIsNotNull() {
            addCriterion("order_cate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCateEqualTo(Integer value) {
            addCriterion("order_cate =", value, "orderCate");
            return (Criteria) this;
        }

        public Criteria andOrderCateNotEqualTo(Integer value) {
            addCriterion("order_cate <>", value, "orderCate");
            return (Criteria) this;
        }

        public Criteria andOrderCateGreaterThan(Integer value) {
            addCriterion("order_cate >", value, "orderCate");
            return (Criteria) this;
        }

        public Criteria andOrderCateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_cate >=", value, "orderCate");
            return (Criteria) this;
        }

        public Criteria andOrderCateLessThan(Integer value) {
            addCriterion("order_cate <", value, "orderCate");
            return (Criteria) this;
        }

        public Criteria andOrderCateLessThanOrEqualTo(Integer value) {
            addCriterion("order_cate <=", value, "orderCate");
            return (Criteria) this;
        }

        public Criteria andOrderCateIn(List<Integer> values) {
            addCriterion("order_cate in", values, "orderCate");
            return (Criteria) this;
        }

        public Criteria andOrderCateNotIn(List<Integer> values) {
            addCriterion("order_cate not in", values, "orderCate");
            return (Criteria) this;
        }

        public Criteria andOrderCateBetween(Integer value1, Integer value2) {
            addCriterion("order_cate between", value1, value2, "orderCate");
            return (Criteria) this;
        }

        public Criteria andOrderCateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_cate not between", value1, value2, "orderCate");
            return (Criteria) this;
        }

        public Criteria andShipMarkIsNull() {
            addCriterion("ship_mark is null");
            return (Criteria) this;
        }

        public Criteria andShipMarkIsNotNull() {
            addCriterion("ship_mark is not null");
            return (Criteria) this;
        }

        public Criteria andShipMarkEqualTo(Integer value) {
            addCriterion("ship_mark =", value, "shipMark");
            return (Criteria) this;
        }

        public Criteria andShipMarkNotEqualTo(Integer value) {
            addCriterion("ship_mark <>", value, "shipMark");
            return (Criteria) this;
        }

        public Criteria andShipMarkGreaterThan(Integer value) {
            addCriterion("ship_mark >", value, "shipMark");
            return (Criteria) this;
        }

        public Criteria andShipMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("ship_mark >=", value, "shipMark");
            return (Criteria) this;
        }

        public Criteria andShipMarkLessThan(Integer value) {
            addCriterion("ship_mark <", value, "shipMark");
            return (Criteria) this;
        }

        public Criteria andShipMarkLessThanOrEqualTo(Integer value) {
            addCriterion("ship_mark <=", value, "shipMark");
            return (Criteria) this;
        }

        public Criteria andShipMarkIn(List<Integer> values) {
            addCriterion("ship_mark in", values, "shipMark");
            return (Criteria) this;
        }

        public Criteria andShipMarkNotIn(List<Integer> values) {
            addCriterion("ship_mark not in", values, "shipMark");
            return (Criteria) this;
        }

        public Criteria andShipMarkBetween(Integer value1, Integer value2) {
            addCriterion("ship_mark between", value1, value2, "shipMark");
            return (Criteria) this;
        }

        public Criteria andShipMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("ship_mark not between", value1, value2, "shipMark");
            return (Criteria) this;
        }

        public Criteria andShipMarkTimeIsNull() {
            addCriterion("ship_mark_time is null");
            return (Criteria) this;
        }

        public Criteria andShipMarkTimeIsNotNull() {
            addCriterion("ship_mark_time is not null");
            return (Criteria) this;
        }

        public Criteria andShipMarkTimeEqualTo(Date value) {
            addCriterion("ship_mark_time =", value, "shipMarkTime");
            return (Criteria) this;
        }

        public Criteria andShipMarkTimeNotEqualTo(Date value) {
            addCriterion("ship_mark_time <>", value, "shipMarkTime");
            return (Criteria) this;
        }

        public Criteria andShipMarkTimeGreaterThan(Date value) {
            addCriterion("ship_mark_time >", value, "shipMarkTime");
            return (Criteria) this;
        }

        public Criteria andShipMarkTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ship_mark_time >=", value, "shipMarkTime");
            return (Criteria) this;
        }

        public Criteria andShipMarkTimeLessThan(Date value) {
            addCriterion("ship_mark_time <", value, "shipMarkTime");
            return (Criteria) this;
        }

        public Criteria andShipMarkTimeLessThanOrEqualTo(Date value) {
            addCriterion("ship_mark_time <=", value, "shipMarkTime");
            return (Criteria) this;
        }

        public Criteria andShipMarkTimeIn(List<Date> values) {
            addCriterion("ship_mark_time in", values, "shipMarkTime");
            return (Criteria) this;
        }

        public Criteria andShipMarkTimeNotIn(List<Date> values) {
            addCriterion("ship_mark_time not in", values, "shipMarkTime");
            return (Criteria) this;
        }

        public Criteria andShipMarkTimeBetween(Date value1, Date value2) {
            addCriterion("ship_mark_time between", value1, value2, "shipMarkTime");
            return (Criteria) this;
        }

        public Criteria andShipMarkTimeNotBetween(Date value1, Date value2) {
            addCriterion("ship_mark_time not between", value1, value2, "shipMarkTime");
            return (Criteria) this;
        }

        public Criteria andShipMarkQtyIsNull() {
            addCriterion("ship_mark_qty is null");
            return (Criteria) this;
        }

        public Criteria andShipMarkQtyIsNotNull() {
            addCriterion("ship_mark_qty is not null");
            return (Criteria) this;
        }

        public Criteria andShipMarkQtyEqualTo(Integer value) {
            addCriterion("ship_mark_qty =", value, "shipMarkQty");
            return (Criteria) this;
        }

        public Criteria andShipMarkQtyNotEqualTo(Integer value) {
            addCriterion("ship_mark_qty <>", value, "shipMarkQty");
            return (Criteria) this;
        }

        public Criteria andShipMarkQtyGreaterThan(Integer value) {
            addCriterion("ship_mark_qty >", value, "shipMarkQty");
            return (Criteria) this;
        }

        public Criteria andShipMarkQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("ship_mark_qty >=", value, "shipMarkQty");
            return (Criteria) this;
        }

        public Criteria andShipMarkQtyLessThan(Integer value) {
            addCriterion("ship_mark_qty <", value, "shipMarkQty");
            return (Criteria) this;
        }

        public Criteria andShipMarkQtyLessThanOrEqualTo(Integer value) {
            addCriterion("ship_mark_qty <=", value, "shipMarkQty");
            return (Criteria) this;
        }

        public Criteria andShipMarkQtyIn(List<Integer> values) {
            addCriterion("ship_mark_qty in", values, "shipMarkQty");
            return (Criteria) this;
        }

        public Criteria andShipMarkQtyNotIn(List<Integer> values) {
            addCriterion("ship_mark_qty not in", values, "shipMarkQty");
            return (Criteria) this;
        }

        public Criteria andShipMarkQtyBetween(Integer value1, Integer value2) {
            addCriterion("ship_mark_qty between", value1, value2, "shipMarkQty");
            return (Criteria) this;
        }

        public Criteria andShipMarkQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("ship_mark_qty not between", value1, value2, "shipMarkQty");
            return (Criteria) this;
        }

        public Criteria andAssignDateIsNull() {
            addCriterion("assign_date is null");
            return (Criteria) this;
        }

        public Criteria andAssignDateIsNotNull() {
            addCriterion("assign_date is not null");
            return (Criteria) this;
        }

        public Criteria andAssignDateEqualTo(Date value) {
            addCriterion("assign_date =", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateNotEqualTo(Date value) {
            addCriterion("assign_date <>", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateGreaterThan(Date value) {
            addCriterion("assign_date >", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateGreaterThanOrEqualTo(Date value) {
            addCriterion("assign_date >=", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateLessThan(Date value) {
            addCriterion("assign_date <", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateLessThanOrEqualTo(Date value) {
            addCriterion("assign_date <=", value, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateIn(List<Date> values) {
            addCriterion("assign_date in", values, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateNotIn(List<Date> values) {
            addCriterion("assign_date not in", values, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateBetween(Date value1, Date value2) {
            addCriterion("assign_date between", value1, value2, "assignDate");
            return (Criteria) this;
        }

        public Criteria andAssignDateNotBetween(Date value1, Date value2) {
            addCriterion("assign_date not between", value1, value2, "assignDate");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNull() {
            addCriterion("buyer_name is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNotNull() {
            addCriterion("buyer_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameEqualTo(String value) {
            addCriterion("buyer_name =", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotEqualTo(String value) {
            addCriterion("buyer_name <>", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThan(String value) {
            addCriterion("buyer_name >", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_name >=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThan(String value) {
            addCriterion("buyer_name <", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThanOrEqualTo(String value) {
            addCriterion("buyer_name <=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLike(String value) {
            addCriterion("buyer_name like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotLike(String value) {
            addCriterion("buyer_name not like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIn(List<String> values) {
            addCriterion("buyer_name in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotIn(List<String> values) {
            addCriterion("buyer_name not in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameBetween(String value1, String value2) {
            addCriterion("buyer_name between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotBetween(String value1, String value2) {
            addCriterion("buyer_name not between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNull() {
            addCriterion("customer_email is null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNotNull() {
            addCriterion("customer_email is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailEqualTo(String value) {
            addCriterion("customer_email =", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotEqualTo(String value) {
            addCriterion("customer_email <>", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThan(String value) {
            addCriterion("customer_email >", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("customer_email >=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThan(String value) {
            addCriterion("customer_email <", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThanOrEqualTo(String value) {
            addCriterion("customer_email <=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLike(String value) {
            addCriterion("customer_email like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotLike(String value) {
            addCriterion("customer_email not like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIn(List<String> values) {
            addCriterion("customer_email in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotIn(List<String> values) {
            addCriterion("customer_email not in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailBetween(String value1, String value2) {
            addCriterion("customer_email between", value1, value2, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotBetween(String value1, String value2) {
            addCriterion("customer_email not between", value1, value2, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Integer value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Integer value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Integer value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Integer value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Integer> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Integer> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNull() {
            addCriterion("country_name is null");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNotNull() {
            addCriterion("country_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNameEqualTo(String value) {
            addCriterion("country_name =", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotEqualTo(String value) {
            addCriterion("country_name <>", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThan(String value) {
            addCriterion("country_name >", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("country_name >=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThan(String value) {
            addCriterion("country_name <", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThanOrEqualTo(String value) {
            addCriterion("country_name <=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLike(String value) {
            addCriterion("country_name like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotLike(String value) {
            addCriterion("country_name not like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIn(List<String> values) {
            addCriterion("country_name in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotIn(List<String> values) {
            addCriterion("country_name not in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameBetween(String value1, String value2) {
            addCriterion("country_name between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotBetween(String value1, String value2) {
            addCriterion("country_name not between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("zip_code is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("zip_code =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("zip_code <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("zip_code >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zip_code >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("zip_code <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("zip_code <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("zip_code like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("zip_code not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("zip_code in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("zip_code not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("zip_code between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("zip_code not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andAddress1IsNull() {
            addCriterion("address1 is null");
            return (Criteria) this;
        }

        public Criteria andAddress1IsNotNull() {
            addCriterion("address1 is not null");
            return (Criteria) this;
        }

        public Criteria andAddress1EqualTo(String value) {
            addCriterion("address1 =", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotEqualTo(String value) {
            addCriterion("address1 <>", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1GreaterThan(String value) {
            addCriterion("address1 >", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1GreaterThanOrEqualTo(String value) {
            addCriterion("address1 >=", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1LessThan(String value) {
            addCriterion("address1 <", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1LessThanOrEqualTo(String value) {
            addCriterion("address1 <=", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1Like(String value) {
            addCriterion("address1 like", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotLike(String value) {
            addCriterion("address1 not like", value, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1In(List<String> values) {
            addCriterion("address1 in", values, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotIn(List<String> values) {
            addCriterion("address1 not in", values, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1Between(String value1, String value2) {
            addCriterion("address1 between", value1, value2, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress1NotBetween(String value1, String value2) {
            addCriterion("address1 not between", value1, value2, "address1");
            return (Criteria) this;
        }

        public Criteria andAddress2IsNull() {
            addCriterion("address2 is null");
            return (Criteria) this;
        }

        public Criteria andAddress2IsNotNull() {
            addCriterion("address2 is not null");
            return (Criteria) this;
        }

        public Criteria andAddress2EqualTo(String value) {
            addCriterion("address2 =", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotEqualTo(String value) {
            addCriterion("address2 <>", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2GreaterThan(String value) {
            addCriterion("address2 >", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2GreaterThanOrEqualTo(String value) {
            addCriterion("address2 >=", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2LessThan(String value) {
            addCriterion("address2 <", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2LessThanOrEqualTo(String value) {
            addCriterion("address2 <=", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2Like(String value) {
            addCriterion("address2 like", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotLike(String value) {
            addCriterion("address2 not like", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2In(List<String> values) {
            addCriterion("address2 in", values, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotIn(List<String> values) {
            addCriterion("address2 not in", values, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2Between(String value1, String value2) {
            addCriterion("address2 between", value1, value2, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotBetween(String value1, String value2) {
            addCriterion("address2 not between", value1, value2, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress3IsNull() {
            addCriterion("address3 is null");
            return (Criteria) this;
        }

        public Criteria andAddress3IsNotNull() {
            addCriterion("address3 is not null");
            return (Criteria) this;
        }

        public Criteria andAddress3EqualTo(String value) {
            addCriterion("address3 =", value, "address3");
            return (Criteria) this;
        }

        public Criteria andAddress3NotEqualTo(String value) {
            addCriterion("address3 <>", value, "address3");
            return (Criteria) this;
        }

        public Criteria andAddress3GreaterThan(String value) {
            addCriterion("address3 >", value, "address3");
            return (Criteria) this;
        }

        public Criteria andAddress3GreaterThanOrEqualTo(String value) {
            addCriterion("address3 >=", value, "address3");
            return (Criteria) this;
        }

        public Criteria andAddress3LessThan(String value) {
            addCriterion("address3 <", value, "address3");
            return (Criteria) this;
        }

        public Criteria andAddress3LessThanOrEqualTo(String value) {
            addCriterion("address3 <=", value, "address3");
            return (Criteria) this;
        }

        public Criteria andAddress3Like(String value) {
            addCriterion("address3 like", value, "address3");
            return (Criteria) this;
        }

        public Criteria andAddress3NotLike(String value) {
            addCriterion("address3 not like", value, "address3");
            return (Criteria) this;
        }

        public Criteria andAddress3In(List<String> values) {
            addCriterion("address3 in", values, "address3");
            return (Criteria) this;
        }

        public Criteria andAddress3NotIn(List<String> values) {
            addCriterion("address3 not in", values, "address3");
            return (Criteria) this;
        }

        public Criteria andAddress3Between(String value1, String value2) {
            addCriterion("address3 between", value1, value2, "address3");
            return (Criteria) this;
        }

        public Criteria andAddress3NotBetween(String value1, String value2) {
            addCriterion("address3 not between", value1, value2, "address3");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyIdIsNull() {
            addCriterion("logist_company_id is null");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyIdIsNotNull() {
            addCriterion("logist_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyIdEqualTo(Integer value) {
            addCriterion("logist_company_id =", value, "logistCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyIdNotEqualTo(Integer value) {
            addCriterion("logist_company_id <>", value, "logistCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyIdGreaterThan(Integer value) {
            addCriterion("logist_company_id >", value, "logistCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("logist_company_id >=", value, "logistCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyIdLessThan(Integer value) {
            addCriterion("logist_company_id <", value, "logistCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("logist_company_id <=", value, "logistCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyIdIn(List<Integer> values) {
            addCriterion("logist_company_id in", values, "logistCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyIdNotIn(List<Integer> values) {
            addCriterion("logist_company_id not in", values, "logistCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("logist_company_id between", value1, value2, "logistCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("logist_company_id not between", value1, value2, "logistCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyCodeIsNull() {
            addCriterion("logist_company_code is null");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyCodeIsNotNull() {
            addCriterion("logist_company_code is not null");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyCodeEqualTo(String value) {
            addCriterion("logist_company_code =", value, "logistCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyCodeNotEqualTo(String value) {
            addCriterion("logist_company_code <>", value, "logistCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyCodeGreaterThan(String value) {
            addCriterion("logist_company_code >", value, "logistCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("logist_company_code >=", value, "logistCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyCodeLessThan(String value) {
            addCriterion("logist_company_code <", value, "logistCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("logist_company_code <=", value, "logistCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyCodeLike(String value) {
            addCriterion("logist_company_code like", value, "logistCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyCodeNotLike(String value) {
            addCriterion("logist_company_code not like", value, "logistCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyCodeIn(List<String> values) {
            addCriterion("logist_company_code in", values, "logistCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyCodeNotIn(List<String> values) {
            addCriterion("logist_company_code not in", values, "logistCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyCodeBetween(String value1, String value2) {
            addCriterion("logist_company_code between", value1, value2, "logistCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("logist_company_code not between", value1, value2, "logistCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameIsNull() {
            addCriterion("logist_company_name is null");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameIsNotNull() {
            addCriterion("logist_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameEqualTo(String value) {
            addCriterion("logist_company_name =", value, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameNotEqualTo(String value) {
            addCriterion("logist_company_name <>", value, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameGreaterThan(String value) {
            addCriterion("logist_company_name >", value, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("logist_company_name >=", value, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameLessThan(String value) {
            addCriterion("logist_company_name <", value, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("logist_company_name <=", value, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameLike(String value) {
            addCriterion("logist_company_name like", value, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameNotLike(String value) {
            addCriterion("logist_company_name not like", value, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameIn(List<String> values) {
            addCriterion("logist_company_name in", values, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameNotIn(List<String> values) {
            addCriterion("logist_company_name not in", values, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameBetween(String value1, String value2) {
            addCriterion("logist_company_name between", value1, value2, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogistCompanyNameNotBetween(String value1, String value2) {
            addCriterion("logist_company_name not between", value1, value2, "logistCompanyName");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNull() {
            addCriterion("warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(Integer value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(Integer value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(Integer value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(Integer value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<Integer> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<Integer> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIsNull() {
            addCriterion("warehouse_code is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIsNotNull() {
            addCriterion("warehouse_code is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeEqualTo(String value) {
            addCriterion("warehouse_code =", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotEqualTo(String value) {
            addCriterion("warehouse_code <>", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThan(String value) {
            addCriterion("warehouse_code >", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_code >=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThan(String value) {
            addCriterion("warehouse_code <", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThanOrEqualTo(String value) {
            addCriterion("warehouse_code <=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLike(String value) {
            addCriterion("warehouse_code like", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotLike(String value) {
            addCriterion("warehouse_code not like", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIn(List<String> values) {
            addCriterion("warehouse_code in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotIn(List<String> values) {
            addCriterion("warehouse_code not in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeBetween(String value1, String value2) {
            addCriterion("warehouse_code between", value1, value2, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotBetween(String value1, String value2) {
            addCriterion("warehouse_code not between", value1, value2, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameIsNull() {
            addCriterion("warehouse_name is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameIsNotNull() {
            addCriterion("warehouse_name is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameEqualTo(String value) {
            addCriterion("warehouse_name =", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameNotEqualTo(String value) {
            addCriterion("warehouse_name <>", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameGreaterThan(String value) {
            addCriterion("warehouse_name >", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_name >=", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameLessThan(String value) {
            addCriterion("warehouse_name <", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameLessThanOrEqualTo(String value) {
            addCriterion("warehouse_name <=", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameLike(String value) {
            addCriterion("warehouse_name like", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameNotLike(String value) {
            addCriterion("warehouse_name not like", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameIn(List<String> values) {
            addCriterion("warehouse_name in", values, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameNotIn(List<String> values) {
            addCriterion("warehouse_name not in", values, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameBetween(String value1, String value2) {
            addCriterion("warehouse_name between", value1, value2, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameNotBetween(String value1, String value2) {
            addCriterion("warehouse_name not between", value1, value2, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andTrackNumberIsNull() {
            addCriterion("track_number is null");
            return (Criteria) this;
        }

        public Criteria andTrackNumberIsNotNull() {
            addCriterion("track_number is not null");
            return (Criteria) this;
        }

        public Criteria andTrackNumberEqualTo(String value) {
            addCriterion("track_number =", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberNotEqualTo(String value) {
            addCriterion("track_number <>", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberGreaterThan(String value) {
            addCriterion("track_number >", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberGreaterThanOrEqualTo(String value) {
            addCriterion("track_number >=", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberLessThan(String value) {
            addCriterion("track_number <", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberLessThanOrEqualTo(String value) {
            addCriterion("track_number <=", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberLike(String value) {
            addCriterion("track_number like", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberNotLike(String value) {
            addCriterion("track_number not like", value, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberIn(List<String> values) {
            addCriterion("track_number in", values, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberNotIn(List<String> values) {
            addCriterion("track_number not in", values, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberBetween(String value1, String value2) {
            addCriterion("track_number between", value1, value2, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackNumberNotBetween(String value1, String value2) {
            addCriterion("track_number not between", value1, value2, "trackNumber");
            return (Criteria) this;
        }

        public Criteria andTrackTimeIsNull() {
            addCriterion("track_time is null");
            return (Criteria) this;
        }

        public Criteria andTrackTimeIsNotNull() {
            addCriterion("track_time is not null");
            return (Criteria) this;
        }

        public Criteria andTrackTimeEqualTo(Date value) {
            addCriterion("track_time =", value, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeNotEqualTo(Date value) {
            addCriterion("track_time <>", value, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeGreaterThan(Date value) {
            addCriterion("track_time >", value, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("track_time >=", value, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeLessThan(Date value) {
            addCriterion("track_time <", value, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeLessThanOrEqualTo(Date value) {
            addCriterion("track_time <=", value, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeIn(List<Date> values) {
            addCriterion("track_time in", values, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeNotIn(List<Date> values) {
            addCriterion("track_time not in", values, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeBetween(Date value1, Date value2) {
            addCriterion("track_time between", value1, value2, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeNotBetween(Date value1, Date value2) {
            addCriterion("track_time not between", value1, value2, "trackTime");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIsNull() {
            addCriterion("currency_code is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIsNotNull() {
            addCriterion("currency_code is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeEqualTo(String value) {
            addCriterion("currency_code =", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotEqualTo(String value) {
            addCriterion("currency_code <>", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeGreaterThan(String value) {
            addCriterion("currency_code >", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("currency_code >=", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLessThan(String value) {
            addCriterion("currency_code <", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLessThanOrEqualTo(String value) {
            addCriterion("currency_code <=", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLike(String value) {
            addCriterion("currency_code like", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotLike(String value) {
            addCriterion("currency_code not like", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIn(List<String> values) {
            addCriterion("currency_code in", values, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotIn(List<String> values) {
            addCriterion("currency_code not in", values, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeBetween(String value1, String value2) {
            addCriterion("currency_code between", value1, value2, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotBetween(String value1, String value2) {
            addCriterion("currency_code not between", value1, value2, "currencyCode");
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

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andReinvoiceMnyIsNull() {
            addCriterion("reinvoice_mny is null");
            return (Criteria) this;
        }

        public Criteria andReinvoiceMnyIsNotNull() {
            addCriterion("reinvoice_mny is not null");
            return (Criteria) this;
        }

        public Criteria andReinvoiceMnyEqualTo(BigDecimal value) {
            addCriterion("reinvoice_mny =", value, "reinvoiceMny");
            return (Criteria) this;
        }

        public Criteria andReinvoiceMnyNotEqualTo(BigDecimal value) {
            addCriterion("reinvoice_mny <>", value, "reinvoiceMny");
            return (Criteria) this;
        }

        public Criteria andReinvoiceMnyGreaterThan(BigDecimal value) {
            addCriterion("reinvoice_mny >", value, "reinvoiceMny");
            return (Criteria) this;
        }

        public Criteria andReinvoiceMnyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reinvoice_mny >=", value, "reinvoiceMny");
            return (Criteria) this;
        }

        public Criteria andReinvoiceMnyLessThan(BigDecimal value) {
            addCriterion("reinvoice_mny <", value, "reinvoiceMny");
            return (Criteria) this;
        }

        public Criteria andReinvoiceMnyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reinvoice_mny <=", value, "reinvoiceMny");
            return (Criteria) this;
        }

        public Criteria andReinvoiceMnyIn(List<BigDecimal> values) {
            addCriterion("reinvoice_mny in", values, "reinvoiceMny");
            return (Criteria) this;
        }

        public Criteria andReinvoiceMnyNotIn(List<BigDecimal> values) {
            addCriterion("reinvoice_mny not in", values, "reinvoiceMny");
            return (Criteria) this;
        }

        public Criteria andReinvoiceMnyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reinvoice_mny between", value1, value2, "reinvoiceMny");
            return (Criteria) this;
        }

        public Criteria andReinvoiceMnyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reinvoice_mny not between", value1, value2, "reinvoiceMny");
            return (Criteria) this;
        }

        public Criteria andShippingWayIsNull() {
            addCriterion("shipping_way is null");
            return (Criteria) this;
        }

        public Criteria andShippingWayIsNotNull() {
            addCriterion("shipping_way is not null");
            return (Criteria) this;
        }

        public Criteria andShippingWayEqualTo(String value) {
            addCriterion("shipping_way =", value, "shippingWay");
            return (Criteria) this;
        }

        public Criteria andShippingWayNotEqualTo(String value) {
            addCriterion("shipping_way <>", value, "shippingWay");
            return (Criteria) this;
        }

        public Criteria andShippingWayGreaterThan(String value) {
            addCriterion("shipping_way >", value, "shippingWay");
            return (Criteria) this;
        }

        public Criteria andShippingWayGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_way >=", value, "shippingWay");
            return (Criteria) this;
        }

        public Criteria andShippingWayLessThan(String value) {
            addCriterion("shipping_way <", value, "shippingWay");
            return (Criteria) this;
        }

        public Criteria andShippingWayLessThanOrEqualTo(String value) {
            addCriterion("shipping_way <=", value, "shippingWay");
            return (Criteria) this;
        }

        public Criteria andShippingWayLike(String value) {
            addCriterion("shipping_way like", value, "shippingWay");
            return (Criteria) this;
        }

        public Criteria andShippingWayNotLike(String value) {
            addCriterion("shipping_way not like", value, "shippingWay");
            return (Criteria) this;
        }

        public Criteria andShippingWayIn(List<String> values) {
            addCriterion("shipping_way in", values, "shippingWay");
            return (Criteria) this;
        }

        public Criteria andShippingWayNotIn(List<String> values) {
            addCriterion("shipping_way not in", values, "shippingWay");
            return (Criteria) this;
        }

        public Criteria andShippingWayBetween(String value1, String value2) {
            addCriterion("shipping_way between", value1, value2, "shippingWay");
            return (Criteria) this;
        }

        public Criteria andShippingWayNotBetween(String value1, String value2) {
            addCriterion("shipping_way not between", value1, value2, "shippingWay");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIsNull() {
            addCriterion("shipping_fee is null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIsNotNull() {
            addCriterion("shipping_fee is not null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeEqualTo(BigDecimal value) {
            addCriterion("shipping_fee =", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotEqualTo(BigDecimal value) {
            addCriterion("shipping_fee <>", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeGreaterThan(BigDecimal value) {
            addCriterion("shipping_fee >", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_fee >=", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeLessThan(BigDecimal value) {
            addCriterion("shipping_fee <", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_fee <=", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIn(List<BigDecimal> values) {
            addCriterion("shipping_fee in", values, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotIn(List<BigDecimal> values) {
            addCriterion("shipping_fee not in", values, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_fee between", value1, value2, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_fee not between", value1, value2, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNull() {
            addCriterion("payment_method is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNotNull() {
            addCriterion("payment_method is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodEqualTo(String value) {
            addCriterion("payment_method =", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotEqualTo(String value) {
            addCriterion("payment_method <>", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThan(String value) {
            addCriterion("payment_method >", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThanOrEqualTo(String value) {
            addCriterion("payment_method >=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThan(String value) {
            addCriterion("payment_method <", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThanOrEqualTo(String value) {
            addCriterion("payment_method <=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLike(String value) {
            addCriterion("payment_method like", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotLike(String value) {
            addCriterion("payment_method not like", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIn(List<String> values) {
            addCriterion("payment_method in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotIn(List<String> values) {
            addCriterion("payment_method not in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodBetween(String value1, String value2) {
            addCriterion("payment_method between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotBetween(String value1, String value2) {
            addCriterion("payment_method not between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andAssignTimeIsNull() {
            addCriterion("assign_time is null");
            return (Criteria) this;
        }

        public Criteria andAssignTimeIsNotNull() {
            addCriterion("assign_time is not null");
            return (Criteria) this;
        }

        public Criteria andAssignTimeEqualTo(Date value) {
            addCriterion("assign_time =", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotEqualTo(Date value) {
            addCriterion("assign_time <>", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeGreaterThan(Date value) {
            addCriterion("assign_time >", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("assign_time >=", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeLessThan(Date value) {
            addCriterion("assign_time <", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeLessThanOrEqualTo(Date value) {
            addCriterion("assign_time <=", value, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeIn(List<Date> values) {
            addCriterion("assign_time in", values, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotIn(List<Date> values) {
            addCriterion("assign_time not in", values, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeBetween(Date value1, Date value2) {
            addCriterion("assign_time between", value1, value2, "assignTime");
            return (Criteria) this;
        }

        public Criteria andAssignTimeNotBetween(Date value1, Date value2) {
            addCriterion("assign_time not between", value1, value2, "assignTime");
            return (Criteria) this;
        }

        public Criteria andIsReserveStockIsNull() {
            addCriterion("is_reserve_stock is null");
            return (Criteria) this;
        }

        public Criteria andIsReserveStockIsNotNull() {
            addCriterion("is_reserve_stock is not null");
            return (Criteria) this;
        }

        public Criteria andIsReserveStockEqualTo(Boolean value) {
            addCriterion("is_reserve_stock =", value, "isReserveStock");
            return (Criteria) this;
        }

        public Criteria andIsReserveStockNotEqualTo(Boolean value) {
            addCriterion("is_reserve_stock <>", value, "isReserveStock");
            return (Criteria) this;
        }

        public Criteria andIsReserveStockGreaterThan(Boolean value) {
            addCriterion("is_reserve_stock >", value, "isReserveStock");
            return (Criteria) this;
        }

        public Criteria andIsReserveStockGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_reserve_stock >=", value, "isReserveStock");
            return (Criteria) this;
        }

        public Criteria andIsReserveStockLessThan(Boolean value) {
            addCriterion("is_reserve_stock <", value, "isReserveStock");
            return (Criteria) this;
        }

        public Criteria andIsReserveStockLessThanOrEqualTo(Boolean value) {
            addCriterion("is_reserve_stock <=", value, "isReserveStock");
            return (Criteria) this;
        }

        public Criteria andIsReserveStockIn(List<Boolean> values) {
            addCriterion("is_reserve_stock in", values, "isReserveStock");
            return (Criteria) this;
        }

        public Criteria andIsReserveStockNotIn(List<Boolean> values) {
            addCriterion("is_reserve_stock not in", values, "isReserveStock");
            return (Criteria) this;
        }

        public Criteria andIsReserveStockBetween(Boolean value1, Boolean value2) {
            addCriterion("is_reserve_stock between", value1, value2, "isReserveStock");
            return (Criteria) this;
        }

        public Criteria andIsReserveStockNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_reserve_stock not between", value1, value2, "isReserveStock");
            return (Criteria) this;
        }

        public Criteria andIsOccupyIsNull() {
            addCriterion("is_occupy is null");
            return (Criteria) this;
        }

        public Criteria andIsOccupyIsNotNull() {
            addCriterion("is_occupy is not null");
            return (Criteria) this;
        }

        public Criteria andIsOccupyEqualTo(Boolean value) {
            addCriterion("is_occupy =", value, "isOccupy");
            return (Criteria) this;
        }

        public Criteria andIsOccupyNotEqualTo(Boolean value) {
            addCriterion("is_occupy <>", value, "isOccupy");
            return (Criteria) this;
        }

        public Criteria andIsOccupyGreaterThan(Boolean value) {
            addCriterion("is_occupy >", value, "isOccupy");
            return (Criteria) this;
        }

        public Criteria andIsOccupyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_occupy >=", value, "isOccupy");
            return (Criteria) this;
        }

        public Criteria andIsOccupyLessThan(Boolean value) {
            addCriterion("is_occupy <", value, "isOccupy");
            return (Criteria) this;
        }

        public Criteria andIsOccupyLessThanOrEqualTo(Boolean value) {
            addCriterion("is_occupy <=", value, "isOccupy");
            return (Criteria) this;
        }

        public Criteria andIsOccupyIn(List<Boolean> values) {
            addCriterion("is_occupy in", values, "isOccupy");
            return (Criteria) this;
        }

        public Criteria andIsOccupyNotIn(List<Boolean> values) {
            addCriterion("is_occupy not in", values, "isOccupy");
            return (Criteria) this;
        }

        public Criteria andIsOccupyBetween(Boolean value1, Boolean value2) {
            addCriterion("is_occupy between", value1, value2, "isOccupy");
            return (Criteria) this;
        }

        public Criteria andIsOccupyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_occupy not between", value1, value2, "isOccupy");
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

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }
    }

    /**
     * sale_orders_main
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sale_orders_main 2018-05-10
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

        private static String allFields = "id,order_sale_code,order_code,order_time,pay_time,exchange_rate,order_ori_mny,store_id,order_loc_mny,order_status,order_cate,ship_mark,ship_mark_time,ship_mark_qty,assign_date,customer_name,buyer_name,customer_email,country_id,country_code,country_name,state,city,zip_code,address1,address2,address3,phone_number,logist_company_id,logist_company_code,logist_company_name,warehouse_id,warehouse_code,warehouse_name,track_number,track_time,currency_code,weight,remark1,remark2,reinvoice_mny,shipping_way,shipping_fee,payment_method,assign_time,is_reserve_stock,is_occupy,status,creator,modifier,create_time,modify_time,ship_mark_fail_reason";

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

        public SelectiveField orderSaleCode() {
            fields.add("order_sale_code");
            return this;
        }

        public SelectiveField orderCode() {
            fields.add("order_code");
            return this;
        }

        public SelectiveField orderTime() {
            fields.add("order_time");
            return this;
        }

        public SelectiveField payTime() {
            fields.add("pay_time");
            return this;
        }

        public SelectiveField exchangeRate() {
            fields.add("exchange_rate");
            return this;
        }

        public SelectiveField orderOriMny() {
            fields.add("order_ori_mny");
            return this;
        }

        public SelectiveField storeId() {
            fields.add("store_id");
            return this;
        }

        public SelectiveField orderLocMny() {
            fields.add("order_loc_mny");
            return this;
        }

        public SelectiveField orderStatus() {
            fields.add("order_status");
            return this;
        }

        public SelectiveField orderCate() {
            fields.add("order_cate");
            return this;
        }

        public SelectiveField shipMark() {
            fields.add("ship_mark");
            return this;
        }

        public SelectiveField shipMarkTime() {
            fields.add("ship_mark_time");
            return this;
        }

        public SelectiveField shipMarkQty() {
            fields.add("ship_mark_qty");
            return this;
        }

        public SelectiveField assignDate() {
            fields.add("assign_date");
            return this;
        }

        public SelectiveField customerName() {
            fields.add("customer_name");
            return this;
        }

        public SelectiveField buyerName() {
            fields.add("buyer_name");
            return this;
        }

        public SelectiveField customerEmail() {
            fields.add("customer_email");
            return this;
        }

        public SelectiveField countryId() {
            fields.add("country_id");
            return this;
        }

        public SelectiveField countryCode() {
            fields.add("country_code");
            return this;
        }

        public SelectiveField countryName() {
            fields.add("country_name");
            return this;
        }

        public SelectiveField state() {
            fields.add("state");
            return this;
        }

        public SelectiveField city() {
            fields.add("city");
            return this;
        }

        public SelectiveField zipCode() {
            fields.add("zip_code");
            return this;
        }

        public SelectiveField address1() {
            fields.add("address1");
            return this;
        }

        public SelectiveField address2() {
            fields.add("address2");
            return this;
        }

        public SelectiveField address3() {
            fields.add("address3");
            return this;
        }

        public SelectiveField phoneNumber() {
            fields.add("phone_number");
            return this;
        }

        public SelectiveField logistCompanyId() {
            fields.add("logist_company_id");
            return this;
        }

        public SelectiveField logistCompanyCode() {
            fields.add("logist_company_code");
            return this;
        }

        public SelectiveField logistCompanyName() {
            fields.add("logist_company_name");
            return this;
        }

        public SelectiveField warehouseId() {
            fields.add("warehouse_id");
            return this;
        }

        public SelectiveField warehouseCode() {
            fields.add("warehouse_code");
            return this;
        }

        public SelectiveField warehouseName() {
            fields.add("warehouse_name");
            return this;
        }

        public SelectiveField trackNumber() {
            fields.add("track_number");
            return this;
        }

        public SelectiveField trackTime() {
            fields.add("track_time");
            return this;
        }

        public SelectiveField currencyCode() {
            fields.add("currency_code");
            return this;
        }

        public SelectiveField weight() {
            fields.add("weight");
            return this;
        }

        public SelectiveField remark1() {
            fields.add("remark1");
            return this;
        }

        public SelectiveField remark2() {
            fields.add("remark2");
            return this;
        }

        public SelectiveField reinvoiceMny() {
            fields.add("reinvoice_mny");
            return this;
        }

        public SelectiveField shippingWay() {
            fields.add("shipping_way");
            return this;
        }

        public SelectiveField shippingFee() {
            fields.add("shipping_fee");
            return this;
        }

        public SelectiveField paymentMethod() {
            fields.add("payment_method");
            return this;
        }

        public SelectiveField assignTime() {
            fields.add("assign_time");
            return this;
        }

        public SelectiveField isReserveStock() {
            fields.add("is_reserve_stock");
            return this;
        }

        public SelectiveField isOccupy() {
            fields.add("is_occupy");
            return this;
        }

        public SelectiveField status() {
            fields.add("status");
            return this;
        }

        public SelectiveField creator() {
            fields.add("creator");
            return this;
        }

        public SelectiveField modifier() {
            fields.add("modifier");
            return this;
        }

        public SelectiveField createTime() {
            fields.add("create_time");
            return this;
        }

        public SelectiveField modifyTime() {
            fields.add("modify_time");
            return this;
        }

        public SelectiveField shipMarkFailReason() {
            fields.add("ship_mark_fail_reason");
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