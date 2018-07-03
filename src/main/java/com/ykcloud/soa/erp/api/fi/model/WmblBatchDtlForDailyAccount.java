package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;

public class WmblBatchDtlForDailyAccount implements Serializable{
	
	private static final long serialVersionUID = -4406281954841129209L;

	private Long batchSeries;
	
	private Double qty;
	
	private Long itemNumId;

	public Long getBatchSeries() {
		return batchSeries;
	}

	public void setBatchSeries(Long batchSeries) {
		this.batchSeries = batchSeries;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}
	
	
	
}
