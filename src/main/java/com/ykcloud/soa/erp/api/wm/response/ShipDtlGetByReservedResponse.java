package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class ShipDtlGetByReservedResponse extends MessagePack {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1109659455169878610L;

	private List<String> containerLabserlnoList;

	public List<String> getContainerLabserlnoList() {
		return containerLabserlnoList;
	}

	public void setContainerLabserlnoList(List<String> containerLabserlnoList) {
		this.containerLabserlnoList = containerLabserlnoList;
	}
	
	
	
	
}
