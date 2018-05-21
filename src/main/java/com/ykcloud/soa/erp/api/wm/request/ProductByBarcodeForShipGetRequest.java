package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

public class ProductByBarcodeForShipGetRequest extends AbstractRequest
{
    private static final long serialVersionUID = 1L;
    @NotNull(message = "出库单不能为空！")
    private String reservedNo;//出库单
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;//门店编号
    @NotNull(message = "托盘号不能为空！")
    private String traySerlno;//托盘号
    @NotNull(message = "商品条码不能为空！")
    private String barcode;//商品条码

    public String getReservedNo()
    {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo)
    {
        this.reservedNo = reservedNo;
    }

    public Long getSubUnitNumId()
    {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId)
    {
        this.subUnitNumId = subUnitNumId;
    }

    public String getTraySerlno()
    {
        return traySerlno;
    }

    public void setTraySerlno(String traySerlno)
    {
        this.traySerlno = traySerlno;
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
