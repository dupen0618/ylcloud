package com.ykcloud.soa.erp.api.scm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class ScmBlChangeCostRequest extends AbstractRequest
{
    private static final long serialVersionUID = 1L;
    @NotNull(message = "调价单号不能为空")
    private String reservedNo;


    public String getReservedNo()
    {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo)
    {
        this.reservedNo = reservedNo;
    }
}
