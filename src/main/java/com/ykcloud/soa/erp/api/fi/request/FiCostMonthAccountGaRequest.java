/**
 * 
 */
package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * @author 殷剑
 *
 */
public class FiCostMonthAccountGaRequest extends AbstractRequest {

	private static final long serialVersionUID = 8018591854632448731L;
	
	private String SERIES;
	private String ADJUSTAMOUNT;
	public String getSERIES() {
		return SERIES;
	}
	public void setSERIES(String sERIES) {
		SERIES = sERIES;
	}
	public String getADJUSTAMOUNT() {
		return ADJUSTAMOUNT;
	}
	public void setADJUSTAMOUNT(String aDJUSTAMOUNT) {
		ADJUSTAMOUNT = aDJUSTAMOUNT;
	}
	
	
}

