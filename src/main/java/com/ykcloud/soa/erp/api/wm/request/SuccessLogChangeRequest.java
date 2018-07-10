package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class SuccessLogChangeRequest extends AbstractUserSessionRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 649169073678955712L;
	
	@NotNull(message = "状态编号不能为空!")
	private Long statusNumId;
	
	@NotNull(message = "日志表序号不能为空!")
	private String logSeries;

	public String getLogSeries() {
		return logSeries;
	}

	public void setLogSeries(String logSeries) {
		this.logSeries = logSeries;
	}

	public Long getStatusNumId() {
		return statusNumId;
	}

	public void setStatusNumId(Long statusNumId) {
		this.statusNumId = statusNumId;
	}

	
	
	
}
