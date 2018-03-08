package com.ykcloud.soa.erp.api.md.service;

import com.ykcloud.soa.erp.api.md.request.HeadSubUnitNumIdGetRequest;
import com.ykcloud.soa.erp.api.md.response.HeadSubUnitNumIdGetRequestRespone;

/**
 * Created by yiako on 2018/3/8
 */
public interface MdShopService {
    public HeadSubUnitNumIdGetRequestRespone getHeadSubUnitNumId(HeadSubUnitNumIdGetRequest request);
}
