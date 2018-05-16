package com.binger.goods.controller;

import com.binger.common.Const;
import com.binger.common.Page;
import com.binger.common.ServerResponse;
import com.binger.common.util.DozerUtils;
import com.binger.goods.controller.form.GoodsStyleForm;
import com.binger.goods.controller.query.GoodsStyleQuery;
import com.binger.goods.domain.GoodsStyle;
import com.binger.goods.domain.GoodsStyleExample;
import com.binger.goods.service.GoodsStyleService;
import com.binger.goods.vo.GoodsStyleDetailVo;
import com.binger.goods.vo.GoodsStyleVo;
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
@Api(value = "goodsStyle",description = "商品款式接口", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController(value = "商品款式API")
@RequestMapping(value = "erp-svc-goods/goodsStyle")
public class GoodsStyleController {

    @Autowired
    private GoodsStyleService goodsStyleService;

    @ApiOperation(value = "列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ServerResponse<List<GoodsStyleVo>> list(@RequestBody(required = false) GoodsStyleQuery query,
                                                   @RequestParam(value = "pageNo", required = false) Integer pageNo,
                                                   @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        GoodsStyleExample example = new GoodsStyleExample();
        GoodsStyleExample.Criteria criteria = example.createCriteria();
        if (query.getStyleName() != null) {
            criteria.andStyleNameLike(query.getStyleName());
        }
        if (query.getStyleCode() != null) {
            criteria.andStyleCodeLike(query.getStyleCode());
        }
        if (pageNo != null) {
            long total = goodsStyleService.countByExample(example);
            Page page = new Page(pageNo, pageSize, total);
            example.setOffset(page.getOffset());
            example.setLimit(page.getPageSize());
            List<GoodsStyleVo> goodsStyleVoList = goodsStyleService.list(example);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsStyleVoList, page);
        } else {
            List<GoodsStyleVo> goodsStyleVoList = goodsStyleService.list(example);
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsStyleVoList);
        }
    }

    @ApiOperation(value = "根据id查询")
    @RequestMapping(value = "/detail/{id}", method = RequestMethod.POST)
    public ServerResponse<GoodsStyleDetailVo> findById(@PathVariable Integer id) {
        GoodsStyle goodsStyle = goodsStyleService.findById(id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, DozerUtils.convert(goodsStyle, GoodsStyleDetailVo.class));
    }

    @ApiOperation(value = "根据id修改")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ServerResponse<GoodsStyleDetailVo> update(@PathVariable Integer id,
                                                     @RequestBody(required = false)GoodsStyleForm form) {
        GoodsStyle goodsStyle = DozerUtils.convert(form, GoodsStyle.class);
        GoodsStyleDetailVo goodsStyleDetailVo = goodsStyleService.updateById(goodsStyle, id);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsStyleDetailVo);
    }

    @ApiOperation(value = "新增")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ServerResponse<GoodsStyleDetailVo> insert(@RequestBody(required = false)GoodsStyleForm form) {
        GoodsStyle goodsStyle = DozerUtils.convert(form, GoodsStyle.class);
        GoodsStyleDetailVo goodsStyleDetailVo = goodsStyleService.insert(goodsStyle);
        return ServerResponse.createBySuccess(Const.SUCCESS_MSG, goodsStyleDetailVo);
    }

    @ApiOperation(value = "删除")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public ServerResponse delete(@PathVariable Integer id) {
        int count = goodsStyleService.deleteById(id);
        if (count > 0) {
            return ServerResponse.createBySuccess(Const.SUCCESS_MSG, null);
        } else {
            return ServerResponse.createByError(Const.FAIL_MSG);
        }
    }
}