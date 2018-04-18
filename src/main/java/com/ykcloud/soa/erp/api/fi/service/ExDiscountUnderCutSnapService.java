package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.DiscountUnderCutSnapGetRequest;
import com.ykcloud.soa.erp.api.fi.response.DiscountUnderCutSnapGetResponse;

/**
 * @Description: 折扣倒扣率
 * @Author: ALi
 * @Date: 2018/4/18 13:42
 */
public interface ExDiscountUnderCutSnapService {
    public DiscountUnderCutSnapGetResponse getDiscountUnderCutSnap(DiscountUnderCutSnapGetRequest request);
}
