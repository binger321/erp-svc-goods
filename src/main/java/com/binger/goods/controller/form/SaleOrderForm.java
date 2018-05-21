package com.binger.goods.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/10
 * Time: 下午7:51
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ApiModel("销售订单vo")
@Data
public class SaleOrderForm {

    @ApiModelProperty(value = "销售主表")
    private SaleOrderMain saleOrderMain;

    @ApiModelProperty(value = "销售详情表")
    private List<SaleOrderDetail> saleOrderDetailList;
}
