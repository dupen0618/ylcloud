package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class WorkLossCreateResponse extends MessagePack {

	private static final long serialVersionUID = 1L;

	private String lossNumId;

	public String getLossNumId() {
		return lossNumId;
	}

	public void setLossNumId(String lossNumId) {
		this.lossNumId = lossNumId;
	}
}
