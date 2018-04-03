package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SubUnitNameBySubUnitNumIdRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7681111633108316052L;
	
	@NotNull(message="门店编号不能为空！")
	private Long subUnitNumId;
	
	@NotNull(message="orderDate不能为空！")
	private Date orderDate;

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
