package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.SupBalanceDtl;

import java.util.List;

public class ListForAppointGenerateBalanceForSellOffGetResponse extends MessagePack {
    private static final long serialVersionUID = 2999054411107103895L;
    private List<SupBalanceDtl> supBalanceDtlList;

    public List<SupBalanceDtl> getSupBalanceDtlList() {
        return supBalanceDtlList;
    }

    public void setSupBalanceDtlList(List<SupBalanceDtl> supBalanceDtlList) {
        this.supBalanceDtlList = supBalanceDtlList;
    }
}
