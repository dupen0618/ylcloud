package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.SoHdr;

public class SoHdrGetResponse extends MessagePack {
	
	private static final long serialVersionUID = 1L;
	private SoHdr soHdr;

	public SoHdr getSoHdr() {
		return soHdr;
	}

	public void setSoHdr(SoHdr soHdr) {
		this.soHdr = soHdr;
	}
	
	
	
}
