package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.GoodsByBarcodeGetRequest;
import com.ykcloud.soa.erp.api.wm.response.GoodsByBarcodeGetResponse;

//入库服务
public interface WmInboundService {

	//通过条码获取商品信息
	public GoodsByBarcodeGetResponse getGoodsInfoByBarcode(GoodsByBarcodeGetRequest request);

}
