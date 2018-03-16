package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.GiftQtyByGiftRelationGetRequest;

import com.ykcloud.soa.erp.api.scm.request.ProductPurchasePriceGetRequest;
import com.ykcloud.soa.erp.api.scm.response.ProductForRepmentCheckResponse;
import com.ykcloud.soa.erp.api.scm.response.GiftQtyByGiftRelationGetResponse;
import com.ykcloud.soa.erp.api.scm.request.ProductForRepmentCheckRequest;
import com.ykcloud.soa.erp.api.scm.response.ProductFdcSignBySupplyNumIdAndPtyNum3GetResponse;
import com.ykcloud.soa.erp.api.scm.request.ProductFdcSignBySupplyNumIdAndPtyNum3GetRequest;
import com.ykcloud.soa.erp.api.scm.response.ProductPurchasePriceGetResponse;

import com.ykcloud.soa.erp.api.scm.request.ProductFdcSignBySupplyNumIdAndPtyNum3GetRequest;
import com.ykcloud.soa.erp.api.scm.response.ProductForRepmentCheckResponse;
import com.ykcloud.soa.erp.api.scm.response.ProductPurchasePriceGetResponse;
import com.ykcloud.soa.erp.api.scm.response.GiftQtyByGiftRelationGetResponse;
import com.ykcloud.soa.erp.api.scm.response.ProductFdcSignBySupplyNumIdAndPtyNum3GetResponse;
import com.ykcloud.soa.erp.api.scm.request.ProductForRepmentCheckRequest;
import com.ykcloud.soa.erp.api.scm.request.ProductPurchasePriceGetRequest;


public interface ScmProductService {

	//获取供应商品赠品数量
	public GiftQtyByGiftRelationGetResponse getGiftQtyByGiftRelation(GiftQtyByGiftRelationGetRequest request);


	//商品可补货合法性验证
	public ProductForRepmentCheckResponse checkProductForRepment(ProductForRepmentCheckRequest Request);
	
	//获得商品生鲜类型
	public ProductFdcSignBySupplyNumIdAndPtyNum3GetResponse getProductFdcSignBySupplyNumIdAndPtyNum3(ProductFdcSignBySupplyNumIdAndPtyNum3GetRequest request);

	//获取商品采购价
	public ProductPurchasePriceGetResponse getProductPurchasePrice(ProductPurchasePriceGetRequest request);
	
	//获得每日门店、

	

}
