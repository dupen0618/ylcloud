package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;

public class ImportReturnApplyDtl implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long itemNumId;
	
	private String itemid;  
	
	private String barcode;
	
	private Double qty;
	
	private Double packageQty;
	

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getPackageQty() {
		return packageQty;
	}

	public void setPackageQty(Double packageQty) {
		this.packageQty = packageQty;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	

}
