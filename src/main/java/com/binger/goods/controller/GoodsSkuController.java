package com.binger.goods.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.goods.controller.form.GoodsSkuForm;
import com.binger.goods.controller.query.GoodsSkuQuery;
import com.binger.goods.domain.GoodsSku;
import com.binger.goods.dto.query.GoodsSkuQueryDto;
import com.binger.goods.service.GoodsSkuService;
import com.binger.goods.vo.GoodsSkuDetailVo;
import com.binger.goods.vo.GoodsSkuVo;
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
 * Time: 16:34
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Api(value = "goodsSku",description = "商品SKU接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "商品SkuAPI")
@RequestMapping(value = "erp-svc-goods/goodsSku")
public class GoodsSkuController {
    @Autowired
    private GoodsSkuService goodsSkuService;
    @ApiOperation("列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ServerResponse<List<GoodsSkuVo>> list(@RequestBody (required = false)GoodsSkuQuery goodsSkuQuery,
                                                 @RequestParam (name = "pageNo", required = false)Integer pageNo,
                                                 @RequestParam (name = "pageSize", required = false)Integer pageSize) {
        GoodsSkuQueryDto queryDto = DozerUtils.convert(goodsSkuQuery, GoodsSkuQueryDto.class);
        if (pageNo != null) {
            long total = goodsSkuService.countSkuByDto(queryDto);
            Page page = new Page(pageNo, pageSize, total);
            queryDto.setOffset(page.getOffset());
            queryDto.setLimit(page.getPageSize());
            List<GoodsSkuVo> goodsSkuVoList = goodsSkuService.listSkuByDto(queryDto);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsSkuVoList, page);
        } else {
            List<GoodsSkuVo> goodsSkuVoList = goodsSkuService.listSkuByDto(queryDto);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsSkuVoList);
        }
    }
    @ApiOperation("查看详情")
    @RequestMapping(value = "/detail/{id}", method = RequestMethod.POST)
    public ServerResponse<GoodsSkuDetailVo> findById(@PathVariable Integer id) {
        GoodsSkuDetailVo goodsSkuDetailVo = goodsSkuService.findById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsSkuDetailVo);
    }

    @ApiOperation("修改sku")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ServerResponse<GoodsSkuVo> updateSku(@RequestBody GoodsSkuForm goodsSkuForm,
                                                      @PathVariable Integer id) {
        GoodsSku goodsSku = DozerUtils.convert(goodsSkuForm, GoodsSku.class);
        GoodsSkuVo goodsSkuVo = goodsSkuService.updateGoodsSku(goodsSku, id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsSkuVo);
    }

    @ApiOperation("新增sku")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ServerResponse<GoodsSkuDetailVo> add(@RequestBody GoodsSkuForm goodsSkuForm) {
        GoodsSku goodsSku = DozerUtils.convert(goodsSkuForm, GoodsSku.class);
        GoodsSkuDetailVo goodsSkuDetailVo = goodsSkuService.add(goodsSku);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsSkuDetailVo);
    }

    @ApiOperation("删除sku")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public ServerResponse delete(@PathVariable Integer id) {
        long result = goodsSkuService.deleteById(id);
        if (result > 0) {
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, null);
        } else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }


}