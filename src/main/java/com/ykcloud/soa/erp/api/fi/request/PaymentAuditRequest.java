package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class PaymentAuditRequest extends AbstractRequest {

	private static final long serialVersionUID = -7738726438426208797L;


	@NotNull(message = "结算单号不能为空！")
	private Long balanceNo;
	
	@NotNull(message = "操作人ID不能为空！")
	private Long createUserId;

	public Long getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(Long balanceNo) {
		this.balanceNo = balanceNo;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	
	

}
