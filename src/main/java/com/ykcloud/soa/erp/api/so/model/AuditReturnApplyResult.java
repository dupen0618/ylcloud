package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;

public class AuditReturnApplyResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String applyNumId;   //申请单编号
	
	private String error;      //错误原因

	public String getApplyNumId() {
		return applyNumId;
	}

	public void setApplyNumId(String applyNumId) {
		this.applyNumId = applyNumId;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	

}
