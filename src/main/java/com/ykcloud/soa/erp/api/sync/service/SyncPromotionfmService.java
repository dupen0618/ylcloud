package com.ykcloud.soa.erp.api.sync.service;

import com.ykcloud.soa.erp.api.sync.request.FulfillDecreasePromotionSynRequest;
import com.ykcloud.soa.erp.api.sync.response.FulfillDecreasePromotionSynResponse;

/**
 * @className:SyncPromotionfmService
 * @description:，满额立减
 * @author: kevin.xiong
 */
public interface SyncPromotionfmService {

  /**
   * 满额立减
   * @param request
   * @return
   */
  public FulfillDecreasePromotionSynResponse synFullReduction(
      FulfillDecreasePromotionSynRequest request);
}
