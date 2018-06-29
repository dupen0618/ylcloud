package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class ProtocolShop implements Serializable {
	private static final long serialVersionUID = 1L;
	
    @NotEmpty(message="采购协议单号不能为空")
	private String reservedNo;
	
    @NotEmpty(message="门店简码不能为空")
	private String subUnitId;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public String getSubUnitId() {
		return subUnitId;
	}

	public void setSubUnitId(String subUnitId) {
		this.subUnitId = subUnitId;
	}

}
