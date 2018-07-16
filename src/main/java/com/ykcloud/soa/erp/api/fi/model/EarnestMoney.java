package com.ykcloud.soa.erp.api.fi.model;

<<<<<<< HEAD
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
=======
public class EarnestMoney {
    private Double contractEarnestMoney;//合同保证金
    private Double differenceEarnestMoney;//差多少保证金
    private Double alreadyEarnestMoney;//已交保证金
>>>>>>> 去合同保证金

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
<<<<<<< HEAD
=======

    public Double getAlreadyEarnestMoney() {
        return alreadyEarnestMoney;
    }

    public void setAlreadyEarnestMoney(Double alreadyEarnestMoney) {
        this.alreadyEarnestMoney = alreadyEarnestMoney;
    }
>>>>>>> 去合同保证金
}
