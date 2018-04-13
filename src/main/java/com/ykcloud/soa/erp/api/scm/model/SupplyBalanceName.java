package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

/**
 * @Description:根据门店选择当前可结算的供应商
 * @author Song
 * @Date 2018年4月4日 下午1:22:19
 */
public class SupplyBalanceName implements Serializable {

	private static final long serialVersionUID = 1L;
	//供应商名称
	private String unitName;
	//供应商id
	private long unitNumId;
	
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public long getUnitNumId() {
		return unitNumId;
	}
	public void setUnitNumId(long unitNumId) {
		this.unitNumId = unitNumId;
	}
	
	
}
