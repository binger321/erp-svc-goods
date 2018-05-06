package com.binger.goods.dao;

import com.binger.goods.domain.Store;
import com.binger.goods.domain.StoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreMapper {
    long countByExample(StoreExample example);

    int deleteByExample(StoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Store record);

    int insertSelective(Store record);

    List<Store> selectByExampleWithColSelected(StoreExample example);

    List<Store> selectByExample(StoreExample example);

    Store selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") StoreExample.SelectiveField selectiveField);

    Store selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}