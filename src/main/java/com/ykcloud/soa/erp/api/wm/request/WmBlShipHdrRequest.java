package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

/**
 * @Author Hewei
 * @Date 2018/5/23 14:36
 */
public class WmBlShipHdrRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = 5783269651955097018L;

    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;
    @NotNull(message = "物理仓编号不能为空！")
    private Long physicalNumId;
    @NotNull(message = "商品编号编号不能为空！")
    private Long itemNumId;
    @NotNull(message = "验收单号不能为空！")
    private String reservedNo;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getPhysicalNumId() {
        return physicalNumId;
    }

    public void setPhysicalNumId(Long physicalNumId) {
        this.physicalNumId = physicalNumId;
    }

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }
}
