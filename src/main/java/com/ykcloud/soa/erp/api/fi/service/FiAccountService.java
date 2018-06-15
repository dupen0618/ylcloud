package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.FiReceiptInAccountRequest;
import com.ykcloud.soa.erp.api.fi.response.InAccountByBalanceResponse;
import com.ykcloud.soa.erp.api.wm.request.InAccountByBalanceRequest;

public interface FiAccountService {

    //客户结算单
    InAccountByBalanceResponse getInAccountByCustBalance(FiReceiptInAccountRequest request);

    //供应商结算单
    InAccountByBalanceResponse getInAccountByBalance(FiReceiptInAccountRequest request);
}
