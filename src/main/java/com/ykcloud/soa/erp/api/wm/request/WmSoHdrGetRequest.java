package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WmSoHdrGetRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8147686661977300539L;
	
	@NotNull(message="订单号不能为空！")
	private String soNumId;
	
	@NotNull(message="门店Id不能为空！")
	private String subUnitNumId;
	
	private Date orderDate;

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
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
