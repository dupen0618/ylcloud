package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @Description: 统计指定时间段内业务发生额的出参
 * @author: henry.wang
 * @date: 2018/5/17 16:59
 **/
public class BusinessAmountForGenKxCountResponse extends MessagePack {

    private static final long serialVersionUID = -8716207623324225827L;

    private Double businessAmount;//业务发生额

    public Double getBusinessAmount() {
        return businessAmount;
    }

    public void setBusinessAmount(Double businessAmount) {
        this.businessAmount = businessAmount;
    }
}
