package com.binger.goods.service;

import com.binger.goods.domain.Supplier;
import com.binger.goods.domain.SupplierExample;
import com.binger.goods.vo.SupplierDetailVo;
import com.binger.goods.vo.SupplierVo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/4/24
 * Time: 下午3:12
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface SupplierService {
    long count(SupplierExample supplier);

    List<SupplierVo> listByExample(SupplierExample example);

    SupplierDetailVo findById(Integer id);

    SupplierDetailVo updateById(Supplier supplier, Integer id);

    SupplierDetailVo add(Supplier supplier);

    Integer deleteById(Integer id);
}
