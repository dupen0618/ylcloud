package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoHdrListGetByWlbcRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9062738540471921141L;
	
	private Long subUnitNumId;
	
	private String wlbc;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getWlbc() {
		return wlbc;
	}

	public void setWlbc(String wlbc) {
		this.wlbc = wlbc;
	}
	
	

}
