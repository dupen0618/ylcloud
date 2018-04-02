package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.ApplyHdrStatusForGenerateApprovalReturnOrderUpdateRequest;
import com.ykcloud.soa.erp.api.so.request.DirectWayDistributionSoGenerateRequest;
import com.ykcloud.soa.erp.api.so.request.DistributionSoGenerateRequest;
import com.ykcloud.soa.erp.api.so.request.GoodsByBarcodeGetRequest;
import com.ykcloud.soa.erp.api.so.request.SoPackingUpdateRequest;
import com.ykcloud.soa.erp.api.so.request.SoWlbcAndSoBingingRequest;
import com.ykcloud.soa.erp.api.so.response.ApplyHdrStatusForGenerateApprovalReturnOrderUpdateResponse;
import com.ykcloud.soa.erp.api.so.response.DirectWayDistributionSoGenerateResponse;
import com.ykcloud.soa.erp.api.so.response.DistributionSoGenerateResponse;
import com.ykcloud.soa.erp.api.so.response.GoodsByBarcodeGetResponse;
import com.ykcloud.soa.erp.api.so.response.SoPackingUpdateResponse;
import com.ykcloud.soa.erp.api.so.response.SoWlbcAndSoBingingResponse;

public interface SoMaintanceService {

	// 按条码获取商品
	public GoodsByBarcodeGetResponse getGoodsInfoByBarcode(GoodsByBarcodeGetRequest request);
	
	//直通收货按验收单及订货审批单产生分拨单
	public DirectWayDistributionSoGenerateResponse  generateDirectWayDistributionSo(DirectWayDistributionSoGenerateRequest request);

	//产生配送分拨单
	public DistributionSoGenerateResponse generateDistributionSo(DistributionSoGenerateRequest request);

	//更新订单中的装箱数量
	public SoPackingUpdateResponse updateSoPackingDtl(SoPackingUpdateRequest request);
	
	public SoWlbcAndSoBingingResponse bingingWlbcAndSo(SoWlbcAndSoBingingRequest request);

    public ApplyHdrStatusForGenerateApprovalReturnOrderUpdateResponse updateApplyHdrStatusForGenerateApprovalReturnOrder
            (ApplyHdrStatusForGenerateApprovalReturnOrderUpdateRequest request);
}
