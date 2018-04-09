package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class CheckSoShipQtyAndPackingQtyRequest extends AbstractRequest {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7008234009750911781L;

	private Long subUnitNumId;
	
	private Long soNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(Long soNumId) {
		this.soNumId = soNumId;
	}


	

}
