package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import com.gb.soa.omp.ccommon.api.request.AbstractSessionRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class WmWlbcHdrCreateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 95011086979848977L;

	private Long subUnitNumId;

	private Date wlbcDate;

	private Long statusNumId;

	private Long soFromType;

	private Long typeNumId;

	private Long stotageNumId;

	private Long physicalNumId;

	private Date deliveryDate;

	private String remark;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getWlbcDate() {
		return wlbcDate;
	}

	public void setWlbcDate(Date wlbcDate) {
		this.wlbcDate = wlbcDate;
	}

	public Long getStatusNumId() {
		return statusNumId;
	}

	public void setStatusNumId(Long statusNumId) {
		this.statusNumId = statusNumId;
	}

	public Long getSoFromType() {
		return soFromType;
	}

	public void setSoFromType(Long soFromType) {
		this.soFromType = soFromType;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Long getStotageNumId() {
		return stotageNumId;
	}

	public void setStotageNumId(Long stotageNumId) {
		this.stotageNumId = stotageNumId;
	}

	public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
