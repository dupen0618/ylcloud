package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

/**
 * @Description:供应商结算所需要供应商名称
 * @author Song
 * @Date 2018年4月2日 下午5:51:46
 */
public class SupplyBalance implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	private String unitName;//供应商名称
	
	private Long supplyUnitNumId;//供应商编号

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}	
	
}
