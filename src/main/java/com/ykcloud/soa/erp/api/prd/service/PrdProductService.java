package com.ykcloud.soa.erp.api.prd.service;

import com.ykcloud.soa.erp.api.prd.request.ProductInfoBySubUnitNumIdGetRequest;
import com.ykcloud.soa.erp.api.prd.response.ProductInfoBySubUnitNumIdGetRespone;

/**
 * Created by yiako on 2018/3/10
 */
public interface PrdProductService {
 public ProductInfoBySubUnitNumIdGetRespone getProductInfoBySubUnitNumId(ProductInfoBySubUnitNumIdGetRequest request);

}
