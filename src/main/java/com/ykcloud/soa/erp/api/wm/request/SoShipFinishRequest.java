package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class SoShipFinishRequest extends AbstractUserSessionRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2680423974639245423L;
	
	@NotNull(message = "门店编号不能为空! ")
	private Long subUnitNumId;
	
	@NotNull(message = "订单编号不能为空! ")
	private String soNumId;
	
	@NotNull(message = "短播标识不能为空! ")
	private Long cancel_sign;
	

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

	public Long getCancel_sign() {
		return cancel_sign;
	}

	public void setCancel_sign(Long cancel_sign) {
		this.cancel_sign = cancel_sign;
	}
}
