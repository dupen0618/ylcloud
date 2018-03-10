package com.ykcloud.soa.erp.api.prd.service;

import com.ykcloud.soa.erp.api.prd.request.LatestPurchasePriceGetRequest;
import com.ykcloud.soa.erp.api.prd.request.ProductInfoBySubUnitNumIdAndSupplyUnitNumIdGetRequest;
import com.ykcloud.soa.erp.api.prd.request.ShopProductDefaultReceiptStorageGetRequest;
import com.ykcloud.soa.erp.api.prd.response.LatestPurchasePriceGetRespone;
import com.ykcloud.soa.erp.api.prd.response.ProductInfoBySubUnitNumIdAndSupplyUnitNumIdGetResponse;
import com.ykcloud.soa.erp.api.prd.response.ShopProductDefaultReceiptStorageGetResponse;

//商品与供应链相关服务
public interface PrdSupplyChainService {

	/*
	*获取最新采购价
	* */
	public LatestPurchasePriceGetRespone getLatestPurchasePrice(LatestPurchasePriceGetRequest request);
	
	//获取门店某商品默认收货仓库(逻辑仓及物理仓)
	public ShopProductDefaultReceiptStorageGetResponse getShopProductDefaultReceiptStorage(ShopProductDefaultReceiptStorageGetRequest request);

	//获取商品的属性到店、供应商 (结算方式、送货方式、原产地)
	public ProductInfoBySubUnitNumIdAndSupplyUnitNumIdGetResponse getProductInfoBySubUnitNumIdAndSupplyUnitNumId(ProductInfoBySubUnitNumIdAndSupplyUnitNumIdGetRequest request);
}
