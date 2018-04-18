package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.InAccountByReceiptRequest;
import com.ykcloud.soa.erp.api.wm.response.InAccountByReceiptResponse;

/**
 * @Author Hewei
 * @Date 2018/4/18 9:51
 */
public interface WmConsignmentInAccountService {
    public InAccountByReceiptResponse setInAccountByReceipt(InAccountByReceiptRequest request);
}
