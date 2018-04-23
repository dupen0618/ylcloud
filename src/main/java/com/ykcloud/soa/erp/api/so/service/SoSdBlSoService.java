package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.model.SdBlSoHdrAndSdBlSoDtl;
import com.ykcloud.soa.erp.api.wm.request.UsableInventoryByReservedNoGetRequest;

import java.util.List;

public interface SoSdBlSoService {

    List<SdBlSoHdrAndSdBlSoDtl> getSdBlSoHdrAndSdBlSoDtlBysoNumId(UsableInventoryByReservedNoGetRequest request);
}
