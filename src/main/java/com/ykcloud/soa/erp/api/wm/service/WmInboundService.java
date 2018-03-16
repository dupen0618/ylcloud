package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.GoodsByBarcodeGetRequest;
import com.ykcloud.soa.erp.api.wm.response.GoodsByBarcodeGetResponse;

//入库服务
public interface WmInboundService {

	public GoodsByBarcodeGetResponse getGoodsInfoByBarcode(GoodsByBarcodeGetRequest request);
}
