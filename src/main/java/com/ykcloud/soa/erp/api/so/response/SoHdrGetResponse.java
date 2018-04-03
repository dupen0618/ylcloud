package com.ykcloud.soa.erp.api.so.response;

import java.util.Date;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.SoHdr;

public class SoHdrGetResponse extends MessagePack {
	

	private SoHdr soHdr;

	public SoHdr getSoHdr() {
		return soHdr;
	}

	public void setSoHdr(SoHdr soHdr) {
		this.soHdr = soHdr;
	}
	
	
	
}
