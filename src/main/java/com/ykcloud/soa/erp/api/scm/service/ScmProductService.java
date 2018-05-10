package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.GiftQtyByGiftRelationGetRequest;

import com.ykcloud.soa.erp.api.scm.request.ProductPurchasePriceGetRequest;
import com.ykcloud.soa.erp.api.scm.response.ProductForReplenishCheckResponse;
import com.ykcloud.soa.erp.api.scm.response.GiftQtyByGiftRelationGetResponse;
import com.ykcloud.soa.erp.api.scm.request.ProductForReplenishCheckRequest;
import com.ykcloud.soa.erp.api.scm.response.ProductFdcSignBySupplyNumIdAndPty3NumIdGetResponse;
import com.ykcloud.soa.erp.api.scm.request.ProductFdcSignBySupplyNumIdAndPty3NumIdGetRequest;
import com.ykcloud.soa.erp.api.scm.response.ProductPurchasePriceGetResponse;


public interface ScmProductService {

	//获取供应商品赠品数量
	public GiftQtyByGiftRelationGetResponse getGiftQtyByGiftRelation(GiftQtyByGiftRelationGetRequest request);


	//商品可补货合法性验证
	public ProductForReplenishCheckResponse checkProductForReplenish(ProductForReplenishCheckRequest Request);
	
	//获得商品生鲜类型
	public ProductFdcSignBySupplyNumIdAndPty3NumIdGetResponse getProductFdcSignBySupplyNumIdAndPty3NumId(ProductFdcSignBySupplyNumIdAndPty3NumIdGetRequest request);

	//获取商品采购价
	public ProductPurchasePriceGetResponse getProductPurchasePrice(ProductPurchasePriceGetRequest request);
	
	//获得每日门店、

}
