package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.GoodsByBarcodeGetRequest;
import com.ykcloud.soa.erp.api.so.response.GoodsByBarcodeGetResponse;

public interface SoMaintanceService {

	// 按条码获取商品
	public GoodsByBarcodeGetResponse getGoodsInfoByBarcode(GoodsByBarcodeGetRequest request);

}
