package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractSessionRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class WmContainerHdrCreateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 585490687158871833L;

	// 订单编号
	@NotNull(message = "订单编号不能为空! ")
	private String soNumId;

	@NotNull(message = "托盘标识符不能为空! ")
	private String containerLabserlno;

	// 门店ID
	@NotNull(message = "门店ID不能为空! ")
	private Long subUnitNumId;

	// @NotNull(message = "订单日期不能为空! ")
	private Date orderData;

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

	public String getContainerLabserlno() {
		return containerLabserlno;
	}

	public void setContainerLabserlno(String containerLabserlno) {
		this.containerLabserlno = containerLabserlno;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getOrderData() {
		return orderData;
	}

	public void setOrderData(Date orderData) {
		this.orderData = orderData;
	}

}
