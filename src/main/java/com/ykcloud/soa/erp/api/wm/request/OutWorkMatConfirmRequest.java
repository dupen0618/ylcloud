package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

/**
 * fakir
 * 2018/4/23
 */
public class OutWorkMatConfirmRequest extends AbstractMethodError {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "申请单号不能为空")
    private Long applyNumId;

    public Long getApplyNumId() {
        return applyNumId;
    }

    public void setApplyNumId(Long applyNumId) {
        this.applyNumId = applyNumId;
    }
}
