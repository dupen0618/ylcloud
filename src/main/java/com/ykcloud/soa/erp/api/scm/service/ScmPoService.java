
package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.ApprovalDtlsForGenerateDirectWayDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalOrderByBuyerAuditGetRequest;
import com.ykcloud.soa.erp.api.scm.request.GiftQtyForApprovalOrderCalcateRequest;
import com.ykcloud.soa.erp.api.scm.request.PoForGenerateDirectWayDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.PoGenerateRequest;
import com.ykcloud.soa.erp.api.scm.response.*;

public interface ScmPoService {
	
	//订货审批单产生采购单
	public PoGenerateResponse generatePo(PoGenerateRequest request);
	
	//为产生直送分拨单获取采购单信息
	public PoForGenerateDirectWayDistributionSoGetResponse getPoForGenerateDirectWayDistributionSo(PoForGenerateDirectWayDistributionSoGetRequest request);

	//为产生直送分拨单获取订货审批单明细
	public ApprovalDtlsForGenerateDirectWayDistributionSoGetResponse getApprovalDtlsForGenerateDirectWayDistributionSo(ApprovalDtlsForGenerateDirectWayDistributionSoGetRequest request);
    //直送、直通订货审批单采购审核
	public ApprovalOrderByBuyerAuditResponse auditApprovalOrderByBuyer(ApprovalOrderByBuyerAuditGetRequest request);
    //分配赠品
    public GiftQtyForApprovalOrderCalcateResponse calcateGiftQtyForApprovalOrder(GiftQtyForApprovalOrderCalcateRequest request);
	
}


