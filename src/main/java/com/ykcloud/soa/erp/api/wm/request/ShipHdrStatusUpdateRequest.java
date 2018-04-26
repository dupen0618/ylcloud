package com.ykcloud.soa.erp.api.wm.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractSessionRequest;

public class ShipHdrStatusUpdateRequest extends AbstractSessionRequest{

	private static final long serialVersionUID = 6861810704886254241L;

	@NotNull(message = "行号不能为空！")
	private List<String> series;
	
	@NotNull(message = "状态不能为空！")
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
