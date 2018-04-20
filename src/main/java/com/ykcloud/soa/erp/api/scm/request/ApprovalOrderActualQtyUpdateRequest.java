package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * 发货后回写发货数量入参
 * @author tz.x
 *
 * @date 2018年4月19日上午9:27:21
 */
public class ApprovalOrderActualQtyUpdateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 2530663321909127885L;
	
	/**
	 * 订单编号
	 */
	@NotEmpty(message = "订单编号不能为空！")
	private String soNumId;
	
	/**
	 * 订单日期 格式：yyyy-mm-dd
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空！")
	private Date orderDate;
	
	@NotNull(message = "门店不能为空!")
	private Long subUnitNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

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

}
