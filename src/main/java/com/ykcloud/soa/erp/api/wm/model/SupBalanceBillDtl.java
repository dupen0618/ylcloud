package com.ykcloud.soa.erp.api.wm.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @author Song
 * @Date 2018年4月17日 下午1:05:21
 */
public class SupBalanceBillDtl implements Serializable {

	private static final long serialVersionUID = 1L;

	//单据编号
	private String reservedNo;

	//发生门店
	private Long balanceSubUnitNumId;
	/**
	 * 发生门店名称
	 */
	private String balanceSubUnitNumIdName;

	/**
	 * 业务日期
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date operatDate;

	/**
	 * 单据类型
	 */
	private Long reservedTypeNumId;
	/**
	 * 单据类型名字
	 */
	private String reservedTypeNumIdName;

	/**
	 * 结算方式
	 */
	private Long settlementType;

	//倒扣率
   private Double	backoffRate;

    //数量
	private Double qty;
	//金额含税
	private Double amount;
	//金额不含税(含税减去税额)
	private Double amountNotRate;
	//税率
	private Double taxRate;
	//税额
	private Double taxAmount;
	//销售金额
	private Double sellAmount;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getBalanceSubUnitNumId() {
		return balanceSubUnitNumId;
	}

	public void setBalanceSubUnitNumId(Long balanceSubUnitNumId) {
		this.balanceSubUnitNumId = balanceSubUnitNumId;
	}

	public String getBalanceSubUnitNumIdName() {
		return balanceSubUnitNumIdName;
	}

	public void setBalanceSubUnitNumIdName(String balanceSubUnitNumIdName) {
		this.balanceSubUnitNumIdName = balanceSubUnitNumIdName;
	}

	public Date getOperatDate() {
		return operatDate;
	}

	public void setOperatDate(Date operatDate) {
		this.operatDate = operatDate;
	}

	public Long getReservedTypeNumId() {
		return reservedTypeNumId;
	}

	public void setReservedTypeNumId(Long reservedTypeNumId) {
		this.reservedTypeNumId = reservedTypeNumId;
	}

	public String getReservedTypeNumIdName() {
		return reservedTypeNumIdName;
	}

	public void setReservedTypeNumIdName(String reservedTypeNumIdName) {
		this.reservedTypeNumIdName = reservedTypeNumIdName;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public Double getBackoffRate() {
		return backoffRate;
	}

	public void setBackoffRate(Double backoffRate) {
		this.backoffRate = backoffRate;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Double getSellAmount() {
		return sellAmount;
	}

	public void setSellAmount(Double sellAmount) {
		this.sellAmount = sellAmount;
	}

	public Double getAmountNotRate() {
		return amountNotRate;
	}

	public void setAmountNotRate(Double amountNotRate) {
		this.amountNotRate = amountNotRate;
	}
}