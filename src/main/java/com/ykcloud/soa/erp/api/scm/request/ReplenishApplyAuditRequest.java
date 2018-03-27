package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

//补货单主管审核入参
public class ReplenishApplyAuditRequest extends AbstractUserSessionRequest {
	@NotNull(message = "门店编号不能为空")
	private Long subUnitNumId; // 门店编号
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空")
	private Date orderDate; // 订单日期
	@NotNull(message = "审批单编号不能为空")
	private String applyNumId; // 审批单编号
	@Range(min = 0, max = 1)
	@NotNull(message = "审核方式不能为空")
	private Long autoAuditSign; // 1:自动审核 0:人工审核

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

	public String getApplyNumId() {
		return applyNumId;
	}

	public void setApplyNumId(String applyNumId) {
		this.applyNumId = applyNumId;
	}

	public Long getAutoAuditSign() {
		return autoAuditSign;
	}

	public void setAutoAuditSign(Long autoAuditSign) {
		this.autoAuditSign = autoAuditSign;
	}

}
