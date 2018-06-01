package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class WmSoHdrGetRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 8147686661977300539L;
	
	@NotNull(message="订单号不能为空！")
	private String soNumId;
	
	@NotNull(message="门店Id不能为空！")
	private Long subUnitNumId;
	
	@NotNull(message = "物理仓ID不能为空! ")
	private Long physicalNumId;
	

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

	public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}

	

}
