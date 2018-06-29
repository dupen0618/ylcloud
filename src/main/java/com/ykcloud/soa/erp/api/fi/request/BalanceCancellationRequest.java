package com.ykcloud.soa.erp.api.fi.request;


import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.AuditBalanceHdr;

import javax.validation.constraints.NotNull;
import java.util.List;

 /**
  * @author alfred.liu
  * @date 2018/6/26 14:44
  * @description 结算单作废
  */
public class BalanceCancellationRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = -1766553622327456524L;
	private List<AuditBalanceHdr> auditBalanceHdrs ;

	public List<AuditBalanceHdr> getAuditBalanceHdrs() {
		return auditBalanceHdrs;
	}

	public void setAuditBalanceHdrs(List<AuditBalanceHdr> auditBalanceHdrs) {
		this.auditBalanceHdrs = auditBalanceHdrs;
	}
}
