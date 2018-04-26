package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

public class FiBlSupBalanceHdr implements Serializable  {
	private static final long serialVersionUID = 1643705694252647524L;

	private String balanceNo;
	private Long subUnitNumId;
	private Date balanceDate;
	private String invoiceNo;
	private Long unitNumId;
	private Long balanceSubUnitNumId;
	private Long divNumId;
	private Long statusNumId;
	private Long soFromType;
	private Long typeNumId;
	private Long currency;
	private String remark;
	private Long carrySign;
	private String series;
	private Long tenantNumId;
	private Long dataSign;
	private Date createDtme;
	private Date lastUpdtme;
	private Long createUserId;
	private Long lastUpdateUserId;
	private String cancelsign;

	public String getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(String balanceNo) {
		this.balanceNo = balanceNo;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public Long getUnitNumId() {
		return unitNumId;
	}

	public void setUnitNumId(Long unitNumId) {
		this.unitNumId = unitNumId;
	}

	public Long getBalanceSubUnitNumId() {
		return balanceSubUnitNumId;
	}

	public void setBalanceSubUnitNumId(Long balanceSubUnitNumId) {
		this.balanceSubUnitNumId = balanceSubUnitNumId;
	}

	public Long getDivNumId() {
		return divNumId;
	}

	public void setDivNumId(Long divNumId) {
		this.divNumId = divNumId;
	}

	public Long getStatusNumId() {
		return statusNumId;
	}

	public void setStatusNumId(Long statusNumId) {
		this.statusNumId = statusNumId;
	}

	public Long getSoFromType() {
		return soFromType;
	}

	public void setSoFromType(Long soFromType) {
		this.soFromType = soFromType;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Long getCurrency() {
		return currency;
	}

	public void setCurrency(Long currency) {
		this.currency = currency;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getCarrySign() {
		return carrySign;
	}

	public void setCarrySign(Long carrySign) {
		this.carrySign = carrySign;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Long getTenantNumId() {
		return tenantNumId;
	}

	public void setTenantNumId(Long tenantNumId) {
		this.tenantNumId = tenantNumId;
	}

	public Long getDataSign() {
		return dataSign;
	}

	public void setDataSign(Long dataSign) {
		this.dataSign = dataSign;
	}

	public Date getCreateDtme() {
		return createDtme;
	}

	public void setCreateDtme(Date createDtme) {
		this.createDtme = createDtme;
	}

	public Date getLastUpdtme() {
		return lastUpdtme;
	}

	public void setLastUpdtme(Date lastUpdtme) {
		this.lastUpdtme = lastUpdtme;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public Long getLastUpdateUserId() {
		return lastUpdateUserId;
	}

	public void setLastUpdateUserId(Long lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
	}

	public String getCancelsign() {
		return cancelsign;
	}

	public void setCancelsign(String cancelsign) {
		this.cancelsign = cancelsign;
	}
}
