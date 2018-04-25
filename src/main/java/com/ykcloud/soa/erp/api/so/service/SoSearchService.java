package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.SupplyNumIdBySubUnitNumIdGetRequest;
import com.ykcloud.soa.erp.api.so.response.SupplyNumIdBySubUnitNumIdGetResponse;

public interface SoSearchService {
	
	//根据查询财务中SD_BL_SO_TML_ITEM_SELLDAILY_HDR中的供应商
	public SupplyNumIdBySubUnitNumIdGetResponse getSupplyNumIdBySubUnitNumId(SupplyNumIdBySubUnitNumIdGetRequest request);


}
