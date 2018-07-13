package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

public class ImportProtocalError implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String reservedId;  //供应商编码
	
	private String message;  //错误信息

	

	public String getReservedId() {
		return reservedId;
	}

	public void setReservedId(String reservedId) {
		this.reservedId = reservedId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
