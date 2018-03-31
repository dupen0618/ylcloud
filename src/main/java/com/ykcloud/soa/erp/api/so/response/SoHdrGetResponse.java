package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class SoHdrGetResponse extends MessagePack {

	private Long soNumId;
	
	private Long wlbcNumId;
	
	private Long storageNumId;
	
	private Long physicalNumId;
	
	private Long recStorageNumId;
	
	private Long recPhysicalNumId;

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

	public Long getStorageNumId() {
		return storageNumId;
	}

	public void setStorageNumId(Long storageNumId) {
		this.storageNumId = storageNumId;
	}

	public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}

	public Long getRecStorageNumId() {
		return recStorageNumId;
	}

	public void setRecStorageNumId(Long recStorageNumId) {
		this.recStorageNumId = recStorageNumId;
	}

	public Long getRecPhysicalNumId() {
		return recPhysicalNumId;
	}

	public void setRecPhysicalNumId(Long recPhysicalNumId) {
		this.recPhysicalNumId = recPhysicalNumId;
	}
	
	

}
