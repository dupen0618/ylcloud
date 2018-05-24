package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmBlShipDtlRequest;
import com.ykcloud.soa.erp.api.wm.response.WmBlShipDtlResponse;

/**
 * @Author Hewei
 * @Date 2018/5/23 14:35
 */
public interface WmBlShipDtlService {

    WmBlShipDtlResponse fetchWmBlShipDtlProperty(WmBlShipDtlRequest request);
}
