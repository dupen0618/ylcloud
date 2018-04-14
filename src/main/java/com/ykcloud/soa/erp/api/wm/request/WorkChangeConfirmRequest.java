package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WorkChangeConfirmRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "加工单号不能为空")
	private String workNumId;

	public String getWorkNumId() {
		return workNumId;
	}

	public void setWorkNumId(String workNumId) {
		this.workNumId = workNumId;
	}


	
	
}
