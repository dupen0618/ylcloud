package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoLockQtyByWlbcRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2868728211423967864L;
	
	private String wlbc;
	
	private String subUnitNumId;
	

	public String getWlbc() {
		return wlbc;
	}

	public void setWlbc(String wlbc) {
		this.wlbc = wlbc;
	}

	public String getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(String subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	

}
