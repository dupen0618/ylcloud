package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

public class PayTypeCreateRequest extends AbstractUserSessionRequest {

    private static final long serialVersionUID = -7738726438426208797L;

    @NotNull(message = "单号不能为空")
    private String reservedNo;

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }
}