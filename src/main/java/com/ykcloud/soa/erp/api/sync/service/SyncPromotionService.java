package com.ykcloud.soa.erp.api.sync.service;

import com.ykcloud.soa.erp.api.sync.request.*;
import com.ykcloud.soa.erp.api.sync.response.*;

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
	
	/**
	 * @description 等级会员
	 */
	public VipPromotionSyncResponse syncVipPromotion(VipPromotionSyncRequest request);


	/**
	 * 促销商品
	 */

	public PromotionGiftSyncResponse syncPromotionGift(PromotionGiftSyncRequest request);
}
