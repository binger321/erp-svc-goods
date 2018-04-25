package com.binger.goods.service;

import com.binger.goods.domain.GoodsStyle;
import com.binger.goods.domain.GoodsStyleExample;
import com.binger.goods.vo.GoodsStyleDetailVo;
import com.binger.goods.vo.GoodsStyleVo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface GoodsStyleService {
    long countByExample(GoodsStyleExample example);

    List<GoodsStyleVo> list(GoodsStyleExample example);

    GoodsStyle findById(Integer id);

    GoodsStyleDetailVo updateById(GoodsStyle goodsStyle, Integer id);

    GoodsStyleDetailVo insert(GoodsStyle goodsStyle);

    int deleteById(Integer id);
}