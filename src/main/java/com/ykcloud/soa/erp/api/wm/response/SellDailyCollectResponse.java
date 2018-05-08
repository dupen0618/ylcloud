package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.WmCollectShipSellDailyDtl;

/**
 * @author:shenq
 * @description:代销获取COSTAMOUNT
 * @date :2018/5/3 - 20:37
 * @version:v1.0
 */
public class SellDailyCollectResponse extends MessagePack {

    /**
     * 出库日报汇总信息
     */
    private WmCollectShipSellDailyDtl collectSellDaily;

    public WmCollectShipSellDailyDtl getCollectSellDaily() {
        return collectSellDaily;
    }

    public void setCollectSellDaily(WmCollectShipSellDailyDtl collectSellDaily) {
        this.collectSellDaily = collectSellDaily;
    }
}
