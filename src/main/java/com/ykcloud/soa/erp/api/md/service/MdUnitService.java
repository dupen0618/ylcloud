package com.ykcloud.soa.erp.api.md.service;

import com.ykcloud.soa.erp.api.md.request.SupplyStatusNumIdGetRequest;
import com.ykcloud.soa.erp.api.md.response.SupplyStatusNumIdGetResponse;

public interface MdUnitService {
	public SupplyStatusNumIdGetResponse getSupplyStatusNumId(SupplyStatusNumIdGetRequest Request);
}
