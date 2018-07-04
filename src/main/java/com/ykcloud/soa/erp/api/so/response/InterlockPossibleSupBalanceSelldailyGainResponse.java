package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.SupBalanceAval;

import java.util.List;

public class InterlockPossibleSupBalanceSelldailyGainResponse extends MessagePack {
    private static final long serialVersionUID = 1L;

    private List<SupBalanceAval> supBalanceAvalList;

    public List<SupBalanceAval> getSupBalanceAvalList() {
        return supBalanceAvalList;
    }

    public void setSupBalanceAvalList(List<SupBalanceAval> supBalanceAvalList) {
        this.supBalanceAvalList = supBalanceAvalList;
    }
}
