package com.binger.goods.dao;

import com.binger.goods.domain.SaleOrdersDetail;
import com.binger.goods.domain.SaleOrdersDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleOrdersDetailMapper {
    long countByExample(SaleOrdersDetailExample example);

    int deleteByExample(SaleOrdersDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SaleOrdersDetail record);

    int insertSelective(SaleOrdersDetail record);

    List<SaleOrdersDetail> selectByExampleWithColSelected(SaleOrdersDetailExample example);

    List<SaleOrdersDetail> selectByExample(SaleOrdersDetailExample example);

    SaleOrdersDetail selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") SaleOrdersDetailExample.SelectiveField selectiveField);

    SaleOrdersDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SaleOrdersDetail record, @Param("example") SaleOrdersDetailExample example);

    int updateByExample(@Param("record") SaleOrdersDetail record, @Param("example") SaleOrdersDetailExample example);

    int updateByPrimaryKeySelective(SaleOrdersDetail record);

    int updateByPrimaryKey(SaleOrdersDetail record);
}