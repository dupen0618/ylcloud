package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author tz.x
 * @date 2018年5月16日下午12:01:29
 */
public class BatchAmountAndTaxAmountForAdjust implements Serializable {
	private static final long serialVersionUID = -8323805671029978682L;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof BatchAmountAndTaxAmountForAdjust)) {
			return false;
		}
		BatchAmountAndTaxAmountForAdjust that = (BatchAmountAndTaxAmountForAdjust) o;
		return Objects.equals(series, that.series);
	}

	@Override
	public int hashCode() {

		return Objects.hash(series);
	}
}
