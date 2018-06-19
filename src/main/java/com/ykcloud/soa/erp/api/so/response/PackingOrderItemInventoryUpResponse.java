package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

import java.io.Serializable;

public class PackingOrderItemInventoryUpResponse extends MessagePack {
    private static final long serialVersionUID = 1L;
    //影响行数
    private Integer influence;

    public Integer getInfluence() {
        return influence;
    }

    public void setInfluence(Integer influence) {
        this.influence = influence;
    }
}
