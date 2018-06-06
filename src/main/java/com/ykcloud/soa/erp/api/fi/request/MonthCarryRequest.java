package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

public class MonthCarryRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = 1L;
    @NotNull(message = "门店号不能为空！")
    private Long subUnitNumId;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

}
