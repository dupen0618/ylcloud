package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WmQuerySoAndContainerRequest extends AbstractRequest {

	private static final long serialVersionUID = 4037272833488307601L;

	@NotNull(message = "托盘码不能为空")
	private String containerSerlno;

	@NotNull(message = "门店ID不能为空")
	private Long subUnitNumId;


	public String getContainerSerlno() {
		return containerSerlno;
	}

	public void setContainerSerlno(String containerSerlno) {
		this.containerSerlno = containerSerlno;
	}


	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
}
