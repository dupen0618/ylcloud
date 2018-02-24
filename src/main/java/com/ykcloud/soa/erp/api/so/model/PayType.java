package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;

import com.gb.soa.omp.ccommon.api.annotation.ApiField;

public class PayType implements Serializable{

	private static final long serialVersionUID = 136270078950699550L;
	
	@ApiField(description="付款方式编号")
	private Long payTypeId;
	
	@ApiField(description="付款方式名称")
	private String payTypeName;

	public Long getPayTypeId() {
		return payTypeId;
	}

	public void setPayTypeId(Long payTypeId) {
		this.payTypeId = payTypeId;
	}

	public String getPayTypeName() {
		return payTypeName;
	}

	public void setPayTypeName(String payTypeName) {
		this.payTypeName = payTypeName;
	}
	
}
