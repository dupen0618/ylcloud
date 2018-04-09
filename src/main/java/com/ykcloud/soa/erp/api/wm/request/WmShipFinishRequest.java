package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WmShipFinishRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 845322839903701744L;
	
	private Long reservedNo;

	private Long subUnitNumId;
	
	private Date orderDate;

	public Long getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(Long reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	
	
	

}
