package com.ykcloud.soa.erp.api.sync.service;

import com.ykcloud.soa.erp.api.sync.request.BarcodeShopSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.BarcodeSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.BrandSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.ColorSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.DivAndPtySyncRequest;
import com.ykcloud.soa.erp.api.sync.request.ExcessPromotionSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.NthPromotionSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.ProductOriginSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.UnitsSyncRequest;
import com.ykcloud.soa.erp.api.sync.response.BarcodeShopSyncResponse;
import com.ykcloud.soa.erp.api.sync.response.BarcodeSyncResponse;
import com.ykcloud.soa.erp.api.sync.response.BrandSyncResponse;
import com.ykcloud.soa.erp.api.sync.response.ColorSyncResponse;
import com.ykcloud.soa.erp.api.sync.response.DivAndPtySyncResponse;
import com.ykcloud.soa.erp.api.sync.response.ExcessPromotionSyncResponse;
import com.ykcloud.soa.erp.api.sync.response.NthPromotionSyncResponse;
import com.ykcloud.soa.erp.api.sync.response.ProductOriginSyncResponse;
import com.ykcloud.soa.erp.api.sync.response.UnitsSyncResponse;

public interface SyncWddService {

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
	
	/**
	 * 
	 * @author Dan
	 * @date 2018年7月16日
	 * @description 第N件促销
	 */
	public NthPromotionSyncResponse syncNthPromotion(NthPromotionSyncRequest request);
	
	/**
	 * 
	 * @author Dan
	 * @date 2018年7月16日
	 * @description 超量促销同步
	 */
	public ExcessPromotionSyncResponse syncExcessPromotion(ExcessPromotionSyncRequest request);
	
	
}
