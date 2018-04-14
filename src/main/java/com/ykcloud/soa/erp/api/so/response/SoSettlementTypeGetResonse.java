package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class SoSettlementTypeGetResonse extends MessagePack {
	
	private static final long serialVersionUID = 1L;
	private Long settlementType;

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}
	

}
