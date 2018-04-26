package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class ShipHdrSeriesGetRequest extends AbstractRequest{

	private static final long serialVersionUID = -8049167170654655465L;
	private String reservedNo;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
}
