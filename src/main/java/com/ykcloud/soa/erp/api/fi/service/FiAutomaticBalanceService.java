package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.BalanceJointSaleAutomaticRequest;
import com.ykcloud.soa.erp.api.fi.request.BalancePurchaseSaleAutomaticRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceSellOffAutomaticRequest;
import com.ykcloud.soa.erp.api.fi.response.BalanceJointSaleAutomaticResponse;
import com.ykcloud.soa.erp.api.fi.response.BalancePurchaseSaleAutomaticResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceSellOffAutomaticResponse;

/**
 * @Description: 自动结算
 * @Author: ALi
 * @Date: 2018/4/23 15:24
 */
public interface FiAutomaticBalanceService {
    //购销
    public BalancePurchaseSaleAutomaticResponse automaticBalancePurchaseSale(BalancePurchaseSaleAutomaticRequest request);
    //代销
    public BalanceSellOffAutomaticResponse automaticBalanceSellOff(BalanceSellOffAutomaticRequest request);
    //联销
    public BalanceJointSaleAutomaticResponse automaticBalanceJointSale(BalanceJointSaleAutomaticRequest request) ;

}
