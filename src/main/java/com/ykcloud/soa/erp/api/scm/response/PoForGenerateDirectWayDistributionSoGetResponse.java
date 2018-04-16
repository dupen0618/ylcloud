package com.ykcloud.soa.erp.api.scm.response;

import java.util.Date;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class PoForGenerateDirectWayDistributionSoGetResponse extends MessagePack {

	private static final long serialVersionUID = -3621634900229807547L;
	
	private Double depositAmount;//定金
	
	private String approvalNumId;
	
	/**
	 * 送货截止日期
	 */
	private Date deliveryDate;
	
	/**
	 * 来源
	 */
	private Long soFromType;
	
	private Long supplyUnitNumId;
	
	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public Long getSoFromType() {
		return soFromType;
	}

	public void setSoFromType(Long soFromType) {
		this.soFromType = soFromType;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

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
