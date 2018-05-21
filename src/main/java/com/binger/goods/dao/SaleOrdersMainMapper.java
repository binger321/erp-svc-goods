package com.binger.goods.dao;

import com.binger.goods.domain.SaleOrdersMain;
import com.binger.goods.domain.SaleOrdersMainExample;
import com.binger.goods.dto.query.SaleOrderQueryDto;
import com.binger.goods.dto.ret.SaleOrderMainRetDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    /**
     * 根据条件查询主表
     * @param saleOrderQueryDto
     * @return
     */
    List<SaleOrderMainRetDto> listByQuery(@Param("queryDto") SaleOrderQueryDto saleOrderQueryDto);

    /**
     * 根据条件计数
     * @param saleOrderQueryDto
     * @return
     */
    long countByQuery(@Param("queryDto") SaleOrderQueryDto saleOrderQueryDto);
}