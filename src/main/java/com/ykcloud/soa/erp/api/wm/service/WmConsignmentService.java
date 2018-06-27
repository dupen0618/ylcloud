package com.ykcloud.soa.erp.api.wm.service;


import com.ykcloud.soa.erp.api.wm.request.BatchDtlStatusNumIdForSellOffUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.ConsignmentCollectBalanceGainRequest;
import com.ykcloud.soa.erp.api.wm.request.DtlOrHdrStatusNumIdForDeleteOrAuditSellOffBalanceUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.ListForAppointGenerateBalanceForSellOffGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ListForGenerateBalanceForSellOffGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ListForHeadGenerateBalanceForSellOffGetRequest;
import com.ykcloud.soa.erp.api.wm.request.SupBlanceDtlBySellOffBatchDtlSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.SupplyUnitNumIdForSellOffGetRequest;
import com.ykcloud.soa.erp.api.wm.response.BatchDtlStatusNumIdForSellOffUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.ConsignmentCollectBalanceGainResponse;
import com.ykcloud.soa.erp.api.wm.response.DtlOrHdrStatusNumIdForDeleteOrAuditSellOffBalanceUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.ListForAppointGenerateBalanceForSellOffGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ListForGenerateBalanceForSellOffGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ListForHeadGenerateBalanceForSellOffGetResponse;
import com.ykcloud.soa.erp.api.wm.response.SupBlanceDtlBySellOffBatchDtlSeriesGetResponse;
import com.ykcloud.soa.erp.api.wm.response.SupplyUnitNumIdForSellOffGetResponse;

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
   public ConsignmentCollectBalanceGainResponse gainConsignmentCollectBalance(ConsignmentCollectBalanceGainRequest request);

    /**
     * @author alfred.liu
     * @date 2018/6/27 16:32
     * @description 指定获取代销数据
     */
   public ListForAppointGenerateBalanceForSellOffGetResponse getListForAppointGenerateBalanceForSellOff(ListForAppointGenerateBalanceForSellOffGetRequest request);

     /**
      * @author alfred.liu
      * @date 2018/6/27 17:24
      * @description 总部调用代销结算
      */
   public ListForHeadGenerateBalanceForSellOffGetResponse getListForHeadGenerateBalanceForSellOff(ListForHeadGenerateBalanceForSellOffGetRequest request);
}
