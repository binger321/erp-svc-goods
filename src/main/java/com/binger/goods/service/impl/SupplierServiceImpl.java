package com.binger.goods.service.impl;

import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.goods.dao.SupplierMapper;
import com.binger.goods.domain.Supplier;
import com.binger.goods.domain.SupplierExample;
import com.binger.goods.service.SupplierService;
import com.binger.goods.vo.SupplierDetailVo;
import com.binger.goods.vo.SupplierVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/4/24
 * Time: 下午3:13
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    SupplierMapper supplierMapper;
    @Override
    public long count(SupplierExample example) {
        return supplierMapper.countByExample(example);
    }

    @Override
    public List<SupplierVo> listByExample(SupplierExample example) {
        return DozerUtils.convertList(supplierMapper.selectByExample(example), SupplierVo.class);
    }

    @Override
    public SupplierDetailVo findById(Integer id) {
        return DozerUtils.convert(supplierMapper.selectByPrimaryKey(id), SupplierDetailVo.class);
    }

    @Override
    public SupplierDetailVo updateById(Supplier supplier, Integer id) {
        Supplier supplier1 = supplierMapper.selectByPrimaryKey(id);
        if (supplier1 == null && supplier1.getId() == null) {
            throw BusinessException.create("无法找到该供应商，可能重复操作");
        }
        supplier.setId(id);
        long count = supplierMapper.updateByPrimaryKeySelective(supplier);
        if (count > 0) {
            return DozerUtils.convert(supplierMapper.selectByPrimaryKey(id), SupplierDetailVo.class);
        } else {
            throw BusinessException.create("修改失败，可能重复操作");
        }

    }

    @Override
    public SupplierDetailVo add(Supplier supplier) {
        int count = supplierMapper.insert(supplier);
        Supplier supplier1 = supplierMapper.selectByPrimaryKey(supplier.getId());
        if (supplier1 != null) {
            return DozerUtils.convert(supplier1, SupplierDetailVo.class);
        } else {
            throw BusinessException.create("新增失败！");
        }
    }

    @Override
    public Integer deleteById(Integer id) {
        Supplier supplier = supplierMapper.selectByPrimaryKey(id);
        if (supplier == null && supplier.getId() == null ) {
            throw BusinessException.create("未找到该供应商，可能已被删除！");
        }
        int result = supplierMapper.deleteByPrimaryKey(id);
        if (result > 0) {
            return result;
        } else {
            throw BusinessException.create("删除失败！");
        }
    }
}
