package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.util.List;

public class ProblemBill implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Long> billType;
	private String reservedNo;

	public List<Long> getBillType() {
		return billType;
	}

	public void setBillType(List<Long> billType) {
		this.billType = billType;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

}
