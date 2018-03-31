package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoByWlbcNumIdAndItemNumIdGetRequest extends AbstractRequest {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8819181948393245910L;

	@NotNull(message = "波次号不能为空!")
	private Long wlbcNumId;
	
	@NotNull(message = "商品ID不能为空!")
	private Long itemNumId;
	
	@NotNull(message = "门店ID不能为空!")
	private Long subUnitNumId;
	
	@NotNull(message = "订单日期不能为空!")
	private Date orderDate;
	
	private String confirmType;

	public Long getWlbcNumId() {
		return wlbcNumId;
	}

	public void setWlbcNumId(Long wlbcNumId) {
		this.wlbcNumId = wlbcNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
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

	public String getConfirmType() {
		return confirmType;
	}

	public void setConfirmType(String confirmType) {
		this.confirmType = confirmType;
	}

	
	
	
}
