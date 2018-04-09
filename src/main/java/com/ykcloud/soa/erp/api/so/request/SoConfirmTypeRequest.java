package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoConfirmTypeRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6020213655003704003L;
	
	private String soNumId;
	
	private Long confirmType;
	
	private String subUnitNumId;
	
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


	public String getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(String subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	

}
