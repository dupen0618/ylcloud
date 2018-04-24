package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoConfirmTypeRequest extends AbstractRequest {

	private static final long serialVersionUID = 6020213655003704003L;
	
	private String soNumId;
	
	private Long confirmType;
	
	private Long subUnitNumId;
	
	private Long userNumId;
	
	private Date orderDate;
	
	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

	public Long getConfirmType() {
		return confirmType;
	}

	public void setConfirmType(Long confirmType) {
		this.confirmType = confirmType;
	}


	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getUserNumId() {
		return userNumId;
	}

	public void setUserNumId(Long userNumId) {
		this.userNumId = userNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	


}
