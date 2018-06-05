package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class ShipDtlGetByReservedRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1170117869104248347L;
	
	private Long subUnitNumId;
	
	private String reservedNo;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
	
	

}
