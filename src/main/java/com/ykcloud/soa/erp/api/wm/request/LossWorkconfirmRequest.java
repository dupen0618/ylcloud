package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

/**
 * Created by yiako on 2018/3/28
 */
public class LossWorkconfirmRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "损溢单号不能为空！")
	private String lossNumId;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	public String getLossNumId() {
		return lossNumId;
	}

	public void setLossNumId(String lossNumId) {
		this.lossNumId = lossNumId;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

}
