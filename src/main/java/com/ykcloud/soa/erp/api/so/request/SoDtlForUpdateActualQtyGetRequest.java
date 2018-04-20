package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * 订单发货后回写审批单和申请单发货数量之前通过so单号查询要回写的审批单
 * @author tz.x
 *
 * @date 2018年4月19日上午9:55:22
 */
public class SoDtlForUpdateActualQtyGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 536215164859211403L;
	
	@NotNull(message = "订单号不能为空！")
	private String soNumId;
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空!")
	private Date orderDate;
	
	@NotNull(message = "门店不能为空!")
	private Long subUnitNumId;

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

}
