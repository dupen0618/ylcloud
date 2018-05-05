package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

public class ApprovalDtlForWriteoffCiteQty implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long itemNumId;  //商品编号
	
	private Double qty; //数量
	
	private Double pmtQty; //赠品数量

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
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
	
	

}
