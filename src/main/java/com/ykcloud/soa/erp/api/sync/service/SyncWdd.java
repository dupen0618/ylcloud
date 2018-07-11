package com.ykcloud.soa.erp.api.sync.service;

import com.ykcloud.soa.erp.api.sync.request.BarcodeSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.BrandSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.DivAndPtySyncRequest;
import com.ykcloud.soa.erp.api.sync.request.UnitsSyncRequest;
import com.ykcloud.soa.erp.api.sync.response.BarcodeSyncResponse;
import com.ykcloud.soa.erp.api.sync.response.BrandSyncResponse;
import com.ykcloud.soa.erp.api.sync.response.DivAndPtySyncResponse;
import com.ykcloud.soa.erp.api.sync.response.UnitsSyncResponse;

public interface SyncWdd {

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
}
