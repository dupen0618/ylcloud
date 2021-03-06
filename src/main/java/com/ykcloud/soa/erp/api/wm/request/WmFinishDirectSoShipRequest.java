package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class WmFinishDirectSoShipRequest extends AbstractUserSessionRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8005113262673514192L;
	
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;
	
	@NotNull(message = "订单编号不能为空！")
	private String soNumId;
	
	@NotNull(message = "是否可以短播标识符不能为空! ")
	private Long confirmSign;

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

	public Long getConfirmSign() {
		return confirmSign;
	}

	public void setConfirmSign(Long confirmSign) {
		this.confirmSign = confirmSign;
	}

	
	
}
