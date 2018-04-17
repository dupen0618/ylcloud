package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @Description: TODO
 * @Author: ALi
 * @Date: 2018/4/17 18:10
 */
public class ProtocolBackOffRateGetResponse extends MessagePack {
    private static final long serialVersionUID = 1L;
    private Double backOffRate;// 倒扣率

    public Double getBackOffRate() {
        return backOffRate;
    }

    public void setBackOffRate(Double backOffRate) {
        this.backOffRate = backOffRate;
    }
}
