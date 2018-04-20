package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

/**
 * @Description: TODO
 * @Author: ALi
 * @Date: 2018/4/19 18:24
 */
public class VoucherAndAccSubjectRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = 4627685577873375711L;

    @NotNull(message = "凭证单号不能为空！")
    private String voucherNumId;

    public String getVoucherNumId() {
        return voucherNumId;
    }

    public void setVoucherNumId(String voucherNumId) {
        this.voucherNumId = voucherNumId;
    }
}
