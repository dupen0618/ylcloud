package com.ykcloud.soa.erp.api.fi.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.fi.model.EarnestMoney;

public class EarnestMoneyGetResponse extends MessagePack{
    private static final long serialVersionUID = 1L;
    private EarnestMoney earnestMoney;

    public EarnestMoney getEarnestMoney() {
        return earnestMoney;
    }

    public void setEarnestMoney(EarnestMoney earnestMoney) {
        this.earnestMoney = earnestMoney;
    }
}
