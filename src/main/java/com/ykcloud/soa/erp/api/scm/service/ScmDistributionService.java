
package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.InventoryForDistributionApprovalLockRequest;
import com.ykcloud.soa.erp.api.scm.response.InventoryForDistributionApprovalLockResponse;

public interface ScmDistributionService {
	
	//已审核配送审批单锁库
	public InventoryForDistributionApprovalLockResponse lockInventoryForDistributionApproval(InventoryForDistributionApprovalLockRequest request);

	
}




  




