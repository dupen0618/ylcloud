package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.util.Date;

public class ReceiptForFi implements Serializable {
	private static final long serialVersionUID = 1L;

	private String series;// 行号

	private String reservedNo;// 验收单号单号

	private Long tenantNumId;// 租户

	private Long subUnitNumId;// 门店

	private Long statusNumId;// 状态

	private Long typeNumId;// 业务类型

	private Long itemNumId;// 商品

	private Long divNumId;// 商品中心

	private String barcode;// 商品条码

	private String itemName;// 商品品名

	private Long productOriginNumId;// 产地

	private Double conversionQty;// 件装单位

	private String conversionStyleDesc;// 件装规格

	private Double price;// 结算价格

	private Double totalAmount;// 金额

	private String batchSeries;// 批次行号

	private String batchPromotionGrade;// 批次促销档期

	private Long batchSupplyUnitNumId;// 批次供应商

	private Double batchPoPrice;// 批次采购价格

	private Double taxRate;// 税率

	private Double taxAmount;// 税金

	private Long settlementType;// 结算方式

	private Long createUserId;// 创建人

	private Long lastUpdateUserId;// 更新人

	private Date createDtme;// 创建时间

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getTenantNumId() {
		return tenantNumId;
	}

	public void setTenantNumId(Long tenantNumId) {
		this.tenantNumId = tenantNumId;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getStatusNumId() {
		return statusNumId;
	}

	public void setStatusNumId(Long statusNumId) {
		this.statusNumId = statusNumId;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}
	
	public Long getDivNumId() {
		return divNumId;
	}

	public void setDivNumId(Long divNumId) {
		this.divNumId = divNumId;
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

	public Long getProductOriginNumId() {
		return productOriginNumId;
	}

	public void setProductOriginNumId(Long productOriginNumId) {
		this.productOriginNumId = productOriginNumId;
	}

	public Double getConversionQty() {
		return conversionQty;
	}

	public void setConversionQty(Double conversionQty) {
		this.conversionQty = conversionQty;
	}

	public String getConversionStyleDesc() {
		return conversionStyleDesc;
	}

	public void setConversionStyleDesc(String conversionStyleDesc) {
		this.conversionStyleDesc = conversionStyleDesc;
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

	public String getBatchSeries() {
		return batchSeries;
	}

	public void setBatchSeries(String batchSeries) {
		this.batchSeries = batchSeries;
	}

	public String getBatchPromotionGrade() {
		return batchPromotionGrade;
	}

	public void setBatchPromotionGrade(String batchPromotionGrade) {
		this.batchPromotionGrade = batchPromotionGrade;
	}

	public Long getBatchSupplyUnitNumId() {
		return batchSupplyUnitNumId;
	}

	public void setBatchSupplyUnitNumId(Long batchSupplyUnitNumId) {
		this.batchSupplyUnitNumId = batchSupplyUnitNumId;
	}

	public Double getBatchPoPrice() {
		return batchPoPrice;
	}

	public void setBatchPoPrice(Double batchPoPrice) {
		this.batchPoPrice = batchPoPrice;
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

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public Long getLastUpdateUserId() {
		return lastUpdateUserId;
	}

	public void setLastUpdateUserId(Long lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
	}

	public Date getCreateDtme() {
		return createDtme;
	}

	public void setCreateDtme(Date createDtme) {
		this.createDtme = createDtme;
	}

	
}
