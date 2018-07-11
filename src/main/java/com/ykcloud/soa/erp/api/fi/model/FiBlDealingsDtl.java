package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * 
 * @author tz.x
 * @date 2018年5月17日上午11:41:42
 */
public class FiBlDealingsDtl implements Serializable {

	private static final long serialVersionUID = -166334049504370098L;
	
	/**
	 * 结算日期
	 */
	private Date balanceDate;
	
	/**
	 * 结算方式编码1购销 2代销 3联销
	 */
	private Long settlementType;
	
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

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getDealingsNumId() {
		return dealingsNumId;
	}

	public void setDealingsNumId(String dealingsNumId) {
		this.dealingsNumId = dealingsNumId;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof FiBlDealingsDtl)) {
			return false;
		}
		FiBlDealingsDtl that = (FiBlDealingsDtl) o;
		return Objects.equals(balanceDate, that.balanceDate) && Objects.equals(settlementType, that.settlementType)
				&& Objects.equals(ptyNum3, that.ptyNum3) && Objects.equals(oldCostAmount, that.oldCostAmount)
				&& Objects.equals(oldTaxAmount, that.oldTaxAmount) && Objects.equals(oldTaxRate, that.oldTaxRate)
				&& Objects.equals(newCostAmount, that.newCostAmount) && Objects.equals(newTaxAmount, that.newTaxAmount)
				&& Objects.equals(newTaxRate, that.newTaxRate) && Objects.equals(dealingsNumId, that.dealingsNumId);
	}

	@Override
	public int hashCode() {

		return Objects.hash(balanceDate, settlementType, ptyNum3, dealingsNumId);
	}
}
