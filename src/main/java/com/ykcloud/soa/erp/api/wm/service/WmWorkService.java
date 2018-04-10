package com.ykcloud.soa.erp.api.wm.service;
/**
 * 
 * @author fakir.jiang
 *
 */

import com.ykcloud.soa.erp.api.wm.request.ProductInfoAndStockGetRequest;
import com.ykcloud.soa.erp.api.wm.response.ProductInfoAndStockGetResponse;

public interface WmWorkService {
	//获取商品信息+商品库存信息
	public ProductInfoAndStockGetResponse getProductInfoAndStock(ProductInfoAndStockGetRequest request);

}
