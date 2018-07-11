package com.ykcloud.soa.erp.api.sync.service;


import com.ykcloud.soa.erp.api.sync.request.SupplyContractSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.SupplyUnitSyncRequest;
import com.ykcloud.soa.erp.api.sync.response.SupplyContractSyncResponse;
import com.ykcloud.soa.erp.api.sync.response.SupplyUnitSyncResponse;

public interface SyncUnitService {
    SupplyUnitSyncResponse syncSupplyUnit(SupplyUnitSyncRequest request);
    SupplyContractSyncResponse syncSupplyContract(SupplyContractSyncRequest request);
}
