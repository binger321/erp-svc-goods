package com.binger.goods.service.impl;

import com.binger.common.enums.BillTypeEnum;
import com.binger.common.exception.BusinessException;
import com.binger.common.util.DozerUtils;
import com.binger.goods.controller.form.SaleOrderDetail;
import com.binger.goods.controller.form.SaleOrderMain;
import com.binger.goods.dao.GoodsSkuMapper;
import com.binger.goods.dao.SaleOrdersDetailMapper;
import com.binger.goods.dao.SaleOrdersMainMapper;
import com.binger.goods.domain.SaleOrdersDetail;
import com.binger.goods.domain.SaleOrdersDetailExample;
import com.binger.goods.domain.SaleOrdersMain;
import com.binger.goods.domain.SaleOrdersMainExample;
import com.binger.goods.dto.query.SaleOrderQueryDto;
import com.binger.goods.dto.ret.GoodsSkuRetDto;
import com.binger.goods.dto.ret.SaleOrderDetailDto;
import com.binger.goods.dto.ret.SaleOrderMainRetDto;
import com.binger.goods.dto.ret.SaleRetDto;
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
import java.util.*;

import static java.util.stream.Collectors.reducing;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

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

    @Autowired
    private GoodsSkuMapper goodsSkuMapper;

    /**
     * 生产计划基准
     */
    private static Integer standard = 2;

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
    public SaleOrderMainVo addOrder(SaleOrderMain saleOrderMain) {
        SaleOrdersMain saleOrdersMain = DozerUtils.convert(saleOrderMain, SaleOrdersMain.class);
        checkUnique(saleOrdersMain, null);
        //获取销售订单编号
        saleOrdersMain.setOrderSaleCode(billCodeService.generateBill(BillTypeEnum.ORDER_BILL.getBillType()));
        saleOrdersMain.setOrderStatus(OrderStatusEnum.STOCK_OF_OUT.getCode());
        saleOrdersMain.setOrderTime(new Date(System.currentTimeMillis()));
        saleOrdersMainMapper.insertSelective(saleOrdersMain);
        SaleOrdersMain ordersMain = saleOrdersMainMapper.selectByPrimaryKey(saleOrdersMain.getId());
        if (ordersMain != null) {
            return DozerUtils.convert(ordersMain, SaleOrderMainVo.class);
        } else {
            return null;
        }
    }

    private void constructMain(SaleOrdersMain saleOrdersMain, List<SaleOrdersDetail> insertDetailList) {
        saleOrdersMain.setId(insertDetailList.get(0).getOrderSaleId());
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

    private List<SaleOrdersDetail> constructDetail(SaleOrdersMain saleOrdersMain, List<SaleOrdersDetail> saleOrderDetailList) {
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
    public SaleOrderMainVo updateOrder(SaleOrderMain saleOrderMain) {
        SaleOrdersMain saleOrdersMain = DozerUtils.convert(saleOrderMain, SaleOrdersMain.class);
        SaleOrdersMain main = saleOrdersMainMapper.selectByPrimaryKey(saleOrderMain.getId());
        Integer orderStatus = main.getOrderStatus();
        if (orderStatus.compareTo(OrderStatusEnum.HAVE_ASSIGN.getCode()) > 0) {
            throw BusinessException.create("订单派单后不能更新！");
        }
        saleOrdersMainMapper.updateByPrimaryKeySelective(saleOrdersMain);
        SaleOrdersMain saleOrdersMain1 = saleOrdersMainMapper.selectByPrimaryKey(saleOrdersMain.getId());
        if (saleOrdersMain1 != null) {
            return DozerUtils.convert(saleOrdersMain1, SaleOrderMainVo.class);
        }
        return null;
    }

    @Override
    public SaleOrderMainVo findMainById(Integer id) {
        SaleOrdersMain saleOrdersMain = saleOrdersMainMapper.selectByPrimaryKey(id);
        if (saleOrdersMain != null) {
            return DozerUtils.convert(saleOrdersMain, SaleOrderMainVo.class);
        }

        return null;
    }

    @Override
    @Transactional
    public SaleOrderDetailVo updateOrderDetail(SaleOrderDetail saleOrderDetail) {
        SaleOrdersDetail saleOrdersDetail = DozerUtils.convert(saleOrderDetail, SaleOrdersDetail.class);
        saleOrdersDetail.setLocalAmount(saleOrdersDetail.getLocalPrice().multiply(new BigDecimal(saleOrdersDetail.getQuantity())));
        saleOrdersDetailMapper.updateByPrimaryKeySelective(saleOrdersDetail);
        SaleOrdersDetail detail = saleOrdersDetailMapper.selectByPrimaryKey(saleOrdersDetail.getId());
        SaleOrdersDetailExample example = new SaleOrdersDetailExample();
        example.createCriteria().andOrderSaleIdEqualTo(detail.getOrderSaleId());
        List<SaleOrdersDetail> saleOrdersDetails = saleOrdersDetailMapper.selectByExample(example);
        SaleOrdersMain saleOrdersMain = new SaleOrdersMain();
        constructMain(saleOrdersMain, saleOrdersDetails);
        saleOrdersMainMapper.updateByPrimaryKeySelective(saleOrdersMain);
        if (detail != null) {
            return DozerUtils.convert(detail, SaleOrderDetailVo.class);
        }
        return null;

    }

    @Override
    @Transactional
    public SaleOrderDetailVo addOrderDetail(SaleOrderDetail saleOrderDetail) {
        SaleOrdersDetail saleOrdersDetail = DozerUtils.convert(saleOrderDetail, SaleOrdersDetail.class);
        saleOrdersDetail.setOrdersSaleDetailCode(billCodeService.generateBill(BillTypeEnum.ORDER_DETAIL_BILL.getBillType()));
        GoodsSkuDetailVo sku = goodsSkuService.findById((saleOrderDetail.getSkuId()));
        if (sku == null || sku.getCostPrice() == null || sku.getCostPrice().equals(0)) {
            throw BusinessException.create("需维护商品的价格!");
        }
        saleOrdersDetail.setLocalPrice(sku.getCostPrice());
        saleOrdersDetail.setLocalAmount(sku.getCostPrice().multiply(new BigDecimal(saleOrdersDetail.getQuantity())));
        saleOrdersDetail.setWeight(sku.getWeight().multiply(new BigDecimal(saleOrdersDetail.getQuantity())));
        saleOrdersDetailMapper.insertSelective(saleOrdersDetail);
        SaleOrdersDetailExample example = new SaleOrdersDetailExample();
        example.createCriteria().andOrderSaleIdEqualTo(saleOrdersDetail.getOrderSaleId());
        List<SaleOrdersDetail> saleOrdersDetailList = saleOrdersDetailMapper.selectByExample(example);
        SaleOrdersMain saleOrdersMain = new SaleOrdersMain();
        constructMain(saleOrdersMain, saleOrdersDetailList);
        saleOrdersMainMapper.updateByPrimaryKeySelective(saleOrdersMain);
        SaleOrdersDetail detail = saleOrdersDetailMapper.selectByPrimaryKey(saleOrdersDetail.getId());
        if (detail != null) {
            return DozerUtils.convert(detail, SaleOrderDetailVo.class);
        } else {
            return null;
        }
    }

    @Override
    @Transactional
    public void deleteOrder(Integer id) {
        SaleOrdersDetailExample example = new SaleOrdersDetailExample();
        example.createCriteria().andOrderSaleIdEqualTo(id);
        saleOrdersDetailMapper.deleteByExample(example);
        saleOrdersMainMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SaleOrderDetailVo findDetailById(Integer id) {
        List<SaleOrderDetailDto> saleOrderDetailDtoList =saleOrdersDetailMapper.selectByDetailId(id);
        if (CollectionUtils.isNotEmpty(saleOrderDetailDtoList)) {
            return DozerUtils.convertList(saleOrderDetailDtoList, SaleOrderDetailVo.class).get(0);
        }
        return null;
    }

    @Override
    public List<SaleOrderDetailVo> findAllDetailById(Integer id) {
        List<SaleOrderDetailDto> saleOrderDetailDtoList =saleOrdersDetailMapper.selectByOrderMainId(id);
        if (CollectionUtils.isNotEmpty(saleOrderDetailDtoList)) {
            return DozerUtils.convertList(saleOrderDetailDtoList, SaleOrderDetailVo.class);
        }
        return null;
    }

    @Override
    public void deleteOrderDetail(Integer id) {
        int count = saleOrdersDetailMapper.deleteByPrimaryKey(id);
        if (count == 0) {
            throw BusinessException.create("删除失败!");
        }
    }

    @Override
    public List<AverageSaleVo> calculateAverageSale() {
        Date now = new Date(System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.set(Calendar.DATE, -7);
        Date sevenBefore = calendar.getTime();
        List<SaleRetDto> sevenAverageList = saleOrdersDetailMapper.getSevenAverage(sevenBefore, now, standard);

        calendar.set(Calendar.DATE, 4);
        Date threeBefore = calendar.getTime();
        List<Integer> skuIdList = sevenAverageList.stream().map(SaleRetDto::getSkuId).collect(toList());
        List<SaleRetDto> threeAverageList = saleOrdersDetailMapper.getThreeAverage(threeBefore, now, skuIdList);

        Map<Integer, BigDecimal> threeSaleMap = new HashMap<>();
        threeAverageList.forEach(saleRetDto -> threeSaleMap.put(saleRetDto.getSkuId(), saleRetDto.getAverageSale()));

        List<GoodsSkuRetDto> goodsSkuVoList = goodsSkuMapper.listSkuBySkuId(skuIdList);
        Map<Integer, GoodsSkuRetDto> skuRetDtoMap = new HashMap<>();
        goodsSkuVoList.forEach(goodsSkuRetDto -> skuRetDtoMap.put(goodsSkuRetDto.getId(), goodsSkuRetDto));
        List<AverageSaleVo> averageSaleVoList = new ArrayList<>();
        sevenAverageList.forEach(saleRetDto -> {
            AverageSaleVo averageSaleVo = new AverageSaleVo();
            GoodsSkuRetDto retDto = skuRetDtoMap.get(saleRetDto.getSkuId());
            if (retDto != null) {
                averageSaleVo = DozerUtils.convert(retDto, AverageSaleVo.class);
            }
            averageSaleVo.setSkuId(saleRetDto.getSkuId());
            averageSaleVo.setSevenDaysSale(saleRetDto.getAverageSale());
            averageSaleVo.setThreeDaysSale(threeSaleMap.get(saleRetDto.getSkuId() == null ? 0 : saleRetDto.getSkuId()));
            averageSaleVoList.add(averageSaleVo);
        });
        return averageSaleVoList;
    }


}
