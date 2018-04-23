package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class BalanceAuditForReceiptDtlStatusSelectRequest extends AbstractRequest {

	private static final long serialVersionUID = 3912737885450571653L;

	 private String reservedNo;

	 public String getReservedNo() {
		return reservedNo;
	 }

	 public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	 }
		 
}
