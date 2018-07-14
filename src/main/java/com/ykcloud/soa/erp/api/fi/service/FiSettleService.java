package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.AppointBalanceCutDtlGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.AppointBalanceDealingsDtlGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.AppointBalanceDtlGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.AppointForSupBalanceCutDtlDeleteRequest;
import com.ykcloud.soa.erp.api.fi.request.AppointForSupBalanceDealingsDtlDeleteRequest;
import com.ykcloud.soa.erp.api.fi.request.AppointForSupBalanceDtlDeleteRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceAuditRequest;
import com.ykcloud.soa.erp.api.fi.request.RollbackAuditionRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceCancellationRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceCutDeductionFlushRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceDataGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceDealingsDeductionFlushRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceJointSaleAutomaticRequest;
import com.ykcloud.soa.erp.api.fi.request.BalancePurchaseSaleAutomaticRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceSellOffAutomaticRequest;
import com.ykcloud.soa.erp.api.fi.request.BatchBillAuditRequest;
import com.ykcloud.soa.erp.api.fi.request.BillAuditRequest;
import com.ykcloud.soa.erp.api.fi.request.CashReceiptAuditRequest;
import com.ykcloud.soa.erp.api.fi.request.EarnestMoneyAuditRequest;
import com.ykcloud.soa.erp.api.fi.request.NotBalanceCutGetRequest;
import com.ykcloud.soa.erp.api.fi.request.NotBalanceDealingsGetRequest;
import com.ykcloud.soa.erp.api.fi.request.NotBalanceGetRequest;
import com.ykcloud.soa.erp.api.fi.request.PaymentAuditRequest;
import com.ykcloud.soa.erp.api.fi.request.PrePaymentAuditRequest;
import com.ykcloud.soa.erp.api.fi.response.AppointBalanceCutDtlGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.AppointBalanceDealingsDtlGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.AppointBalanceDtlGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.AppointForSupBalanceCutDtlDeleteResponse;
import com.ykcloud.soa.erp.api.fi.response.AppointForSupBalanceDealingsDtlDeleteResponse;
import com.ykcloud.soa.erp.api.fi.response.AppointForSupBalanceDtlDeleteResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceAuditResponse;
import com.ykcloud.soa.erp.api.fi.response.RollbackAuditionResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceCancellationResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceCutDeductionFlushResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceDataGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceDealingsDeductionFlushResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceJointSaleAutomaticResponse;
import com.ykcloud.soa.erp.api.fi.response.BalancePurchaseSaleAutomaticResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceSellOffAutomaticResponse;
import com.ykcloud.soa.erp.api.fi.response.BatchBillAuditResponse;
import com.ykcloud.soa.erp.api.fi.response.BillAuditResponse;
import com.ykcloud.soa.erp.api.fi.response.CashReceiptAuditResponse;
import com.ykcloud.soa.erp.api.fi.response.EarnestMoneyAuditResponse;
import com.ykcloud.soa.erp.api.fi.response.NotBalanceCutGetResponse;
import com.ykcloud.soa.erp.api.fi.response.NotBalanceDealingsGetResponse;
import com.ykcloud.soa.erp.api.fi.response.NotBalanceGetResponse;
import com.ykcloud.soa.erp.api.fi.response.PaymentAuditResponse;
import com.ykcloud.soa.erp.api.fi.response.PrePaymentAuditResponse;


/**
 * 供应商结算相关服务
 *
 * @author Song
 * @date 2018年4月4日 上午11:31:46
 */
public interface FiSettleService {

    /**
     * 取结算数据
     */
    BalanceDataGenerateResponse generateBalanceData(BalanceDataGenerateRequest request);

    /**
     * 刷新扣款项
     */
    BalanceCutDeductionFlushResponse flushBalanceCutDeduction(BalanceCutDeductionFlushRequest request);

    /**
     * 获取没有结算的数据
     */
    NotBalanceGetResponse getNotBalance(NotBalanceGetRequest request);

    /**
     * 获取可结算扣款项明细
     */
    NotBalanceCutGetResponse getNotBalanceCut(NotBalanceCutGetRequest request);

    /**
     * 选择指定明细项目生成结算明细
     */
    AppointBalanceDtlGenerateResponse generateAppointBalanceDtl(AppointBalanceDtlGenerateRequest request);

    /**
     * 选择指定扣款项明细项目生成结算明细
     */
    AppointBalanceCutDtlGenerateResponse generateAppointBalanceCutDtl(AppointBalanceCutDtlGenerateRequest request);

    /**
     * 删除结算单商品明细中的指定项目
     */
    AppointForSupBalanceDtlDeleteResponse deleteAppointForSupBalanceDtl(AppointForSupBalanceDtlDeleteRequest request);

    /**
     * 删除结算单扣款明细中的指定项目
     */
    AppointForSupBalanceCutDtlDeleteResponse deleteAppointForSupBalanceCutDtl(AppointForSupBalanceCutDtlDeleteRequest request);

    /**
     * 结算单审核
     */
    BalanceAuditResponse auditBalance(BalanceAuditRequest request);

    /**
     * 到票发票审核
     */
    BillAuditResponse auditBill(BillAuditRequest request);

    /**
     * 付款审核
     */
    PaymentAuditResponse auditPayment(PaymentAuditRequest request);

    /**
     * 预付款审核
     */
    PrePaymentAuditResponse auditPrePayment(PrePaymentAuditRequest request);

    /**
     * 购销
     */
    BalancePurchaseSaleAutomaticResponse automaticBalancePurchaseSale(BalancePurchaseSaleAutomaticRequest request);

    /**
     * 代销
     */
    BalanceSellOffAutomaticResponse automaticBalanceSellOff(BalanceSellOffAutomaticRequest request);

    /**
     * 联销
     */
    BalanceJointSaleAutomaticResponse automaticBalanceJointSale(BalanceJointSaleAutomaticRequest request);

    /**
     * 刷新往来
     */
    BalanceDealingsDeductionFlushResponse flushBalanceDealingsDeduction(BalanceDealingsDeductionFlushRequest request);

    /**
     * 获取可结算往来项明细
     */
    NotBalanceDealingsGetResponse getNotBalanceDealings(NotBalanceDealingsGetRequest request);

    /**
     * 选择指定往来项明细项目生成结算明细
     */
    AppointBalanceDealingsDtlGenerateResponse generateAppointBalanceDealingsDtl(AppointBalanceDealingsDtlGenerateRequest request);

    /**
     * 删除结算单往来明细中的指定项目
     */
    AppointForSupBalanceDealingsDtlDeleteResponse deleteAppointForSupBalanceDealingsDtl(
            AppointForSupBalanceDealingsDtlDeleteRequest request);

    /**
     * @author alfred.liu
     * @date 2018/6/1 10:34
     * @description 现金收据审核
     */
    CashReceiptAuditResponse auditCashReceipt(CashReceiptAuditRequest request);

    /**
     * @author alfred.liu
     * @date 2018/5/24 11:20
     * @description 保证金审核
     */
    EarnestMoneyAuditResponse auditEarnestMoney(EarnestMoneyAuditRequest request);

    /**
     * @author alfred.liu
     * @date 2018/6/26 14:41
     * @description 删除/作废结算单
     */
    BalanceCancellationResponse cancellationBalance(BalanceCancellationRequest request);



    /**
     * 多次到票审核
     */
    BatchBillAuditResponse auditBatchBill(BatchBillAuditRequest request);

    /**
     * 反审核, 回写数据
     *
     * @author Sealin
     */
    RollbackAuditionResponse rollbackAudition(RollbackAuditionRequest request);
}
