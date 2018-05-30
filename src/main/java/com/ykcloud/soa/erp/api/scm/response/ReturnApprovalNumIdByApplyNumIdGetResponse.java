package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
//根据退货申请单查询退货审批单
public class ReturnApprovalNumIdByApplyNumIdGetResponse extends MessagePack {
	private static final long serialVersionUID = 1L;
	
	private String approvalNumId; //审批单号

	public String getApprovalNumId() {
		return approvalNumId;
	}

	public void setApprovalNumId(String approvalNumId) {
		this.approvalNumId = approvalNumId;
	}
	
	

}
