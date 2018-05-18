package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class ItemSellDailyDtlNotBalanceCountGetResponse extends MessagePack{

	private static final long serialVersionUID = 1754628776443434936L;

	private   Long count;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
