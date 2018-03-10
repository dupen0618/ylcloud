package com.ykcloud.soa.erp.api.md.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
* @ClassName: UnitNumIdBySubUnitNumIdGetResponse.java
* @Description: 获取门店的业务单元编号response
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月9日 上午9:35:00 
*/
public class UnitNumIdBySubUnitNumIdGetResponse extends MessagePack {

	private static final long serialVersionUID = 1L;
	
	//业务单元编号
	private Long unitNumId;

	public Long getUnitNumId() {
		return unitNumId;
	}

	public void setUnitNumId(Long unitNumId) {
		this.unitNumId = unitNumId;
	} 
	
	

}
