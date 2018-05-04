package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @Description:获取可结算扣款项明细
 * @author Song
 * @Date 2018年4月4日 下午6:04:35
 */
public class Deduction implements Serializable {

	private static final long serialVersionUID = 1L;
	private String series; // 行号
	private Long tenantNumId; // 租户编号
	private Long dataSign; // 0: 正式 1：测试
	private Date createDtme; // 创建时间
	private Date lastUpdtme; // 最后更新时间
	private Long createUserId; // 创建用户
	private Long lastUpdateUserId;// 更新用户
	private String balanceNo; // 结算单号 组合唯一索引
	private Long subUnitNumId; // 门店 分库标识
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date balanceDate; // 结算日期 分表标识
	
	private String reservedNo; // 单据编号 fi_bl_sup_cut_hdr
	private Long typeNumId; // 业务类型 fi_bl_sup_cut_hdr
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date operatDate; // 业务日期
	
	private Long cutItem; // 扣款项目
	private String cutDesc; // 扣款说明
	private Double cutAmount; // 扣款金额
	private Double taxRate; // 税率
	private Double taxAmount; // 税金
	private Long carrySign; // 结转标识
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
	public String getReservedNo() {
		return reservedNo;
	}
	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
	public Long getTypeNumId() {
		return typeNumId;
	}
	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}
	public Date getOperatDate() {
		return operatDate;
	}
	public void setOperatDate(Date operatDate) {
		this.operatDate = operatDate;
	}
	public Long getCutItem() {
		return cutItem;
	}
	public void setCutItem(Long cutItem) {
		this.cutItem = cutItem;
	}
	public String getCutDesc() {
		return cutDesc;
	}
	public void setCutDesc(String cutDesc) {
		this.cutDesc = cutDesc;
	}
	public Double getCutAmount() {
		return cutAmount;
	}
	public void setCutAmount(Double cutAmount) {
		this.cutAmount = cutAmount;
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
	public Long getCarrySign() {
		return carrySign;
	}
	public void setCarrySign(Long carrySign) {
		this.carrySign = carrySign;
	}

	
}
