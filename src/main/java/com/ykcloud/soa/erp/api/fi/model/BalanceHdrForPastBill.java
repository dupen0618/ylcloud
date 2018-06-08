package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Sealin
 * Created on 2018-06-08
 */
public class BalanceHdrForPastBill implements Serializable {
    private static final long serialVersionUID = -7539117492139914379L;
    private String balanceNo;
    private Date balanceDate;

    public String getBalanceNo() {
        return balanceNo;
    }

    public void setBalanceNo(String balanceNo) {
        this.balanceNo = balanceNo;
    }

    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }
}
