package com.ykcloud.soa.erp.api.wm.response;

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

}
