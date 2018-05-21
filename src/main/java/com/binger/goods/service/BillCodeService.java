package com.binger.goods.service;

/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2018/5/16
 * Time: 下午4:45
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface BillCodeService {

    /**
     * 生产单据编号
     * @param billType
     * @return
     */
    String generateBill(String billType);
}
