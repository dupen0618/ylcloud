package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class TmlProductAmountAndPayAmountCompareRequestCompareResponse extends MessagePack {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> shortList;

	public List<String> getShortList() {
		return shortList;
	}

	public void setShortList(List<String> shortList) {
		this.shortList = shortList;
	}
	

}
