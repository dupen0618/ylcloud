package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.util.List;

public class ProblemBill implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Long> reservedNo;
	private String billType;

	public List<Long> getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(List<Long> reservedNo) {
		this.reservedNo = reservedNo;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
