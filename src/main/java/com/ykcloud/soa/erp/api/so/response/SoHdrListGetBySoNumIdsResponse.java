package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.SoHdr;

public class SoHdrListGetBySoNumIdsResponse extends MessagePack {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4487990583257334105L;
	
	private List<SoHdr> soHdrList;

	public List<SoHdr> getSoHdrList() {
		return soHdrList;
	}

	public void setSoHdrList(List<SoHdr> soHdrList) {
		this.soHdrList = soHdrList;
	}
	
	

}
