package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoDtlQtyAndPackingQtyGetBySoNumIdAndItemIdRequest extends AbstractRequest {
	private static final long serialVersionUID = -7173705633933157105L;
	
	@NotNull(message="订单ID不能为空！")
	private String soNumId;
	
	//@NotNull(message="商品ID不能为空！")
	private Long itemNumId;
	
	@NotNull(message="门店ID不能为空！")
	private Long subUnitNumId;
	
	@NotNull(message="orderDate不能为空！")
	private Date orderDate;
	
	//sql是否要带itemNumId
	private Long itemFlag;


	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
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

	public Long getItemFlag() {
		return itemFlag;
	}

	public void setItemFlag(Long itemFlag) {
		this.itemFlag = itemFlag;
	}
	
	

}
