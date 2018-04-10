package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class SoLockQtyByWlbcResponse extends MessagePack {
	
	private Double lockQty;

	public Double getLockQty() {
		return lockQty;
	}

	public void setLockQty(Double lockQty) {
		this.lockQty = lockQty;
	}
	
	

}
