package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.UsableInventoryGetByReservedNoRequest;
import com.ykcloud.soa.erp.api.wm.response.EffectRowsResponse;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by yiako on 2018/4/2
 */
public interface WmUsableInventoryService {
    EffectRowsResponse usableInventoryGetByReservedNo(UsableInventoryGetByReservedNoRequest request) throws InvocationTargetException, IllegalAccessException;
}