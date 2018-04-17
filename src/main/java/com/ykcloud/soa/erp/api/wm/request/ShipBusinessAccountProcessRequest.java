package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractSessionRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class ShipBusinessAccountProcessRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 2927747602530460502L;

	@NotNull(message = "门店编号不能为空!")
	private Long subUnitNumId;

	@NotNull(message = "出库单号不能为空!")
	private String reservedNo;

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

}
