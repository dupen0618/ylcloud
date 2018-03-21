
package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.ApprovalDtlsForGenerateDirectWayDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.GeneratePoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.PoForGenerateDirectWayDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.response.ApprovalDtlsForGenerateDirectWayDistributionSoGetResponse;
import com.ykcloud.soa.erp.api.scm.response.GeneratePoGetResponse;
import com.ykcloud.soa.erp.api.scm.response.PoForGenerateDirectWayDistributionSoGetResponse;

public interface ScmPoService {
	
	/**
	 * 通过订货审批单获取采购单号
	 * @author tz.x
	 * @date 2018年3月21日下午3:32:00
	 * @param 
	 * @return
	 */
	public GeneratePoGetResponse generatePo(GeneratePoGetRequest request);
	
	//为产生直送分拨单获取采购单信息
	public PoForGenerateDirectWayDistributionSoGetResponse getPoForGenerateDirectWayDistributionSo(PoForGenerateDirectWayDistributionSoGetRequest request);

	//为产生直送分拨单获取订货审批单明细
	public ApprovalDtlsForGenerateDirectWayDistributionSoGetResponse getApprovalDtlsForGenerateDirectWayDistributionSo(ApprovalDtlsForGenerateDirectWayDistributionSoGetRequest request);

	
	
}




  




