package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.PmCost;

public class PmCostGetResponse extends MessagePack{
	
	private static final long serialVersionUID = -8670336951357228222L;
	
	private List<PmCost> pmCostList;

	public List<PmCost> getPmCostList() {
		return pmCostList;
	}

	public void setPmCostList(List<PmCost> pmCostList) {
		this.pmCostList = pmCostList;
	}

	
	
	

}
