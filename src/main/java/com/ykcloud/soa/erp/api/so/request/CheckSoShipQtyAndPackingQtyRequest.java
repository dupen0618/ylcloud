package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class CheckSoShipQtyAndPackingQtyRequest extends AbstractRequest {

	private static final long serialVersionUID = 7008234009750911781L;

	private Long subUnitNumId;

	private String soNumId;
	
	private Date orderDate;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	

}
