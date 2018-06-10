package com.binger.goods.dao;

import com.binger.goods.domain.GoodsSupplier;
import com.binger.goods.domain.GoodsSupplierExample;
import com.binger.goods.dto.ret.SupplierSimpleRetDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsSupplierMapper {
    long countByExample(GoodsSupplierExample example);

    int deleteByExample(GoodsSupplierExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSupplier record);

    int insertSelective(GoodsSupplier record);

    List<GoodsSupplier> selectByExampleWithColSelected(GoodsSupplierExample example);

    List<GoodsSupplier> selectByExample(GoodsSupplierExample example);

    GoodsSupplier selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") GoodsSupplierExample.SelectiveField selectiveField);

    GoodsSupplier selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSupplier record, @Param("example") GoodsSupplierExample example);

    int updateByExample(@Param("record") GoodsSupplier record, @Param("example") GoodsSupplierExample example);

    int updateByPrimaryKeySelective(GoodsSupplier record);

    int updateByPrimaryKey(GoodsSupplier record);

    /**
     * 根据goodsId查询对应得供应商
     * @param goodsId
     * @return
     */
    List<SupplierSimpleRetDto> listSupplierByGoodsId(@Param("goodsId") Integer goodsId);

    SupplierSimpleRetDto findById(@Param("id")Integer id);
}