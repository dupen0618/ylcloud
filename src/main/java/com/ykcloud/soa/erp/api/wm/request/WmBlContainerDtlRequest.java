package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

public class WmBlContainerDtlRequest extends AbstractRequest
{
    private static final long serialVersionUID = 585490687158871833L;
    // 门店ID
    @NotNull(message = "门店ID不能为空! ")
    private Long subUnitNumId;

    @NotNull(message = "托盘码不能为空! ")
    private String containerSerlno;

    @NotNull(message = "商品条码不能为空！")
    private String barcode;

    public Long getSubUnitNumId()
    {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId)
    {
        this.subUnitNumId = subUnitNumId;
    }

    public static long getSerialVersionUID()
    {
        return serialVersionUID;
    }

    public String getContainerSerlno()
    {
        return containerSerlno;
    }

    public void setContainerSerlno(String containerSerlno)
    {
        this.containerSerlno = containerSerlno;
    }

    public String getBarcode()
    {
        return barcode;
    }

    public void setBarcode(String barcode)
    {
        this.barcode = barcode;
    }
}
