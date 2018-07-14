package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;

public class EarnestMoney implements Serializable {
    private Double alreadyEarnestMoney;//已交保证金
    private Double contractEarnestMoney;//应交保证金
    private Double differenceEarnestMoney;//需要交保证金

    public Double getAlreadyEarnestMoney() {
        return alreadyEarnestMoney;
    }

    public void setAlreadyEarnestMoney(Double alreadyEarnestMoney) {
        this.alreadyEarnestMoney = alreadyEarnestMoney;
    }

    public Double getContractEarnestMoney() {
        return contractEarnestMoney;
    }

    public void setContractEarnestMoney(Double contractEarnestMoney) {
        this.contractEarnestMoney = contractEarnestMoney;
    }

    public Double getDifferenceEarnestMoney() {
        return differenceEarnestMoney;
    }

    public void setDifferenceEarnestMoney(Double differenceEarnestMoney) {
        this.differenceEarnestMoney = differenceEarnestMoney;
    }
}
