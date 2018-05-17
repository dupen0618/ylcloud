package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;

/**
 * 
 * @author tz.x
 * @date 2018年5月17日上午11:41:42
 */
public class FiBlDealingsDtl implements Serializable {

	private static final long serialVersionUID = -166334049504370098L;
	
	/**
	 * 结算方式编码1购销 2代销 3联销
	 */
	private Long payTypeId;
	
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

	public String getDealingsNumId() {
		return dealingsNumId;
	}

	public void setDealingsNumId(String dealingsNumId) {
		this.dealingsNumId = dealingsNumId;
	}

	public Long getPayTypeId() {
		return payTypeId;
	}

	public void setPayTypeId(Long payTypeId) {
		this.payTypeId = payTypeId;
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

}
