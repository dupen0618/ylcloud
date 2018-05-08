package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class WmBlContainerDtlResponse extends MessagePack
{
    private static final long serialVersionUID = 1L;
    //商品主键
    private Long itemNumId;
    //商品名称
    private String itemName;
    //数量
    private Double conversionQty;
    //客户名称
    private String custSubUnitName;
    //托盘号
    private String containerSerlno;
    //托盘实物标签
    private String containerSerlnoLabel;
    //托盘商品装箱数量
    private Double containerProductPackingQt;
    //托盘装箱数量
    private Double containerPackingQty;
    //托盘商品复核数量
    private Double containerProductScanQty;
    //托盘符合数量
    private Double containerScanQty;

    public Long getItemNumId()
    {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId)
    {
        this.itemNumId = itemNumId;
    }

    public String getItemName()
    {
        return itemName;
    }

    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public Double getConversionQty()
    {
        return conversionQty;
    }

    public void setConversionQty(Double conversionQty)
    {
        this.conversionQty = conversionQty;
    }

    public String getCustSubUnitName()
    {
        return custSubUnitName;
    }

    public void setCustSubUnitName(String custSubUnitName)
    {
        this.custSubUnitName = custSubUnitName;
    }

    public String getContainerSerlno()
    {
        return containerSerlno;
    }

    public void setContainerSerlno(String containerSerlno)
    {
        this.containerSerlno = containerSerlno;
    }

    public String getContainerSerlnoLabel()
    {
        return containerSerlnoLabel;
    }

    public void setContainerSerlnoLabel(String containerSerlnoLabel)
    {
        this.containerSerlnoLabel = containerSerlnoLabel;
    }

    public Double getContainerProductPackingQt()
    {
        return containerProductPackingQt;
    }

    public void setContainerProductPackingQt(Double containerProductPackingQt)
    {
        this.containerProductPackingQt = containerProductPackingQt;
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
