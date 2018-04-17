package com.ykcloud.soa.erp.api.wm.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class ReceiptStatusUpdateRequest extends AbstractUserSessionRequest  {

	private static final long serialVersionUID = -5195355820358295113L;
	
	@NotNull(message = "行号不能为空！")
	private List<String> series;	

	public List<String> getSeries() {
		return series;
	}

	public void setSeries(List<String> series) {
		this.series = series;
	}
}
