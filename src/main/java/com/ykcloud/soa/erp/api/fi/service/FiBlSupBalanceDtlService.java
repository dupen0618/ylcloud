package com.ykcloud.soa.erp.api.fi.service;

import java.util.List;

import com.ykcloud.soa.erp.api.fi.model.FiBlSupBalanceDtl;
import com.ykcloud.soa.erp.api.fi.request.FiBlSupBalanceDtlByBalanceNoRequest;
import com.ykcloud.soa.erp.api.fi.response.FiBlSupBalanceDtlByBalanceNoResponse;

public interface FiBlSupBalanceDtlService {


	/*List<FiBlSupBalanceDtl> getFiBlSupBalanceDtlByBalanceNo(Long tenantNumId, Long dataSign, Long balanceNo);
	*/
	FiBlSupBalanceDtlByBalanceNoResponse getFiBlSupBalanceDtlByBalanceNo(FiBlSupBalanceDtlByBalanceNoRequest request);

    List<FiBlSupBalanceDtl> selectList(Long tenantNumId, Long dataSign, Long subUnitNumId, String reservedNo);
}
