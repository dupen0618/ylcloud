package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoWlbcAndSoBingingRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8781020251949209140L;
	
	private Long wlbcNumId;
	
	private Long soNumId;
	
	private Long subUnitNumId;

	public Long getWlbcNumId() {
		return wlbcNumId;
	}

	public void setWlbcNumId(Long wlbcNumId) {
		this.wlbcNumId = wlbcNumId;
	}

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
