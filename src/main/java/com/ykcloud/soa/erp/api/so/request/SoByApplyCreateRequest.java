package com.ykcloud.soa.erp.api.so.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
/**
 * 
 * @author fakir.jiang
 * 2018年3月29日
 */
public class SoByApplyCreateRequest extends AbstractRequest{

	private static final long serialVersionUID = 1L;
	
	@NotNull(message="申请单号不能为空")
	private String applyNumId;//申请单号
	
	private Long subUnitNumId;//门店
	
	public String getApplyNumId() {
		return applyNumId;
	}

	public void setApplyNumId(String applyNumId) {
		this.applyNumId = applyNumId;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	
}
