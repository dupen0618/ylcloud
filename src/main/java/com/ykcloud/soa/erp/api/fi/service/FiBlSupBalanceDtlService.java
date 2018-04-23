package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.FiBlSupBalanceDtlByBalanceNoRequest;
import com.ykcloud.soa.erp.api.fi.response.FiBlSupBalanceDtlByBalanceNoResponse;

public interface FiBlSupBalanceDtlService {


	/*List<FiBlSupBalanceDtl> getFiBlSupBalanceDtlByBalanceNo(Long tenantNumId, Long dataSign, Long balanceNo);
	*/	
	FiBlSupBalanceDtlByBalanceNoResponse getFiBlSupBalanceDtlByBalanceNo(FiBlSupBalanceDtlByBalanceNoRequest request);
}
