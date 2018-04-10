package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoNumIdOneRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7870514749928476218L;
	
	@NotNull(message = "波次号不能为空!")
	private String wlbc;
	
	@NotNull(message = "商品ID不能为空!")
	private Long itemNumId;
	
	@NotNull(message = "门店ID不能为空!")
	private String subUnitNumId;
	
	@NotNull(message = "orderDate不能为空!")
	private Date orderDate;
	
	
	private Long sowNumId;

	public String getWlbc() {
		return wlbc;
	}

	public void setWlbc(String wlbc) {
		this.wlbc = wlbc;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
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


	public Long getSowNumId() {
		return sowNumId;
	}

	public void setSowNumId(Long sowNumId) {
		this.sowNumId = sowNumId;
	}


	

}
