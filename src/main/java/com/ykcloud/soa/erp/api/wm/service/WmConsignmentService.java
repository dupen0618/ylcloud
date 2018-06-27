package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.*;
import com.ykcloud.soa.erp.api.wm.response.*;

/**
 * @Author:ALi
 * @Description: 损溢单
 * @Date:
 */
public interface WmConsignmentService {
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
    /**
     * @author alfred.liu
     * @date 2018/6/27 11:54
     * @description 获取代销汇总单据信息
     */
   public ConsignmentCollectBalanceGainResponse GainConsignmentCollectBalance(ConsignmentCollectBalanceGainRequest request);
}
