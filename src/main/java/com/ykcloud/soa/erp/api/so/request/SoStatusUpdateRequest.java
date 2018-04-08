package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoStatusUpdateRequest extends AbstractRequest {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4263080691699508181L;

	private Long wlbc;
	
	private Long subUnitNumId;
	
	private Long statusNumId;

	public Long getWlbc() {
		return wlbc;
	}

	public void setWlbc(Long wlbc) {
		this.wlbc = wlbc;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getStatusNumId() {
		return statusNumId;
	}

	public void setStatusNumId(Long statusNumId) {
		this.statusNumId = statusNumId;
	}
	
	

}
