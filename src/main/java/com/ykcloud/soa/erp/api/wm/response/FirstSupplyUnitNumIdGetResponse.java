package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class FirstSupplyUnitNumIdGetResponse extends MessagePack {

	private static final long serialVersionUID = 1L;

	private Long firstSupplyUnitNumId;

	public Long getFirstSupplyUnitNumId() {
		return firstSupplyUnitNumId;
	}

	public void setFirstSupplyUnitNumId(Long firstSupplyUnitNumId) {
		this.firstSupplyUnitNumId = firstSupplyUnitNumId;
	}

}
