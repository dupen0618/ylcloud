package com.ykcloud.soa.erp.api.scm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractSessionRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class ScmBlChangeCostRequest extends AbstractUserSessionRequest
{
    private static final long serialVersionUID = 1L;
    @NotNull(message = "调价单号不能为空！")
    private String reservedNo;

    @NotNull(message = "掉价时间不能为空！")
    private Date orderDate;


    public String getReservedNo()
    {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo)
    {
        this.reservedNo = reservedNo;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
