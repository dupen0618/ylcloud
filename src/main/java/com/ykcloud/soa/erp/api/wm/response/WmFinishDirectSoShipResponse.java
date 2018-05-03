package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class WmFinishDirectSoShipResponse extends MessagePack {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9015934589204074815L;
	
	//出库验收单
	private String reservedNo;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
	
	

}
