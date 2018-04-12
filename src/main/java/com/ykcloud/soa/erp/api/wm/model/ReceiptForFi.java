package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.util.Date;

public class ReceiptForFi implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long reservedNo;//验收单号单号
	
	private Long tenantNumId;//租户
	
	private Long subUnitNumId;//门店
	
	private int statusNumId;//状态
	
	private int typeNumId;//业务类型
	
	private Long itemNumId;//商品
	
	private String divNumId;//商品中心
	
	private String barcode;//商品条码
	
	private String itemName;//商品品名

	private String productOriginNumId;//产地
	
	private Long conversionQty;//件装单位

	private String conversionStyleDesc;//件装规格

	private Double price;//结算价格
	
	private Double totalAmount;//金额
	
	private String batchSeries;//批次行号

	private Long batchPromotionGrade;//批次促销档期

	private int batchSupplyUnitNumId;//批次供应商

	private Long batchPoPrice;//批次采购价格
	
	private Double taxRate;//税率
	
	private Long taxAmount;//税金
	
	private int settlementType;//结算方式
	
	private Long createUserId;//创建人
	
	private Long lastUpdateUserId;//更新人

	private Date createDtme;//创建时间

	public Long getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(Long reservedNo) {
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

	public int getStatusNumId() {
		return statusNumId;
	}

	public void setStatusNumId(int statusNumId) {
		this.statusNumId = statusNumId;
	}

	public int getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(int typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public String getDivNumId() {
		return divNumId;
	}

	public void setDivNumId(String divNumId) {
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

	public String getProductOriginNumId() {
		return productOriginNumId;
	}

	public void setProductOriginNumId(String productOriginNumId) {
		this.productOriginNumId = productOriginNumId;
	}

	public Long getConversionQty() {
		return conversionQty;
	}

	public void setConversionQty(Long conversionQty) {
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

	public Long getBatchPromotionGrade() {
		return batchPromotionGrade;
	}

	public void setBatchPromotionGrade(Long batchPromotionGrade) {
		this.batchPromotionGrade = batchPromotionGrade;
	}

	public int getBatchSupplyUnitNumId() {
		return batchSupplyUnitNumId;
	}

	public void setBatchSupplyUnitNumId(int batchSupplyUnitNumId) {
		this.batchSupplyUnitNumId = batchSupplyUnitNumId;
	}

	public Long getBatchPoPrice() {
		return batchPoPrice;
	}

	public void setBatchPoPrice(Long batchPoPrice) {
		this.batchPoPrice = batchPoPrice;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public Long getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Long taxAmount) {
		this.taxAmount = taxAmount;
	}

	public int getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(int settlementType) {
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
