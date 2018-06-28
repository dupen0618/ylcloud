package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.SupBalanceBillDtl;

public class InterlockCollectSelldailyGainAppointResponse extends MessagePack {
    private static final long serialVersionUID = 1L;
    private SupBalanceBillDtl supBalanceBillDtl;

    public SupBalanceBillDtl getSupBalanceBillDtl() {
        return supBalanceBillDtl;
    }

    public void setSupBalanceBillDtl(SupBalanceBillDtl supBalanceBillDtl) {
        this.supBalanceBillDtl = supBalanceBillDtl;
    }
}
