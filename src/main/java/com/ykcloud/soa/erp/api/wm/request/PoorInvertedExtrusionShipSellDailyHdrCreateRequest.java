package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class PoorInvertedExtrusionShipSellDailyHdrCreateRequest extends AbstractUserSessionRequest {


	private static final long serialVersionUID = 2202636539056219049L;
	
	@NotNull(message = "们店编号不能为空!")
	private Long subUnitNumId;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "日结日期不能为空！")
	private Date orderDate;
	
	@NotNull(message = "临时单号")
	private String transientReservedNo;

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

	public String getTransientReservedNo() {
		return transientReservedNo;
	}

	public void setTransientReservedNo(String transientReservedNo) {
		this.transientReservedNo = transientReservedNo;
	}
	
	
	
	
}
