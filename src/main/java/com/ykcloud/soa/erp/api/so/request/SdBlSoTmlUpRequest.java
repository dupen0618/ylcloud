package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

public class SdBlSoTmlUpRequest extends AbstractUserSessionRequest {

    @NotNull(message = "终端订单号不能为空!")
    private String tmlNumId;
    @NotNull(message = "门店编号不能为空!")
    private Long subUnitNumId;
    @NotNull(message = "订单类型不能为空")
    private Long typeNumId;

    public String getTmlNumId() {
        return tmlNumId;
    }

    public void setTmlNumId(String tmlNumId) {
        this.tmlNumId = tmlNumId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }
}
