package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.ProductPurchasePriceGetRequest;
import com.ykcloud.soa.erp.api.scm.response.ProductPurchasePriceGetResponse;

public interface ScmBaseService {
    public ProductPurchasePriceGetResponse getProductPurchasePrice(ProductPurchasePriceGetRequest request);
}
