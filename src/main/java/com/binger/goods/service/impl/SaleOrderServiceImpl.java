package com.binger.goods.service.impl;

import com.binger.common.util.DozerUtils;
import com.binger.goods.dao.SaleOrdersDetailMapper;
import com.binger.goods.dao.SaleOrdersMainMapper;
import com.binger.goods.dto.query.SaleOrderQueryDto;
import com.binger.goods.dto.ret.SaleOrderMainRetDto;
import com.binger.goods.service.SaleOrderService;
import com.binger.goods.vo.SaleOrderMainVo;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/15
 * Time: 上午8:25
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@Service
public class SaleOrderServiceImpl implements SaleOrderService {

    @Autowired
    private SaleOrdersMainMapper saleOrdersMainMapper;

    @Autowired
    private SaleOrdersDetailMapper saleOrdersDetailMapper;

    @Override
    public List<SaleOrderMainVo> listByQuery(SaleOrderQueryDto saleOrderQueryDto) {
        List<SaleOrderMainRetDto> saleOrderMainRetDtos = saleOrdersMainMapper.listByQuery(saleOrderQueryDto);
        if(CollectionUtils.isNotEmpty(saleOrderMainRetDtos)) {
            return DozerUtils.convertList(saleOrderMainRetDtos, SaleOrderMainVo.class);
        } else {
            return null;
        }
    }

    @Override
    public long countByQuery(SaleOrderQueryDto saleOrderQueryDto) {
        return 0;
    }
}
