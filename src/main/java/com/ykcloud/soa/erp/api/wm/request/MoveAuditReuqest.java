package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class MoveAuditReuqest extends AbstractRequest{

	/**
	 * 移库审核
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "移库单号不能为空")
	private String moveNumId;
	@NotNull(message = "门店不能为空")
	private Long subUnitNumId;
	
	public String getMoveNumId() {
		return moveNumId;
	}

	public void setMoveNumId(String moveNumId) {
		this.moveNumId = moveNumId;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	
}
