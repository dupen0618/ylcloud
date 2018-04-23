package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;

public class SoDtlForInTransitDeposit implements Serializable {

    private static final long serialVersionUID = -2305750048515780399L;

    private String series;//序号

    private Long itemNumId;
    
    private Double qty;

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}
    
    
}
