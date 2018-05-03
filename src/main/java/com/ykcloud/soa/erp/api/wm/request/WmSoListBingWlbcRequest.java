package com.ykcloud.soa.erp.api.wm.request;

import java.util.List;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class WmSoListBingWlbcRequest extends AbstractUserSessionRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5513836710553084166L;
	
	private Long subUnitNumId;
	
	private List<String> soNumIds;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public List<String> getSoNumIds() {
		return soNumIds;
	}

	public void setSoNumIds(List<String> soNumIds) {
		this.soNumIds = soNumIds;
	}

	
	
	

}
