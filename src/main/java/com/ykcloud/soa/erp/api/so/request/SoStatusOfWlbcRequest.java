package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoStatusOfWlbcRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2998458547948205657L;
	
	private String subUnitNumId;
	
	private String wlbc;

	public String getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(String subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getWlbc() {
		return wlbc;
	}

	public void setWlbc(String wlbc) {
		this.wlbc = wlbc;
	}
	
	

}
