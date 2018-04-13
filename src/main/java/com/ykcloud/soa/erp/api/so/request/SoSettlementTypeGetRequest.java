package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoSettlementTypeGetRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8530326413873929338L;
	
	private String subUnitNumId;
	
	private String soNumId;

	public String getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(String subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}
	
	
}
