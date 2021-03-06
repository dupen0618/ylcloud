package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class WmFinishSoPackingRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 4419449230653442470L;

	@NotNull(message = "物流波次号不能为空! ")
	private String wlbc;

	@NotNull(message = "门店号不能为空! ")
	private Long subUnitNumId;

	@NotNull(message = "是否可以短播标识符不能为空! ")
	private Long confirmSign;
	

	public String getWlbc() {
		return wlbc;
	}

	public void setWlbc(String wlbc) {
		this.wlbc = wlbc;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getConfirmSign() {
		return confirmSign;
	}

	public void setConfirmSign(Long confirmSign) {
		this.confirmSign = confirmSign;
	}

	

}
