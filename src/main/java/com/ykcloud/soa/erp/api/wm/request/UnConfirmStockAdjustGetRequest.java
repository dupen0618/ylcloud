package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * @Description: 查询指定日期之前的所有未入账的盈亏单的入参
 * @author: henry.wang
 * @date: 2018/5/3 16:36
 **/
public class UnConfirmStockAdjustGetRequest extends AbstractRequest {

	private static final long serialVersionUID = -3101956261800131597L;

	@ApiField(description = "门店编号")
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@ApiField(description = "盈亏日期")
	@NotNull(message = "盈亏日期不能为空！")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date orderDate;

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
