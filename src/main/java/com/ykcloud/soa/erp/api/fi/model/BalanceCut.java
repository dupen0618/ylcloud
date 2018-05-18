package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @Description:获取可结算扣款项明细
 * @author ali
 * @Date 2018年4月4日 下午6:04:35
 */
public class BalanceCut implements Serializable {

	private static final long serialVersionUID = 1L;
	private String series; // 行号
	private Long subUnitNumId; // 门店 分库标识
	private String unitName;//门店名称
	private String reservedNo; // 单据编号 fi_bl_sup_cut_hdr
	private Long typeNumId; // 业务类型 fi_bl_sup_cut_hdr
	private String typeName; // 业务类型名字
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date operatDate; // 业务日期
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date orderDate; // 业务日期
	private Long cutItem; // 扣款项目
	private String kxName; // 扣款项目名称
	private String cutDesc; // 扣款说明
	private Double cutAmount; // 扣款金额
	private Double taxRate; // 税率
	private Double taxAmount; // 税金
	private Long carrySign; // 结转标识
	private Long dataSign;
	private Long tenantNumId;	// 租户编号
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public Long getSubUnitNumId() {
		return subUnitNumId;
	}
	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
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

	public Long getDataSign() {
		return dataSign;
	}

	public void setDataSign(Long dataSign) {
		this.dataSign = dataSign;
	}

	public Long getTenantNumId() {
		return tenantNumId;
	}

	public void setTenantNumId(Long tenantNumId) {
		this.tenantNumId = tenantNumId;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getKxName() {
		return kxName;
	}

	public void setKxName(String kxName) {
		this.kxName = kxName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
}
