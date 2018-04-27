package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.*;
import com.ykcloud.soa.erp.api.so.response.*;

public interface SoMaintanceService {
	
	/**
	 * 订单发货后回写审批单和申请单发货数量之前通过so单号查询要回写的审批单
	 * @author tz.x
	 * @date 2018年4月19日上午9:56:59
	 * @param 
	 * @return
	 */
	public SoDtlForUpdateActualQtyGetResponse getSoDtlForUpdateActualQty(SoDtlForUpdateActualQtyGetRequest request);
	
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
	
	//将wlbc与订单绑定
	public SoWlbcAndSoBingingResponse updateSoWlbc(SoWlbcAndSoBingingRequest request);


    public ApplyHdrStatusForGenerateApprovalReturnOrderUpdateResponse updateApplyHdrStatusForGenerateApprovalReturnOrder
            (ApplyHdrStatusForGenerateApprovalReturnOrderUpdateRequest request);

	//跟新订单出库类型
	public SoConfirmTypeResponse updateSoConFirmType(SoConfirmTypeRequest request);
	
	//按wlbc更新订单状态
	public SoStatusUpdateResponse updateSoStatusAndCancelQty(SoStatusUpdateRequest request);

	//按so更新订单状态
	public SoStatusUpdateSoOneResponse updateSoStatusAndCancelQtyOneSo(SoStatusUpdateSoOneRequest request);
	
	public SoShipQtyUpdateResponse updateSoShipQty(SoShipQtyUpdateRequest request);

	public CheckSoShipQtyAndPackingQtyResponse checkSoShipQtyAndPackingQty(CheckSoShipQtyAndPackingQtyRequest request);

	public SoAllotWithShipResponse allotSoWithShip(SoAllotWithShipRequest request);
	
	public SoUpdateLockToPackingResponse updateSoLockToPacking(SoUpdateLockToPackingRequest request);

	//订单预出
	public packingOrderItemInventoryResponse upPackingOrderItemInventory(packingOrderItemInventoryRequest request);
}
