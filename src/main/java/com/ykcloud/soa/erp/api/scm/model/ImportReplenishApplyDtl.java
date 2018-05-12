package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

public class ImportReplenishApplyDtl implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long itemNumId;  //商品编号
	
	private String itemid;   //商家编号
	
	private String barcode;  //条形码
	
	private Double qty;    //数量
	
	private Double packageQty; //件数

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
	
	

}
