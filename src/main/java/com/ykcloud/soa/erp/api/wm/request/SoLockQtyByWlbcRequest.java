package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoLockQtyByWlbcRequest extends AbstractRequest {

	private static final long serialVersionUID = 2868728211423967864L;
	
	private String wlbc;
	
	private Long subUnitNumId;
	

	public String getWlbc() {
		return wlbc;
	}

	public void setWlbc(String wlbc) {
		this.wlbc = wlbc;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}


	

	

}
