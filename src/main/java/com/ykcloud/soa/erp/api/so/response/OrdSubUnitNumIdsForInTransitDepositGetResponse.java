package com.ykcloud.soa.erp.api.so.response;

import java.util.List;
import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class OrdSubUnitNumIdsForInTransitDepositGetResponse extends MessagePack {

	private static final long serialVersionUID = 5304969504492084935L;

	private List<Long> orderSubUnitNumIds;

	public List<Long> getOrderSubUnitNumIds() {
		return orderSubUnitNumIds;
	}

	public void setOrderSubUnitNumIds(List<Long> orderSubUnitNumIds) {
		this.orderSubUnitNumIds = orderSubUnitNumIds;
	}

}
