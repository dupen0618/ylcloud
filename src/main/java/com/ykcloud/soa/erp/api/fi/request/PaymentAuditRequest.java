package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import java.util.Date;

public class PaymentAuditRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -7738726438426208797L;
	@NotNull(message = "门店不能为空！")
	private Long subUnitNumId;
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "付款日期不能为空！")
	private Date payDate;
	@NotNull(message = "付款单号不能为空！")
	private String reservedNo;
	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
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
