package com.ykcloud.soa.erp.api.scm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
*Po完成方法请求类
@author hank.zhu
@date 2018年4月18日 上午11:40:36 新建
**/
public class PoFinishRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = -875614724445219444L;
	
	@ApiField(description = "门店编号")
	@NotNull(message = "门店编号不能为空!")
	private Long subUnitNumId;
	
	@ApiField(description = "采购单号")
	@NotNull(message = "采购单号不能为空!")
	private String PoNumId;

	@ApiField(description = "用户ID")
	@NotNull(message = "用户ID不能为空!")
	private Long userNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	
	public String getPoNumId() {
		return PoNumId;
	}

	public void setPoNumId(String poNumId) {
		PoNumId = poNumId;
	}

	public Long getUserNumId() {
		return userNumId;
	}
	public void setUserNumId(Long userNumId) {
		this.userNumId = userNumId;
	}
}
