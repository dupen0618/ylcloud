package com.ykcloud.soa.erp.api.so.response;

import java.util.List;
import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class OrdSubUnitNumIdsBySoNumIdForInTransitDepositGetResponse extends MessagePack {

	private static final long serialVersionUID = 5304969504492084935L;

	private List<Long> ordSubUnitNumIds;

	public List<Long> getOrdSubUnitNumIds() {
		return ordSubUnitNumIds;
	}

	public void setOrdSubUnitNumIds(List<Long> ordSubUnitNumIds) {
		this.ordSubUnitNumIds = ordSubUnitNumIds;
	}

}
