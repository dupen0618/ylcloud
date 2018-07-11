package com.ykcloud.soa.erp.api.sync.service;


import com.ykcloud.soa.erp.api.sync.request.SupplyContractSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.SupplyUnitModifySyncRequest;
import com.ykcloud.soa.erp.api.sync.response.SupplyContractSyncResponse;
import com.ykcloud.soa.erp.api.sync.response.SupplyUnitModifySyncResponse;

public interface SyncUnitService {
    SupplyUnitModifySyncResponse syncModifySupplyUnit(SupplyUnitModifySyncRequest request);
    SupplyContractSyncResponse syncSupplyContract(SupplyContractSyncRequest request);
}
