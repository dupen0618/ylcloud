package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WorkLossCreateRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	// 加工单号
	@NotNull(message = "加工单号不能为空")
	private String workNumId;

	// 损耗数量
	@NotNull(message = "损耗数量不能为空")
	private Double lossQty;

	@NotNull(message = "损耗金额不能为空")
	private Double losscost;
	
	@NotNull(message = "门店编号不能为空")
	private Long subUnitNumId;
	
	private Long typeNumId;

	public String getWorkNumId() {
		return workNumId;
	}

	public void setWorkNumId(String workNumId) {
		this.workNumId = workNumId;
	}

	public Double getLossQty() {
		return lossQty;
	}

	public void setLossQty(Double lossQty) {
		this.lossQty = lossQty;
	}

	public Double getLosscost() {
		return losscost;
	}

	public void setLosscost(Double losscost) {
		this.losscost = losscost;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	
}
