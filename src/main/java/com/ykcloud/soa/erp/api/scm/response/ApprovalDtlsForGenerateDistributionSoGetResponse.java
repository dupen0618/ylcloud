package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;
import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ApprovalDtlForGenerateDistributionSo;

public class ApprovalDtlsForGenerateDistributionSoGetResponse extends MessagePack {

	private static final long serialVersionUID = -3621634900229807547L;

	private List<ApprovalDtlForGenerateDistributionSo> approvalDtls;

	public List<ApprovalDtlForGenerateDistributionSo> getApprovalDtls() {
		return approvalDtls;
	}

	public void setApprovalDtls(List<ApprovalDtlForGenerateDistributionSo> approvalDtls) {
		this.approvalDtls = approvalDtls;
	}
	
	
}
