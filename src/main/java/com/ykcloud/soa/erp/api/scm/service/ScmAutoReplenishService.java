package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.GoodsByBarcodeGetRequest;
import com.ykcloud.soa.erp.api.scm.response.GoodsByBarcodeGetResponse;

public interface ScmAutoReplenishService {

	//按条码获取商品
	public GoodsByBarcodeGetResponse getGoodsInfoByBarcode(GoodsByBarcodeGetRequest request);

}
