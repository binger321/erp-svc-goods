package com.binger.goods.service.impl;

import com.binger.common.enums.BillTypeEnum;
import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.goods.controller.form.SaleOrderDetail;
import com.binger.goods.controller.form.SaleOrderForm;
import com.binger.goods.dao.SaleOrdersDetailMapper;
import com.binger.goods.dao.SaleOrdersMainMapper;
import com.binger.goods.domain.SaleOrdersDetail;
import com.binger.goods.domain.SaleOrdersMain;
import com.binger.goods.domain.SaleOrdersMainExample;
import com.binger.goods.dto.query.SaleOrderQueryDto;
import com.binger.goods.dto.ret.SaleOrderDetailDto;
import com.binger.goods.dto.ret.SaleOrderMainRetDto;
import com.binger.goods.enums.OrderStatusEnum;
import com.binger.goods.service.BillCodeService;
import com.binger.goods.service.GoodsSkuService;
import com.binger.goods.service.SaleOrderService;
import com.binger.goods.vo.*;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static java.util.stream.Collectors.toList;

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

    @Autowired
    private BillCodeService billCodeService;

    @Autowired
    private GoodsSkuService goodsSkuService;

    @Override
    public List<SaleOrderMainVo> listByQuery(SaleOrderQueryDto saleOrderQueryDto) {
        List<SaleOrderMainRetDto> saleOrderMainRetDtoList = saleOrdersMainMapper.listByQuery(saleOrderQueryDto);
        if (CollectionUtils.isNotEmpty(saleOrderMainRetDtoList)) {
            return saleOrderMainRetDtoList
                    .parallelStream()
                    .map(saleOrderMainRetDto -> {
                        SaleOrderMainVo saleOrderMainVo = DozerUtils.convert(saleOrderMainRetDto, SaleOrderMainVo.class);
                        saleOrderMainVo.setOrderStatusStr(
                                OrderStatusEnum.getOrderStatusByCode(saleOrderMainVo.getOrderStatus()).getStatus());
                        return saleOrderMainVo;
                    }).collect(toList());
        } else {
            return null;
        }

    }

    @Override
    public long countByQuery(SaleOrderQueryDto saleOrderQueryDto) {
        long count = saleOrdersMainMapper.countByQuery(saleOrderQueryDto);
        return count;
    }

    @Override
    @Transactional
    public SaleOrderMainVo addOrder(SaleOrderForm saleOrderForm) {
        SaleOrdersMain saleOrdersMain = DozerUtils.convert(saleOrderForm.getSaleOrderMain(), SaleOrdersMain.class);
        checkUnique(saleOrdersMain, null);
        //获取销售订单编号
        saleOrdersMain.setOrderSaleCode(billCodeService.generateBill(BillTypeEnum.ORDER_BILL.getBillType()));
        saleOrdersMain.setOrderStatus(OrderStatusEnum.STOCK_OF_OUT.getCode());
        saleOrdersMain.setOrderTime(new Date(System.currentTimeMillis()));
        List<SaleOrderDetail> saleOrderDetailList = saleOrderForm.getSaleOrderDetailList();
        List<SaleOrdersDetail> insertDetailList = constructDetail(saleOrdersMain, saleOrderDetailList);
        constructMain(saleOrdersMain, insertDetailList);
        saleOrdersMainMapper.insertSelective(saleOrdersMain);
        if (CollectionUtils.isNotEmpty(insertDetailList)) {
            insertDetailList.forEach(saleOrdersDetail -> {
                saleOrdersDetail.setOrderSaleId(saleOrdersMain.getId());
                saleOrdersDetailMapper.insertSelective(saleOrdersDetail);
            });
        }
        SaleOrdersMain ordersMain = saleOrdersMainMapper.selectByPrimaryKey(saleOrdersMain.getId());
        if (ordersMain != null) {
            return DozerUtils.convert(ordersMain, SaleOrderMainVo.class);
        } else {
            return null;
        }
    }

    private void constructMain(SaleOrdersMain saleOrdersMain, List<SaleOrdersDetail> insertDetailList) {
        BigDecimal tempAmount = new BigDecimal(0);
        BigDecimal totalAmount = new BigDecimal(0);
        BigDecimal tempWeight = new BigDecimal(0);
        BigDecimal totalWeight = new BigDecimal(0);
        if (CollectionUtils.isNotEmpty(insertDetailList)) {
            for (SaleOrdersDetail saleOrdersDetail : insertDetailList){
                totalAmount = tempAmount.add(saleOrdersDetail.getLocalAmount());
                tempAmount = totalAmount;
                totalWeight = tempWeight.add(saleOrdersDetail.getWeight());
                tempWeight = totalWeight;

            }
        }
        saleOrdersMain.setOrderLocMny(totalAmount);
        saleOrdersMain.setWeight(totalWeight);
    }

    private void checkUnique(SaleOrdersMain saleOrdersMain, Integer id) {
        SaleOrdersMainExample example =  new SaleOrdersMainExample();
        SaleOrdersMainExample.Criteria criteria = example.createCriteria();
        criteria.andOrderCodeEqualTo(saleOrdersMain.getOrderCode());
        if (id != null) {
            criteria.andIdNotEqualTo(id);
        }
        long count = saleOrdersMainMapper.countByExample(example);
        if (count > 0) {
            throw BusinessException.create("该订单编号已在系统中存在！");
        }
    }

    private List<SaleOrdersDetail> constructDetail(SaleOrdersMain saleOrdersMain, List<SaleOrderDetail> saleOrderDetailList) {
        List<SaleOrdersDetail> tempList;
        if (CollectionUtils.isNotEmpty(saleOrderDetailList)) {
            tempList = saleOrderDetailList
                    .stream()
                    .map(saleOrderDetail -> {
                        SaleOrdersDetail saleOrdersDetail = DozerUtils.convert(saleOrderDetail, SaleOrdersDetail.class);
                        saleOrdersDetail.setOrderSaleCode(saleOrdersMain.getOrderSaleCode());
                        saleOrdersDetail.setOrdersSaleDetailCode(billCodeService.generateBill(BillTypeEnum.ORDER_DETAIL_BILL.getBillType()));
                        GoodsSkuDetailVo sku = goodsSkuService.findById((saleOrderDetail.getSkuId()));
                        if (sku == null || sku.getCostPrice() == null || sku.getCostPrice().equals(0)) {
                            throw BusinessException.create("需维护商品的价格!");
                        }
                        saleOrdersDetail.setLocalPrice(sku.getCostPrice());
                        saleOrdersDetail.setLocalAmount(sku.getCostPrice().multiply(new BigDecimal(saleOrdersDetail.getQuantity())));
                        saleOrdersDetail.setWeight(sku.getWeight().multiply(new BigDecimal(saleOrdersDetail.getQuantity())));
                        return saleOrdersDetail;
                    }).collect(toList());
            return tempList;
        } else {
            return null;
        }
    }


    @Override
    @Transactional
    public SaleOrderMainVo updateOrder(SaleOrderForm saleOrderForm) {
        SaleOrdersMain saleOrdersMain = DozerUtils.convert(saleOrderForm.getSaleOrderMain(), SaleOrdersMain.class);
        Integer orderStatus = saleOrdersMain.getOrderStatus();
        if (orderStatus.compareTo(OrderStatusEnum.HAVE_ASSIGN.getCode()) > 0) {
            throw BusinessException.create("订单派单后不能更新！");
        }
        saleOrdersMainMapper.updateByPrimaryKeySelective(saleOrdersMain);
        List<SaleOrderDetail> saleOrdersDetailList = saleOrderForm.getSaleOrderDetailList();
        saleOrdersDetailList.forEach(saleOrderDetail -> {
            SaleOrdersDetail saleOrdersDetail = DozerUtils.convert(saleOrderDetail, SaleOrdersDetail.class);
            saleOrdersDetailMapper.updateByPrimaryKeySelective(saleOrdersDetail);
        });
        SaleOrdersMain saleOrdersMain1 = saleOrdersMainMapper.selectByPrimaryKey(saleOrdersMain.getId());
        if (saleOrdersMain1 != null) {
            return DozerUtils.convert(saleOrdersMain1, SaleOrderMainVo.class);
        }
        return null;
    }

    @Override
    public SaleOrderVo findMainById(Integer id) {
        SaleOrderVo saleOrderVo = new SaleOrderVo();
        SaleOrdersMain saleOrdersMain = saleOrdersMainMapper.selectByPrimaryKey(id);
        if (saleOrdersMain != null) {
            saleOrderVo.setSaleOrderMainDetailVo(DozerUtils.convert(saleOrdersMain, SaleOrderMainDetailVo.class));
        }

        List<SaleOrderDetailDto> saleOrderDetailDtoList =saleOrdersDetailMapper.selectByOrderMainId(id);
        if (CollectionUtils.isNotEmpty(saleOrderDetailDtoList)) {
            List<SaleOrderDetailVo> saleOrderDetailVoList =DozerUtils.convertList(saleOrderDetailDtoList, SaleOrderDetailVo.class);
            saleOrderVo.setSaleOrderDetailVoList(saleOrderDetailVoList);
        }
        return saleOrderVo;

    }


}
