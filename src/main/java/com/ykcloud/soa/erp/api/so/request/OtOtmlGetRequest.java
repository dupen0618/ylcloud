package com.ykcloud.soa.erp.api.so.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class OtOtmlGetRequest extends AbstractRequest{

	private static final long serialVersionUID = 1L;
	
	@NotNull(message="门店编号不能为空!")
	private Long subUnitNumId;
	
	@NotNull(message="行号不能为空!")
	private String tmlLine;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getTmlLine() {
		return tmlLine;
	}

	public void setTmlLine(String tmlLine) {
		this.tmlLine = tmlLine;
	}
	
	
	
	
	
	
}
