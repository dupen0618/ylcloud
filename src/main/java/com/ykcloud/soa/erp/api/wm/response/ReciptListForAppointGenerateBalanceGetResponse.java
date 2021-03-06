package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.SupBalanceDtl;

import java.util.List;

public class ReciptListForAppointGenerateBalanceGetResponse extends MessagePack {
    private static final long serialVersionUID = -3708825331021090125L;
    private List<SupBalanceDtl> supBalanceDtlList;

    public List<SupBalanceDtl> getSupBalanceDtlList() {
        return supBalanceDtlList;
    }

    public void setSupBalanceDtlList(List<SupBalanceDtl> supBalanceDtlList) {
        this.supBalanceDtlList = supBalanceDtlList;
    }
}
