package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class BalanceAuditForStockadJustDtlStatusSelectRequest extends AbstractRequest {

	private static final long serialVersionUID = 5422946265141485502L;

	 private String reservedNo;

	 public String getReservedNo() {
		return reservedNo;
	 }

	 public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	 }
}
