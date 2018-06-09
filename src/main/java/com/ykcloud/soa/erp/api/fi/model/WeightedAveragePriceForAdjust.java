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

}
