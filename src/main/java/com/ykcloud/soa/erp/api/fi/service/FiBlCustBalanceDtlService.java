package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.model.FiBlCustBalanceDtl;

import java.util.List;

public interface FiBlCustBalanceDtlService {


    //客户结算单
    List<FiBlCustBalanceDtl> selectSupBalanceList(Long tenantNumId, Long dataSign, Long subUnitNumId, String reservedNo);
}
