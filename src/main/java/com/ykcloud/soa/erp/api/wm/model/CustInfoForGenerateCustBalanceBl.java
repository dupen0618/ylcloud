package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 封装了结算客户的信息，用于生成购销客户结算单
 * @author: henry.wang
 * @date: 2018/6/1 10:34
 **/
public class CustInfoForGenerateCustBalanceBl implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long custSubUnitNumId;//结算客户编号
	private Long custUnitNumId;//结算客户业务单元
	private Long subUnitNumId;//结算门店
	private Long unitNumId;//结算门店业务单元

	public Long getCustSubUnitNumId() {
		return custSubUnitNumId;
	}

	public void setCustSubUnitNumId(Long custSubUnitNumId) {
		this.custSubUnitNumId = custSubUnitNumId;
	}

	public Long getCustUnitNumId() {
		return custUnitNumId;
	}

	public void setCustUnitNumId(Long custUnitNumId) {
		this.custUnitNumId = custUnitNumId;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getUnitNumId() {
		return unitNumId;
	}

	public void setUnitNumId(Long unitNumId) {
		this.unitNumId = unitNumId;
	}
}
