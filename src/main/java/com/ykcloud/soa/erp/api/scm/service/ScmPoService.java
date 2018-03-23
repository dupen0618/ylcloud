

package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.ApprovalDtlsForGenerateDirectWayDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.AuditApprovalOrderByBuyerGetRequest;
import com.ykcloud.soa.erp.api.scm.request.GiftQtyForApprovalOrderCalcateGetRequest;
import com.ykcloud.soa.erp.api.scm.request.PoForGenerateDirectWayDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.response.ApprovalDtlsForGenerateDirectWayDistributionSoGetResponse;
import com.ykcloud.soa.erp.api.scm.response.AuditApprovalOrderByBuyerGetResponse;
import com.ykcloud.soa.erp.api.scm.response.GiftQtyForApprovalOrderCalcateGetResponse;
import com.ykcloud.soa.erp.api.scm.response.PoForGenerateDirectWayDistributionSoGetResponse;

public interface ScmPoService {
	
	//为产生直送分拨单获取采购单信息
	public PoForGenerateDirectWayDistributionSoGetResponse getPoForGenerateDirectWayDistributionSo(PoForGenerateDirectWayDistributionSoGetRequest request);

	//为产生直送分拨单获取订货审批单明细
	public ApprovalDtlsForGenerateDirectWayDistributionSoGetResponse getApprovalDtlsForGenerateDirectWayDistributionSo(ApprovalDtlsForGenerateDirectWayDistributionSoGetRequest request);
    //直送、直通订货审批单采购审核
	public AuditApprovalOrderByBuyerGetResponse auditApprovalOrderByBuyer(AuditApprovalOrderByBuyerGetRequest request);
    //分配赠品
    public GiftQtyForApprovalOrderCalcateGetResponse calcateGiftQtyForApprovalOrder(GiftQtyForApprovalOrderCalcateGetRequest request);
	
}


