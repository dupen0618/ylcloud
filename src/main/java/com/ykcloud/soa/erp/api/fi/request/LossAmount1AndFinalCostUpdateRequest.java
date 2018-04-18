package com.ykcloud.soa.erp.api.fi.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class LossAmount1AndFinalCostUpdateRequest extends AbstractRequest {
	private static final long serialVersionUID = 1L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@NotNull(message = "商品编号不能为空！")
	private Long itemNumId;

	@NotNull(message = "物理仓库不能为空！")
	private Long physicalNumId;

	@NotNull(message = "结算日期")
	private Double losscost;
	
	public interface lossType{
		public String loss = "0";
		public String overFlow = "1";
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}

}
