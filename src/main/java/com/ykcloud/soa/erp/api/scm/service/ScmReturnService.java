package com.ykcloud.soa.erp.api.scm.service;



import com.ykcloud.soa.erp.api.scm.request.ApprovalReturnOrderGenerateRequest;
import com.ykcloud.soa.erp.api.scm.request.SupplyApprovalReturnOrderByBuyerAuditRequest;
import com.ykcloud.soa.erp.api.scm.response.ApprovalReturnOrderGenerateResponse;
import com.ykcloud.soa.erp.api.scm.request.ReturnProductGetRequest;
import com.ykcloud.soa.erp.api.scm.response.ReturnProductGetResponse;
import com.ykcloud.soa.erp.api.scm.response.SupplyApprovalReturnOrderByBuyerAuditResponse;

/**
 * @author fred.zhao
 * 根据退货申请产生退货审批单服务
 */
public interface ScmReturnService {
    //退货申请单生成退货审批单
    public ApprovalReturnOrderGenerateResponse generateApprovalReturnOrder(ApprovalReturnOrderGenerateRequest request);
     //前台根据商品编号获取退货商品相关信息(价格）
	public ReturnProductGetResponse getReturnProduct(ReturnProductGetRequest request);
    /** 
    * @Description:
    * @Author: fred.zhao
    * @Date: 2018/4/3 
    */ 
	public SupplyApprovalReturnOrderByBuyerAuditResponse auditSupplyApprovalReturnOrderByBuyer(SupplyApprovalReturnOrderByBuyerAuditRequest request);

}
