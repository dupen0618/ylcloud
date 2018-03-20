package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.LastMoveWeightingCostPriceGetRequest;
import com.ykcloud.soa.erp.api.fi.response.LastMoveWeightingCostPriceGetResponse;

/**
* @ClassName: FiCostQueryService.java
* @Description: 取最新移动加权成本服务
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月20日 上午10:02:30 
*/
public interface FiCostQueryService {
	//获取
	LastMoveWeightingCostPriceGetResponse getLastMoveWeightingCostPrice(LastMoveWeightingCostPriceGetRequest request);
}
