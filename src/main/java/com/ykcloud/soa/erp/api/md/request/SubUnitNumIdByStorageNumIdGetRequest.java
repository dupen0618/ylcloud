package com.ykcloud.soa.erp.api.md.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
* @ClassName: SubUnitNumIdByStorageNumIdGetRequest.java
* @Description: 获取逻辑仓所在的门店编号request
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月9日 下午6:16:34 
*/
public class SubUnitNumIdByStorageNumIdGetRequest extends AbstractRequest{

	private static final long serialVersionUID = -2013320659147823734L;
	
	@NotNull(message="仓库编号不能为空！")
	private Long stroageNumId;

	public Long getStroageNumId() {
		return stroageNumId;
	}

	public void setStroageNumId(Long stroageNumId) {
		this.stroageNumId = stroageNumId;
	}
	
	

}
