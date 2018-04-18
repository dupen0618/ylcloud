package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

//产生分拨单取验收单明细
public class ReceiptDtlForGenerateDirectWayDistributionSo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Double confirmQty;

	private String promotionGrade;

	private Long itemNumId;

	private Long productOriginNumId;

	private Double qty;

	private String receiptLine;

	private Double pmtQty;

	private String receiptPmtLine;

	private Long pmtMaterial;

	private Double price;

	private Double totalAmount;

	private Double taxRate;

	private Double taxAmount;

	private Long settlementType;
	
	private Long logisticsType;

	private String supProduceDate;

	public Double getConfirmQty() {
		return confirmQty;
	}

	public void setConfirmQty(Double confirmQty) {
		this.confirmQty = confirmQty;
	}

	public String getPromotionGrade() {
		return promotionGrade;
	}

	public void setPromotionGrade(String promotionGrade) {
		this.promotionGrade = promotionGrade;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getProductOriginNumId() {
		return productOriginNumId;
	}

	public void setProductOriginNumId(Long productOriginNumId) {
		this.productOriginNumId = productOriginNumId;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public String getReceiptLine() {
		return receiptLine;
	}

	public void setReceiptLine(String receiptLine) {
		this.receiptLine = receiptLine;
	}

	public Double getPmtQty() {
		return pmtQty;
	}

	public void setPmtQty(Double pmtQty) {
		this.pmtQty = pmtQty;
	}

	public String getReceiptPmtLine() {
		return receiptPmtLine;
	}

	public void setReceiptPmtLine(String receiptPmtLine) {
		this.receiptPmtLine = receiptPmtLine;
	}

	public Long getPmtMaterial() {
		return pmtMaterial;
	}

	public void setPmtMaterial(Long pmtMaterial) {
		this.pmtMaterial = pmtMaterial;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
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

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public Long getLogisticsType() {
		return logisticsType;
	}

	public void setLogisticsType(Long logisticsType) {
		this.logisticsType = logisticsType;
	}

	public String getSupProduceDate() {
		return supProduceDate;
	}

	public void setSupProduceDate(String supProduceDate) {
		this.supProduceDate = supProduceDate;
	}

	
}
