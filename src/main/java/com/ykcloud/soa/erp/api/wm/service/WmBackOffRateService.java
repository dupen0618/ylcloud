package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.BackOffRateGetRequest;
import com.ykcloud.soa.erp.api.wm.response.BackOffRateGetResponse;

/**
 * @Description: 倒扣率
 * @Author: ALi
 * @Date: 2018/4/18 16:00
 */
public interface WmBackOffRateService {
    //查询倒扣率
    public BackOffRateGetResponse getBackOffRate(BackOffRateGetRequest request);
}
