package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class ReverseReceiptCreateByContainerRequest extends AbstractUserSessionRequest {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9040984868153799037L;

	@NotNull(message="门店编号不能为空！")
	private Long subUnitNumId;
	
	@NotNull(message="托盘实物标志不能为空！")
	private String containerLabserlno;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getContainerLabserlno() {
		return containerLabserlno;
	}

	public void setContainerLabserlno(String containerLabserlno) {
		this.containerLabserlno = containerLabserlno;
	}
	

}
