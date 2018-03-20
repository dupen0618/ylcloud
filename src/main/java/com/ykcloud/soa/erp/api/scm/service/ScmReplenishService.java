package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.ApprovalOrderGenerateRequest;
import com.ykcloud.soa.erp.api.scm.response.ApprovalOrderGenerateResponse;

/**
* @ClassName: ScmReplenishService.java
* @Description: 补货申请单,订货审批单服务
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月12日 上午11:20:50 
*/
public interface ScmReplenishService {
	
	//补货申请单生成订货审批单
	public ApprovalOrderGenerateResponse generateApprovalOrder(ApprovalOrderGenerateRequest request);
	
	
}
