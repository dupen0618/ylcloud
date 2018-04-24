package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
//商品发货数量回写so申请单入参
public class SoApplyActualQtyUpdateGetRequest extends AbstractRequest {
	private static final long serialVersionUID = 1L;

	private String soNumId;     //订单单号
	
	private Long subUnitNumId;   //门店编号
	
	private Date orderDate;     //日期

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
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
