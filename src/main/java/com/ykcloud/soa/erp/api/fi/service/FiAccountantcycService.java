package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.FiAccountantcycRequest;
import com.ykcloud.soa.erp.api.fi.response.FiAccountantcycResponse;

import java.util.List;

public interface FiAccountantcycService {
    public FiAccountantcycResponse getFiaccountantcycBysubUnitNumId(FiAccountantcycRequest request);
}
