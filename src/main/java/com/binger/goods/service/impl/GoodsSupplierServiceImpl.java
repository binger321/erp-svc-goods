package com.binger.goods.service.impl;

import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.goods.dao.GoodsSupplierMapper;
import com.binger.goods.domain.GoodsSupplier;
import com.binger.goods.domain.GoodsSupplierExample;
import com.binger.goods.dto.ret.SupplierSimpleRetDto;
import com.binger.goods.service.GoodsSupplierService;
import com.binger.goods.vo.SupplierSimpleVo;
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
public class GoodsSupplierServiceImpl implements GoodsSupplierService{

    @Autowired
    private GoodsSupplierMapper goodsSupplierMapper;

    @Override
    public List<SupplierSimpleVo> listSupplierByGoodsId(Integer goodsId) {
        List<SupplierSimpleRetDto> supplierSimpleRetDtoList = goodsSupplierMapper.listSupplierByGoodsId(goodsId);
        return DozerUtils.convertList(supplierSimpleRetDtoList, SupplierSimpleVo.class);
    }

    @Override
    public SupplierSimpleVo updateGoodsSupplier(GoodsSupplier goodsSupplier, Integer id) {
        GoodsSupplierExample example = new GoodsSupplierExample();
        example.createCriteria().andIdEqualTo(id);
        long count = goodsSupplierMapper.countByExample(example);
        if (count > 0) {
            if (checkUnique(goodsSupplier, id)) {
                goodsSupplier.setId(id);
                int result = goodsSupplierMapper.updateByPrimaryKey(goodsSupplier);
                if (result > 0) {
                    return DozerUtils.convert(goodsSupplierMapper.selectByPrimaryKey(id), SupplierSimpleVo.class);
                } else {
                    throw BusinessException.create("更新失败，刷新后重试");
                }
            } else {
                throw BusinessException.create("该商品和该供应商对应关系已存在");
            }
        } else {
            throw BusinessException.create("删除失败，可能已经被删除，请刷新后重试");
        }
    }

    @Override
    public SupplierSimpleVo insertGoodsSupplier(GoodsSupplier goodsSupplier) {
        if (checkUnique(goodsSupplier, null)) {
            long count = goodsSupplierMapper.insert(goodsSupplier);
            if (count > 0) {
                return DozerUtils.convert(goodsSupplierMapper.selectByPrimaryKey(goodsSupplier.getId()), SupplierSimpleVo.class);
            } else {
                throw BusinessException.create("更新失败");
            }
        } else {
            throw BusinessException.create("该商品和该供应商对应关系已存在");
        }
    }

    @Override
    public void deleteGoodsSupplier(Integer id) {
        int count = goodsSupplierMapper.deleteByPrimaryKey(id);
        if (count <= 0) {
            throw BusinessException.create("删除失败");
        }
    }

    /**
     * 检查该商品的供应商是否已存在
     * @param goodsSupplier
     * @param id
     * @return
     */
    private boolean checkUnique(GoodsSupplier goodsSupplier, Integer id) {
        GoodsSupplierExample example = new GoodsSupplierExample();
        GoodsSupplierExample.Criteria criteria = example.createCriteria();
        criteria.andSupplierIdEqualTo(goodsSupplier.getSupplierId())
                .andGoodsIdEqualTo(goodsSupplier.getGoodsId());
        if (id != null) {
            criteria.andIdNotEqualTo(id);
        }
        long count = goodsSupplierMapper.countByExample(example);
        if (count > 0) {
            return false;
        } else {
            return true;
        }

    }

}