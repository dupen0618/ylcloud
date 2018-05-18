package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

public class PrePaymentAuditRequest extends AbstractUserSessionRequest  {
	private static final long serialVersionUID = 1180505494003852499L;
	@NotNull(message = "结算单号不能为空！")
	private String balanceNo;
	@NotNull(message = "门店不能为空！")
	private Long subUnitNumId;

	public String getBalanceNo() {
		return balanceNo;
	}
	public void setBalanceNo(String balanceNo) {
		this.balanceNo = balanceNo;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
}
