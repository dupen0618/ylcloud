package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

public class ApprovalDtlForGenerateDistributionSo implements Serializable {

	private static final long serialVersionUID = 277797115130619689L;
	
	private Double confirmPmtQty;
	private String series;
	private Long ordSubUnitNumId;
	private Long itemNumId;
	private Long divNumId;
	private String barcode;
	private String itemName;
	private Long productOriginNumId;
	private Double conversionQty;
	private Long conversionUnitNumId;
	private String conversionStyleDesc;
	private Double qty;
	
	private String applyNumId;
	
	private String applyLine;
	
	private String itemid;
	
	private String supProduceDate;
	
	public Double getConfirmPmtQty() {
		return confirmPmtQty;
	}

	public void setConfirmPmtQty(Double confirmPmtQty) {
		this.confirmPmtQty = confirmPmtQty;
	}

	public String getSupProduceDate() {
		return supProduceDate;
	}

	public void setSupProduceDate(String supProduceDate) {
		this.supProduceDate = supProduceDate;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public String getApplyLine() {
		return applyLine;
	}

	public void setApplyLine(String applyLine) {
		this.applyLine = applyLine;
	}

	public String getApplyNumId() {
		return applyNumId;
	}

	public void setApplyNumId(String applyNumId) {
		this.applyNumId = applyNumId;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Long getOrdSubUnitNumId() {
		return ordSubUnitNumId;
	}

	public void setOrdSubUnitNumId(Long ordSubUnitNumId) {
		this.ordSubUnitNumId = ordSubUnitNumId;
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

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

}
