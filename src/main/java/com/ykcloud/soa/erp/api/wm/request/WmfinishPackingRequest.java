package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WmfinishPackingRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4398979725161318722L;
	
	@NotNull(message = "门店id不能为空! ")
	private String subUnitNumId;
	
	@NotNull(message = "订单id不能为空! ")
	private String soNumId;
	
	@NotNull(message = "短装标识符不能为空不能为空! ")
	private Long cancelSign;

	public String getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(String subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

	public Long getCancelSign() {
		return cancelSign;
	}

	public void setCancelSign(Long cancelSign) {
		this.cancelSign = cancelSign;
	}
	
	

}
