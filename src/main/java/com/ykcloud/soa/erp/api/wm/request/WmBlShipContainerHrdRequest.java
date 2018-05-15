package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

public class WmBlShipContainerHrdRequest extends AbstractRequest
{
    private static final long serialVersionUID = 585490687158871833L;


    @NotNull(message = "托盘标识符不能为空! ")
    private String containerLabserlno;

    // 门店ID
    @NotNull(message = "门店ID不能为空! ")
    private Long subUnitNumId;

    public String getContainerLabserlno()
    {
        return containerLabserlno;
    }

    public void setContainerLabserlno(String containerLabserlno)
    {
        this.containerLabserlno = containerLabserlno;
    }

    public Long getSubUnitNumId()
    {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId)
    {
        this.subUnitNumId = subUnitNumId;
    }
}
