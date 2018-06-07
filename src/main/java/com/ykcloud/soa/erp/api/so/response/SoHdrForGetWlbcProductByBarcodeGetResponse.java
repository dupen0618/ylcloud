package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.SoHdr;

public class SoHdrForGetWlbcProductByBarcodeGetResponse extends MessagePack {
	
	private static final long serialVersionUID = 1L;
	private SoHdr sohdr;



	public SoHdr getSohdr() {
		return sohdr;
	}

	public void setSohdr(SoHdr sohdr) {
		this.sohdr = sohdr;
	}
	
	

}
