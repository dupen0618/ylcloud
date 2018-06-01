package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.CustBalanceHdrGenerateRequest;
import com.ykcloud.soa.erp.api.fi.response.CustBalanceHdrGenerateResponse;

/**
 * @author Sealin
 * Created on 2018-06-01
 */
public interface FiBlCustBalanceHdrService {
    CustBalanceHdrGenerateResponse generateCustomerBalanceHeader(CustBalanceHdrGenerateRequest request);
}
