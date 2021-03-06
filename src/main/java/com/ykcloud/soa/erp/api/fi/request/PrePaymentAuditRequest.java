package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class PrePaymentAuditRequest extends AbstractUserSessionRequest  {
	private static final long serialVersionUID = 1180505494003852499L;
	@NotNull(message = "预付款单号不能为空！")
	private String advNo;
	@NotNull(message = "门店不能为空！")
	private Long subUnitNumId;
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "预付款日期不能为空！")
	private Date payDate;

	public String getAdvNo() {
		return advNo;
	}

	public void setAdvNo(String advNo) {
		this.advNo = advNo;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
}
