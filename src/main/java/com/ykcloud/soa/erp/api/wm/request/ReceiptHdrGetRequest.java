package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
*
@author hank.zhu
@date 2018年3月12日 下午8:19:28 新建
**/
public class ReceiptHdrGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;
	@NotNull(message="门店编号布恩那个为空!")
	private Long subUnitNUmId;//门店编号
	@NotEmpty(message="验收单号不能为空!")
	private String reservedNo;//验收单号后6位
	public String getReservedNo() {
		return reservedNo;
	}
	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
	public Long getSubUnitNUmId() {
		return subUnitNUmId;
	}
	public void setSubUnitNUmId(Long subUnitNUmId) {
		this.subUnitNUmId = subUnitNUmId;
	}
	
}
