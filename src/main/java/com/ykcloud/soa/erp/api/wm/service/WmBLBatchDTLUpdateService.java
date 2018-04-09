package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmBLBatchDTLUpdateRequest;
import com.ykcloud.soa.erp.api.wm.response.WmBLBatchDTLUpdateResponse;

/**
 * @Author Hewei
 * @Date 2018/4/8 15:52
 */
public interface WmBLBatchDTLUpdateService {

    //单据更新批次明细表--验收入库单
    WmBLBatchDTLUpdateResponse updateBatchDtlByReciept(WmBLBatchDTLUpdateRequest request);
}
