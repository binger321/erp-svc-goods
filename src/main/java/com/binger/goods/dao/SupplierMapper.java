package com.binger.goods.dao;

import com.binger.goods.domain.Supplier;
import com.binger.goods.domain.SupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierMapper {
    long countByExample(SupplierExample example);

    int deleteByExample(SupplierExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    List<Supplier> selectByExampleWithColSelected(SupplierExample example);

    List<Supplier> selectByExample(SupplierExample example);

    Supplier selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") SupplierExample.SelectiveField selectiveField);

    Supplier selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByExample(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}