package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class PhysicalQtyByItemNumIdResponse extends MessagePack{

	
	private static final long serialVersionUID = 1745330473398898396L;
	private Double physicQty;
	private Double onloadQty;
	public Double getPhysicQty() {
		return physicQty;
	}
	public void setPhysicQty(Double physicQty) {
		this.physicQty = physicQty;
	}
	public Double getOnloadQty() {
		return onloadQty;
	}
	public void setOnloadQty(Double onloadQty) {
		this.onloadQty = onloadQty;
	}
	
	

}
