package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

public class StatusNumIdForSoApplySubcontractSplitGetRequest extends AbstractRequest {
    private static final long serialVersionUID = -8781020251949209140L;

    @NotNull(message = "领料单号不能为空")
    private String applyNumId;
    @NotNull(message = "门店编号不能为空")
    private Long subUnitNumId;

    public String getApplyNumId() {
        return applyNumId;
    }

    public void setApplyNumId(String applyNumId) {
        this.applyNumId = applyNumId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}
