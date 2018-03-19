package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

public class ApprovalDtlForGenerateDirectWayDistributionSo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    private Long ordSubUnitNumId; //订货门店
    
    private Double qty;
    
    private Double pmtQty;

	public Long getOrdSubUnitNumId() {
		return ordSubUnitNumId;
	}

	public void setOrdSubUnitNumId(Long ordSubUnitNumId) {
		this.ordSubUnitNumId = ordSubUnitNumId;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getPmtQty() {
		return pmtQty;
	}

	public void setPmtQty(Double pmtQty) {
		this.pmtQty = pmtQty;
	}
  
    
}
