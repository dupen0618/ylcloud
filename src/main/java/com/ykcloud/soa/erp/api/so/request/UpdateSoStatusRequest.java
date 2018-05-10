package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class UpdateSoStatusRequest extends AbstractUserSessionRequest
{
    private static final long serialVersionUID = -8409296700083263920L;

    private Long subUnitNumId;

    private String soNumId;

    private Long status;

    public Long getStatus()
    {
        return status;
    }

    public void setStatus(Long status)
    {
        this.status = status;
    }

    public Long getSubUnitNumId()
    {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId)
    {
        this.subUnitNumId = subUnitNumId;
    }

    public String getSoNumId()
    {
        return soNumId;
    }

    public void setSoNumId(String soNumId)
    {
        this.soNumId = soNumId;
    }
}
