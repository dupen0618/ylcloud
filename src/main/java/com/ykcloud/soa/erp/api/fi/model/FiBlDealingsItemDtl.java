package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;

/**
 * @author tz.x
 * @date 2018年5月17日下午1:31:56
 */
public class FiBlDealingsItemDtl implements Serializable {

	private static final long serialVersionUID = -1879313120009266010L;
	
	/**
	 * 结算方式编码1购销 2代销 3联销
	 */
	private Long settlementType;
	
	/**
	 * 商品编号
	 */
	private Long itemNumId;
	
	/**
	 * 商品名称
	 */
	private String itemName;
	
	/**
	 * 商品条码
	 */
	private String barcode;
	
	/**
	 * 小类编码
	 */
	private Long ptyNum3;
	
	/**
	 * 原成本金额(含税)
	 */
	private Double oldCostAmount;
	
	/**
	 * 原税金
	 */
	private Double oldTaxAmount;
	
	/**
	 * 原进项税率(%)
	 */
	private Double oldTaxRate;
	
	/**
	 * 调整成本金额(含税)
	 */
	private Double newCostAmount;
	
	/**
	 * 调整税金
	 */
	private Double newTaxAmount;
	
	/**
	 * 进项税率(%)
	 */
	private Double newTaxRate;
	
	/**
	 * 单据编号
	 */
	private String dealingsNumId;

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

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

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Long getPtyNum3() {
		return ptyNum3;
	}

	public void setPtyNum3(Long ptyNum3) {
		this.ptyNum3 = ptyNum3;
	}

	public Double getOldCostAmount() {
		return oldCostAmount;
	}

	public void setOldCostAmount(Double oldCostAmount) {
		this.oldCostAmount = oldCostAmount;
	}

	public Double getOldTaxAmount() {
		return oldTaxAmount;
	}

	public void setOldTaxAmount(Double oldTaxAmount) {
		this.oldTaxAmount = oldTaxAmount;
	}

	public Double getOldTaxRate() {
		return oldTaxRate;
	}

	public void setOldTaxRate(Double oldTaxRate) {
		this.oldTaxRate = oldTaxRate;
	}

	public Double getNewCostAmount() {
		return newCostAmount;
	}

	public void setNewCostAmount(Double newCostAmount) {
		this.newCostAmount = newCostAmount;
	}

	public Double getNewTaxAmount() {
		return newTaxAmount;
	}

	public void setNewTaxAmount(Double newTaxAmount) {
		this.newTaxAmount = newTaxAmount;
	}

	public Double getNewTaxRate() {
		return newTaxRate;
	}

	public void setNewTaxRate(Double newTaxRate) {
		this.newTaxRate = newTaxRate;
	}

	public String getDealingsNumId() {
		return dealingsNumId;
	}

	public void setDealingsNumId(String dealingsNumId) {
		this.dealingsNumId = dealingsNumId;
	}


}
