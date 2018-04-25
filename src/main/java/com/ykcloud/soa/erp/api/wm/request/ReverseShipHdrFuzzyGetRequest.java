package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
*
@author hank.zhu
@date 2018年4月19日 下午5:14:09 新建
**/
public class ReverseShipHdrFuzzyGetRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 3504288628107413793L;
	
	@ApiField(description = "门店编号")
	@NotNull(message = "门店编号不能为空!")
	private Long subUnitNumId;
	
	@ApiField(description = "负出库单号")
	@NotNull(message = "负出库单号不能为空!")
	private String reservedNo;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}


	
	

}
