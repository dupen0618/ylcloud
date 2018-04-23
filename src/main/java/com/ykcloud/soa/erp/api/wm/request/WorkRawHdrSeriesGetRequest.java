package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WorkRawHdrSeriesGetRequest extends AbstractRequest{

	private static final long serialVersionUID = 5876643772286666634L;

	  private String reservedNo;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
	  
	  
}
