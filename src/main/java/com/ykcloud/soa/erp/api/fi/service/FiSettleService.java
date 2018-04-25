package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.BalanceAuditRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceDtlByDeductionGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceDtlByReceiptGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.BillAuditRequest;
import com.ykcloud.soa.erp.api.fi.request.DeductionDtlForBalanceDeleteRequest;
import com.ykcloud.soa.erp.api.fi.request.DeductionForCanBalanceGetRequest;
import com.ykcloud.soa.erp.api.fi.request.PaymentAuditRequest;
import com.ykcloud.soa.erp.api.fi.request.ProductDtlForBalanceDeleteRequest;
import com.ykcloud.soa.erp.api.fi.request.ReceiptDtilsForCanBalanceGetRequest;
import com.ykcloud.soa.erp.api.fi.request.SupplyByBalanceDataGetRequest;
import com.ykcloud.soa.erp.api.fi.request.SupplyByBalanceDeductionFlushRequest;
import com.ykcloud.soa.erp.api.fi.response.BalanceAuditResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceDtlByDeductionGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceDtlByReceiptGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.BillAuditResponse;
import com.ykcloud.soa.erp.api.fi.response.DeductionDtlForBalanceDeleteResponse;
import com.ykcloud.soa.erp.api.fi.response.DeductionForCanBalanceGetResponse;
import com.ykcloud.soa.erp.api.fi.response.PaymentAuditResponse;
import com.ykcloud.soa.erp.api.fi.response.ProductDtlForBalanceDeleteResponse;
import com.ykcloud.soa.erp.api.fi.response.ReceiptDtilsForCanBalanceGetResponse;
import com.ykcloud.soa.erp.api.fi.response.SupplyByBalanceDataGetResponse;
import com.ykcloud.soa.erp.api.fi.response.SupplyByBalanceDeductionFlushResponse;

/**
 * @Description:供应商结算相关服务
 * @author Song
 * @Date 2018年4月4日 上午11:31:46
 */
public interface FiSettleService {

	//取结算数据
	public SupplyByBalanceDataGetResponse getBalanceData(SupplyByBalanceDataGetRequest request);
	
	//刷新扣款项
	public SupplyByBalanceDeductionFlushResponse flushDeduction(SupplyByBalanceDeductionFlushRequest request);
	
	//获取可结算验收入库明细
	public ReceiptDtilsForCanBalanceGetResponse getReceiptDtilsForBalance(ReceiptDtilsForCanBalanceGetRequest request);
	
	//获取可结算扣款项明细
	public DeductionForCanBalanceGetResponse getDeductionForBalance(DeductionForCanBalanceGetRequest request);
	
	//选择指定验收入库单明细项目生成结算明细
	public BalanceDtlByReceiptGenerateResponse generateBalanceDtlByReceipt(BalanceDtlByReceiptGenerateRequest request);
	
	//选择指定扣款项明细项目生成结算明细
	public BalanceDtlByDeductionGenerateResponse generateBalanceDtlByDeduction(BalanceDtlByDeductionGenerateRequest request);
	
	//删除结算单商品明细中的指定项目
	public ProductDtlForBalanceDeleteResponse deleteProductDtlForBalance(ProductDtlForBalanceDeleteRequest request);
	
	//删除结算单扣款明细中的指定项目
	public DeductionDtlForBalanceDeleteResponse deleteDeductionDtlForBalance(DeductionDtlForBalanceDeleteRequest request);
	
	//结算单审核
	public BalanceAuditResponse auditBalance(BalanceAuditRequest request);
	
	//到票发票审核
	public BillAuditResponse auditBill(BillAuditRequest request);

	//付款审核
	public PaymentAuditResponse auditPayment(PaymentAuditRequest request);

	//预付款审核
	public PaymentAuditResponse auditPrePayment(PaymentAuditRequest request);

}
