package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

public class CustomerGrossProfitSettlementRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -3702466843514123983L;
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    @NotNull(message = "结算单号不能空！")
    private String balanceNo;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public String getBalanceNo() {
        return balanceNo;
    }

    public void setBalanceNo(String balanceNo) {
        this.balanceNo = balanceNo;
    }
}
