package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

public class ProblemBill implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long billType;
	private String reservedNo;

	public Long getBillType() {
		return billType;
	}

	public void setBillType(Long billType) {
		this.billType = billType;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

}
