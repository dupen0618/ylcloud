package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class LossBatchDtlNotBalanceCountGetResponse extends MessagePack{

	private static final long serialVersionUID = 1754628776443434936L;

	private   Long count;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
