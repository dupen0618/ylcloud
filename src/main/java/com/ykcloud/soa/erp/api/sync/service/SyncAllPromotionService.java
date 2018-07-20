/*
 * Copyright © 2017-2018 All Rights Reserved
 * 上海仰空网络科技有限公司 版权所有
 */

package com.ykcloud.soa.erp.api.sync.service;

import com.ykcloud.soa.erp.api.sync.request.AllPromotionSyncRequest;
import com.ykcloud.soa.erp.api.sync.response.AllPromotionSyncResponse;

/**
 * @className SyncAllPromotionService
 * @description 同步全量促销服务
 */
public interface SyncAllPromotionService {

    public AllPromotionSyncResponse
    syncAllPromotion(AllPromotionSyncRequest allPromotionRequest);
}
