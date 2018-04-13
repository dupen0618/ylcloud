package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

public class BatchPrice implements Serializable {
	
	private static final long serialVersionUID = -6781665813773667602L;

	private Double price;

	private Double taxRate;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

}
