package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.*;
import com.ykcloud.soa.erp.api.fi.response.*;


/**
 * @Description:供应商结算相关服务
 * @author Song
 * @Date 2018年4月4日 上午11:31:46
 */
public interface FiSettleService {

	//取结算数据
	public BalanceDataGenerateResponse generateBalanceData(BalanceDataGenerateRequest request);
	
	//刷新扣款项
	public BalanceCutDeductionFlushResponse flushBalanceCutDeduction(BalanceCutDeductionFlushRequest request);
	
	//获取没有结算的数据
	public NotBalanceGetResponse getNotBalance(NotBalanceGetRequest request);
	
	//获取可结算扣款项明细
	public NotBalanceCutGetResponse getNotBalanceCut(NotBalanceCutGetRequest request);
	
	//选择指定明细项目生成结算明细
	public AppointBalanceDtlGenerateResponse generateAppointBalanceDtl(AppointBalanceDtlGenerateRequest request);
	
	//选择指定扣款项明细项目生成结算明细
	public AppointBalanceCutDtlGenerateResponse generateAppointBalanceCutDtl(AppointBalanceCutDtlGenerateRequest request);
	
	//删除结算单商品明细中的指定项目
	public AppointForSupBalanceDtlDeleteResponse deleteAppointForSupBalanceDtl(AppointForSupBalanceDtlDeleteRequest request);
	
	//删除结算单扣款明细中的指定项目
	public AppointForSupBalanceCutDtlDeleteResponse deleteAppointForSupBalanceCutDtl(AppointForSupBalanceCutDtlDeleteRequest request);

	//结算单审核
	public BalanceAuditResponse auditBalance(BalanceAuditRequest request);
	
	//到票发票审核
	public BillAuditResponse auditBill(BillAuditRequest request);

	//付款审核
	public PaymentAuditResponse auditPayment(PaymentAuditRequest request);

	//预付款审核
	public PrePaymentAuditResponse auditPrePayment(PrePaymentAuditRequest request);

	//购销
	public BalancePurchaseSaleAutomaticResponse automaticBalancePurchaseSale(BalancePurchaseSaleAutomaticRequest request);
	//代销
	public BalanceSellOffAutomaticResponse automaticBalanceSellOff(BalanceSellOffAutomaticRequest request);
	//联销
	public BalanceJointSaleAutomaticResponse automaticBalanceJointSale(BalanceJointSaleAutomaticRequest request) ;
	//刷新往来
	public BalanceDealingsDeductionFlushResponse flushBalanceDealingsDeduction(BalanceDealingsDeductionFlushRequest request);
	//获取可结算往来项明细
	public NotBalanceDealingsGetResponse getNotBalanceDealings(NotBalanceDealingsGetRequest request);
	//选择指定往来项明细项目生成结算明细
	public AppointBalanceDealingsDtlGenerateResponse generateAppointBalanceDealingsDtl(AppointBalanceDealingsDtlGenerateRequest request);
	//删除结算单往来明细中的指定项目
	public AppointForSupBalanceDealingsDtlDeleteResponse deleteAppointForSupBalanceDealingsDtl(AppointForSupBalanceDealingsDtlDeleteRequest request);

	 /**
	  * @author alfred.liu
	  * @date 2018/6/1 10:34
	  * @description 现金收据审核
	  */
	public CashReceiptAuditResponse auditCashReceipt(CashReceiptAuditRequest request);

	/**
	 * @author alfred.liu
	 * @date 2018/5/24 11:20
	 * @description 保证金审核
	 */
	public EarnestMoneyAuditResponse auditEarnestMoney(EarnestMoneyAuditRequest request);

	 /**
	  * @author alfred.liu
	  * @date 2018/6/26 14:41
	  * @description 作废结算单
	  */
	  BalanceCancellationResponse cancellationBalance(BalanceCancellationRequest request);


}
