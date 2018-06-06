package com.ykcloud.soa.erp.api.fi.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class DealingsGenerateByAdjustRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 3110512252512818590L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@NotNull(message = "盘点单号不能为空！")
	private String reservedNo;

	@NotNull(message = "盘点日期不能为空！")
	private Date justDate;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Date getJustDate() {
		return justDate;
	}

	public void setJustDate(Date justDate) {
		this.justDate = justDate;
	}

}
