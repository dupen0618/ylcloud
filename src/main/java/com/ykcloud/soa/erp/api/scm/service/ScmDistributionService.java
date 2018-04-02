
package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.ApprovalDtlsForGenerateDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalHdrForGenerateDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.InventoryForDistributionApprovalLockRequest;
import com.ykcloud.soa.erp.api.scm.response.ApprovalDtlsForGenerateDistributionSoGetResponse;
import com.ykcloud.soa.erp.api.scm.response.ApprovalHdrForGenerateDistributionSoGetResponse;
import com.ykcloud.soa.erp.api.scm.response.InventoryForDistributionApprovalLockResponse;

public interface ScmDistributionService {
	
	//已审核配送审批单锁库
	public InventoryForDistributionApprovalLockResponse lockInventoryForDistributionApproval(
			InventoryForDistributionApprovalLockRequest request);

	//为产生配送分拨单，获取So单头纬度信息
	public ApprovalHdrForGenerateDistributionSoGetResponse getApprovalHdrForGenerateDistributionSo(
			ApprovalHdrForGenerateDistributionSoGetRequest request);
	
	//为产生配送分拨单，获取配送单身
	public ApprovalDtlsForGenerateDistributionSoGetResponse getApprovalDtlsForGenerateDistributionSo(
			ApprovalDtlsForGenerateDistributionSoGetRequest request);
	
}




  




