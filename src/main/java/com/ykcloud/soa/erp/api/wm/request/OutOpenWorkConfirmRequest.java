package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

/**
 * fakir
 * 2018/4/12
 */
public class OutOpenWorkConfirmRequest extends AbstractRequest {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "加工单号不能为空")
    private String workNumId;//加工单号

    public String getWorkNumId() {
        return workNumId;
    }

    public void setWorkNumId(String workNumId) {
        this.workNumId = workNumId;
    }
}
