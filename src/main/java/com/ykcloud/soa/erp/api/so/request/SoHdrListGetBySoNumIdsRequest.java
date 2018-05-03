package com.ykcloud.soa.erp.api.so.request;

import java.util.List;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoHdrListGetBySoNumIdsRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4154602261371489716L;
	
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
