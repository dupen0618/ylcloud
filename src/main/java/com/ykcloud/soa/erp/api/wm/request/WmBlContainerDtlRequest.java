package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

public class WmBlContainerDtlRequest extends AbstractRequest
{
    private static final long serialVersionUID = 585490687158871833L;
    // 门店ID
    @NotNull(message = "门店ID不能为空! ")
    private Long subUnitNumId;

    @NotNull(message = "托盘标识符不能为空! ")
    private String containererlno;

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

    public String getContainererlno()
    {
        return containererlno;
    }

    public void setContainererlno(String containererlno)
    {
        this.containererlno = containererlno;
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