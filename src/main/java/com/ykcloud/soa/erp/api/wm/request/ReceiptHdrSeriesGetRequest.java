package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class ReceiptHdrSeriesGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 2899139547819709755L;
	 private String reservedNo;
	public String getReservedNo() {
		return reservedNo;
	}
	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	
	
}
