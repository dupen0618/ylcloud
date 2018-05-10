package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;
import java.util.List;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.AuditReplenishApply;
//主管批量审核入参
public class ReplenishApplyBatchAuditRequest extends AbstractUserSessionRequest {
	
		private static final long serialVersionUID = 1L;


		private Long subUnitNumId;  //门店编号
		
		
		private List<AuditReplenishApply> auditReplenishApplyList; //补货申请单明细


		public Long getSubUnitNumId() {
			return subUnitNumId;
		}


		public void setSubUnitNumId(Long subUnitNumId) {
			this.subUnitNumId = subUnitNumId;
		}


		public List<AuditReplenishApply> getAuditReplenishApplyList() {
			return auditReplenishApplyList;
		}


		public void setAuditReplenishApplyList(List<AuditReplenishApply> auditReplenishApplyList) {
			this.auditReplenishApplyList = auditReplenishApplyList;
		}
		
		

}
