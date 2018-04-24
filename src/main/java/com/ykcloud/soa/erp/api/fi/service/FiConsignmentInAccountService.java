package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.response.FiInAccountByReceiptResponse;
import com.ykcloud.soa.erp.api.fi.request.FiInAccountByReceiptRequest;

/**
 * @Author Hewei
 * @Date 2018/4/18 13:53
 */
public interface FiConsignmentInAccountService {
    FiInAccountByReceiptResponse setConsignmentInAccount(FiInAccountByReceiptRequest request);
}
