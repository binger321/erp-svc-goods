package com.binger.goods.enums;

/**
 * 订单状态枚举
 */
public enum OrderStatusEnum {
//  0未付款
//  100已付款
//  200缺货
//  300等待派单
//  400已派单
//  500核单出库
//  900退货

    NO_PAY(0, "未付款"),
    HAVE_PAY(100, "已付款"),
    STOCK_OF_OUT(200, "缺货"),
    WAIT_ASSIGN(300, "等待派单"),
    HAVE_ASSIGN(400, "已派单"),
    HAVE_DELIVER(500, "已发货"),
    HAVE_CHECK_STOCK_OUT(500, "核单出库"),
    FINISH(900, "退货");

    private Integer code;
    private String status;


    OrderStatusEnum(Integer code, String status) {
        this.code = code;
        this.status = status;
    }

    public static OrderStatusEnum getOrderStatusByCode(Integer code) {
        if (code == null) {
            return NO_PAY;
        }
        for(OrderStatusEnum statusEnum : OrderStatusEnum.values()) {
            if (statusEnum.code.equals(code)) {
                return statusEnum;
            }
        }
        return NO_PAY;
    }

    public Integer getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }
}
