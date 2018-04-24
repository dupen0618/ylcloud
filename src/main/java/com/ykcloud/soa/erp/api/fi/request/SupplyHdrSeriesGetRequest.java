package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SupplyHdrSeriesGetRequest extends AbstractRequest{

	private static final long serialVersionUID = 3110512252512818590L;

	private String reservedNo;
	 
	public String getReservedNo() {
		return reservedNo;
	}
	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
}
