package com.ykcloud.soa.erp.api.fi.model;

/**
 * @author 殷剑
 *
 */
public class AdjustPriceForApi {
	/**
	 * 原价格
	 */
	Double costPrice;
	/**
	 * 调整后价格
	 */
	Double adjustPrice;
	/**
	 * 批次id
	 */
	String batchSeries;	
	/**
	 * 进项税额
	 */
	Double inTaxRate;
	/**
	 * 调整数量
	 */
	Double adjustQty;
	public Double getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}
	public Double getAdjustPrice() {
		return adjustPrice;
	}
	public void setAdjustPrice(Double adjustPrice) {
		this.adjustPrice = adjustPrice;
	}
	public String getBatchSeries() {
		return batchSeries;
	}
	public void setBatchSeries(String batchSeries) {
		this.batchSeries = batchSeries;
	}
	public Double getInTaxRate() {
		return inTaxRate;
	}
	public void setInTaxRate(Double inTaxRate) {
		this.inTaxRate = inTaxRate;
	}
	public Double getAdjustQty() {
		return adjustQty;
	}
	public void setAdjustQty(Double adjustQty) {
		this.adjustQty = adjustQty;
	}
	
}
