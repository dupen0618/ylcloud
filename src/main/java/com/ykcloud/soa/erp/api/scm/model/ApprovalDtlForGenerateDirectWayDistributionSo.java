package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

public class ApprovalDtlForGenerateDirectWayDistributionSo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 行号
	 */
	private String series;
	
    private Long ordSubUnitNumId; //订货门店
    
    private Long itemNumId;
    
    private String itemid;
    
    private Long divNumId;
    
    private String itemName;
    
    private String barcode;
    
    private Long productOriginNumId;
    
    private Double conversionQty;
    
    private Long conversionUnitNumId;
    
    private String conversionStyleDesc;
    
    private Long pmtMaterial;
        
    private Double qty;
    
    private Double pmtQty;
    
	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
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

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
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

	public Long getOrdSubUnitNumId() {
		return ordSubUnitNumId;
	}

	public void setOrdSubUnitNumId(Long ordSubUnitNumId) {
		this.ordSubUnitNumId = ordSubUnitNumId;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getPmtQty() {
		return pmtQty;
	}

	public void setPmtQty(Double pmtQty) {
		this.pmtQty = pmtQty;
	}

	public Long getPmtMaterial() {
		return pmtMaterial;
	}

	public void setPmtMaterial(Long pmtMaterial) {
		this.pmtMaterial = pmtMaterial;
	}
  
    
}
