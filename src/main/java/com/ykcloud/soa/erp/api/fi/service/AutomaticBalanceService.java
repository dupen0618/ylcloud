package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.AutomaticBalanceRequest;
import com.ykcloud.soa.erp.api.fi.response.AutomaticBalanceResponse;

/**
 * @Description: 自动结算
 * @Author: ALi
 * @Date: 2018/4/23 15:24
 */
public interface AutomaticBalanceService {
    //购销
    public AutomaticBalanceResponse automaticBalanceGX(AutomaticBalanceRequest request);
    //代销
    public AutomaticBalanceResponse automaticBalanceDX(AutomaticBalanceRequest request);
    //联销
    public AutomaticBalanceResponse automaticBalanceLX(AutomaticBalanceRequest request);

}
