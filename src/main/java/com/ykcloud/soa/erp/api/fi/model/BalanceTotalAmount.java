package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;

/**
 *
 * @Description: 根据税率汇总金额
 *
 * @auther: sheen.lee
 * @date: 15:19 2018/7/14
 * @param:
 * @return:
 *
 */
public class BalanceTotalAmount implements Serializable {
    private static final long serialVersionUID = -5644540398477476703L;

    private Double totalAmount;//汇总金额

    private int taxRate;//税率

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }
}
