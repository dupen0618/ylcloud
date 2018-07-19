package com.ykcloud.soa.erp.api.fi.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.fi.model.EarnestMoney;

import java.util.List;

public class EarnestMoneyGetResponse extends MessagePack{
    private static final long serialVersionUID = 1L;
    private List<EarnestMoney> earnestMoneyList;

    public List<EarnestMoney> getEarnestMoneyList() {
        return earnestMoneyList;
    }

    public void setEarnestMoneyList(List<EarnestMoney> earnestMoneyList) {
        this.earnestMoneyList = earnestMoneyList;
    }
}
