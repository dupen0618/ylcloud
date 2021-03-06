package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class InventoryForDistributionApprovalLockRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 5118059696054727934L;

	@ApiField(description="门店编号")
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空！")
	private Date orderDate;

	@ApiField(description="订货审批单号")
	@NotNull(message = "订货审批单号不能为空！")
	private String approvaNumId;

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

	public String getApprovaNumId() {
		return approvaNumId;
	}

	public void setApprovaNumId(String approvaNumId) {
		this.approvaNumId = approvaNumId;
	}

}
