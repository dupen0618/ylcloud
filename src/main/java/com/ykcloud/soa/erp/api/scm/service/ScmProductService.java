package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.GiftQtyByGiftRelationGetRequest;
import com.ykcloud.soa.erp.api.scm.request.ProductPurchasePriceGetRequest;
import com.ykcloud.soa.erp.api.scm.response.ProductForRepmentCheckResponse;
import com.ykcloud.soa.erp.api.scm.response.GiftQtyByGiftRelationGetResponse;
import com.ykcloud.soa.erp.api.scm.request.ProductForRepmentCheckRequest;
import com.ykcloud.soa.erp.api.scm.response.ProductFdcSignBySupplyNumIdAndPtyNum3GetResponse;
import com.ykcloud.soa.erp.api.scm.request.ProductFdcSignBySupplyNumIdAndPtyNum3GetRequest;
import com.ykcloud.soa.erp.api.scm.response.ProductPurchasePriceGetResponse;

public interface ScmProductService {

	//获取供应商品赠品数量
	public GiftQtyByGiftRelationGetResponse getGiftQtyByGiftRelation(GiftQtyByGiftRelationGetRequest request);

	// 商品可补货合法验证
	public ProductForRepmentCheckResponse checkProductForRepment(ProductForRepmentCheckRequest Request);
	
	//根据供应商编号和商品小类来查询生鲜类型
	public ProductFdcSignBySupplyNumIdAndPtyNum3GetResponse getProductFdcSignBySupplyNumIdAndPtyNum3(ProductFdcSignBySupplyNumIdAndPtyNum3GetRequest request);

	//获取价格
	public ProductPurchasePriceGetResponse getProductPurchasePrice(ProductPurchasePriceGetRequest request);
}
