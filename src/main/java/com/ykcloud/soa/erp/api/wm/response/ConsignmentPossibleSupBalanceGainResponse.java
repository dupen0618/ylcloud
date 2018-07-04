package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.SupBalanceAval;

import java.util.List;

public class ConsignmentPossibleSupBalanceGainResponse extends MessagePack {
    private static final long serialVersionUID = 1L;

    private List<SupBalanceAval> supBalanceAvalList;

    public List<SupBalanceAval> getSupBalanceAvalList() {
        return supBalanceAvalList;
    }

    public void setSupBalanceAvalList(List<SupBalanceAval> supBalanceAvalList) {
        this.supBalanceAvalList = supBalanceAvalList;
    }
}
