package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class BalanceAuditForSellDailyDtlStatusSelectRequest extends AbstractRequest {

	private static final long serialVersionUID = -4821784307322995739L;

	private String reservedNo;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
}
