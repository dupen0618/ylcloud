package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class FiBlSupBalanceDtlByBalanceNoRequest extends AbstractRequest{


	private static final long serialVersionUID = -8931594271378510652L;

	private Long balanceNo;

	public Long getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(Long balanceNo) {
		this.balanceNo = balanceNo;
	}
	
	
}
