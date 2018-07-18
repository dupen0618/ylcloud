package com.ykcloud.soa.erp.api.sync.service;


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


	public ShopCostSynResponse synProductShopCost(ShopCostSynRequest request);

	public ProductShopSynResponse synProductShop(ProductShopSynRequest request);
	
	/**
	 * 
	 * @author Dan
	 * @date 2018年7月10日
	 * @description 同步多条码
	 */
	public BarcodeSyncResponse syncBarcode(BarcodeSyncRequest request);
	
	
	/**
	 * 
	 * @author Dan
	 * @date 2018年7月10日
	 * @description 同步多条多价
	 */
	public BarcodeShopSyncResponse syncBarcodeShop(BarcodeShopSyncRequest request);
	/**
	 * 
	 * @author Dan
	 * @date 2018年7月10日
	 * @description 同步品牌
	 */
	public BrandSyncResponse syncBrand(BrandSyncRequest request);
	
	/**
	 * 
	 * @author Dan
	 * @date 2018年7月10日
	 * @description 同步部类，大中小类
	 */
	public DivAndPtySyncResponse syncDivAndPty(DivAndPtySyncRequest request);//未完成，数据库没见表
	
	/**
	 * 
	 * @author Dan
	 * @date 2018年7月10日
	 * @description 同步单位
	 */
	public UnitsSyncResponse syncUnits(UnitsSyncRequest request);
	/**
	 * 
	 * @author Dan
	 * @date 2018年7月10日
	 * @description 同步产地
	 */
	public ProductOriginSyncResponse syncProductOrigin(ProductOriginSyncRequest request);
	
	/**
	 * 
	 * @author Dan
	 * @date 2018年7月10日
	 * @description 同步颜色	
	 */
	public ColorSyncResponse syncColor(ColorSyncRequest request);
}
