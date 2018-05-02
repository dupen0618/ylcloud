package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class WmSoListBingWlbcRequest extends AbstractUserSessionRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5513836710553084166L;
	
	private Long subUnitNumId;
	
	private String[] soNumIds;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String[] getSoNumIds() {
		return soNumIds;
	}

	public void setSoNumIds(String[] soNumIds) {
		this.soNumIds = soNumIds;
	}
	
	

}
