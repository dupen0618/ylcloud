package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.DirectWayDistributionSoGenerateRequest;
import com.ykcloud.soa.erp.api.so.request.GoodsByBarcodeGetRequest;
import com.ykcloud.soa.erp.api.so.response.DirectWayDistributionSoGenerateResponse;
import com.ykcloud.soa.erp.api.so.response.GoodsByBarcodeGetResponse;

public interface SoMaintanceService {

	// 按条码获取商品
	public GoodsByBarcodeGetResponse getGoodsInfoByBarcode(GoodsByBarcodeGetRequest request);
	
	//待实现
	//直通收货按验收单及订货审批单产生分拨单
	//public DirectWayDistributionSoGenerateResponse  generateDirectWayDistributionSo(DirectWayDistributionSoGenerateRequest request);

}
