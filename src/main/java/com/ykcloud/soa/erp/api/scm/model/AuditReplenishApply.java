package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;
import java.util.Date;

public class AuditReplenishApply implements Serializable {
	
	/**
	 * 批量审核的类
	 */
	private static final long serialVersionUID = 1L;

	private Date orderDate; //日期
	
	private String applyNumId;  //申请单单号

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getApplyNumId() {
		return applyNumId;
	}

	public void setApplyNumId(String applyNumId) {
		this.applyNumId = applyNumId;
	}
	
	

}
