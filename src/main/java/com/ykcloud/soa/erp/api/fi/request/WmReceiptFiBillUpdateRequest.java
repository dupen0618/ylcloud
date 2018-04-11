package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
*仓库收货,财务帐处理请求类
@author hank.zhu
@date 2018年4月12日 上午7:24:13 新建
**/
public class WmReceiptFiBillUpdateRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 6923661216035655759L;
	
	@NotEmpty(message="门店编号不能为空!")
	private Long subUnitNumId;
	@NotNull(message="验收单号不能为空!")
	private String reservedNO;
	public Long getSubUnitNumId() {
		return subUnitNumId;
	}
	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	public String getReservedNO() {
		return reservedNO;
	}
	public void setReservedNO(String reservedNO) {
		this.reservedNO = reservedNO;
	}

}
