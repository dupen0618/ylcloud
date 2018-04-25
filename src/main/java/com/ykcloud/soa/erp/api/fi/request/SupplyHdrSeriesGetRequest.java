package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SupplyHdrSeriesGetRequest extends AbstractRequest{

	private static final long serialVersionUID = 3110512252512818590L;

	private String balanceNo;

	public String getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(String balanceNo) {
		this.balanceNo = balanceNo;
	}
	 
	
}
