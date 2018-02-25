package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.GoodsByBarcodeGetRequest;
import com.ykcloud.soa.erp.api.fi.response.GoodsByBarcodeGetResponse;

public interface FiXXXService {

	//通过条码获取商品信息
	public GoodsByBarcodeGetResponse getGoodsInfoByBarcode(GoodsByBarcodeGetRequest request);
	
}
