package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
*仓库收货业务帐处理请求类
@author hank.zhu
@date 2018年4月12日 上午6:58:09 新建
**/
public class WmReceiptInventoryBillUpdateRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = -4804228244059578778L;
	
	@NotEmpty(message="验收单号不能为空!")
	private String reservedNo;
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
