package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class PaymentAuditRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -7738726438426208797L;

	@NotNull(message = "结算单号不能为空！")
	private String balanceNo;

	public String getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(String balanceNo) {
		this.balanceNo = balanceNo;
	}

}
