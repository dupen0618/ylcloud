package com.ykcloud.soa.erp.api.scm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class ProtocolAuditRequest extends AbstractUserSessionRequest {
	
private static final long serialVersionUID = 1L;
	
	private String reservedNo;  //采购协议单号

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

}
