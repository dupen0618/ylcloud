
package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.ApprovalDtlsForGenerateDirectWayDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalOrderByBuyerAuditGetRequest;
import com.ykcloud.soa.erp.api.scm.request.GiftQtyForApprovalOrderCalcateRequest;
import com.ykcloud.soa.erp.api.scm.request.PoBySupplyConfirmRequest;
import com.ykcloud.soa.erp.api.scm.request.PoForGenerateDirectWayDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.PoForGenerateReceiptGetRequest;
import com.ykcloud.soa.erp.api.scm.request.PoGenerateRequest;
import com.ykcloud.soa.erp.api.scm.response.*;

public interface ScmPoService {
	
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
    //分配赠品
    public GiftQtyForApprovalOrderCalcateResponse calcateGiftQtyForApprovalOrder(GiftQtyForApprovalOrderCalcateRequest request);
	
}


