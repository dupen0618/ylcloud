package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class PoForGenerateDirectWayDistributionSoGetResponse extends MessagePack {

	private static final long serialVersionUID = -3621634900229807547L;
	
	private Double depositAmount;//定金
	
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
