package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品成本金额调整明细
 * @author tz.x
 * @date 2018年5月16日下午8:40:09
 */
public class CostAmountAndTaxAmountForAdjust implements Serializable {

	private static final long serialVersionUID = -575132236301604824L;
	
	/**
	 * 门店
	 */
	private Long subUnitNumId;
	
	/**
	 * 商品编号
	 */
	private Long itemNumId;
	
	/**
	 * 物理仓库
	 */
	private Long physicalNumId;
	
	/**
	 * 批次发生日期
	 */
	private Date orderDate;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
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

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

}
