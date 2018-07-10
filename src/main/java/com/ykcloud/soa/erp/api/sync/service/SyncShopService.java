package com.ykcloud.soa.erp.api.sync.service;


import com.ykcloud.soa.erp.api.sync.request.SyncSubUnitImportRequest;
import com.ykcloud.soa.erp.api.sync.response.SyncSubUnitImportResponse;

public interface SyncShopService {

	SyncSubUnitImportResponse syncSubUnit(SyncSubUnitImportRequest request);
}
