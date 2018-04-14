package com.ykcloud.soa.erp.api.so.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoHdrGetBySoNumIdRequest extends AbstractRequest {

	private static final long serialVersionUID = 7607898859671363976L;

	@NotNull(message="订单ID不能为空！")
	private String soNumId;
	
	@NotNull(message="门店ID不能为空！")
	private Long subUnitNumId;

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}


	
	

}
