package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * 获取入账日期
 * @author tz.x
 * @date 2018年6月11日下午7:15:19
 */
public class BillInAccountDateGetRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 1956518105073686826L;
	
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

}
