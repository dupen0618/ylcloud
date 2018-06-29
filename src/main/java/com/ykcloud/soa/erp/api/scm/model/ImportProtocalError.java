package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

public class ImportProtocalError implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String reservedNo;  //供应商编码
	
	private String message;  //错误信息

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
