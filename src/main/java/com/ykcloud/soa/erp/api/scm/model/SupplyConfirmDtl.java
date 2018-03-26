package com.ykcloud.soa.erp.api.scm.model;

/**
 * 供应商确认明细
 * @author tz.x
 *
 * @date 2018年3月24日上午11:41:03
 */
public class SupplyConfirmDtl {
	
	/**
	 * 采购单供应商协同体行号
	 */
	private String series;
	
	/**
	 * 商品编号
	 */
	private String itemNumId; 
	
	/**
	 * 供应商确认商品数量(商品及赠品总数量)
	 */
	private Double totalQty;
	
	/**
	 * 供应商确认生产日期
	 */
	private String supProduceDate;

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(String itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Double getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(Double totalQty) {
		this.totalQty = totalQty;
	}

	public String getSupProduceDate() {
		return supProduceDate;
	}

	public void setSupProduceDate(String supProduceDate) {
		this.supProduceDate = supProduceDate;
	}

}
