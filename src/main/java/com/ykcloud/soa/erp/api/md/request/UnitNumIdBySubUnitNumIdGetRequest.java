package com.ykcloud.soa.erp.api.md.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
* @ClassName: UnitNumIdBySubUnitNumIdGetRequest.java
* @Description: 获取门店的业务单元编号request
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月9日 上午9:31:04 
*/
public class UnitNumIdBySubUnitNumIdGetRequest extends AbstractRequest{

	private static final long serialVersionUID = 1L;
	
	@NotNull(message="门店编号不能为空！")
	private Long subUnitNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long ssubUnitNumId) {
		this.subUnitNumId = ssubUnitNumId;
	}
	
	

}
