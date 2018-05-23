package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmBlReceiptBudHdrRequest;
import com.ykcloud.soa.erp.api.wm.response.WmBlReceiptBudHdrResponse;

/**
 * @Author Hewei
 * @Date 2018/5/23 14:43
 */
public interface WmBlReceiptBudHdrService {
    WmBlReceiptBudHdrResponse fetchWmBlReceiptBudHdrProperty(WmBlReceiptBudHdrRequest request);
}
