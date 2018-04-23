package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class BalanceAuditForWorkRawDtlStatusSelectRequest extends AbstractRequest {

	private static final long serialVersionUID = -335074873950238207L;
	
	 private String reservedNo;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
	 

}
