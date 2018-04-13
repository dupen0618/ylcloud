package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

/**
 * 缺货商品列表
 * @author tz.x
 *
 * @date 2018年4月13日下午1:05:52
 */
public class LackInventoryProduct implements Serializable {

	private static final long serialVersionUID = -7591065835082713730L;
	
	/**
	 * 商品编号
	 */
	private Long itemNumId;
	
	/**
	 * 商品名称
	 */
	private String itemName;
	
	/**
	 * 需求数量
	 */
	private Double applyQty;
	
	/**
	 * 库存数量
	 */
	private Double stockQty;
	
	/**
	 * 缺货数量
	 */
	private Double lackQty;

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getApplyQty() {
		return applyQty;
	}

	public void setApplyQty(Double applyQty) {
		this.applyQty = applyQty;
	}

	public Double getStockQty() {
		return stockQty;
	}

	public void setStockQty(Double stockQty) {
		this.stockQty = stockQty;
	}

	public Double getLackQty() {
		return lackQty;
	}

	public void setLackQty(Double lackQty) {
		this.lackQty = lackQty;
	}

}
