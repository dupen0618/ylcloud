package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class OutWorkDealingsRequest extends AbstractUserSessionRequest{

	private static final long serialVersionUID = 3110512252512818590L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@NotNull(message = "损溢单号不能为空！")
	private String lossNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getLossNumId() {
		return lossNumId;
	}

	public void setLossNumId(String lossNumId) {
		this.lossNumId = lossNumId;
	}

}
