package com.ykcloud.soa.erp.api.scm.response;

import java.util.Date;
import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ApprovalStorageForGenerateDistributionSo;

public class ApprovalHdrForGenerateDistributionSoGetResponse extends MessagePack {

	private static final long serialVersionUID = -3621634900229807547L;

	private Long settlementType;

	private Long storeType;
	
	private Date deliveryDate;

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	private List<ApprovalStorageForGenerateDistributionSo> approvalStorageList;

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public Long getStoreType() {
		return storeType;
	}

	public void setStoreType(Long storeType) {
		this.storeType = storeType;
	}

	public List<ApprovalStorageForGenerateDistributionSo> getApprovalStorageList() {
		return approvalStorageList;
	}

	public void setApprovalStorageList(List<ApprovalStorageForGenerateDistributionSo> approvalStorageList) {
		this.approvalStorageList = approvalStorageList;
	}

}
