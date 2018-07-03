/**
 *
 */
package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmBatchDtlByItemRequest;
import com.ykcloud.soa.erp.api.wm.request.WmBlBatchDtlRequest;
import com.ykcloud.soa.erp.api.wm.response.WmBlBatchDtlResponse;

/**
 * @author 殷剑
 */
public interface WmBlBatchDtlService {
    //根据进价调整标的要求调整Price字段中的价格
//    WmBLBatchDTLAllotResponse updatePrice(WmBlBatchDtlQuest request);

    //根据进价调整标的要求调整Price字段中的价格
//    WmBLBatchDTLAllotResponse updateBatchPrice(WmBlBatchDtlQuest request);

    //只调低价格(不指定批次，只调整批次明细中价格比AdjustPrice高的)，【调低不调高】
//    WmBLBatchDTLAllotResponse updateLowPrice(WmBlBatchDtlQuest request);

    WmBlBatchDtlResponse fetchWmBlBatchDtlProperty(WmBlBatchDtlRequest request);

    WmBlBatchDtlResponse getBatchCostInfoByItemAndPhysical(WmBatchDtlByItemRequest request);
}
