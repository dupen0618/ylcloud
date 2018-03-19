package com.ykcloud.soa.erp.api.wm.service;

import java.util.Date;

import com.ykcloud.soa.erp.api.scm.request.ProductDemandQtyGetRequest;
import com.ykcloud.soa.erp.api.scm.response.ProductDemandQtyGetResponse;
import com.ykcloud.soa.erp.api.wm.request.ReceiptForGenerateDirectWayDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ShopProductLastReceiveDateGetRequest;
import com.ykcloud.soa.erp.api.wm.response.ReceiptForGenerateDirectWayDistributionSoGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ShopProductLastReceiveDateGetResponse;

public interface WmReceiptService {
	//查询商品最后收货日期
	public ShopProductLastReceiveDateGetResponse getShopProductLastReceiveDate(ShopProductLastReceiveDateGetRequest request);

	// 为产生分拨单获取验收单信息
	public ReceiptForGenerateDirectWayDistributionSoGetResponse getReceiptForGenerateDirectWayDistributionSo(
			ReceiptForGenerateDirectWayDistributionSoGetRequest request);

}
