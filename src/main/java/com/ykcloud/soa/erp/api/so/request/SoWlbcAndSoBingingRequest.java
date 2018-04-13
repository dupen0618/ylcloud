package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoWlbcAndSoBingingRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8781020251949209140L;
	
	private String wlbc;
	
	private String soNumId;
	
	private String subUnitNumId;

	public String getWlbc() {
		return wlbc;
	}

	public void setWlbc(String wlbc) {
		this.wlbc = wlbc;
	}

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

	public String getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(String subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	

}
