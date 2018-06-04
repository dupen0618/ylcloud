package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.CustPayAuditRequest;
import com.ykcloud.soa.erp.api.fi.response.CustPayAuditResponse;

/**
  * @author alfred.liu
  * @date 2018/6/2 12:11
  * @description 客户付款单
  */
public interface FiCustPayService {
     /**
      * @author alfred.liu
      * @date 2018/6/2 15:09
      * @description 客户付款单审核
      */
    public CustPayAuditResponse auditCustPay (CustPayAuditRequest request);
}
