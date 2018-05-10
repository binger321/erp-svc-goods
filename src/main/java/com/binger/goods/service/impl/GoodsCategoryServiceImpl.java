package com.binger.goods.service.impl;

import com.binger.common.exception.BusinessException;
import com.binger.common.nodeBuilder.Node;
import com.binger.common.nodeBuilder.TreeBuilder;
import com.binger.common.util.DozerUtils;
import com.binger.goods.dao.GoodsCategoryMapper;
import com.binger.goods.domain.GoodsCategory;
import com.binger.goods.domain.GoodsCategoryExample;
import com.binger.goods.service.GoodsCategoryService;
import com.binger.goods.vo.GoodsCategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/19 0019
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class GoodsCategoryServiceImpl implements GoodsCategoryService{
    @Autowired
    private GoodsCategoryMapper goodsCategoryMapper;
    @Override
    public List<Node> listTree() {
        GoodsCategoryExample goodsCategoryExample = new GoodsCategoryExample();
        GoodsCategoryExample.Criteria criteria = goodsCategoryExample.createCriteria();
        criteria.andStatusEqualTo(true);
        goodsCategoryExample.getSelectiveField().pid().id().categoryCode().categoryName();
        List<GoodsCategory> goodsCategoryList = goodsCategoryMapper.selectByExample(goodsCategoryExample);
        List<Node> allNodes = goodsCategoryList
                .parallelStream()
                .map(goodsCategory -> {
                    Node node = new Node(goodsCategory.getPid(), goodsCategory.getId(), goodsCategory.getCategoryCode(), goodsCategory.getCategoryName());
                    return node;
                })
                .collect(Collectors.toList());
        List<Node> resultNodes = TreeBuilder.builderTree(allNodes);
        return resultNodes;
    }

    @Override
    public GoodsCategoryVo findById(Integer id) {
        GoodsCategory goodsCategory = goodsCategoryMapper.selectByPrimaryKey(id);
        if (goodsCategory != null) {
            return DozerUtils.convert(goodsCategory, GoodsCategoryVo.class);
        } else {
            return null;
        }
    }

    @Override
    public GoodsCategoryVo updateById(GoodsCategory goodsCategory, Integer id) {
        checkCategoryUnique(goodsCategory, id);
        goodsCategory.setId(id);
        long count = goodsCategoryMapper.updateByPrimaryKeySelective(goodsCategory);
        System.out.println(count);
        GoodsCategory category = goodsCategoryMapper.selectByPrimaryKey(id);
        if (category != null) {
            return DozerUtils.convert(category, GoodsCategoryVo.class);
        } else {
            return null;
        }

    }

    @Override
    public long deleteById(Integer id) {
        return goodsCategoryMapper.deleteByPrimaryKey(id);
    }

    private void checkCategoryUnique(GoodsCategory goodsCategory, Integer id) {
        GoodsCategoryExample example = new GoodsCategoryExample();
        GoodsCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andPidEqualTo(goodsCategory.getPid())
                .andLevelEqualTo(goodsCategory.getLevel())
                .andCategoryCodeEqualTo(goodsCategory.getCategoryName());
        if (id != null) {
            criteria.andIdNotEqualTo(id);
        }
        long count = goodsCategoryMapper.countByExample(example);
        if (count > 0) {
            throw BusinessException.create("该种类已存在");
        }

    }
}