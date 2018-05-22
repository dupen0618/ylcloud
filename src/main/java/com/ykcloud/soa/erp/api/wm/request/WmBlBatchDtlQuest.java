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
	 * 批次id
	 */
	String batchSeries;

	public String getBatchSeries() {
		return batchSeries;
	}

	public void setBatchSeries(String batchSeries) {
		this.batchSeries = batchSeries;
	}	
	
}
