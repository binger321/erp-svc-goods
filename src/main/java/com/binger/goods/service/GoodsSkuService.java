package com.binger.goods.service;

import com.binger.goods.domain.GoodsSku;
import com.binger.goods.dto.query.GoodsSkuQueryDto;
import com.binger.goods.vo.GoodsSkuDetailVo;
import com.binger.goods.vo.GoodsSkuVo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface GoodsSkuService {
    /**
     * 根据dto统计数量
     * @param queryDto
     * @return
     */
    long countSkuByDto(GoodsSkuQueryDto queryDto);

    /**
     * 根据dto查询list
     * @param queryDto
     * @return
     */
    List<GoodsSkuVo> listSkuByDto(GoodsSkuQueryDto queryDto);

    /**
     * 修改sku
     * @param goodsSku
     * @param id
     * @return
     */
    GoodsSkuVo updateGoodsSku(GoodsSku goodsSku, Integer id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    GoodsSkuDetailVo findById(Integer id);

    /**
     * 新增sku
     * @param goodsSku
     * @return
     */
    GoodsSkuDetailVo add(GoodsSku goodsSku);

    /**
     * 删除sku
     * @param id
     * @return
     */
    long deleteById(Integer id);
}