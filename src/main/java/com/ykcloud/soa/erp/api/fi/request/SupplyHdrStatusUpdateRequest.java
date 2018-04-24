package com.ykcloud.soa.erp.api.fi.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractSessionRequest;

public class SupplyHdrStatusUpdateRequest extends AbstractSessionRequest{

	private static final long serialVersionUID = -5678449055890967832L;

	@NotNull(message = "行号不能为空！")
	private List<String> series;	
	
	private Long flagStatus;

	public List<String> getSeries() {
		return series;
	}

	public void setSeries(List<String> series) {
		this.series = series;
	}

	public Long getFlagStatus() {
		return flagStatus;
	}

	public void setFlagStatus(Long flagStatus) {
		this.flagStatus = flagStatus;
	}
}
