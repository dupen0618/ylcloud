package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * 店间调拨收货门店确认入参
 * @author tz.x
 *
 * @date 2018年4月16日上午9:00:11
 */
public class ShopTransferByOperationCenterAuditRequest extends AbstractUserSessionRequest{
	
	private static final long serialVersionUID = 1034959357911621148L;

	@NotNull(message = "门店不能为空!")
	private Long subUnitNumId;
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空!")
	private Date orderDate;
	
	@NotNull(message = "订单申请单号不能为空!")
	private String applyNumId;

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

}
