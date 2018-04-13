package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.UsableInventoryByReservedNoGetRequest;
import com.ykcloud.soa.erp.api.wm.response.AffectRowsResponse;

import com.ykcloud.soa.erp.api.wm.request.WmProcessAccountRequest;

/**
 * Created by yiako on 2018/4/2
 */
public interface WmUsableInventoryService {
    AffectRowsResponse getUsableInventoryByReservedNo(UsableInventoryByReservedNoGetRequest request);
}