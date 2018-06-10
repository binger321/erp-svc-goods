package com.binger.goods.service.impl;

import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.goods.dao.StoreMapper;
import com.binger.goods.domain.Store;
import com.binger.goods.domain.StoreExample;
import com.binger.goods.service.StoreService;
import com.binger.goods.vo.StoreVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    StoreMapper storeMapper;

    @Override
    public long count(StoreExample storeExample) {
        return storeMapper.countByExample(storeExample);
    }

    @Override
    public List<StoreVo> listByExample(StoreExample storeExample) {
        List<Store> storeList = storeMapper.selectByExample(storeExample);
        if (storeList != null) {

            return DozerUtils.convertList(storeList, StoreVo.class);
        } else {
            throw BusinessException.create("数据不存在");
        }
    }

    @Override
    public StoreVo findById(Integer id) {
        Store store = storeMapper.selectByPrimaryKey(id);
        if (null != store) {
            return DozerUtils.convert(store, StoreVo.class);
        } else {
            throw BusinessException.create("不存在该商店ID,请确认后输入");
        }
    }

    @Override
    public StoreVo updateById(Store store, Integer id) {
        checkStoreUnique(store, id);
        Store store1 = storeMapper.selectByPrimaryKey(id);
        if (store1 == null) {
            throw BusinessException.create("无法找到该商店");
        }
        store.setId(id);
        long count = storeMapper.updateByPrimaryKeySelective(store);
        if (count > 0) {
            return DozerUtils.convert(storeMapper.selectByPrimaryKey(id), StoreVo.class);
        } else {
            throw BusinessException.create("修改失败，可能重复操作");
        }
    }

    private void checkStoreUnique(Store store, Integer id) {
        StoreExample example = new StoreExample();
        StoreExample.Criteria criteria = example.createCriteria();
        criteria.andStoreCodeEqualTo(store.getStoreCode());
        if (id != null) {
            criteria.andIdNotEqualTo(id);
        }
        long count = storeMapper.countByExample(example);
        if (count > 0) {
            throw BusinessException.create("该店铺编号已存在！");
        }
    }

    @Override
    public StoreVo add(Store store) {
        if (StringUtils.isEmpty(store.getStoreCode())) {
            throw BusinessException.create("商店编号不能为空");
        }
        checkStoreUnique(store, null);
        storeMapper.insertSelective(store);
        Store store1 = storeMapper.selectByPrimaryKey(store.getId());
        if (store1 != null) {
            return DozerUtils.convert(store1, StoreVo.class);
        } else {
            throw BusinessException.create("新增失败！");
        }

    }

    @Override
    public Integer deleteById(Integer id) {
        Store store = storeMapper.selectByPrimaryKey(id);
        if (store == null) {
            throw BusinessException.create("未找到该人员，可能已被删除");
        }
        int count = storeMapper.deleteByPrimaryKey(id);
        if (count > 0) {
            return count;
        } else {
            throw BusinessException.create("删除失败");
        }
    }
}
