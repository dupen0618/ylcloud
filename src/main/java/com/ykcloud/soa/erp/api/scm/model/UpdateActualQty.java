package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

public class UpdateActualQty implements Serializable{
	private static final long serialVersionUID = 6901097914034651844L;
	private String applyNumId;  //申请单单号
	
	private String applyLine;   //申请单行号
	
	private Double qty;       //退货数量

	public String getApplyNumId() {
		return applyNumId;
	}

	public void setApplyNumId(String applyNumId) {
		this.applyNumId = applyNumId;
	}

	public String getApplyLine() {
		return applyLine;
	}

	public void setApplyLine(String applyLine) {
		this.applyLine = applyLine;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

}
