package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class SoHdrGetBySoNumIdResponse extends MessagePack {

	private static final long serialVersionUID = 1L;

	private String wlbcNumId;

	public String getWlbcNumId() {
		return wlbcNumId;
	}

	public void setWlbcNumId(String wlbcNumId) {
		this.wlbcNumId = wlbcNumId;
	}

}
