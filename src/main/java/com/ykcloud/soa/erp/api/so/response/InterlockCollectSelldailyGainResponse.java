package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.SupBalanceBillDtl;

import java.util.List;

public class InterlockCollectSelldailyGainResponse extends MessagePack {
    private static final long serialVersionUID = 1L;
    private List<SupBalanceBillDtl> supBalanceBillDtlList;

    public List<SupBalanceBillDtl> getSupBalanceBillDtlList() {
        return supBalanceBillDtlList;
    }

    public void setSupBalanceBillDtlList(List<SupBalanceBillDtl> supBalanceBillDtlList) {
        this.supBalanceBillDtlList = supBalanceBillDtlList;
    }
}
