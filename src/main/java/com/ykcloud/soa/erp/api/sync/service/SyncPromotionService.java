package com.ykcloud.soa.erp.api.sync.service;

import com.ykcloud.soa.erp.api.sync.request.CombinePromotionSysRequest;
import com.ykcloud.soa.erp.api.sync.request.PackPromotionSysRequest;
import com.ykcloud.soa.erp.api.sync.response.CombinePromotionSysResponse;
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


}
