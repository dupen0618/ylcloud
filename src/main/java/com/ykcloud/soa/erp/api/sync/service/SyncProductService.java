package com.ykcloud.soa.erp.api.sync.service;


import com.ykcloud.soa.erp.api.sync.request.BasicProductSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.ChangeCostSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.ChangePriceSynRequest;
import com.ykcloud.soa.erp.api.sync.request.ChangePriceVipSynRequest;
import com.ykcloud.soa.erp.api.sync.request.DmSynRequest;
import com.ykcloud.soa.erp.api.sync.request.PriceCutSynRequest;
import com.ykcloud.soa.erp.api.sync.request.ProtocolSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.StockSyncRequest;
import com.ykcloud.soa.erp.api.sync.response.BasicProductSyncResponse;
import com.ykcloud.soa.erp.api.sync.response.ChangeCostSyncResponse;
import com.ykcloud.soa.erp.api.sync.response.ChangePriceSynResponse;
import com.ykcloud.soa.erp.api.sync.response.ChangeVipPriceSynResponse;
import com.ykcloud.soa.erp.api.sync.response.DmSynResponse;
import com.ykcloud.soa.erp.api.sync.response.PriceCutSynResponse;
import com.ykcloud.soa.erp.api.sync.response.ProtocolSyncResponse;
import com.ykcloud.soa.erp.api.sync.response.StockSyncResponse;

import com.ykcloud.soa.erp.api.sync.request.*;
import com.ykcloud.soa.erp.api.sync.response.*;


public interface SyncProductService {
	
	/**
	 * 期初库存同步
	 * @author tz.x
	 * @date 2018年7月11日下午2:13:55
	 */
	public StockSyncResponse syncStock(StockSyncRequest request);
	
	/**
	 * 同步进价调整
	 * @author tz.x
	 * @date 2018年7月10日下午1:57:57
	 */
	public ChangeCostSyncResponse syncChangeCost(ChangeCostSyncRequest request);

	// 同步采购协议
	public ProtocolSyncResponse syncProtocol(ProtocolSyncRequest request);
	
	// 同步门店商品补货属性
	public ReplenishProductShopSyncResponse syncReplenishProductShop(ReplenishProductShopSyncRequest request);
	
	/**
	 * 临时、永久调价数据同步
	 * @author pengh
	 * @param request
	 * @return
	 */
	public ChangePriceSynResponse synChangePrice(ChangePriceSynRequest request);
	
	/**
     * 会员调价数据同步
     * @author pengh
     * @param request
     * @return
     */
	public ChangeVipPriceSynResponse synChangeVipPrice(ChangePriceVipSynRequest request);

	// 同步商品
	public BasicProductSyncResponse syncBasicProduct(BasicProductSyncRequest request);

	
	/**
	 * 削价数据同步
	 * @param request
	 * @author pengh
	 * @return
	 */
	public PriceCutSynResponse synPriceCut(PriceCutSynRequest request);
	
	/**
     * DM促销数据同步
     * @param request
     * @author pengh
     * @return
     */
    public DmSynResponse synDm(DmSynRequest request);


	public ShopCostSynResponse synShopCost(ShopCostSynRequest request);

	public ProductShopSynResponse synProductShop(ProductShopSynRequest request);
}
