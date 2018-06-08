package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.CustBalanceForPurchaseSellGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.CustBalanceGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.InvoiceAuditRequest;

import com.ykcloud.soa.erp.api.fi.response.CustBalanceForPurchaseSellGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.CustBalanceHdrGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.InvoiceAuditResponse;

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
    CustBalanceForPurchaseSellGenerateResponse generateCustBalanceForPurchaseSell(
            CustBalanceForPurchaseSellGenerateRequest request);

    /**
     * 生成客户结算单 - 代销
     * @param request
     * @return
     */
    CustBalanceHdrGenerateResponse generateCustomerBalance(CustBalanceGenerateRequest request);

     /**
      * @author alfred.liu
      * @date 2018/6/4 9:24
      * @description 结算单开票审核
      */
    InvoiceAuditResponse auditInvocie(InvoiceAuditRequest request);
}
