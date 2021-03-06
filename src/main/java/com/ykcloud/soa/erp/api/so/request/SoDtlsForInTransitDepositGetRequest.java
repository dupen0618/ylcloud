package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoDtlsForInTransitDepositGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "门店编号不能为空!")
	private Long subUnitNumId; // 门店编号

	@NotNull(message = "订货日期不能为空!")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date orderDate;

	@NotNull(message = "订单编号不能为空！")
	private String soNumId;

	@NotNull(message = "门店编号不能为空!")
	private Long ordSubUnitNumId; // 补货门店编号

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

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

	public Long getOrdSubUnitNumId() {
		return ordSubUnitNumId;
	}

	public void setOrdSubUnitNumId(Long ordSubUnitNumId) {
		this.ordSubUnitNumId = ordSubUnitNumId;
	}

}
