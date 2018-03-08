package com.ykcloud.soa.erp.api.md.service;

import com.ykcloud.soa.erp.api.md.request.GoodsByBarcodeGetRequest;
import com.ykcloud.soa.erp.api.md.request.ItemStatusPermitActionGetRequest;
import com.ykcloud.soa.erp.api.md.request.ShopProductItemStatusGetRequest;
import com.ykcloud.soa.erp.api.md.response.GoodsByBarcodeGetResponse;
import com.ykcloud.soa.erp.api.md.response.ItemStatusPermitActionCheckResponse;
import com.ykcloud.soa.erp.api.md.response.ShopProductItemStatusGetRsponse;

import com.ykcloud.soa.erp.api.md.request.LatestPurchasePriceGetRequest;
import com.ykcloud.soa.erp.api.md.response.LatestPurchasePriceGetRespone;

/***
 * 通过条形码获取商品信息接口
 * @author bi.cai
 * @date 2018年01月12日 下午10:46:39
 */
public interface MdProductService {

	/**
	 * 通过条码获取商品信息(先查缓存再查库)
	 */
	public GoodsByBarcodeGetResponse getGoodsInfoByBarcode(GoodsByBarcodeGetRequest request);

	public ShopProductItemStatusGetRsponse getShopProductItemStatus(ShopProductItemStatusGetRequest request);

	//根据商品状态id判断某类操作{补货，自动补货，采购，销售，分销}是否被允许
	public ItemStatusPermitActionCheckResponse checkItemStatusPermitAction(ItemStatusPermitActionGetRequest request);

	/*
	*获取最新采购价
	* */
	public LatestPurchasePriceGetRespone getLatestPurchasePrice(LatestPurchasePriceGetRequest request);
}
