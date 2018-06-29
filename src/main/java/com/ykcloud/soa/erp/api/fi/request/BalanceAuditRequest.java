package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.AuditBalanceHdr;

import java.util.List;

/**
 * @Description:付款审核 结算单审核
 * @author Song
 * @Date 2018年4月4日 下午5:21:38
 */
public class BalanceAuditRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = -1766553622327456524L;
	private List<AuditBalanceHdr> auditBalanceHdrs ;
	public List<AuditBalanceHdr> getAuditBalanceHdrs() {
		return auditBalanceHdrs;
	}

	public void setAuditBalanceHdrs(List<AuditBalanceHdr> auditBalanceHdrs) {
		this.auditBalanceHdrs = auditBalanceHdrs;
	}

}
