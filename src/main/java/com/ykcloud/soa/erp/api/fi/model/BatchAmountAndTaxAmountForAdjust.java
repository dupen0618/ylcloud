package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;

/**
 * @author tz.x
 * @date 2018年5月16日下午12:01:29
 */
public class BatchAmountAndTaxAmountForAdjust implements Serializable {

	private static final long serialVersionUID = 7985515599920330035L;
	
	/**
	 * 批次行号
	 */
	private String series;
	
	/**
	 * 调整金额
	 */
	private Double adjustAmount;
	
	/**
	 * 调整税金
	 */
	private Double adjustTaxAmount;
	
	/**
	 * 门店编号
	 */
    private Long subUnitNumId;

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
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

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

}
