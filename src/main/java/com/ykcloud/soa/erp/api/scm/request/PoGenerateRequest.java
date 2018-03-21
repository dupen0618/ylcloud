package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * 
 * @author tz.x
 *
 * @date 2018年3月21日下午3:30:02
 */
public class PoGenerateRequest extends AbstractRequest {

	private static final long serialVersionUID = 5118059696054727934L;
	
	/**
	 * 门店编号
	 */
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;
	
	/**
	 * 订单日期 格式：yyyy-mm-dd
	 */
	@NotNull(message = "订单日期不能为空！")
	private Date orderDate;
	
	/**
	 * 订货审批单号
	 */
	@NotNull(message = "订货审批单号不能为空！")
	private Long approvaNumId;

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

	public Long getApprovaNumId() {
		return approvaNumId;
	}

	public void setApprovaNumId(Long approvaNumId) {
		this.approvaNumId = approvaNumId;
	}


}
