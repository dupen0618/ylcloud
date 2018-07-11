package com.ykcloud.soa.erp.api.sync.service;


import com.ykcloud.soa.erp.api.sync.request.SubUnitSyncRequest;
import com.ykcloud.soa.erp.api.sync.response.SubUnitSyncResponse;

public interface SyncShopService {

	SubUnitSyncResponse syncSubUnit(SubUnitSyncRequest request);

}
