package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class ReverseScanContainerRequest extends AbstractUserSessionRequest {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3699446458983754960L;

	@NotNull(message="门店编号不能为空!")
	private Long subUnitNumId;
	@NotNull(message="验收单号不能为空!")
	private String reservedNo;
	@NotNull(message="托盘实物标志不能为空!")
	private String containerLabserlno;
	@NotNull(message="扫描标志不能为空!0正向,-1反向!")
	private Long confirmSign;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public String getContainerLabserlno() {
		return containerLabserlno;
	}

	public void setContainerLabserlno(String containerLabserlno) {
		this.containerLabserlno = containerLabserlno;
	}

	public Long getConfirmSign() {
		return confirmSign;
	}

	public void setConfirmSign(Long confirmSign) {
		this.confirmSign = confirmSign;
	}

}
