package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmBlShipHdrRequest;
import com.ykcloud.soa.erp.api.wm.response.WmBlShipHdrResponse;

/**
 * @Author Hewei
 * @Date 2018/5/23 14:35
 */
public interface WmBlShipHdrService {

    WmBlShipHdrResponse fetchWmBlShipHdrProperty(WmBlShipHdrRequest request);
}
