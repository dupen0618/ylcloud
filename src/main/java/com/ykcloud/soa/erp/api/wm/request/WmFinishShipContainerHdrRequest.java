package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class WmFinishShipContainerHdrRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = -3357073694317741885L;

	@NotNull(message = "门店不能为空! ")
	private Long subUnitNumId;

	@NotNull(message = "装箱单号不能为空! ")
	private String containerSerlno;

	@NotNull(message = "复核类型不能为空! ")
	private Long sowSign;

	private String soNumId;

	private Date orderDate;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getContainerSerlno() {
		return containerSerlno;
	}

	public void setContainerSerlno(String containerSerlno) {
		this.containerSerlno = containerSerlno;
	}

	public Long getSowSign() {
		return sowSign;
	}

	public void setSowSign(Long sowSign) {
		this.sowSign = sowSign;
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
