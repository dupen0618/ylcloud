/**
 * 
 */
package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * @author 殷剑
 *
 */
public class WmBlBatchDtlQuest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1001265722329349228L;
	
	/**
	 * id
	 */
	String series;
	
	/**
	 * 批次id
	 */
	String batchSeries;

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getBatchSeries() {
		return batchSeries;
	}

	public void setBatchSeries(String batchSeries) {
		this.batchSeries = batchSeries;
	}
	
	
}
