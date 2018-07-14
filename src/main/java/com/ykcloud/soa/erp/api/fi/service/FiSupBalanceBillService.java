package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.AllSupBalanceBillDtlDeleteRequest;
import com.ykcloud.soa.erp.api.fi.request.AppointBalanceBillDtlGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.AppointForSupBalanceDtlDeleteRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceAvalUnitListBatchGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceDataBatchGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceDataGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceEndDateGetRequest;
import com.ykcloud.soa.erp.api.fi.request.BillAmountCheckRequest;
import com.ykcloud.soa.erp.api.fi.request.NotBalanceBillGetRequest;
import com.ykcloud.soa.erp.api.fi.request.NotContractBalanceJointSaleAutomaticRequest;
import com.ykcloud.soa.erp.api.fi.request.NotContractBalancePurchaseSaleAutomaticRequest;
import com.ykcloud.soa.erp.api.fi.request.NotContractDateAutomateRequest;
import com.ykcloud.soa.erp.api.fi.response.AllSupBalanceDtlDeleteResponse;
import com.ykcloud.soa.erp.api.fi.response.AppointBalanceBillDtlGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.AppointForSupBalanceDtlDeleteResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceAvalUnitListBatchGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceDataBatchGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceDataGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceEndDateGetResponse;
import com.ykcloud.soa.erp.api.fi.response.BillAmountCheckResponse;
import com.ykcloud.soa.erp.api.fi.response.NotBalanceBillGetResponse;
import com.ykcloud.soa.erp.api.fi.response.NotContractBalanceJointSaleAutomaticResponse;
import com.ykcloud.soa.erp.api.fi.response.NotContractBalancePurchaseSaleAutomaticResponse;
import com.ykcloud.soa.erp.api.fi.response.NotContractDateAutomateResponse;

/**
 * @Author:ALi
 * @Description: 供应商结算单
 * @Date:
 */
public interface FiSupBalanceBillService {
    /**
     * 取结算数据
     * @param
     * @return
     */
    public BalanceDataGenerateResponse generateBalanceData(BalanceDataGenerateRequest request);

    /**
     * 获取没有结算的数据
     * @param request
     * @return
     */
    public NotBalanceBillGetResponse getNotBalanceBill(NotBalanceBillGetRequest request);

    /**
     * 选择指定明细项目生成结算明细
     * @param request
     * @return
     */
    public AppointBalanceBillDtlGenerateResponse generateAppointBalanceBillDtl(AppointBalanceBillDtlGenerateRequest request) ;
    /**
     * 删除结算单商品明细中的指定项目
     * @param request
     * @return
     */
    public AppointForSupBalanceDtlDeleteResponse deleteAppointForSupBalanceDtl(AppointForSupBalanceDtlDeleteRequest request);

    /**
     * 批量生成结算
     * @param request
     * @return
     */
    public BalanceDataBatchGenerateResponse batchGenerateBalanceData(BalanceDataBatchGenerateRequest request);

    /**
     * 插入结算数据
     * @param
     * @return
     */
    public BalanceAvalUnitListBatchGenerateResponse batchGenerateBalanceAvalUnitList(BalanceAvalUnitListBatchGenerateRequest request);

    /**
     * 获得结算的结束时间
     */
    public BalanceEndDateGetResponse getBalanceEndDate(BalanceEndDateGetRequest request);

    //购销
    public NotContractBalancePurchaseSaleAutomaticResponse automateNotContractBalancePurchaseSale(NotContractBalancePurchaseSaleAutomaticRequest request);

    /**
     * @author alfred.liu
     * @date 2018/7/5 22:32
     * @description 自动生成供应商结算单（总部，不取合同日期）
     */
    public NotContractDateAutomateResponse automateNotContractDate (NotContractDateAutomateRequest request);

    //联销
    public NotContractBalanceJointSaleAutomaticResponse automateNotContractBalanceJointSale(NotContractBalanceJointSaleAutomaticRequest request) ;


    /**
     * 删除结算单商品明细
     * @param request
     * @return
     */
    public AllSupBalanceDtlDeleteResponse deleteAllSupBalanceBillDtl(AllSupBalanceBillDtlDeleteRequest request);

     /**
      * @author alfred.liu
      * @date 2018/7/14 14:54
      * @description 校验开票金额不能大于结算单中的金额
      */
    public BillAmountCheckResponse checkBillAmount(BillAmountCheckRequest request);

}
