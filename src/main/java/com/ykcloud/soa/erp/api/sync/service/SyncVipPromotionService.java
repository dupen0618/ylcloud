package com.ykcloud.soa.erp.api.sync.service;

import com.ykcloud.soa.erp.api.sync.request.VipPromotionSyncRequest;
import com.ykcloud.soa.erp.api.sync.response.VipPromotionSyncResponse;

public interface SyncVipPromotionService {

	
	/**
	 * @description 等级会员
	 */
	public VipPromotionSyncResponse syncVipPromotion(VipPromotionSyncRequest request);
	
	
}
