package com.binger.goods.service;

import com.binger.goods.domain.GoodsSupplier;
import com.binger.goods.vo.SupplierSimpleVo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface GoodsSupplierService {
    List<SupplierSimpleVo> listSupplierByGoodsId(Integer goodsId);

    SupplierSimpleVo updateGoodsSupplier(GoodsSupplier goodsSupplier, Integer id);

    SupplierSimpleVo insertGoodsSupplier(GoodsSupplier goodsSupplier);

    void deleteGoodsSupplier(Integer id);
}