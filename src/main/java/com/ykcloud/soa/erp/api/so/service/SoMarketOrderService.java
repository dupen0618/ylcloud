package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.SdBlSoHdrGetReservedQtyRequest;
import com.ykcloud.soa.erp.api.so.response.SdBlSoHdrGetReservedQtyResponse;

/**
 * Created by yiako on 2018/4/9
 */
public interface SoMarketOrderService {
    //获取销售订单
    public SdBlSoHdrGetReservedQtyResponse getSdBlSoHdrBySoNumId(SdBlSoHdrGetReservedQtyRequest request);
}
