package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.SdBlSoTmlItemSellDailyRequest;
import com.ykcloud.soa.erp.api.so.response.SdBlSoTmlItemSellDailyResponse;

import java.util.List;

/**
 * @author:shenq
 * @description:销售出库日报Service
 * @date :2018/4/23 - 10:01
 * @version:v1.0
 */
public interface SdBlSoTmlItemSellDailyService {



    /**
     * 根据销售小票生成销售出库日报
     * @author shenq
     * @param request
     * @return
     */
    public SdBlSoTmlItemSellDailyResponse generateSalesDaily(SdBlSoTmlItemSellDailyRequest request);




    /**
     * 根据销售门店编号&&销售日期获取销售日报
     * @author shenq
     * @param request
     * @return
     */
    public SdBlSoTmlItemSellDailyResponse getItemSellDaily(SdBlSoTmlItemSellDailyRequest request);

}
