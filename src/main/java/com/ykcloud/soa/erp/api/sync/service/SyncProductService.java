package com.ykcloud.soa.erp.api.sync.service;

import com.ykcloud.soa.erp.api.sync.request.ChangePriceSynRequest;
import com.ykcloud.soa.erp.api.sync.request.ChangePriceVipSynRequest;
import com.ykcloud.soa.erp.api.sync.request.ProtocolSyncRequest;
import com.ykcloud.soa.erp.api.sync.response.ChangePriceSynResponse;
import com.ykcloud.soa.erp.api.sync.response.ChangeVipPriceSynResponse;
import com.ykcloud.soa.erp.api.sync.request.ChangeCostSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.ProtocolSyncRequest;
import com.ykcloud.soa.erp.api.sync.response.ChangeCostSyncResponse;
import com.ykcloud.soa.erp.api.sync.request.BasicProductSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.ProtocolSyncRequest;
import com.ykcloud.soa.erp.api.sync.response.BasicProductSyncResponse;
import com.ykcloud.soa.erp.api.sync.response.ProtocolSyncResponse;

public interface SyncProductService {
	
	/**
	 * 同步进价调整
	 * @author tz.x
	 * @date 2018年7月10日下午1:57:57
	 */
	public ChangeCostSyncResponse syncChangeCost(ChangeCostSyncRequest request);

	// 同步采购协议
	public ProtocolSyncResponse syncProtocol(ProtocolSyncRequest request);
	
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

}
