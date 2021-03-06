package com.ykcloud.soa.erp.api.wm.response;

import java.util.Date;
import java.util.List;
import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ReceiptDtlForGenerateDirectWayDistributionSo;

public class ReceiptForGenerateDirectWayDistributionSoGetResponse extends MessagePack {

	private static final long serialVersionUID = -3621634900229807547L;

	// 采购单编号
	private String poNumId;

	// 供应商编号
	private Long supplyUnitNumId;

	// 收货逻辑仓
	private Long storageNumId;

	// 收货物理仓
	private Long physicalNumId;

	private Long settlementType;
	
	private Long storeType;
	
	/**
	 * 供应商确认日期
	 */
	private Date supConfirmDate;

	public Date getSupConfirmDate() {
		return supConfirmDate;
	}

	public void setSupConfirmDate(Date supConfirmDate) {
		this.supConfirmDate = supConfirmDate;
	}

	// 验收明细
	private List<ReceiptDtlForGenerateDirectWayDistributionSo> receiptDtls;

	public String getPoNumId() {
		return poNumId;
	}

	public void setPoNumId(String poNumId) {
		this.poNumId = poNumId;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public Long getStorageNumId() {
		return storageNumId;
	}

	public void setStorageNumId(Long storageNumId) {
		this.storageNumId = storageNumId;
	}

	public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}

	public List<ReceiptDtlForGenerateDirectWayDistributionSo> getReceiptDtls() {
		return receiptDtls;
	}

	public void setReceiptDtls(List<ReceiptDtlForGenerateDirectWayDistributionSo> receiptDtls) {
		this.receiptDtls = receiptDtls;
	}

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

	

}
