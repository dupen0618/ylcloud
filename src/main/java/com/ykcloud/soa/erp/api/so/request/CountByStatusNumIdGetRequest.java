package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

//查询销售日报表中状态小于2的数量
public class CountByStatusNumIdGetRequest extends AbstractRequest {

	private String reservedNo; // 单号

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

}
