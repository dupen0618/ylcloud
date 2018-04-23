package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class BalanceAuditForLossDtlStatusSelectRequest extends AbstractRequest {

	private static final long serialVersionUID = 8012940269752762067L;

	 private String reservedNo;

	 public String getReservedNo() {
		return reservedNo;
	 }

	 public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	 }
}
