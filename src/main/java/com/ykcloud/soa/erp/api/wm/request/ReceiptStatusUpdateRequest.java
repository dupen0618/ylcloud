package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class ReceiptStatusUpdateRequest extends AbstractRequest  {

	private static final long serialVersionUID = -5195355820358295113L;
	
	@NotNull(message = "行号不能为空！")
	private List<String> series;
	
	@NotNull(message = "修改人不能为空！")
	private Long userNumId;
	

	public List<String> getSeries() {
		return series;
	}

	public void setSeries(List<String> series) {
		this.series = series;
	}

	public Long getUserNumId() {
		return userNumId;
	}

	public void setUserNumId(Long userNumId) {
		this.userNumId = userNumId;
	}


}
