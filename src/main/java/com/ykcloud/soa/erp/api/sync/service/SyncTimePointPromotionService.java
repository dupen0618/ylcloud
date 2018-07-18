/*
 * Copyright © 2017-2018 All Rights Reserved
 * 上海仰空网络科技有限公司 版权所有
 */

package com.ykcloud.soa.erp.api.sync.service;

import com.ykcloud.soa.erp.api.sync.request.TimePointPromotionSyncRequest;
import com.ykcloud.soa.erp.api.sync.response.TimePointPromotionSyncResponse;

/**
 * @className SyncTimePointService
 * @description 时点促销
 */
public interface SyncTimePointPromotionService {
  // 同步时点促销
  public TimePointPromotionSyncResponse syncTimePointPromotion(
      TimePointPromotionSyncRequest request);
}
