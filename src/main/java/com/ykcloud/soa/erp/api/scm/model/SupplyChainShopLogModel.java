package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 单据审核价格流水实体
 * 
 * @author bi.cai
 * @date 2018年02月09日 上午10:12:21
 */
public class SupplyChainShopLogModel implements Serializable {

	private static final long serialVersionUID = -6445347891259303182L;

	// 行号
	private String series;
	// 商品主键
	private Long itemNumId;
	// 门店编码
	private Long subUnitNumId = 0L;

	// 线上门店编号
	private Long ecShopNumId = 0L;
	// 零售价
	private Double retailPrice = 0.0;
	// 执行售价
	private Double price = 0.0;
	// 单据号
	private Long reservedNo;
	// 单据类型
	private Long typeNumId;
	// 价格开始时间
	private Date beginDay;
	// 价格结束时间
	private Date endDay;
	// 租户编号
	private Long tenantNumId;
	// 0: 正式 1：测试
	private Long dataSign;
	// 创建用户
	private Long createUserId;
	// 更新用户
	private Long lastUpdateUserId;

	// 是否同步线上 0否 1是
	private Integer isToEcShop;

	public Long getEcShopNumId() {
		return ecShopNumId;
	}

	public void setEcShopNumId(Long ecShopNumId) {
		this.ecShopNumId = ecShopNumId;
	}

	public Integer getIsToEcShop() {
		return isToEcShop;
	}

	public void setIsToEcShop(Integer isToEcShop) {
		this.isToEcShop = isToEcShop;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(Long reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Date getBeginDay() {
		return beginDay;
	}

	public void setBeginDay(Date beginDay) {
		this.beginDay = beginDay;
	}

	public Date getEndDay() {
		return endDay;
	}

	public void setEndDay(Date endDay) {
		this.endDay = endDay;
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

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}
}
