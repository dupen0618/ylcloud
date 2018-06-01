package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

public class LossNumIdByGetLossDtlRequest extends AbstractRequest {

	private static final long serialVersionUID = -2565804606566389460L;
	/**
	 * 门店编号
	 */
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	/**
	 * 损溢单号
	 */
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
