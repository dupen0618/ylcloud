package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class PmCostGetResponse extends MessagePack{
	
	private static final long serialVersionUID = -8670336951357228222L;
	
	private Long typeNumId;
	
	private Double oldCost;
	
	private Double priceDiff;

	public Double getPriceDiff() {
		return priceDiff;
	}

	public void setPriceDiff(Double priceDiff) {
		this.priceDiff = priceDiff;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Double getOldCost() {
		return oldCost;
	}

	public void setOldCost(Double oldCost) {
		this.oldCost = oldCost;
	}
	
	
	

}
