package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class WmSoHdrGetResponse extends MessagePack {

	private Long soNumId;
	
	private Long wlbcNumId;
	
	private Long custSubUnitNumId;

	public Long getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(Long soNumId) {
		this.soNumId = soNumId;
	}

	public Long getWlbcNumId() {
		return wlbcNumId;
	}

	public void setWlbcNumId(Long wlbcNumId) {
		this.wlbcNumId = wlbcNumId;
	}

	public Long getCustSubUnitNumId() {
		return custSubUnitNumId;
	}

	public void setCustSubUnitNumId(Long custSubUnitNumId) {
		this.custSubUnitNumId = custSubUnitNumId;
	}
	
	
	
	
}
