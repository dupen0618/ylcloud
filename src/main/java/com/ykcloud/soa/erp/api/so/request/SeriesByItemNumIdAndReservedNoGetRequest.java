package com.ykcloud.soa.erp.api.so.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SeriesByItemNumIdAndReservedNoGetRequest extends AbstractRequest {

	@NotNull(message = "单号不能为空")
	private String reservedNo;

	@NotNull(message = "商品编号不能为空")
	private Long itemNumId; // 商品编号

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

}
