package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
*一键收货请求类
@author hank.zhu
@date 2018年3月26日 上午10:02:06 新建
**/
public class DirectReceiptUpdateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 7417876855969251381L;
	
	@ApiField(description = "验收单号")
	@NotNull(message = "验收单号不能为空!")
	private String reservedNo;//验收单号
	
	@ApiField(description = "门店编号")
	@NotNull(message="门店编号不能为空!")
	private Long subUnitNumId;
	

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

}
