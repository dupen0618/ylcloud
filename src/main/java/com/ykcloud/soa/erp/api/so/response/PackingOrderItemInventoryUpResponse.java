package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class PackingOrderItemInventoryUpResponse extends MessagePack {
    private static final long serialVersionUID = 1L;
    //影响行数
    private int influence;

    public int getInfluence() {
        return influence;
    }

    public void setInfluence(int influence) {
        this.influence = influence;
    }
}
