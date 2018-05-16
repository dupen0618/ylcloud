package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.BatchDtlStatusNumIdForSellOffUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.DtlOrHdrStatusNumIdForDeleteOrAuditSellOffBalanceUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.ListForGenerateBalanceForSellOffGetRequest;
import com.ykcloud.soa.erp.api.wm.request.SellOffBatchDtlStatusforDeleteSellOffSupBalanceDtlUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.SupBlanceDtlBySellOffBatchDtlSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.SupplyUnitNumIdForSellOffGetRequest;
import com.ykcloud.soa.erp.api.wm.response.BatchDtlStatusNumIdForSellOffUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.DtlOrHdrStatusNumIdForDeleteOrAuditSellOffBalanceUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.ListForGenerateBalanceForSellOffGetResponse;
import com.ykcloud.soa.erp.api.wm.response.SellOffBatchDtlStatusforDeleteSellOffSupBalanceDtlUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.SupBlanceDtlBySellOffBatchDtlSeriesGetResponse;
import com.ykcloud.soa.erp.api.wm.response.SupplyUnitNumIdForSellOffGetResponse;

/**
 * @Author:ALi
 * @Description: 损益单
 * @Date:
 */
public interface WmSupBlanceDtlSellOffService {
    //获取代销可结算数据
    public ListForGenerateBalanceForSellOffGetResponse getListForGenerateBalanceForSellOff(ListForGenerateBalanceForSellOffGetRequest request);
    //修改代销批次表体状态
    public BatchDtlStatusNumIdForSellOffUpdateResponse updateBatchDtlStatusNumIdForSellOff(BatchDtlStatusNumIdForSellOffUpdateRequest request);
    //用于结算删除或者审核
    public DtlOrHdrStatusNumIdForDeleteOrAuditSellOffBalanceUpdateResponse updateDtlOrHdrStatusNumIdForDeleteOrAuditSellOffBalance(DtlOrHdrStatusNumIdForDeleteOrAuditSellOffBalanceUpdateRequest request);
    //获得代销没有结算的供应商
    public SupplyUnitNumIdForSellOffGetResponse getSupplyUnitNumIdForSellOff(SupplyUnitNumIdForSellOffGetRequest request);
    //代销根据批次行号查询信息
    public SupBlanceDtlBySellOffBatchDtlSeriesGetResponse getSupBlanceDtlBySellOffBatchDtlSeries(SupBlanceDtlBySellOffBatchDtlSeriesGetRequest request);
   /* //获得代销行号等信息并且修改
    public SellOffBatchDtlStatusforDeleteSellOffSupBalanceDtlUpdateResponse updateSellOffBatchDtlStatusforDeleteSellOffSupBalanceDtl(SellOffBatchDtlStatusforDeleteSellOffSupBalanceDtlUpdateRequest request) ;*/
}
