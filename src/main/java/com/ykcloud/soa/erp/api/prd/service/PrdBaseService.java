package com.ykcloud.soa.erp.api.prd.service;

import com.ykcloud.soa.erp.api.prd.request.ItemStatusPermitActionGetRequest;
import com.ykcloud.soa.erp.api.prd.request.ProductInfoBySubUnitNumIdAndSupplyUnitNumIdGetRequest;
import com.ykcloud.soa.erp.api.prd.request.ShopProductItemStatusGetRequest;
import com.ykcloud.soa.erp.api.prd.response.ItemStatusPermitActionCheckResponse;
import com.ykcloud.soa.erp.api.prd.response.ProductInfoBySubUnitNumIdAndSupplyUnitNumIdGetResponse;
import com.ykcloud.soa.erp.api.prd.response.ShopProductItemStatusGetRsponse;

//商品基础服务
public interface PrdBaseService {
	
	public ShopProductItemStatusGetRsponse getShopProductItemStatus(ShopProductItemStatusGetRequest request);

	//根据商品状态id判断某类操作{补货，自动补货，采购，销售，分销}是否被允许
	public ItemStatusPermitActionCheckResponse checkItemStatusPermitAction(ItemStatusPermitActionGetRequest request);
	
}
