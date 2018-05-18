/**
 * 
 */
package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * @author 殷剑
 *
 */
public class FiBatchAccountGaRequest extends AbstractRequest {

	private static final long serialVersionUID = 992352310762556502L;
	
    private String batchSeries;
	
	private Double adjustAmount;
	
	private Double adjustTaxAmount;

	public String getBatchSeries() {
		return batchSeries;
	}

	public void setBatchSeries(String batchSeries) {
		this.batchSeries = batchSeries;
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

}
