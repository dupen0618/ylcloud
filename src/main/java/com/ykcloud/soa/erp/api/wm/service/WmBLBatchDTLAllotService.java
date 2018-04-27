package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmBLBatchDTLAllotRequest;
import com.ykcloud.soa.erp.api.wm.request.WmBLBatchDTLUpdateRequest;
import com.ykcloud.soa.erp.api.wm.response.WmBLBatchDTLAllotResponse;

/**
 * @Author Hewei
 * @Date 2018/4/9 9:18
 */
public interface WmBLBatchDTLAllotService {
    //单据批次分配--出库单(暂时不用)
    WmBLBatchDTLAllotResponse updateBatchDtlByShip(WmBLBatchDTLAllotRequest request);

    //单据批次分配--出库单(使用)
    WmBLBatchDTLAllotResponse updateBatchDtlByContainer(WmBLBatchDTLAllotRequest request);

    //单据批次分配--盘亏单
    WmBLBatchDTLAllotResponse updateBatchDtlByStockAdjust(WmBLBatchDTLUpdateRequest request);

    //单据批次分配--移库单-移出
    WmBLBatchDTLAllotResponse updateBatchDtlByMove(WmBLBatchDTLAllotRequest request);

    //单据批次分配--加工单-原材料
    WmBLBatchDTLAllotResponse updateBatchDtlByWork(WmBLBatchDTLUpdateRequest request);

    //单据批次分配--损溢单-损耗
    WmBLBatchDTLAllotResponse updateBatchDtlByLoss(WmBLBatchDTLUpdateRequest request);
}
