package com.ykcloud.soa.erp.api.scm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

public class ContractEarnestMoneyRequest extends AbstractRequest {
    private static final long serialVersionUID = -5567561237996119331L;

    private Long UnitNumId;//采购方
    private Long supplyUnitNumId;//供应商编码

    public Long getUnitNumId() {
        return UnitNumId;
    }

    public void setUnitNumId(Long unitNumId) {
        UnitNumId = unitNumId;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }
}
