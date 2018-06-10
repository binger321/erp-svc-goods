package com.binger.goods.controller;

import com.binger.common.Const;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.goods.controller.form.GoodsSupplierForm;
import com.binger.goods.domain.GoodsSupplier;
import com.binger.goods.service.GoodsSupplierService;
import com.binger.goods.vo.SupplierSimpleVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 16:32
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Api(value = "goodsSupplier",description = "商品品牌接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "商品供应商对应关系API")
@RequestMapping(value = "erp-svc-goods/goodsSupplier")
public class GoodsSupplierController {
    @Autowired
    private GoodsSupplierService goodsSupplierService;

    @ApiOperation(value = "显示商品对于的供应商")
    @RequestMapping(value = "/listSupplierByGoodsId", method = RequestMethod.POST)
    public ServerResponse<List<SupplierSimpleVo>> listSupplierByGoodsId(@RequestParam(value = "goodsId") Integer goodsId) {

        List<SupplierSimpleVo> supplierSimpleVoList = goodsSupplierService.listSupplierByGoodsId(goodsId);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, supplierSimpleVoList);
    }

    @ApiOperation(value = "查看供应商详情")
    @RequestMapping(value = "/{id}",method = RequestMethod.POST)
    public ServerResponse<SupplierSimpleVo> find(@PathVariable Integer id) {
        SupplierSimpleVo supplierSimpleVo = goodsSupplierService.findById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, supplierSimpleVo);
    }


    @ApiOperation(value = "修改商品对应的供应商")
    @RequestMapping(value = "/updateGoodsSupplier/{id}",method = RequestMethod.POST)
    public ServerResponse<SupplierSimpleVo> updateGoodsSupplier(@PathVariable Integer id,
                                                                @RequestBody(required = false)GoodsSupplierForm goodsSupplierForm) {
        GoodsSupplier goodsSupplier = DozerUtils.convert(goodsSupplierForm, GoodsSupplier.class);
        SupplierSimpleVo supplierSimpleVo = goodsSupplierService.updateGoodsSupplier(goodsSupplier, id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, supplierSimpleVo);
    }

    @ApiOperation(value = "新增商品对应的供应商")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ServerResponse<SupplierSimpleVo> insert(@RequestBody GoodsSupplierForm form) {
        GoodsSupplier goodsSupplier = DozerUtils.convert(form, GoodsSupplier.class);
        SupplierSimpleVo supplierSimpleVo = goodsSupplierService.insertGoodsSupplier(goodsSupplier);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, supplierSimpleVo);
    }

    @ApiOperation(value = "删除商品供应商对应关系")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public ServerResponse delete(@PathVariable Integer id) {
        goodsSupplierService.deleteGoodsSupplier(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, null);
    }

}