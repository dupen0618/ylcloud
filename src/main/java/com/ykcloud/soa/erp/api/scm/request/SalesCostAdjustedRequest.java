package com.ykcloud.soa.erp.api.scm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class SalesCostAdjustedRequest extends AbstractUserSessionRequest{

	
	private static final long serialVersionUID = 8785519726060670704L;
	
	@NotNull(message="价格调整单号不能为空!")
	private String reservedNo;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
	

}
