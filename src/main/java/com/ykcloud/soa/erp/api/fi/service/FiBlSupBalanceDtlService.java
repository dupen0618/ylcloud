package com.ykcloud.soa.erp.api.fi.service;

import java.util.List;

import com.ykcloud.soa.erp.api.fi.model.FiBlSupBalanceDtl;

public interface FiBlSupBalanceDtlService {


	List<FiBlSupBalanceDtl> getFiBlSupBalanceDtlByBalanceNo(Long dataSign, Long balanceNo);
		
	
}
