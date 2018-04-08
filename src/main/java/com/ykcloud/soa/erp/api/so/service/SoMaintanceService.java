package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.ApplyHdrStatusForGenerateApprovalReturnOrderUpdateRequest;
import com.ykcloud.soa.erp.api.so.request.ApprovalReturnSoGenerateRequest;
import com.ykcloud.soa.erp.api.so.request.DirectWayDistributionSoGenerateRequest;
import com.ykcloud.soa.erp.api.so.request.DistributionSoGenerateRequest;
import com.ykcloud.soa.erp.api.so.request.SoConfirmTypeRequest;
import com.ykcloud.soa.erp.api.so.request.SoPackingUpdateRequest;
import com.ykcloud.soa.erp.api.so.request.SoStatusUpdateRequest;
import com.ykcloud.soa.erp.api.so.request.SoWlbcAndSoBingingRequest;
import com.ykcloud.soa.erp.api.so.response.ApplyHdrStatusForGenerateApprovalReturnOrderUpdateResponse;
import com.ykcloud.soa.erp.api.so.response.ApprovalReturnSoGenerateResponse;
import com.ykcloud.soa.erp.api.so.response.DirectWayDistributionSoGenerateResponse;
import com.ykcloud.soa.erp.api.so.response.DistributionSoGenerateResponse;
import com.ykcloud.soa.erp.api.so.response.SoConfirmTypeResponse;
import com.ykcloud.soa.erp.api.so.response.SoPackingUpdateResponse;
import com.ykcloud.soa.erp.api.so.response.SoStatusUpdateResponse;
import com.ykcloud.soa.erp.api.so.response.SoWlbcAndSoBingingResponse;

public interface SoMaintanceService {
	
	/**
	 * 退供应商退总仓产生so
	 * @author tz.x
	 * @date 2018年4月8日下午6:43:26
	 * @param 
	 * @return
	 */
	public ApprovalReturnSoGenerateResponse generateApprovalReturnSo(ApprovalReturnSoGenerateRequest request);

	//直通收货按验收单及订货审批单产生分拨单
	public DirectWayDistributionSoGenerateResponse  generateDirectWayDistributionSo(DirectWayDistributionSoGenerateRequest request);

	//产生配送分拨单
	public DistributionSoGenerateResponse generateDistributionSo(DistributionSoGenerateRequest request);

	//更新订单中的装箱数量
	public SoPackingUpdateResponse updateSoPackingDtl(SoPackingUpdateRequest request);
	
	public SoWlbcAndSoBingingResponse bingingWlbcAndSo(SoWlbcAndSoBingingRequest request);


    public ApplyHdrStatusForGenerateApprovalReturnOrderUpdateResponse updateApplyHdrStatusForGenerateApprovalReturnOrder
            (ApplyHdrStatusForGenerateApprovalReturnOrderUpdateRequest request);

	//跟新订单出库类型
	public SoConfirmTypeResponse updateSoConFirmType(SoConfirmTypeRequest request);
	
	//按wlbc更新订单状态
	public SoStatusUpdateResponse updateSoStatus(SoStatusUpdateRequest request);

}
