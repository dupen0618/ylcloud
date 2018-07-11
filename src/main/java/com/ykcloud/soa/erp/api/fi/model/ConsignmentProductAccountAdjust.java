package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author tz.x
 * @date 2018年5月17日下午4:34:00
 */
public class ConsignmentProductAccountAdjust implements Serializable {

	private static final long serialVersionUID = 7386327234710466198L;
	
	/**
	 * 商品编号
	 */
	private Long itemNumId;
	
	/**
	 * 供应商
	 */
	private Long supplyUnitNumId;
	
	/**
	 * 调整金额
	 */
	private Double adjustAmount;
	
	/**
	 * 调整税金
	 */
	private Double adjustTaxAmount;

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ConsignmentProductAccountAdjust)) {
			return false;
		}
		ConsignmentProductAccountAdjust that = (ConsignmentProductAccountAdjust) o;
		return Objects.equals(itemNumId, that.itemNumId) && Objects.equals(supplyUnitNumId, that.supplyUnitNumId);
	}

	@Override
	public int hashCode() {

		return Objects.hash(itemNumId, supplyUnitNumId);
	}
}
