package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.SdBlSoTmlUpRequest;
import com.ykcloud.soa.erp.api.so.response.SdBlSoTmlUpResponse;

//客户订单库相关服务
public interface SoCustomerOrderService {


    //小票入业务库存账
    SdBlSoTmlUpResponse upSdBlSoTml(SdBlSoTmlUpRequest request);

}
