package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.LastMoveWeightingCostPriceGetRequest;
import com.ykcloud.soa.erp.api.fi.response.LastMoveWeightingCostPriceGetResponse;

public interface FiQueryService {
     //取最新移动加权成本
	public LastMoveWeightingCostPriceGetResponse getLastMoveWeightingCostPrice(LastMoveWeightingCostPriceGetRequest request);
}
