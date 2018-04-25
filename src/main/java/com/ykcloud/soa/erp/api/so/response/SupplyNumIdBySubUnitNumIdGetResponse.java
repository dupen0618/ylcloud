package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class SupplyNumIdBySubUnitNumIdGetResponse extends MessagePack {
	
	private List<Long> supplyUnitNumIds;  //供应商编号集合

	public List<Long> getSupplyUnitNumIds() {
		return supplyUnitNumIds;
	}

	public void setSupplyUnitNumIds(List<Long> supplyUnitNumIds) {
		this.supplyUnitNumIds = supplyUnitNumIds;
	}
	
	

}
