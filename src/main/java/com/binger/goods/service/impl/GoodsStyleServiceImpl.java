package com.binger.goods.service.impl;

import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.goods.dao.GoodsStyleMapper;
import com.binger.goods.domain.GoodsStyle;
import com.binger.goods.domain.GoodsStyleExample;
import com.binger.goods.service.GoodsStyleService;
import com.binger.goods.vo.GoodsStyleDetailVo;
import com.binger.goods.vo.GoodsStyleVo;
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
public class GoodsStyleServiceImpl implements GoodsStyleService{
    @Autowired
    private GoodsStyleMapper goodsStyleMapper;

    @Override
    public long countByExample(GoodsStyleExample example) {
        return goodsStyleMapper.countByExample(example);
    }

    @Override
    public List<GoodsStyleVo> list(GoodsStyleExample example) {
        return DozerUtils.convertList(goodsStyleMapper.selectByExample(example), GoodsStyleVo.class);
    }

    @Override
    public GoodsStyle findById(Integer id) {
        return goodsStyleMapper.selectByPrimaryKey(id);
    }

    @Override
    public GoodsStyleDetailVo updateById(GoodsStyle goodsStyle, Integer id) {
        GoodsStyle goodsStyle1 = goodsStyleMapper.selectByPrimaryKey(id);
        if (goodsStyle1 == null || goodsStyle1.getId() == null) {
            throw BusinessException.create("该款式不存在");
        } else {
            goodsStyle.setId(id);
            int result = goodsStyleMapper.updateByPrimaryKeySelective(goodsStyle);
            if (result > 0) {
                return DozerUtils.convert(goodsStyleMapper.selectByPrimaryKey(id), GoodsStyleDetailVo.class);
            } else {
                throw BusinessException.create("未更新成功");
            }
        }
    }

    @Override
    public GoodsStyleDetailVo insert(GoodsStyle goodsStyle) {
        int result = goodsStyleMapper.insert(goodsStyle);
        if (result > 0) {
            return DozerUtils.convert(goodsStyleMapper.selectByPrimaryKey(goodsStyle.getId()),GoodsStyleDetailVo.class);
        }else {
            throw BusinessException.create("新增失败");
        }
    }

    @Override
    public int deleteById(Integer id) {
        return goodsStyleMapper.deleteByPrimaryKey(id);
    }
}