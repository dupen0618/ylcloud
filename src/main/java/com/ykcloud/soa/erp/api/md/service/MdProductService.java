package com.ykcloud.soa.erp.api.md.service;

import com.ykcloud.soa.erp.api.md.request.GoodsByBarcodeGetRequest;
import com.ykcloud.soa.erp.api.md.response.GoodsByBarcodeGetResponse;

/***
 * 通过条形码获取商品信息接口
 * @author bi.cai
 * @date 2018年01月12日 下午10:46:39
 */
public interface MdProductService {

	/**
	 * 通过条码获取商品信息(先查缓存再查库)
	 */
	GoodsByBarcodeGetResponse getGoodsInfoByBarcode(GoodsByBarcodeGetRequest request);

	
}
