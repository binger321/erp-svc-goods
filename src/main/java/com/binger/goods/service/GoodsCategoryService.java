package com.binger.goods.service;

import com.binger.common.nodeBuilder.Node;
import com.binger.goods.domain.GoodsCategory;
import com.binger.goods.domain.GoodsCategoryExample;
import com.binger.goods.vo.GoodsCategoryVo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface GoodsCategoryService {
    /**
     * 列出树状结构
     * @return
     */
    List<Node> listTree();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    GoodsCategoryVo findById(Integer id);

    /**
     * 根据id更新
     * @param goodsCategory
     * @return
     */
    GoodsCategoryVo updateById(GoodsCategory goodsCategory, Integer id);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    long deleteById(Integer id);

    List<GoodsCategoryVo> listByExample(GoodsCategoryExample example);
}