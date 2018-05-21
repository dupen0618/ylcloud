package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.FiAccountantcycRequest;
import com.ykcloud.soa.erp.api.fi.response.FiAccountantcycResponse;

import java.util.List;

public interface FiAccountantcycService {
    //查询当前会计年月
    FiAccountantcycResponse getFiaccountantcycBysubUnitNumId(FiAccountantcycRequest request);

    //获取下一个会计日期

    FiAccountantcycResponse getNextFiaccountantcycBysubUnitNumId(FiAccountantcycRequest request);
}
