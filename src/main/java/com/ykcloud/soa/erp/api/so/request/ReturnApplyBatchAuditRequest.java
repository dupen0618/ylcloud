package com.ykcloud.soa.erp.api.so.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.so.model.AuditReturnApply;
//退货申请主管批量审核入参
public class ReturnApplyBatchAuditRequest extends AbstractUserSessionRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull(message="门店编号不能为空")
	private Long subUnitNumId;  //门店编号
	
	private List<AuditReturnApply> auditReturnApplyList; //退货审批单

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public List<AuditReturnApply> getAuditReturnApplyList() {
		return auditReturnApplyList;
	}

	public void setAuditReturnApplyList(List<AuditReturnApply> auditReturnApplyList) {
		this.auditReturnApplyList = auditReturnApplyList;
	}
	
	
	

}
