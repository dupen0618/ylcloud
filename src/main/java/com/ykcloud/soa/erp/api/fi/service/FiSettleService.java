package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.BalanceAuditRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceDtlByDeductionGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.AppointBalanceDtlGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.BillAuditRequest;
import com.ykcloud.soa.erp.api.fi.request.DeductionDtlForBalanceDeleteRequest;
import com.ykcloud.soa.erp.api.fi.request.DeductionForCanBalanceGetRequest;
import com.ykcloud.soa.erp.api.fi.request.PaymentAuditRequest;
import com.ykcloud.soa.erp.api.fi.request.AppointForSupBalanceDtlDeleteRequest;
import com.ykcloud.soa.erp.api.fi.request.NotBalanceGetRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceDataGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.SupplyByBalanceDeductionFlushRequest;
import com.ykcloud.soa.erp.api.fi.response.BalanceAuditResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceDtlByDeductionGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.AppointBalanceDtlGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.BillAuditResponse;
import com.ykcloud.soa.erp.api.fi.response.DeductionDtlForBalanceDeleteResponse;
import com.ykcloud.soa.erp.api.fi.response.DeductionForCanBalanceGetResponse;
import com.ykcloud.soa.erp.api.fi.response.PaymentAuditResponse;
import com.ykcloud.soa.erp.api.fi.response.AppointForSupBalanceDtlDeleteResponse;
import com.ykcloud.soa.erp.api.fi.response.NotBalanceGetResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceDataGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.SupplyByBalanceDeductionFlushResponse;

/**
 * @Description:供应商结算相关服务
 * @author Song
 * @Date 2018年4月4日 上午11:31:46
 */
public interface FiSettleService {

	//取结算数据
	public BalanceDataGenerateResponse generateBalanceData(BalanceDataGenerateRequest request);
	
	//刷新扣款项
	public SupplyByBalanceDeductionFlushResponse flushBalanceDeduction(SupplyByBalanceDeductionFlushRequest request);
	
	//获取没有结算的数据
	public NotBalanceGetResponse getNotBalance(NotBalanceGetRequest request);
	
	//获取可结算扣款项明细
	public DeductionForCanBalanceGetResponse getDeductionForBalance(DeductionForCanBalanceGetRequest request);
	
	//选择指定验收入库单明细项目生成结算明细
	public AppointBalanceDtlGenerateResponse generateAppointBalanceDtl(AppointBalanceDtlGenerateRequest request);
	
	//选择指定扣款项明细项目生成结算明细
	public BalanceDtlByDeductionGenerateResponse generateBalanceDtlByDeduction(BalanceDtlByDeductionGenerateRequest request);
	
	//删除结算单商品明细中的指定项目
	public AppointForSupBalanceDtlDeleteResponse deleteAppointForSupBalanceDtl(AppointForSupBalanceDtlDeleteRequest request);
	
	//删除结算单扣款明细中的指定项目
	public DeductionDtlForBalanceDeleteResponse deleteDeductionDtlForBalance(DeductionDtlForBalanceDeleteRequest request);
	
	//结算单审核
	public BalanceAuditResponse auditBalance(BalanceAuditRequest request);
	
	//到票发票审核
	public BillAuditResponse auditBill(BillAuditRequest request);

	//付款审核
	public PaymentAuditResponse auditPayment(PaymentAuditRequest request);

	//预付款审核
	public PaymentAuditResponse auditPrePayment(BillAuditRequest request);

}
