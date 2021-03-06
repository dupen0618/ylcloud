package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmBLBatchDTLAllotRequest;
import com.ykcloud.soa.erp.api.wm.request.WmBLBatchDTLUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.WmBlBatchDtlBySeriesRequest;
import com.ykcloud.soa.erp.api.wm.response.WmBLBatchDTLAllotResponse;
import com.ykcloud.soa.erp.api.wm.response.WmBlBatchDtlBySeriesResponse;
import com.ykcloud.soa.erp.api.wm.response.WmBlContainerDtlResponse;

/**
 * @Author Hewei
 * @Date 2018/4/9 9:18
 */
public interface WmBLBatchDTLAllotService {

    //单据批次分配--出库单
    WmBLBatchDTLAllotResponse updateBatchDtlByContainer(WmBLBatchDTLAllotRequest request);

    //验收入库单-负数分配批次明细
    WmBLBatchDTLAllotResponse updateBatchDtlByReceipt(WmBLBatchDTLAllotRequest request);

    //单据批次分配--盘亏单
    WmBLBatchDTLAllotResponse updateBatchDtlByStockAdjust(WmBLBatchDTLUpdateRequest request);

    //单据批次分配--移库单-移出
    WmBLBatchDTLAllotResponse updateBatchDtlByMove(WmBLBatchDTLAllotRequest request);

    //单据批次分配--加工单-原材料
    WmBLBatchDTLAllotResponse updateBatchDtlByWork(WmBLBatchDTLUpdateRequest request);

    //单据批次分配--损溢单-损耗
    WmBLBatchDTLAllotResponse updateBatchDtlByLoss(WmBLBatchDTLUpdateRequest request);

     /**
      * @author alfred
      * @date 2018/5/10 11:28
      * @description
      */
    WmBlBatchDtlBySeriesResponse selectOneBySeries(WmBlBatchDtlBySeriesRequest request);
}
