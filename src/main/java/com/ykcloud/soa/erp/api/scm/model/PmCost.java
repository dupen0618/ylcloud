package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

public class PmCost implements Serializable{
	
	private static final long serialVersionUID = 4469401073132509423L;

	private Long typeNumId;
	
	private Double oldCost;
	
	private Double priceDiff;

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

	public Double getPriceDiff() {
		return priceDiff;
	}

	public void setPriceDiff(Double priceDiff) {
		this.priceDiff = priceDiff;
	}
	
	
	
}
