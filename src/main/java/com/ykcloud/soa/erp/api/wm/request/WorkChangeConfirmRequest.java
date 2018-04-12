package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WorkChangeConfirmRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "加工单号不能为空")
	private String work_num_id;

	public String getWork_num_id() {
		return work_num_id;
	}

	public void setWork_num_id(String work_num_id) {
		this.work_num_id = work_num_id;
	}
	
}
