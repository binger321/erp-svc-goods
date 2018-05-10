package com.binger.goods.dao;

import com.binger.goods.domain.GoodsSku;
import com.binger.goods.domain.GoodsSkuExample;
import com.binger.goods.dto.query.GoodsSkuQueryDto;
import com.binger.goods.dto.ret.GoodsSkuRetDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsSkuMapper {
    long countByExample(GoodsSkuExample example);

    int deleteByExample(GoodsSkuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSku record);

    int insertSelective(GoodsSku record);

    List<GoodsSku> selectByExampleWithColSelected(GoodsSkuExample example);

    List<GoodsSku> selectByExample(GoodsSkuExample example);

    GoodsSku selectByPrimaryKeyWithColSelected(@Param("id") Integer id, @Param("selectiveField") GoodsSkuExample.SelectiveField selectiveField);

    GoodsSku selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSku record, @Param("example") GoodsSkuExample example);

    int updateByExample(@Param("record") GoodsSku record, @Param("example") GoodsSkuExample example);

    int updateByPrimaryKeySelective(GoodsSku record);

    int updateByPrimaryKey(GoodsSku record);

    /**
     * 根据条件计数
     * @param queryDto
     * @return
     */
    long countByQueryDto(@Param("queryDto") GoodsSkuQueryDto queryDto);

    /**
     * 根据dto查询skuList
     * @param queryDto
     * @return
     */
    List<GoodsSkuRetDto> listSkuByDto(@Param("queryDto") GoodsSkuQueryDto queryDto);

    /**
     * 根据id查询sku
     * @param id
     * @return
     */
    GoodsSkuRetDto findSkuById(@Param("id") Integer id);
}