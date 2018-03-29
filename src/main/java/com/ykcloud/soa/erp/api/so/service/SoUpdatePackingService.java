package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.SoUpdatePackingRequest;
import com.ykcloud.soa.erp.api.so.response.SoUpdatePackingResponse;

public interface SoUpdatePackingService {

	public SoUpdatePackingResponse updateSoPackingDtl(SoUpdatePackingRequest request);
}
