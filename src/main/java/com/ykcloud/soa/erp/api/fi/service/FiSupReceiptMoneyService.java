package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.CashReceiptRequest;
import com.ykcloud.soa.erp.api.fi.response.CashReceiptResponse;

/**
  * @author alfred  
  * @date 2018/5/23 11:19  
  * @description 供应商现金收据服务
  */

public interface FiSupReceiptMoneyService
{
    public CashReceiptResponse audit(CashReceiptRequest request);
}
