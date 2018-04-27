package com.ykcloud.soa.erp.api.so.request;

import java.util.List;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
//修改销售日报表体的状态入参类
public class StatusNumIdForSoTmlItemSellDailyUpdateRequest extends AbstractUserSessionRequest {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<String> series;
	
	private Long statusNumId;  //状态编号

	public Long getStatusNumId() {
		return statusNumId;
	}

	public void setStatusNumId(Long statusNumId) {
		this.statusNumId = statusNumId;
	}

	public List<String> getSeries() {
		return series;
	}

	public void setSeries(List<String> series) {
		this.series = series;
	}
	
	
	

}
