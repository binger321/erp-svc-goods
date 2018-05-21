package com.binger.goods.service.impl;

import com.binger.common.enums.BillTypeEnum;
import com.binger.common.exception.BusinessException;
import com.binger.common.redis.DistributedLockHandler;
import com.binger.common.redis.Lock;
import com.binger.goods.service.BillCodeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/16
 * Time: 下午4:46
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class BillCodeServiceImpl implements BillCodeService {

    @Value("${spring.application.name:erp-svc-goods}")
    private String application;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private DistributedLockHandler distributedLockHandler;

    @Override
    public String generateBill(String billType) {
        BillTypeEnum billTypeEnum = BillTypeEnum.getBillTypeByType(billType);
        String billCode = null;
        if (billTypeEnum == null) {
            throw BusinessException.create("编号类型有误！需联系管理员");
        }
        Lock lock = new Lock(application+":"+billTypeEnum.getBillType()+":lock", "lock");
        if (distributedLockHandler.tryLock(lock)) {
            billCode = constructBillCode(billTypeEnum);
            distributedLockHandler.releaseLock(lock);
        }
        return billCode;
    }

    private String constructBillCode(BillTypeEnum billTypeEnum) {
        String key = application + ":" + billTypeEnum.getBillType();
        BoundValueOperations<String, String> bvOps = redisTemplate.boundValueOps(key);
        String value = bvOps.get();
        Integer codeNum = 1;
        StringBuffer codeBuf = new StringBuffer();
        String prefix = billTypeEnum.getBillPrefix();
        if (StringUtils.isNotBlank(value)) {
            codeNum = Integer.parseInt(value);
            codeNum ++;
        }
        if (codeNum < billTypeEnum.getMax()) {
            codeBuf.append(prefix);
            int length = codeNum.toString().length() + prefix.length();
            for (int i = 0 ; i <length ; i ++) {
                codeBuf.append(0);
            }
            codeBuf.append(codeNum);
            bvOps.set(codeNum.toString());
        } else {
            throw BusinessException.create("订单量达到99999999!");
        }
        return codeBuf.toString();
    }
}
