package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;

/**
 * @author tz.x
 * @date 2018年5月16日下午12:01:29
 */
public class ReceiptAdjustOnLoadAccountForAdjust implements Serializable {

	private static final long serialVersionUID = 7985515599920330035L;
	
	/**
	 * 卖方门店
	 */
	private Long subUnitNumId;
	
	/**
	 * 买房门店
	 */
	private Long custSubUnitNumId;
	
	/**
	 * 供应商
	 */
	private Long supplyUnitNumId;
	
	/**
	 * 差额
	 */
	private Double diffAmount;
	
	/**
	 * 商品编号
	 */
	private Long itemNumId;

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

	public Long getCustSubUnitNumId() {
		return custSubUnitNumId;
	}

	public void setCustSubUnitNumId(Long custSubUnitNumId) {
		this.custSubUnitNumId = custSubUnitNumId;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public Double getDiffAmount() {
		return diffAmount;
	}

	public void setDiffAmount(Double diffAmount) {
		this.diffAmount = diffAmount;
	}

}
