package com.ykcloud.soa.erp.api.scm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SupplyContractAuditRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8054081068925132144L;
	
	private Long batchNo;

	public Long getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(Long batchNo) {
		this.batchNo = batchNo;
	} 

}
