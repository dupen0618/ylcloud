package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class WmShipDtlScanStatusResponse extends MessagePack
{
    private static final long serialVersionUID = 1L;

    //托盘商品装箱数量
    private Double containerProductPackingQty;
    //托盘装箱数量
    private Double containerPackingQty;
    //托盘商品复核数量
    private Double containerProductScanQty;
    //托盘复核数量
    private Double containerScanQty;

    public Double getContainerProductPackingQty()
    {
        return containerProductPackingQty;
    }

    public void setContainerProductPackingQty(Double containerProductPackingQty)
    {
        this.containerProductPackingQty = containerProductPackingQty;
    }

    public Double getContainerPackingQty()
    {
        return containerPackingQty;
    }

    public void setContainerPackingQty(Double containerPackingQty)
    {
        this.containerPackingQty = containerPackingQty;
    }

    public Double getContainerProductScanQty()
    {
        return containerProductScanQty;
    }

    public void setContainerProductScanQty(Double containerProductScanQty)
    {
        this.containerProductScanQty = containerProductScanQty;
    }

    public Double getContainerScanQty()
    {
        return containerScanQty;
    }

    public void setContainerScanQty(Double containerScanQty)
    {
        this.containerScanQty = containerScanQty;
    }
}
