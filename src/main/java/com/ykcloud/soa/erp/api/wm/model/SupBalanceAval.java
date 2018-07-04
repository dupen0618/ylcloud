package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.util.Date;

public class SupBalanceAval implements Serializable{
    private Long supplyUnitNumId;//供应商
    private Long divNumId;//部类
    private Date minOrderDate;//最小日期
    private Long subUnitNumId;//门店编号

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Long getDivNumId() {
        return divNumId;
    }

    public void setDivNumId(Long divNumId) {
        this.divNumId = divNumId;
    }

    public Date getMinOrderDate() {
        return minOrderDate;
    }

    public void setMinOrderDate(Date minOrderDate) {
        this.minOrderDate = minOrderDate;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}
