package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 更新采购单状态为供应商已确认（直送供应商确认生成验收单后或直通供应商确认生成验证单及分拨单后）出参
 * @author tz.x
 *
 * @date 2018年3月28日下午5:43:48
 * @see
 */
public class PoStatusNumIdForConfirmPoBySupplyUpdateResponse extends MessagePack {

	private static final long serialVersionUID = -6312392019594266994L;
	
	/**
	 * 定金金额
	 */
	private Double depositAmount;
	
	/**
	 * 订货审批单单号
	 */
	private String approvalNumId;

	public Double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(Double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public String getApprovalNumId() {
		return approvalNumId;
	}

	public void setApprovalNumId(String approvalNumId) {
		this.approvalNumId = approvalNumId;
	}

}
