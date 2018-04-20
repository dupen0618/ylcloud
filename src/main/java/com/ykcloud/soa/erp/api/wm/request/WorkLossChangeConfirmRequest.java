package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * fakir
 * 2018/4/18
 */
public class WorkLossChangeConfirmRequest extends AbstractRequest {
    private static final long serialVersionUID = 1L;
    private String workNumId;
    private Double changeCost;
    public String getWorkNumId() {
        return workNumId;
    }

    public void setWorkNumId(String workNumId) {
        this.workNumId = workNumId;
    }

    public Double getChangeCost() {
        return changeCost;
    }

    public void setChangeCost(Double changeCost) {
        this.changeCost = changeCost;
    }
}
