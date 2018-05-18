package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.SupBalanceDtl;

public class SupBlanceDtlBySellOffBatchDtlSeriesGetResponse extends MessagePack{

	private static final long serialVersionUID = 1754628776443434936L;

	private SupBalanceDtl supBalanceDtl;

    public SupBalanceDtl getSupBalanceDtl() {
        return supBalanceDtl;
    }

    public void setSupBalanceDtl(SupBalanceDtl supBalanceDtl) {
        this.supBalanceDtl = supBalanceDtl;
    }
}
