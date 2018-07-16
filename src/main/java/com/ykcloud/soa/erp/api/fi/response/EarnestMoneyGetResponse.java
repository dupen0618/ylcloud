package com.ykcloud.soa.erp.api.fi.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.fi.model.EarnestMoney;

<<<<<<< HEAD
public class EarnestMoneyGetResponse extends MessagePack{
    private static final long serialVersionUID = 1L;

=======
public class EarnestMoneyGetResponse extends MessagePack {
>>>>>>> 去合同保证金
    private EarnestMoney earnestMoney;

    public EarnestMoney getEarnestMoney() {
        return earnestMoney;
    }

    public void setEarnestMoney(EarnestMoney earnestMoney) {
        this.earnestMoney = earnestMoney;
    }
}
