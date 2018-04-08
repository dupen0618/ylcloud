package com.ykcloud.soa.erp.api.scm.service;



import com.ykcloud.soa.erp.api.scm.request.ApprovalReturnOrderByFinanceAutoAuditRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalReturnOrderByFinanceHandAuditRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalReturnOrderGenerateRequest;
import com.ykcloud.soa.erp.api.scm.request.DistributionApprovalReturnOrderByBuyerAuditRequest;
import com.ykcloud.soa.erp.api.scm.request.InventoryForReturnApprovalLockRequest;
import com.ykcloud.soa.erp.api.scm.request.SupplyApprovalReturnOrderByBuyerAuditRequest;
import com.ykcloud.soa.erp.api.scm.response.ApprovalReturnOrderByFinanceAutoAuditResponse;
import com.ykcloud.soa.erp.api.scm.response.ApprovalReturnOrderByFinanceHandAuditResponse;
import com.ykcloud.soa.erp.api.scm.response.ApprovalReturnOrderGenerateResponse;
import com.ykcloud.soa.erp.api.scm.request.ReturnProductGetRequest;
import com.ykcloud.soa.erp.api.scm.response.DistributionApprovalReturnOrderByBuyerAuditResponse;
import com.ykcloud.soa.erp.api.scm.response.InventoryForReturnApprovalLockResponse;
import com.ykcloud.soa.erp.api.scm.response.ReturnProductGetResponse;
import com.ykcloud.soa.erp.api.scm.response.SupplyApprovalReturnOrderByBuyerAuditResponse;

/**
 * @author fred.zhao
 * 根据退货申请产生退货审批单服务
 */
public interface ScmReturnService {
	
	/**
	 * 退货审批后锁库及产生so
	 * @author tz.x
	 * @date 2018年4月8日下午4:20:40
	 * @param 
	 * @return
	 */
	public InventoryForReturnApprovalLockResponse lockInventoryForReturnApproval(InventoryForReturnApprovalLockRequest request);
	
    //退货申请单生成退货审批单
    public ApprovalReturnOrderGenerateResponse generateApprovalReturnOrder(ApprovalReturnOrderGenerateRequest request);
     //前台根据商品编号获取退货商品相关信息(价格）
	public ReturnProductGetResponse getReturnProduct(ReturnProductGetRequest request);
    /** 
    * @Description: 退供应商审核
    * @Author: fred.zhao
    * @Date: 2018/4/3 
    */ 
	public SupplyApprovalReturnOrderByBuyerAuditResponse auditSupplyApprovalReturnOrderByBuyer(SupplyApprovalReturnOrderByBuyerAuditRequest request);
    /**
    * @Description: 退大仓审核
    * @Author: fred.zhao
    * @Date: 2018/4/3
    */
	public DistributionApprovalReturnOrderByBuyerAuditResponse auditDistributionApprovalReturnOrderByBuyer(DistributionApprovalReturnOrderByBuyerAuditRequest request);
    /** 
    * @Description: 退供应商财务审核
    * @Author: fred.zhao
    * @Date: 2018/4/3 
    */ 
	public ApprovalReturnOrderByFinanceAutoAuditResponse auditApprovalReturnOrderByFinanceAuto(ApprovalReturnOrderByFinanceAutoAuditRequest request);

	/** 
	* @Description: 退供应商财务人工审核
	* @Author: fred.zhao
	* @Date: 2018/4/4 
	*/ 
	public ApprovalReturnOrderByFinanceHandAuditResponse auditApprovalReturnOrderByFinanceHand(ApprovalReturnOrderByFinanceHandAuditRequest request);

}
