package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

public class StatusNumIdBySoNumIdUpdateRequest extends AbstractRequest {
    private static final long serialVersionUID = -8781020251949209140L;
    @NotNull(message = "领料单号不能为空")
    private String soNumId;
    @NotNull(message = "门店编号不能为空")
    private Long subUnitNumId;
    @NotNull(message = "订单状态不能为空")
    Long statusNumId;
    public String getSoNumId() {
        return soNumId;
    }

    public void setSoNumId(String soNumId) {
        this.soNumId = soNumId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getStatusNumId() {
        return statusNumId;
    }

    public void setStatusNumId(Long statusNumId) {
        this.statusNumId = statusNumId;
    }
}
