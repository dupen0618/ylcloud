package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

import com.ykcloud.soa.erp.api.fi.model.VirtualWmBlBatchDtl;

public class WmShipSellDailyBatchDtlForFinance implements Serializable{

	private static final long serialVersionUID = 5243172342948378168L;
	
	private Double sellQty;
	
	private Double tradePrice;
	
	private Double taxRate;
	
	private Long settlementType;
	
	private Long itemNumId;
	
	private String batchSeries;//物理库存批次序号
	
	private Long hasProcessVirtualBatch;//虚拟批次标识
	
	private VirtualWmBlBatchDtl virtualWmBlBatchDtl;
	
	

	public VirtualWmBlBatchDtl getVirtualWmBlBatchDtl() {
		return virtualWmBlBatchDtl;
	}

	public void setVirtualWmBlBatchDtl(VirtualWmBlBatchDtl virtualWmBlBatchDtl) {
		this.virtualWmBlBatchDtl = virtualWmBlBatchDtl;
	}

	public Double getSellQty() {
		return sellQty;
	}

	public void setSellQty(Double sellQty) {
		this.sellQty = sellQty;
	}

	public Double getTradePrice() {
		return tradePrice;
	}

	public void setTradePrice(Double tradePrice) {
		this.tradePrice = tradePrice;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public String getBatchSeries() {
		return batchSeries;
	}

	public void setBatchSeries(String batchSeries) {
		this.batchSeries = batchSeries;
	}

	public Long getHasProcessVirtualBatch() {
		return hasProcessVirtualBatch;
	}

	public void setHasProcessVirtualBatch(Long hasProcessVirtualBatch) {
		this.hasProcessVirtualBatch = hasProcessVirtualBatch;
	}

	
	
	
	
}
