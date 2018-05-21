package com.binger.goods.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/16
 * Time: 下午2:13
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@ApiModel
public class SaleOrderVo {

    @ApiModelProperty(value = "订单主表")
    private SaleOrderMainDetailVo saleOrderMainDetailVo;

    @ApiModelProperty(value = "订单子表")
    private List<SaleOrderDetailVo> saleOrderDetailVoList;

}
