package com.ykcloud.soa.erp.api.scm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

public class ContractEarnestMoneyRequest extends AbstractRequest {
    private static final long serialVersionUID = -5567561237996119331L;
    @NotNull(message = "采购方不能为空！")
    private Long unitNumId;
    @NotNull(message = "供应商不能为空！")
    private Long supplyUnitNumId;

    public Long getUnitNumId() {
        return unitNumId;
    }

    public void setUnitNumId(Long unitNumId) {
        this.unitNumId = unitNumId;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }
}
