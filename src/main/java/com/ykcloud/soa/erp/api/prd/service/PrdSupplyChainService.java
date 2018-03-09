package com.ykcloud.soa.erp.api.prd.service;

import com.ykcloud.soa.erp.api.prd.request.LatestPurchasePriceGetRequest;
import com.ykcloud.soa.erp.api.prd.request.ShopProductDefaultReceiptStorageGetRequest;
import com.ykcloud.soa.erp.api.prd.response.LatestPurchasePriceGetRespone;
import com.ykcloud.soa.erp.api.prd.response.ShopProductDefaultReceiptStorageGetResponse;

//商品与供应链相关服务
public interface PrdSupplyChainService {

	/*
	*获取最新采购价
	* */
	public LatestPurchasePriceGetRespone getLatestPurchasePrice(LatestPurchasePriceGetRequest request);
	
	//获取门店某商品默认收货仓库(逻辑仓及物理仓)
	public ShopProductDefaultReceiptStorageGetResponse getShopProductDefaultReceiptStorage(ShopProductDefaultReceiptStorageGetRequest request);
	
	
}
