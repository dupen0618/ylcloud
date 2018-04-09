package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WmQuerySoAndContainerRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4037272833488307601L;
	
	
	@NotNull(message="托盘码不能为空")
	private String containerSerno;
	
	@NotNull(message="门店ID不能为空")
	private String subUnitNumId;
	
	private Date orderDate;


	public String getContainerSerno() {
		return containerSerno;
	}

	public void setContainerSerno(String containerSerno) {
		this.containerSerno = containerSerno;
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
