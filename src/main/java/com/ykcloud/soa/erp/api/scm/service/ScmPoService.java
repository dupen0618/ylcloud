
package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.ApprovalDtlsForGenerateDirectWayDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalOrderByBuyerAuditGetRequest;
import com.ykcloud.soa.erp.api.scm.request.PoBySupplyConfirmRequest;
import com.ykcloud.soa.erp.api.scm.request.PoForGenerateDirectWayDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.PoForGenerateReceiptGetRequest;
import com.ykcloud.soa.erp.api.scm.request.PoGenerateRequest;
import com.ykcloud.soa.erp.api.scm.response.ApprovalDtlsForGenerateDirectWayDistributionSoGetResponse;
import com.ykcloud.soa.erp.api.scm.response.ApprovalOrderByBuyerAuditResponse;
import com.ykcloud.soa.erp.api.scm.response.PoBySupplyConfirmResponse;
import com.ykcloud.soa.erp.api.scm.response.PoForGenerateDirectWayDistributionSoGetResponse;
import com.ykcloud.soa.erp.api.scm.response.PoForGenerateReceiptGetResponse;
import com.ykcloud.soa.erp.api.scm.response.PoGenerateResponse;
import com.ykcloud.soa.erp.api.scm.response.PoStatusNumIdForConfirmPoBySupplyUpdateResponse;
import com.ykcloud.soa.erp.api.scm.request.PoStatusNumIdForConfirmPoBySupplyUpdateRequest;

public interface ScmPoService {
	
	/**
	 * 更新采购单状态为供应商已确认（直送供应商确认生成验收单后或直通供应商确认生成验证单及分拨单后）
	 * @author tz.x
	 * @date 2018年3月28日下午5:44:28
	 * @param 
	 * @return
	 */
	public PoStatusNumIdForConfirmPoBySupplyUpdateResponse updatePoStatusNumIdForDirectSendGenerateReceipt(
			PoStatusNumIdForConfirmPoBySupplyUpdateRequest request);
	
	/**
	 * 为产生验收单获取采购单头、单身、供应商协同单身信息
	 * @author tz.x
	 * @date 2018年3月27日下午2:44:30
	 * @param 
	 * @return
	 */
	public PoForGenerateReceiptGetResponse getPoForGenerateReceipt(PoForGenerateReceiptGetRequest request);
	
	/**
	 * 供应商预约送货服务接口
	 * @author tz.x
	 * @date 2018年3月24日上午11:50:44
	 * @param 
	 * @return
	 */
	public PoBySupplyConfirmResponse confirmPoBySupply(PoBySupplyConfirmRequest request);
	
	/**
	 * 通过订货审批单获取采购单号
	 * @author tz.x
	 * @date 2018年3月21日下午3:32:00
	 * @param 
	 * @return
	 */
	public PoGenerateResponse generatePo(PoGenerateRequest request);
	
	//为产生直送分拨单获取采购单信息
	public PoForGenerateDirectWayDistributionSoGetResponse getPoForGenerateDirectWayDistributionSo(PoForGenerateDirectWayDistributionSoGetRequest request);

	//为产生直送分拨单获取订货审批单明细
	public ApprovalDtlsForGenerateDirectWayDistributionSoGetResponse getApprovalDtlsForGenerateDirectWayDistributionSo(ApprovalDtlsForGenerateDirectWayDistributionSoGetRequest request);
    //直送、直通订货审批单采购审核
	public ApprovalOrderByBuyerAuditResponse auditApprovalOrderByBuyer(ApprovalOrderByBuyerAuditGetRequest request);
	
}


