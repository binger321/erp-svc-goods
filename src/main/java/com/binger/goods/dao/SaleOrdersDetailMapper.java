package com.binger.goods.dao;

import com.binger.goods.domain.SaleOrdersDetail;
import com.binger.goods.domain.SaleOrdersDetailExample;
import com.binger.goods.dto.ret.SaleOrderDetailDto;
import com.binger.goods.dto.ret.SaleRetDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
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

    /**
     * 根据订单主表id查询详情
     * @param id
     * @return
     */
    List<SaleOrderDetailDto> selectByOrderMainId(@Param("orderMainId") Integer id);

    List<SaleOrderDetailDto> selectByDetailId(@Param("orderDetailId") Integer id);

    /**
     * 获得七天平均销量
     * @param sevenBefore
     * @param now
     */
    List<SaleRetDto> getSevenAverage(@Param("beginTime")Date sevenBefore, @Param("endTime") Date now, @Param("standard") Integer count);

    /**
     * 获得三天销量
     * @param sevenBefore
     * @param count
     * @param now
     * @return
     */
    List<SaleRetDto> getThreeAverage(@Param("beginTime")Date threeBefore, @Param("endTime") Date now, @Param("skuList") List<Integer> skuIdList);
}