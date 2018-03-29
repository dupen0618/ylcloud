package com.ykcloud.soa.erp.api.scm.service;


import com.ykcloud.soa.erp.api.scm.request.ApprovalReturnOrderGenerateRequest;
import com.ykcloud.soa.erp.api.scm.response.ApprovalReturnOrderGenerateResponse;

/**
 * @author fred.zhao
 * 根据退货申请产生退货审批单服务
 */
public interface ScmReturnService {
    //退货申请单生成退货审批单
    public ApprovalReturnOrderGenerateResponse generateApprovalReturnOrder(ApprovalReturnOrderGenerateRequest request);
}
