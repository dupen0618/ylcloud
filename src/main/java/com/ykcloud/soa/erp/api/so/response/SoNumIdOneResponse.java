package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class SoNumIdOneResponse extends MessagePack {
	
	private Long soNumId;
	
	private Long custUnitNumId;

	public Long getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(Long soNumId) {
		this.soNumId = soNumId;
	}

	public Long getCustUnitNumId() {
		return custUnitNumId;
	}

	public void setCustUnitNumId(Long custUnitNumId) {
		this.custUnitNumId = custUnitNumId;
	}


}
