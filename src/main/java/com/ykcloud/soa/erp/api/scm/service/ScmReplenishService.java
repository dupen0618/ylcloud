package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.ApprovalOrderDemandCompensateRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalOrderGenerateRequest;
import com.ykcloud.soa.erp.api.scm.request.AutoReplenishApplyGenerateRequest;
import com.ykcloud.soa.erp.api.scm.request.CouponApprovalOrderGenerateRequest;
import com.ykcloud.soa.erp.api.scm.request.DmsForAutoReplenishCalcateRequest;
import com.ykcloud.soa.erp.api.scm.request.HandReplenishProductGetRequest;
import com.ykcloud.soa.erp.api.scm.response.ApprovalOrderDemandCompensateResponse;
import com.ykcloud.soa.erp.api.scm.response.ApprovalOrderGenerateResponse;
import com.ykcloud.soa.erp.api.scm.response.AutoReplenishApplyGenerateResponse;
import com.ykcloud.soa.erp.api.scm.response.DmsForAutoReplenishCalcateResponse;
import com.ykcloud.soa.erp.api.scm.response.HandReplenishProductGetResponse;
import com.ykcloud.soa.erp.api.scm.request.ReplenishApplyAuditRequest;
import com.ykcloud.soa.erp.api.scm.request.ReplenishApplyBatchAuditRequest;
import com.ykcloud.soa.erp.api.scm.request.ReplenishApplyByAuthorConfirmRequest;
import com.ykcloud.soa.erp.api.scm.request.ReplenishApplyDtlImportRequest;
import com.ykcloud.soa.erp.api.scm.request.ReturnApprovalNumIdByApplyNumIdGetRequest;
import com.ykcloud.soa.erp.api.scm.response.ApprovalOrderGenerateResponse;
import com.ykcloud.soa.erp.api.scm.response.ReplenishApplyAuditResponse;
import com.ykcloud.soa.erp.api.scm.response.ReplenishApplyBatchAuditResponse;
import com.ykcloud.soa.erp.api.scm.response.ReplenishApplyByAuthorConfirmResponse;
import com.ykcloud.soa.erp.api.scm.response.ReplenishApplyDtlImportResponse;
import com.ykcloud.soa.erp.api.scm.response.ReturnApprovalNumIdByApplyNumIdGetResponse;


/**
* @ClassName: ScmReplenishService.java
* @Description: 补货申请单,订货审批单服务
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月12日 上午11:20:50 
*/
public interface ScmReplenishService {
	
	//补货申请单生成订货审批单(普通单)
	public ApprovalOrderGenerateResponse generateApprovalOrder(ApprovalOrderGenerateRequest request);
	//补货申请单生成订货审批单(团购单)
	public ApprovalOrderGenerateResponse generateCouponApprovalOrder(CouponApprovalOrderGenerateRequest request);
    //前台根据商品编号获取补货商品相关信息
    public HandReplenishProductGetResponse getHandRepmentProductInfo(HandReplenishProductGetRequest request);
	//补货单制单确认
	public ReplenishApplyByAuthorConfirmResponse confirmReplenishApplyByAuthor(ReplenishApplyByAuthorConfirmRequest request);
	//补货单主管确认
	public ReplenishApplyAuditResponse auditReplenishApply(ReplenishApplyAuditRequest request);
    //计算ndms和pdms日销售量
	public DmsForAutoReplenishCalcateResponse calcateDmsForAutoReplenish(DmsForAutoReplenishCalcateRequest request);
    //产生自动补货申请单
	public AutoReplenishApplyGenerateResponse generateAutoReplenishApply(AutoReplenishApplyGenerateRequest request);

	//主管批量审核
	public ReplenishApplyBatchAuditResponse batchAuditReplenishApply(ReplenishApplyBatchAuditRequest request);

	//补货申请单Excel批量导入
	public ReplenishApplyDtlImportResponse importReplenishApplyDtl(ReplenishApplyDtlImportRequest request);

	//补偿生成审批单明细
	public ApprovalOrderDemandCompensateResponse compensateApprovalOrderDemand(ApprovalOrderDemandCompensateRequest request);
}
