package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WmFinishSoPackingRequest extends AbstractRequest {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4419449230653442470L;

	private Long wlbc;
	
	private Long subUnitNumId;

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
	
}
