package com.ykcloud.soa.erp.api.so.request;

import java.util.List;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
//更改销售日报表头状态
public class StatusNumIdForSellDailyHdrUpdateRequest extends AbstractUserSessionRequest {
	
	private List<String> reservedNos;  //日报单号集合
	
	private Long statusNumId;    //  状态编号

	public List<String> getReservedNos() {
		return reservedNos;
	}

	public void setReservedNos(List<String> reservedNos) {
		this.reservedNos = reservedNos;
	}

	public Long getStatusNumId() {
		return statusNumId;
	}

	public void setStatusNumId(Long statusNumId) {
		this.statusNumId = statusNumId;
	}
	
	

}
