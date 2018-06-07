package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

public class WmBlStockadjustDtl implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long subUnitNumId;// 门店

	private Long itemNumId;// 商品

	private String barcode;// 商品条码

	private String itemName;// 商品品名

	private Double costAmount;// 成本金额

	private Double taxRate;// 税率

	private Double taxAmount;// 税额

	private Long supplyUnitNumId;// 供应商ID

	private Long settlementType;// 结算方式

	private Long ptyNum3;// 小类

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getCostAmount() {
		return costAmount;
	}

	public void setCostAmount(Double costAmount) {
		this.costAmount = costAmount;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public Long getPtyNum3() {
		return ptyNum3;
	}

	public void setPtyNum3(Long ptyNum3) {
		this.ptyNum3 = ptyNum3;
	}

}
