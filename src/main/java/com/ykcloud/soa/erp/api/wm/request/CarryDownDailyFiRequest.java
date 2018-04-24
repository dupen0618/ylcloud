package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class CarryDownDailyFiRequest extends AbstractRequest {

	private static final long serialVersionUID = -8775140995059788800L;

	@ApiField(description = "门店编号")
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@ApiField(description = "结算日期")
	@NotNull(message = "结算日期不能为空！")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date orderDate;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

}
