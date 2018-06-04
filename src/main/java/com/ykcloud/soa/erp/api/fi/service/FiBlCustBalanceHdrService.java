package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.model.FiBlCustBalanceHdr;

/**
 * @author Sealin
 * Created on 2018-06-01
 */
public interface FiBlCustBalanceHdrService {    //客户订单
    //客户订单单头
    public FiBlCustBalanceHdr selectCustBalanceHdr(Long tenantNumId, Long dataSign, Long subUnitNumId, String reservedNo);
}
