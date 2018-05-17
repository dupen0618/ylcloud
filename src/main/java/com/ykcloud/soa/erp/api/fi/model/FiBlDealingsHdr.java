package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;


/**
 * @author tz.x
 * @date 2018年5月17日上午10:50:50
 */
public class FiBlDealingsHdr implements Serializable {

	private static final long serialVersionUID = -3876586394618921453L;
	
	/**
	 * 单据编号
	 */
	private String dealingsNumId;
	
	/**
	 * 门店号
	 */
	private Long subUnitNumId;
	
	/**
	 * 供应商
	 */
	private Long unitNumId;
	
	/**
	 * 业务单据编号
	 */
	private String businessNumId;
	
	/**
	 * 业务单据类型
	 */
	private Long businessTypeNumId;
	
	/**
	 * 业务员
	 */
	private String salesman;
	
	/**
	 * 调整原因
	 */
	private String reason;
	
	/**
	 * 0:未审核 1：已审核
	 */
	private Long statusNumId;
	
	/**
	 * 0: 手工输入 1： 自动计算
	 */
	private Long soFromType;

	public String getDealingsNumId() {
		return dealingsNumId;
	}

	public void setDealingsNumId(String dealingsNumId) {
		this.dealingsNumId = dealingsNumId;
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

	public String getBusinessNumId() {
		return businessNumId;
	}

	public void setBusinessNumId(String businessNumId) {
		this.businessNumId = businessNumId;
	}

	public Long getBusinessTypeNumId() {
		return businessTypeNumId;
	}

	public void setBusinessTypeNumId(Long businessTypeNumId) {
		this.businessTypeNumId = businessTypeNumId;
	}

	public String getSalesman() {
		return salesman;
	}

	public void setSalesman(String salesman) {
		this.salesman = salesman;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Long getStatusNumId() {
		return statusNumId;
	}

	public void setStatusNumId(Long statusNumId) {
		this.statusNumId = statusNumId;
	}

	public Long getSoFromType() {
		return soFromType;
	}

	public void setSoFromType(Long soFromType) {
		this.soFromType = soFromType;
	}

}
