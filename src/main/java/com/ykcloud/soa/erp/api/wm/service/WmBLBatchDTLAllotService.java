package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmBLBatchDTLAllotRequest;
import com.ykcloud.soa.erp.api.wm.response.WmBLBatchDTLAllotResponse;

/**
 * @Author Hewei
 * @Date 2018/4/9 9:18
 */
public interface WmBLBatchDTLAllotService {
    //单据批次分配--出库单
    WmBLBatchDTLAllotResponse updateBatchDtlByShip(WmBLBatchDTLAllotRequest request);
}
