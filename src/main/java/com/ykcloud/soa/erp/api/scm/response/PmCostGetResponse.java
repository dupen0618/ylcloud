package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.PmCost;

public class PmCostGetResponse extends MessagePack{
	
	private static final long serialVersionUID = -8670336951357228222L;
	
	private PmCost pmCost;

	public PmCost getPmCost() {
		return pmCost;
	}

	public void setPmCost(PmCost pmCost) {
		this.pmCost = pmCost;
	}
	
	

}
