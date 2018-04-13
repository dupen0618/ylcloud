package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WmShipGetRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -798434039581851255L;

	@NotNull(message="门店Id不能为空！")
	private String subUnitNumId;
	
	@NotNull(message="托盘标识符不能为空！")
	private String containerLabserlno;

	public String getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(String subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getContainerLabserlno() {
		return containerLabserlno;
	}

	public void setContainerLabserlno(String containerLabserlno) {
		this.containerLabserlno = containerLabserlno;
	}
	
	
}
