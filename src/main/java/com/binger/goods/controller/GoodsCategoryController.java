package com.binger.goods.controller;

import com.binger.common.Const;
import com.binger.common.ServerResponse;
import com.binger.common.nodeBuilder.Node;
import com.binger.common.util.DozerUtils;
import com.binger.goods.controller.form.GoodsCategoryForm;
import com.binger.goods.domain.GoodsCategory;
import com.binger.goods.service.GoodsCategoryService;
import com.binger.goods.vo.GoodsCategoryVo;
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
@Api(value = "goodsCategory",description = "商品种类接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "商品类别API")
@RequestMapping(value = "erp-svc-goods/goodsCategory")
public class GoodsCategoryController {
    @Autowired
    private GoodsCategoryService goodsCategoryService;


    @ApiOperation(value = "列出商品类别的树形结构")
    @RequestMapping(value = "/tree", method = RequestMethod.POST)
    public ServerResponse<List<Node>> listTree() {
        List<Node> nodeList = goodsCategoryService.listTree();
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, nodeList);
    }

    @ApiOperation(value = "根据id查询种类")
    @RequestMapping(value = "/detail/{id}", method = RequestMethod.POST)
    public ServerResponse<GoodsCategoryVo> findById(@PathVariable Integer id) {
        GoodsCategoryVo goodsCategoryVo = goodsCategoryService.findById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsCategoryVo);
    }

    @ApiOperation(value = "修改种类信息")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ServerResponse<GoodsCategoryVo> updateById(@RequestBody GoodsCategoryForm goodsCategoryForm,
                                                      @PathVariable Integer id) {
        GoodsCategory goodsCategory = DozerUtils.convert(goodsCategoryForm, GoodsCategory.class);
        GoodsCategoryVo goodsCategoryVo = goodsCategoryService.updateById(goodsCategory, id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsCategoryVo);
    }

    @ApiOperation(value = "删除种类")
    @RequestMapping(value = "/delete{id}", method = RequestMethod.POST)
    public ServerResponse deleteById(@PathVariable Integer id) {
        long result = goodsCategoryService.deleteById(id);
        if (result > 0) {
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, null);
        } else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }
}