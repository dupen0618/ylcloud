package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AuditReturnApply implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message="日期不能为空")
	private Date orderDate;  //日期
	
	@NotNull(message="申请单号不能为空")
	private String applyNumId;   //申请单号

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
