package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

public class WmShipDtlScanStatusRequest extends AbstractUserSessionRequest
{
    private static final long serialVersionUID = -329220897215489154L;
    //门店编号
    @NotNull(message = "门店号不能为空！")
    private Long subUnitNumId;
    //托盘码
    @NotNull(message ="托盘码不能为空！" )
    private String containerSerlno;
    //商品编号
    @NotNull(message ="商品编号不能为空！" )
    private Long itemNumId;
    //复核数量
    @NotNull(message ="复核数量不能为空！" )
    private Double qty;
    //0是扫出，1是扫回
    @NotNull(message ="扫入扫出标志不能为空！" )
    private Long confirmSign;

    public Long getSubUnitNumId()
    {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId)
    {
        this.subUnitNumId = subUnitNumId;
    }

    public String getContainerSerlno()
    {
        return containerSerlno;
    }

    public void setContainerSerlno(String containerSerlno)
    {
        this.containerSerlno = containerSerlno;
    }

    public Long getItemNumId()
    {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId)
    {
        this.itemNumId = itemNumId;
    }

    public Double getQty()
    {
        return qty;
    }

    public void setQty(Double qty)
    {
        this.qty = qty;
    }

	public Long getConfirmSign() {
		return confirmSign;
	}

	public void setConfirmSign(Long confirmSign) {
		this.confirmSign = confirmSign;
	}

    

}
