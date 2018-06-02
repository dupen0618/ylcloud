package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.CustBalanceHdrGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.InvoiceAuditRequest;
import com.ykcloud.soa.erp.api.fi.response.CustBalanceHdrGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.InvoiceAuditResponse;

/**
 * @author Sealin
 * Created on 2018-06-01
 */
public interface FiBlCustBalanceHdrService {
    CustBalanceHdrGenerateResponse generateCustomerBalanceHeader(CustBalanceHdrGenerateRequest request);
     /**
      * @author alfred.liu
      * @date 2018/6/2 10:13
      * @description 结算单开票审核
      */
    public InvoiceAuditResponse auditInvocie(InvoiceAuditRequest request);
}
