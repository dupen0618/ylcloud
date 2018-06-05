package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ContainerDtlOutInfo;

public class ContainerDtlGetByContainerSerlnoResponse extends MessagePack {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7459491019019636614L;
	
	List<ContainerDtlOutInfo> containerDtlList;

	public List<ContainerDtlOutInfo> getContainerDtlList() {
		return containerDtlList;
	}

	public void setContainerDtlList(List<ContainerDtlOutInfo> containerDtlList) {
		this.containerDtlList = containerDtlList;
	}
	
	

}
