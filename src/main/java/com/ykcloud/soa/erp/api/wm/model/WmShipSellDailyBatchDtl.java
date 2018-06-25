package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

public class WmShipSellDailyBatchDtl implements Serializable{

	private static final long serialVersionUID = -8590650336485965470L;
	
	private Long itemNumId;
	
	private Long firstSupplyUnitNumId;
	
	private Double price;//含税成本价格
	
	private Double qty;
	
	private Long settlementType;
	
	private Double costAmount;
	
	private Double taxAmount;
	
	private Double taxRate;

	private String reservedNo;
	
	private Long batchSupplyUnitNumId;
	
	

	public Long getBatchSupplyUnitNumId() {
		return batchSupplyUnitNumId;
	}

	public void setBatchSupplyUnitNumId(Long batchSupplyUnitNumId) {
		this.batchSupplyUnitNumId = batchSupplyUnitNumId;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Double getCostAmount() {
		return costAmount;
	}

	public void setCostAmount(Double costAmount) {
		this.costAmount = costAmount;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
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

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getFirstSupplyUnitNumId() {
		return firstSupplyUnitNumId;
	}

	public void setFirstSupplyUnitNumId(Long firstSupplyUnitNumId) {
		this.firstSupplyUnitNumId = firstSupplyUnitNumId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	

}
