package com.binger.goods.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.goods.controller.form.SaleOrderForm;
import com.binger.goods.controller.query.SaleOrderQuery;
import com.binger.goods.dto.query.SaleOrderQueryDto;
import com.binger.goods.service.SaleOrderService;
import com.binger.goods.vo.SaleOrderMainVo;
import com.binger.goods.vo.SaleOrderVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private SaleOrderService saleOrderService;
    @ApiOperation(value = "销售订单列表")
    @RequestMapping(value = "/order/list", method = RequestMethod.POST)
    public ServerResponse<List<SaleOrderMainVo>> list(@RequestBody(required = false)SaleOrderQuery saleOrderQuery,
                                                      @RequestParam(required = false, value = "pageNo") Integer pageNo,
                                                      @RequestParam(required = false, value = "pageSize") Integer pageSize) {
        SaleOrderQueryDto saleOrderQueryDto = DozerUtils.convert(saleOrderQuery, SaleOrderQueryDto.class);
        if (pageNo != null) {
            long total = saleOrderService.countByQuery(saleOrderQueryDto);
            Page page = new Page(pageNo, pageSize, total);
            saleOrderQueryDto.setOffset(page.getOffset());
            saleOrderQueryDto.setLimit(page.getPageSize());
            List<SaleOrderMainVo> saleOrderMainVoList = saleOrderService.listByQuery(saleOrderQueryDto);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, saleOrderMainVoList, page);
        } else {
            List<SaleOrderMainVo> saleOrderMainVoList = saleOrderService.listByQuery(saleOrderQueryDto);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, saleOrderMainVoList);
        }
    }

    @ApiOperation(value = "新增订单")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ServerResponse<SaleOrderMainVo> addOrder(@RequestBody SaleOrderForm saleOrderForm) {
        SaleOrderMainVo saleOrderMainVo = saleOrderService.addOrder(saleOrderForm);
        if (saleOrderMainVo != null){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, saleOrderMainVo);
        }else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }

    @ApiOperation(value = "修改订单")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ServerResponse<SaleOrderMainVo> update(@RequestBody SaleOrderForm saleOrderForm) {
        SaleOrderMainVo saleOrderMainVo = saleOrderService.updateOrder(saleOrderForm);
        if (saleOrderMainVo != null) {
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, saleOrderMainVo);
        } else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }

    @ApiOperation(value = "查询主订单")
    @RequestMapping(value = "/findMain/{id}", method = RequestMethod.POST)
    public ServerResponse<SaleOrderVo> findMain(@PathVariable Integer id) {
        SaleOrderVo saleOrderVo = saleOrderService.findMainById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, saleOrderVo);
    }


    /**
     * 将订单状态为缺货状态的 置为 待派单 300
     * 若仍是缺货状态，前段展示需要创建生成订单
     * @return
     */
    // TODO
    @ApiOperation(value = "补货检测")
    @RequestMapping(value = "/replenish", method = RequestMethod.POST)
    public ServerResponse replenish() {
        return null;
    }

    /**
     * 将订单状态为待派单 置为 已派单 400
     * @return
     */
    // TODO
    @ApiOperation(value = "派单")
    @RequestMapping(value = "/assign", method = RequestMethod.POST)
    public ServerResponse assign() {
        return null;
    }

    /**
     * 已发货 供仓库模块后端微服务调用
     */
    // TODO
    @ApiOperation(value = "已发货(供仓库模块后端微服务调用)")
    @RequestMapping(value = "/deliver", method = RequestMethod.POST)
    public ServerResponse deliver(){
        return null;
    }




}
