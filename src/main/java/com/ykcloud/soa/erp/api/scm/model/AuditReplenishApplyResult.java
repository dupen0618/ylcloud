package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

public class AuditReplenishApplyResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String applyNumId;  //申请单号
	
	private String error;       //信息描述

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
