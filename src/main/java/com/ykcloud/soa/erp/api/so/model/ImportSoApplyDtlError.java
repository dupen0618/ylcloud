package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;

public class ImportSoApplyDtlError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long itemNumId;
	
	private String itemid;
	
	private String barcode;
	
	private String error;

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

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	

}
