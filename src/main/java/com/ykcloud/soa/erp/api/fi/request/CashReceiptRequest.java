package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class CashReceiptRequest extends AbstractUserSessionRequest
{
    private static final long serialVersionUID = 1L;

    @NotNull(message = "门店号不能为空！")
    private Long subUnitNumId;

    @NotNull(message = "付款日期不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date payDate;

    @NotNull(message = "单据编号不能为空!")
    private String reservedNo;

    public Long getSubUnitNumId()
    {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId)
    {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getPayDate()
    {
        return payDate;
    }

    public void setPayDate(Date payDate)
    {
        this.payDate = payDate;
    }

    public String getReservedNo()
    {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo)
    {
        this.reservedNo = reservedNo;
    }
}
