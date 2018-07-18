package com.ykcloud.soa.erp.api.sync.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class ExcessPromotionSyncRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -843513293116991206L;
	
	@NotNull(message = "重复导入跳过标识不能为空!")
	private Long skipSign;

	public Long getSkipSign() {
		return skipSign;
	}

	public void setSkipSign(Long skipSign) {
		this.skipSign = skipSign;
	}

}
