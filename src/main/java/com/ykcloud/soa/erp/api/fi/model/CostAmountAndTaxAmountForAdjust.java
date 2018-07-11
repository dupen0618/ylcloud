package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * 商品成本金额调整明细
 * @author tz.x
 * @date 2018年5月16日下午8:40:09
 */
public class CostAmountAndTaxAmountForAdjust implements Serializable {

	private static final long serialVersionUID = -575132236301604824L;
	
	/**
	 * 调整金额
	 */
	private Double adjustAmount;
	
	/**
	 * 整税金
	 */
	private Double adjustTaxAmount;
	
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


	public Double getAdjustAmount() {
		return adjustAmount;
	}

	public void setAdjustAmount(Double adjustAmount) {
		this.adjustAmount = adjustAmount;
	}

	public Double getAdjustTaxAmount() {
		return adjustTaxAmount;
	}

	public void setAdjustTaxAmount(Double adjustTaxAmount) {
		this.adjustTaxAmount = adjustTaxAmount;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof CostAmountAndTaxAmountForAdjust)) {
			return false;
		}
		CostAmountAndTaxAmountForAdjust that = (CostAmountAndTaxAmountForAdjust) o;
		return Objects.equals(itemNumId, that.itemNumId) && Objects.equals(physicalNumId, that.physicalNumId)
				&& Objects.equals(orderDate, that.orderDate);
	}

	@Override
	public int hashCode() {

		return Objects.hash(itemNumId, physicalNumId, orderDate);
	}
}
