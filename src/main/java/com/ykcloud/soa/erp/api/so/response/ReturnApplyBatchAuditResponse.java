package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.AuditReturnApplyResult;

public class ReturnApplyBatchAuditResponse extends MessagePack {

	private static final long serialVersionUID = 1L;
	
	private List<AuditReturnApplyResult> auditReturnApplyResults;

	public List<AuditReturnApplyResult> getAuditReturnApplyResults() {
		return auditReturnApplyResults;
	}

	public void setAuditReturnApplyResults(List<AuditReturnApplyResult> auditReturnApplyResults) {
		this.auditReturnApplyResults = auditReturnApplyResults;
	}
	
	

}
