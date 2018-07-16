package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class ContractEarnestMoneyResponse extends MessagePack {
    private static final long serialVersionUID = 5870545387046291226L;
    private Double contractEarnestMoney;

    public Double getContractEarnestMoney() {
        return contractEarnestMoney;
    }

    public void setContractEarnestMoney(Double contractEarnestMoney) {
        this.contractEarnestMoney = contractEarnestMoney;
    }
}
