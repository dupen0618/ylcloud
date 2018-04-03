package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

public class GiftProduct implements Serializable {

	private static final long serialVersionUID = 1L;

	//赠品数量
	private Double giftQty;
		
	private Double qty;
		
	private Double packageQty;

	public Double getGiftQty() {
		return giftQty;
	}

	public void setGiftQty(Double giftQty) {
		this.giftQty = giftQty;
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
