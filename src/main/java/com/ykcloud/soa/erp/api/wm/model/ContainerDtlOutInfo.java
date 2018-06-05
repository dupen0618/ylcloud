package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.util.Date;

public class ContainerDtlOutInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8870186711319590422L;
	
private String series;
	
	private String containerSerlno;
	
	private String soNumId;

	private String soLineId;
	
	private String tmlNumId;
	
	private String tmlLine;
	
	private Long tenantNumId;
	
	private Long subUnitNumId;
	
	private Long physicalNumId;
	
	private Long classifyNumId;
	
	private Date containerDate;
	
	private String promotionGrade;
	
	private Long itemNumId;
	
	private Long divNumId;
	
	private String itemid;
	
	private String itemName;
	
	private String barCode;
	
	private Long productOriginNumId;
	
	private Double conversionQty;
	
	private Long conversionUnitNumId;
	
	private String conversionStyleDesc;
	
	private Long pmtMaterial;
	
	private Double packageQty;
	
	private Double qty;
	
	private Long locNumId;
	
	private Long pmtSign;
	
	private Double tradePrice;
	
	private Double totalAmount;
	
	private Double taxRate;
	
	private Long settlementType;
	
	private Long logisticsType;
	
	private Long createUserId;
	
	private Long lastUpdateUserId;
	
	private Date createDtme;
	
	private Date lastUpdtme;
	
	private Long carrySign;
	
	private Long dataSign;
	
	private Double taxAmount;

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getContainerSerlno() {
		return containerSerlno;
	}

	public void setContainerSerlno(String containerSerlno) {
		this.containerSerlno = containerSerlno;
	}

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

	public String getSoLineId() {
		return soLineId;
	}

	public void setSoLineId(String soLineId) {
		this.soLineId = soLineId;
	}

	public String getTmlNumId() {
		return tmlNumId;
	}

	public void setTmlNumId(String tmlNumId) {
		this.tmlNumId = tmlNumId;
	}

	public String getTmlLine() {
		return tmlLine;
	}

	public void setTmlLine(String tmlLine) {
		this.tmlLine = tmlLine;
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

	public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}

	public Long getClassifyNumId() {
		return classifyNumId;
	}

	public void setClassifyNumId(Long classifyNumId) {
		this.classifyNumId = classifyNumId;
	}

	public Date getContainerDate() {
		return containerDate;
	}

	public void setContainerDate(Date containerDate) {
		this.containerDate = containerDate;
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

	public Long getDivNumId() {
		return divNumId;
	}

	public void setDivNumId(Long divNumId) {
		this.divNumId = divNumId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
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

	public Long getConversionUnitNumId() {
		return conversionUnitNumId;
	}

	public void setConversionUnitNumId(Long conversionUnitNumId) {
		this.conversionUnitNumId = conversionUnitNumId;
	}

	public String getConversionStyleDesc() {
		return conversionStyleDesc;
	}

	public void setConversionStyleDesc(String conversionStyleDesc) {
		this.conversionStyleDesc = conversionStyleDesc;
	}

	public Long getPmtMaterial() {
		return pmtMaterial;
	}

	public void setPmtMaterial(Long pmtMaterial) {
		this.pmtMaterial = pmtMaterial;
	}


	public Double getPackageQty() {
		return packageQty;
	}

	public void setPackageQty(Double packageQty) {
		this.packageQty = packageQty;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Long getLocNumId() {
		return locNumId;
	}

	public void setLocNumId(Long locNumId) {
		this.locNumId = locNumId;
	}

	public Long getPmtSign() {
		return pmtSign;
	}

	public void setPmtSign(Long pmtSign) {
		this.pmtSign = pmtSign;
	}

	public Double getTradePrice() {
		return tradePrice;
	}

	public void setTradePrice(Double tradePrice) {
		this.tradePrice = tradePrice;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
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

	public Date getLastUpdtme() {
		return lastUpdtme;
	}

	public void setLastUpdtme(Date lastUpdtme) {
		this.lastUpdtme = lastUpdtme;
	}

	public Long getCarrySign() {
		return carrySign;
	}

	public void setCarrySign(Long carrySign) {
		this.carrySign = carrySign;
	}

	public Long getDataSign() {
		return dataSign;
	}

	public void setDataSign(Long dataSign) {
		this.dataSign = dataSign;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

}
