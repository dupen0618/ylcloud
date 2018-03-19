package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ApprovalDtlForGenerateDirectWayDistributionSo;

public class ApprovalDtlsForGenerateDirectWayDistributionSoGetResponse extends MessagePack {

	private static final long serialVersionUID = -3621634900229807547L;
	
	List<ApprovalDtlForGenerateDirectWayDistributionSo> approvalDtls;

	public List<ApprovalDtlForGenerateDirectWayDistributionSo> getApprovalDtls() {
		return approvalDtls;
	}

	public void setApprovalDtls(List<ApprovalDtlForGenerateDirectWayDistributionSo> approvalDtls) {
		this.approvalDtls = approvalDtls;
	}
	

}
