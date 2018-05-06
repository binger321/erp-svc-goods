package com.binger.goods.service;


import com.binger.goods.domain.Store;
import com.binger.goods.domain.StoreExample;
import com.binger.goods.vo.StoreVo;

import java.util.List;


public interface StoreService {
    long count(StoreExample storeExample);

    List<StoreVo> listByExample(StoreExample storeExample);

    StoreVo findById(Integer id);

    StoreVo updateById(Store store, Integer id);

    StoreVo add(Store store);

    Integer deleteById(Integer id);
}
