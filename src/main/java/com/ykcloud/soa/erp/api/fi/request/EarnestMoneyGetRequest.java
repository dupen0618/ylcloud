package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;


import javax.validation.constraints.NotNull;

public class EarnestMoneyGetRequest extends AbstractRequest {
    private static final long serialVersionUID = 1L;
    @NotNull(message = "供应商编号不能为空！")
    private Long supplyUnitNumId;

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }
}
