package com.ykcloud.soa.erp.api.so.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoHdrGetRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8147686661977300539L;
	
	@NotNull(message="订单号不能为空！")
	private Long soNumId;
	
	@NotNull(message="门店Id不能为空！")
	private Long subUnitNumId;

	public Long getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(Long soNumId) {
		this.soNumId = soNumId;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	
	

}
