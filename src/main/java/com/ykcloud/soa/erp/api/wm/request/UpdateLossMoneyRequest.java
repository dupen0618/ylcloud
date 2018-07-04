package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class UpdateLossMoneyRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 1L;

	private LossWorkconfirmRequest request;
	private Double qty;
	private Long settlement;
	private Double taxRate;
	private Long itemNumId;
	private String lossNumId;

	public LossWorkconfirmRequest getRequest() {
		return request;
	}

	public void setRequest(LossWorkconfirmRequest request) {
		this.request = request;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Long getSettlement() {
		return settlement;
	}

	public void setSettlement(Long settlement) {
		this.settlement = settlement;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public String getLossNumId() {
		return lossNumId;
	}

	public void setLossNumId(String lossNumId) {
		this.lossNumId = lossNumId;
	}

}
