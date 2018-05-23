package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmBlReceiptBudDtlRequest;
import com.ykcloud.soa.erp.api.wm.response.WmBlReceiptBudDtlResponse;

/**
 * @Author Hewei
 * @Date 2018/5/23 14:46
 */
public interface WmBlReceiptBudDtlService {
    WmBlReceiptBudDtlResponse fetchWmBlReceiptBudDtlProperty(WmBlReceiptBudDtlRequest request);
}
