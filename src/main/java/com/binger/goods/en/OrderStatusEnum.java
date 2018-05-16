package com.binger.goods.en;

/**
 * 订单状态枚举
 */
public enum OrderStatusEnum {
//    订单状态,0未付款 100已付款 200缺货 300等待派单 310已派单
//    400已转仓库 410未拣货 420已拣货未核单 430已核单未包装
//    500已揽收 900退货 910取消单 920退款 990其他异常

    NO_PAY(0, "未付款"),
    HAVE_PAY(100, "已付款"),
    STOCK_OF_OUT(200, "缺货"),
    WAIT_ASSIGN(300, "等待派单"),
    HAVE_ASSIGN(400, "已派单"),
    HAVE_CHECK_STOCK_OUT(500, "核单出库"),
    FINISH(900, "退货");

    private Integer code;
    private String Status;

    OrderStatusEnum(Integer code, String status) {
        this.code = code;
        Status = status;
    }

//    public static OrderStatusEnum getOrderStatusByCode(Integer code) {
//        if (code ==)
//    }
}
