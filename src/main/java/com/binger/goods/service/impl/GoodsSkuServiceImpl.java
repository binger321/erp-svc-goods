package com.binger.goods.service.impl;

import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.goods.dao.GoodsColorMapper;
import com.binger.goods.dao.GoodsMapper;
import com.binger.goods.dao.GoodsSizeMapper;
import com.binger.goods.dao.GoodsSkuMapper;
import com.binger.goods.domain.*;
import com.binger.goods.dto.query.GoodsSkuQueryDto;
import com.binger.goods.dto.ret.GoodsSkuRetDto;
import com.binger.goods.service.GoodsSkuService;
import com.binger.goods.vo.GoodsSkuDetailVo;
import com.binger.goods.vo.GoodsSkuVo;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class GoodsSkuServiceImpl implements GoodsSkuService {
    @Autowired
    private GoodsSkuMapper goodsSkuMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private GoodsSizeMapper goodsSizeMapper;

    @Autowired
    private GoodsColorMapper goodsColorMapper;

    @Override
    public long countSkuByDto(GoodsSkuQueryDto queryDto) {
        return goodsSkuMapper.countByQueryDto(queryDto);
    }

    @Override
    public List<GoodsSkuVo> listSkuByDto(GoodsSkuQueryDto queryDto) {
        List<GoodsSkuRetDto> goodsSkuRetDtoList = goodsSkuMapper.listSkuByDto(queryDto);
        if (CollectionUtils.isNotEmpty(goodsSkuRetDtoList)) {
            List<GoodsSkuVo> goodsSkuVoList = DozerUtils.convertList(goodsSkuRetDtoList, GoodsSkuVo.class);
            return goodsSkuVoList;
        } else {
            return null;
        }
    }

    @Override
    public GoodsSkuVo updateGoodsSku(GoodsSku goodsSku, Integer id) {
        checkSkuUnique(goodsSku, id);
        goodsSku.setId(id);
        checkGoodsColorSize(goodsSku);
        long count = goodsSkuMapper.updateByPrimaryKeySelective(goodsSku);
        System.out.println(count);
        GoodsSku goodsSku1 = goodsSkuMapper.selectByPrimaryKey(id);
        if (goodsSku1 != null) {
            return DozerUtils.convert(goodsSku1, GoodsSkuVo.class);
        } else {
            throw BusinessException.create("更新异常");
        }

    }

    @Override
    public GoodsSkuDetailVo findById(Integer id) {
        GoodsSkuRetDto goodsSkuRetDto = goodsSkuMapper.findSkuById(id);
        if (goodsSkuRetDto != null) {
            return DozerUtils.convert(goodsSkuRetDto, GoodsSkuDetailVo.class);
        } else {
            return null;
        }
    }

    @Override
    public GoodsSkuDetailVo add(GoodsSku goodsSku) {
        checkGoodsColorSize(goodsSku);
        checkSkuUnique(goodsSku, null);
        long count = goodsSkuMapper.insert(goodsSku);
        if (count > 0) {
            GoodsSku sku = goodsSkuMapper.selectByPrimaryKey(goodsSku.getId());
            if (sku != null) {
                return DozerUtils.convert(sku, GoodsSkuDetailVo.class);
            } else {
                throw BusinessException.create("新增失败！");
            }
        } else {
            throw BusinessException.create("新增失败！");
        }
    }

    @Override
    public long deleteById(Integer id) {
        return goodsSkuMapper.deleteByPrimaryKey(id);
    }

    private void checkGoodsColorSize(GoodsSku goodsSku) {
        if (goodsSku.getGoodsId() == null) {
            throw BusinessException.create("商品是必填项");
        }
        Goods goods = goodsMapper.selectByPrimaryKey(goodsSku.getGoodsId());
        if (goods == null) {
            throw BusinessException.create("未找到对应商品！");
        }
        if (goodsSku.getSizeId() == null) {
            throw BusinessException.create("尺寸为必填项");
        }
        GoodsSize goodsSize = goodsSizeMapper.selectByPrimaryKey(goodsSku.getSizeId());
        if (goodsSize == null) {
            throw BusinessException.create("未找到对应尺寸！");
        }
        if (goodsSku.getColorId() == null) {
            throw BusinessException.create("颜色为必填项");
        }
        GoodsColor goodsColor = goodsColorMapper.selectByPrimaryKey(goodsSku.getColorId());
        if (goodsColor == null) {
            throw BusinessException.create("未找到对应颜色！");
        }
    }

    private void checkSkuUnique(GoodsSku goodsSku, Integer id) {
        GoodsSkuExample example = new GoodsSkuExample();
        GoodsSkuExample.Criteria criteria = example.createCriteria();
        criteria.andGoodsIdEqualTo(goodsSku.getGoodsId())
                .andColorIdEqualTo(goodsSku.getColorId())
                .andSizeEqualTo(goodsSku.getSize());
        if (id != null) {
            criteria.andIdNotEqualTo(id);
        }
        long count = goodsSkuMapper.countByExample(example);
        if (count > 0) {
            throw BusinessException.create("已存在该颜色该尺寸的该商品！");
        }
    }
}