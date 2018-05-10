package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.AuditReplenishApplyResult;

public class ReplenishApplyBatchAuditResponse extends MessagePack {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<AuditReplenishApplyResult> auditReplenishApplyResults;

	public List<AuditReplenishApplyResult> getAuditReplenishApplyResults() {
		return auditReplenishApplyResults;
	}

	public void setAuditReplenishApplyResults(List<AuditReplenishApplyResult> auditReplenishApplyResults) {
		this.auditReplenishApplyResults = auditReplenishApplyResults;
	}
	
	

}
