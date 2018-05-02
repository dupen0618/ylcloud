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

    //单据更新批次明细表--盘盈盘亏单-盘盈
    WmBLBatchDTLUpdateResponse updateBatchDtlByStockAdjust(WmBLBatchDTLUpdateRequest request);

    //单据更新批次明细表--加工单-成品
    WmBLBatchDTLUpdateResponse updateBatchDtlByWork(WmBLBatchDTLUpdateRequest request);

    //单据更新批次明细表--损溢单-升溢
    WmBLBatchDTLUpdateResponse updateBatchDtlByLoss(WmBLBatchDTLUpdateRequest request);
    //出库单更新批次明细--负数
    WmBLBatchDTLUpdateResponse updateBatchDtlByShip(WmBLBatchDTLUpdateRequest request);
}
