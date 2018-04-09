package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class SoNumIdOneResponse extends MessagePack {
	
	private Long soNumId;
	
	private Long custUnitNumId;
	
	private Long sowNumId;

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

	public Long getSowNumId() {
		return sowNumId;
	}

	public void setSowNumId(Long sowNumId) {
		this.sowNumId = sowNumId;
	}
	

}
