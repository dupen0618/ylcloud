package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.CustBalanceBlForPurchaseSellGenRequest;
import com.ykcloud.soa.erp.api.fi.request.CustBalanceHdrGenerateRequest;
import com.ykcloud.soa.erp.api.fi.response.CustBalanceBlForPurchaseSellGenResponse;
import com.ykcloud.soa.erp.api.fi.response.CustBalanceHdrGenerateResponse;

/**
 * @Description: 客户结算服务
 * @author: henry.wang
 * @date: 2018/5/31 16:46
 **/
public interface FiCustBalanceService {

    /**
     * @Description: 生成购销客户结算单
     * @author: henry.wang
     * @date: 2018/5/31 16:52
     **/
    CustBalanceBlForPurchaseSellGenResponse genCustBalanceBlForPurchaseSell(
            CustBalanceBlForPurchaseSellGenRequest request);

    /**
     * 生成客户结算单 - 代销
     * @param request
     * @return
     */
    CustBalanceHdrGenerateResponse generateCustomerBalanceHeader(CustBalanceHdrGenerateRequest request);

}
