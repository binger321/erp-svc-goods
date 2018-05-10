package com.binger.goods.controller;

import com.binger.common.ServerResponse;
import com.binger.goods.controller.query.SaleOrderQuery;
import com.binger.goods.vo.SaleOrderMainVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/10
 * Time: 下午7:35
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Api(value = "saleOrder", description = "销售订单管理接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "saleOrderController")
@RequestMapping(value = "/goods-svc/saleOrder")
public class SaleOrderController {
    @ApiOperation(value = "销售订单列表")
    @RequestMapping(value = "/order/list", method = RequestMethod.POST)
    public ServerResponse<List<SaleOrderMainVo>> list(@RequestBody(required = false)SaleOrderQuery saleOrderQuery,
                                                      @RequestParam(required = false, value = "pageNo") Integer pageNo,
                                                      @RequestParam(required = false, value = "pageSize") Integer pageSize) {

    }

}
