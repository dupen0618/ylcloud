package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class BatchBillAuditRequest extends AbstractUserSessionRequest  {
	private static final long serialVersionUID = 1180505494003852499L;
	@NotNull(message = "门店不能为空！")
	private Long subUnitNumId;
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "结算日期不能为空！")
	private Date balanceDate;
	@NotNull(message = "结算单号不能为空！")
	private String balanceNo;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(String balanceNo) {
		this.balanceNo = balanceNo;
	}
}
