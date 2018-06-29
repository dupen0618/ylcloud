package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tz.x
 * @date 2018年5月16日下午5:06:43
 */
public class WeightedAveragePriceForAdjust implements Serializable {
	
	private static final long serialVersionUID = 4986431171381360135L;
	
	/**
	 * 单据号
	 */
	private String reservedNo;
	
	/**
	 * 行号
	 */
	private String series;
	
	/**
	 * 业务类型
	 */
	private Long typeNumId;
	
	/**
	 * 调整日期
	 */
	private Date justDate;

	/**
	 * 商品编号
	 */
	private Long itemNumId;
	
	/**
	 * 物理仓库
	 */
	private Long physicalNumId;
	
	/**
	 * 调整金额
	 */
	private Double adjustAmount;
	
	/**
	 * 税率
	 */
	private Double taxRate;
	/**
	 * 数量
	 */
	private Double qty;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Date getJustDate() {
		return justDate;
	}

	public void setJustDate(Date justDate) {
		this.justDate = justDate;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public Double getAdjustAmount() {
		return adjustAmount;
	}

	public void setAdjustAmount(Double adjustAmount) {
		this.adjustAmount = adjustAmount;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}

	/**
	 * 获取 qty
	 *
	 * @author Sealin
	 */
	public Double getQty() {
		return qty;
	}

	/**
	 * 设置 qty
	 *
	 * @author Sealin
	 */
	public void setQty(Double qty) {
		this.qty = qty;
	}
}
