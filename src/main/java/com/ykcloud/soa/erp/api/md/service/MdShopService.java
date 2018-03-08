package com.ykcloud.soa.erp.api.md.service;

import com.ykcloud.soa.erp.api.md.request.MdShopRequest;
import com.ykcloud.soa.erp.api.md.response.MdShopRespone;

/**
 * Created by yiako on 2018/3/8
 */
public interface MdShopService {
    public MdShopRespone getHeadSubUnitNumId(MdShopRequest request);
}
