package com.binger.goods.dao;

import com.binger.goods.domain.SaleOrdersMain;
import com.binger.goods.domain.SaleOrdersMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleOrdersMainMapper {
    long countByExample(SaleOrdersMainExample example);

    int deleteByExample(SaleOrdersMainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SaleOrdersMain record);

    int insertSelective(SaleOrdersMain record);

    List<SaleOrdersMain> selectByExampleWithBLOBs(SaleOrdersMainExample example);

    List<SaleOrdersMain> selectByExampleWithColSelected(SaleOrdersMainExample example);

    List<SaleOrdersMain> selectByExample(SaleOrdersMainExample example);

    SaleOrdersMain selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") SaleOrdersMainExample.SelectiveField selectiveField);

    SaleOrdersMain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SaleOrdersMain record, @Param("example") SaleOrdersMainExample example);

    int updateByExampleWithBLOBs(@Param("record") SaleOrdersMain record, @Param("example") SaleOrdersMainExample example);

    int updateByExample(@Param("record") SaleOrdersMain record, @Param("example") SaleOrdersMainExample example);

    int updateByPrimaryKeySelective(SaleOrdersMain record);

    int updateByPrimaryKeyWithBLOBs(SaleOrdersMain record);

    int updateByPrimaryKey(SaleOrdersMain record);
}