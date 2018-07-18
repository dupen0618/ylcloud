package com.ykcloud.soa.erp.api.sync.service;

import com.ykcloud.soa.erp.api.sync.request.CombinePromotionSysRequest;
import com.ykcloud.soa.erp.api.sync.request.ExcessPromotionSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.NthPromotionSyncRequest;
import com.ykcloud.soa.erp.api.sync.request.PackPromotionSysRequest;
import com.ykcloud.soa.erp.api.sync.response.CombinePromotionSysResponse;
import com.ykcloud.soa.erp.api.sync.response.ExcessPromotionSyncResponse;
import com.ykcloud.soa.erp.api.sync.response.NthPromotionSyncResponse;
import com.ykcloud.soa.erp.api.sync.response.PackPromotionSysResponse;

/**
 * 促销数据同步关相服务
 * @author pengh
 *
 */
public interface SyncPromotionService {

    //打包促销
    public PackPromotionSysResponse sysPackPromotion(PackPromotionSysRequest request);

    //组合促销
    public CombinePromotionSysResponse sysCombinePromotion(CombinePromotionSysRequest request);
    
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
