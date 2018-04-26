package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class ShipDtlStatusSelectRequest extends AbstractRequest{

	private static final long serialVersionUID = 198981265500418827L;
	private String reservedNo;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
}
