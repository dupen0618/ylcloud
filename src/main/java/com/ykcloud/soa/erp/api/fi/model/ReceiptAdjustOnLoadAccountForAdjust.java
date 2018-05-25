package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;

/**
 * @author tz.x
 * @date 2018年5月16日下午12:01:29
 */
public class ReceiptAdjustOnLoadAccountForAdjust implements Serializable {

	private static final long serialVersionUID = 7985515599920330035L;
	
	/**
	 * 批次行号
	 */
	private String series;
	
	/**
	 * 差额
	 */
	private Double diffAmount;
	
	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Double getDiffAmount() {
		return diffAmount;
	}

	public void setDiffAmount(Double diffAmount) {
		this.diffAmount = diffAmount;
	}

}
