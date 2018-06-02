package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;


/**
 * @Author:ALi
 * @Description: TODO
 * @Date:
 */
public class SupPriceBySeriesGetResponse  extends MessagePack {
    private static final long serialVersionUID = 1754628776443434936L;

    private Double supPrice;

    public Double getSupPrice() {
        return supPrice;
    }

    public void setSupPrice(Double supPrice) {
        this.supPrice = supPrice;
    }
}
