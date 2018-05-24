package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class EarnestMoneyRequest extends AbstractUserSessionRequest{
    private static final long serialVersionUID = 1L;
    @NotNull(message = "保证金单号不能为空！")
    private String reservedno;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @NotNull(message = "缴纳日期不能为空！")
    private Date paymentdate;

    @NotNull(message = "门店不能为空！")
    private Long subUnitNumId;

    public String getReservedno() {
        return reservedno;
    }

    public void setReservedno(String reservedno) {
        this.reservedno = reservedno;
    }

    public Date getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Date paymentdate) {
        this.paymentdate = paymentdate;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}
