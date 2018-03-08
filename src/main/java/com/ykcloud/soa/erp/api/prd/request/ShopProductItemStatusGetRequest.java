package com.ykcloud.soa.erp.api.prd.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class ShopProductItemStatusGetRequest extends AbstractRequest {
	private static final long serialVersionUID = 252066442002275661L;
	private int itemStatusId;
	private int itemStatusDesc;

	public int getItemStatusId() {
		return itemStatusId;
	}

	public void setItemStatusId(int itemStatusId) {
		this.itemStatusId = itemStatusId;
	}

	public int getItemStatusDesc() {
		return itemStatusDesc;
	}

	public void setItemStatusDesc(int itemStatusDesc) {
		this.itemStatusDesc = itemStatusDesc;
	}

}
