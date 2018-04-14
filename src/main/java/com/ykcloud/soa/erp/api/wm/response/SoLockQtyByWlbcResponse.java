package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class SoLockQtyByWlbcResponse extends MessagePack {
	
	private static final long serialVersionUID = 1L;
	private Double lackQty;

	public Double getLackQty() {
		return lackQty;
	}

	public void setLackQty(Double lackQty) {
		this.lackQty = lackQty;
	}

	
	
	

}
