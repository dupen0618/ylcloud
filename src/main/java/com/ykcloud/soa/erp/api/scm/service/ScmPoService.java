
package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.ApprovalDtlsForGenerateDirectWayDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.PoForGenerateDirectWayDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.PoGenerateRequest;
import com.ykcloud.soa.erp.api.scm.response.ApprovalDtlsForGenerateDirectWayDistributionSoGetResponse;
import com.ykcloud.soa.erp.api.scm.response.PoForGenerateDirectWayDistributionSoGetResponse;
import com.ykcloud.soa.erp.api.scm.response.PoGenerateResponse;

public interface ScmPoService {
	
	//订货审批单产生采购单
	public PoGenerateResponse generatePo(PoGenerateRequest request);
	
	//为产生直送分拨单获取采购单信息
	public PoForGenerateDirectWayDistributionSoGetResponse getPoForGenerateDirectWayDistributionSo(PoForGenerateDirectWayDistributionSoGetRequest request);

	//为产生直送分拨单获取订货审批单明细
	public ApprovalDtlsForGenerateDirectWayDistributionSoGetResponse getApprovalDtlsForGenerateDirectWayDistributionSo(ApprovalDtlsForGenerateDirectWayDistributionSoGetRequest request);

	
	
}




  




