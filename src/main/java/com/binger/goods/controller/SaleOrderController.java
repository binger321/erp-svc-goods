package com.binger.goods.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.goods.controller.form.SaleOrderDetail;
import com.binger.goods.controller.form.SaleOrderForm;
import com.binger.goods.controller.form.SaleOrderMain;
import com.binger.goods.controller.query.SaleOrderQuery;
import com.binger.goods.dto.query.SaleOrderQueryDto;
import com.binger.goods.service.SaleOrderService;
import com.binger.goods.vo.AverageSaleVo;
import com.binger.goods.vo.SaleOrderDetailExcelVo;
import com.binger.goods.vo.SaleOrderDetailVo;
import com.binger.goods.vo.SaleOrderMainVo;
import com.binger.goods.vo.SaleOrderVo;
import com.xuxueli.poi.excel.ExcelExportUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Path;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.net.URLEncoder;
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
@RequestMapping(value = "/erp-svc-goods/saleOrder")
public class SaleOrderController {

    @Autowired
    private SaleOrderService saleOrderService;

    @Autowired
    private HttpServletResponse response;
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
    public ServerResponse<SaleOrderMainVo> addOrderMain(@RequestBody SaleOrderMain saleOrderMain) {
        SaleOrderMainVo saleOrderMainVo = saleOrderService.addOrder(saleOrderMain);
        if (saleOrderMainVo != null){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, saleOrderMainVo);
        }else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }

    @ApiOperation(value = "新增订单详情")
    @RequestMapping(value = "/addDetail", method = RequestMethod.POST)
    public ServerResponse<SaleOrderDetailVo> addOrderDetail(@RequestBody SaleOrderDetail saleOrderDetail) {
        SaleOrderDetailVo saleOrderDetailVo = saleOrderService.addOrderDetail(saleOrderDetail);
        if (saleOrderDetailVo != null){
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, saleOrderDetailVo);
        }else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }


    @ApiOperation(value = "修改订单")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ServerResponse<SaleOrderMainVo> update(@PathVariable Integer id,
                                                  @RequestBody SaleOrderMain saleOrderMain) {
        saleOrderMain.setId(id);
        SaleOrderMainVo saleOrderMainVo = saleOrderService.updateOrder(saleOrderMain);
        if (saleOrderMainVo != null) {
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, saleOrderMainVo);
        } else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }


    @ApiOperation(value = "修改订单详情")
    @RequestMapping(value = "/updateDetail/{id}", method = RequestMethod.POST)
    public ServerResponse<SaleOrderDetailVo> updateDetail(@PathVariable Integer id,
                                                          @RequestBody SaleOrderDetail saleOrderDetail) {
        saleOrderDetail.setId(id);
        SaleOrderDetailVo saleOrderDetailVo = saleOrderService.updateOrderDetail(saleOrderDetail);
        if (saleOrderDetailVo != null) {
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, saleOrderDetailVo);
        } else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }

    @ApiOperation(value = "删除")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public ServerResponse delete(@PathVariable Integer id) {
        saleOrderService.deleteOrder(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, null);
    }


    @ApiOperation(value = "删除")
    @RequestMapping(value = "/deleteDetail/{id}", method = RequestMethod.POST)
    public ServerResponse<SaleOrderVo> deleteDetail(@PathVariable Integer id) {
        saleOrderService.deleteOrderDetail(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, null);
    }


    @ApiOperation(value = "查询主订单")
    @RequestMapping(value = "/findMain/{id}", method = RequestMethod.POST)
    public ServerResponse<SaleOrderMainVo> findMain(@PathVariable Integer id) {
    SaleOrderMainVo saleOrderMainVo = saleOrderService.findMainById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, saleOrderMainVo);
}

    @ApiOperation(value = "查询详情单")
    @RequestMapping(value = "/findAllDetail/{id}", method = RequestMethod.POST)
    public ServerResponse<List<SaleOrderDetailVo>> findAllDetail(@PathVariable Integer id) {
        List<SaleOrderDetailVo> saleOrderMainVo = saleOrderService.findAllDetailById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, saleOrderMainVo);
    }

    @ApiOperation(value = "详情单导出")
    @GetMapping(value = "/download/excel/saleOrderDetail/{id}")
    public void allDetailToExcel(@PathVariable Integer id) {
        List<SaleOrderDetailVo> saleOrderDetailVos = saleOrderService.findAllDetailById(id);
        List<SaleOrderDetailExcelVo> saleOrderDetailExcelVos = DozerUtils.convertList(saleOrderDetailVos,SaleOrderDetailExcelVo.class);
        for (SaleOrderDetailExcelVo excelVo : saleOrderDetailExcelVos){
            if (excelVo.getCostPrice()== null){
                excelVo.setCostPrice(new BigDecimal(0));
            }
        }
        byte[] excelBytes = ExcelExportUtil.exportToBytes(saleOrderDetailExcelVos);
        String fileName = "订单详情.xls";
        response.setCharacterEncoding("utf-8");
        response.setContentType("multipart/form-data");
        try {
            response.setHeader("Content-Disposition", "attachment;fileName="
                    + URLEncoder.encode(fileName, "UTF-8"));
            OutputStream os = response.getOutputStream();
            os.write(excelBytes);
            // 这里主要关闭。
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @ApiOperation(value = "查询详情单")
    @RequestMapping(value = "/findDetail/{id}", method = RequestMethod.POST)
    public ServerResponse<SaleOrderDetailVo> findDetail(@PathVariable Integer id) {
        SaleOrderDetailVo saleOrderDetailVo = saleOrderService.findDetailById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, saleOrderDetailVo);
    }

    @ApiOperation(value = "获取三天和七天平均(供备货计划使用)")
    @RequestMapping(value = "/getAverageSale", method = RequestMethod.POST)
    public ServerResponse<List<AverageSaleVo>> getAverageSale() {
        List<AverageSaleVo> averageSaleVoList = saleOrderService.calculateAverageSale();
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, averageSaleVoList);
    }

    /**
     * 将订单状态为缺货状态的 置为 待派单 300
     * 若仍是缺货状态，前段展示需要创建生产订单
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
