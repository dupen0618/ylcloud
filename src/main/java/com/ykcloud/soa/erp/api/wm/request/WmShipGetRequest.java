package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class WmShipGetRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -798434039581851255L;

	@NotNull(message="门店Id不能为空！")
	private Long subUnitNumId;
	
	private String containerLabserlno;


	private String containerSerlno;
	
	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getContainerLabserlno() {
		return containerLabserlno;
	}

	public void setContainerLabserlno(String containerLabserlno) {
		this.containerLabserlno = containerLabserlno;
	}

	public String getContainerSerlno() {
		return containerSerlno;
	}

	public void setContainerSerlno(String containerSerlno) {
		this.containerSerlno = containerSerlno;
	}
	
	
	
}
