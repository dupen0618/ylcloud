package com.ykcloud.soa.erp.api.prd.service;

import com.ykcloud.soa.erp.api.prd.request.ItemStatusPermitActionGetRequest;
import com.ykcloud.soa.erp.api.prd.request.ShopProductItemStatusGetRequest;
import com.ykcloud.soa.erp.api.prd.response.ItemStatusPermitActionCheckResponse;
import com.ykcloud.soa.erp.api.prd.response.ShopProductItemStatusGetRsponse;

import com.ykcloud.soa.erp.api.prd.request.LatestPurchasePriceGetRequest;
import com.ykcloud.soa.erp.api.prd.request.ShopProductDefaultReceiptStorageGetRequest;
import com.ykcloud.soa.erp.api.prd.response.LatestPurchasePriceGetRespone;
import com.ykcloud.soa.erp.api.prd.response.ShopProductDefaultReceiptStorageGetResponse;

//商品采购服务
public interface PrdPurchaseService {

	
	public ShopProductItemStatusGetRsponse getShopProductItemStatus(ShopProductItemStatusGetRequest request);

	//根据商品状态id判断某类操作{补货，自动补货，采购，销售，分销}是否被允许
	public ItemStatusPermitActionCheckResponse checkItemStatusPermitAction(ItemStatusPermitActionGetRequest request);

	/*
	*获取最新采购价
	* */
	public LatestPurchasePriceGetRespone getLatestPurchasePrice(LatestPurchasePriceGetRequest request);
	
	//获取门店某商品默认收货仓库(逻辑仓及物理仓)
	public ShopProductDefaultReceiptStorageGetResponse getShopProductDefaultReceiptStorage(ShopProductDefaultReceiptStorageGetRequest request);
	
	
}
