package com.ykcloud.soa.erp.api.prd.service;

import com.ykcloud.soa.erp.api.prd.request.ProductInfoBySubUnitNumIdAndSupplyUnitNumIdGetRequest;
import com.ykcloud.soa.erp.api.prd.response.ProductInfoBySubUnitNumIdAndSupplyUnitNumIdGitResponse;

/**
 * Created by yiako on 2018/3/9
 */
public interface PrdProductBaseService {
public ProductInfoBySubUnitNumIdAndSupplyUnitNumIdGitResponse getProductInfoBySubUnitNumIdAndSupplyUnitNumId(ProductInfoBySubUnitNumIdAndSupplyUnitNumIdGetRequest request);
}
