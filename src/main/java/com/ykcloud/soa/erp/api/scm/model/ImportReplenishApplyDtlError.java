package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

public class ImportReplenishApplyDtlError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long itemNumId;  //商品编号
	
	private String itemid;  //商家编号
	
	private String barcode;  //条形码
	
	private String error;  //错误信息

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
