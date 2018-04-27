package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

public class packingOrderItemInventoryRequest extends AbstractRequest {

    @NotNull(message = "订单编号不能为空！")
    String reservedNo;
    @NotNull(message = "供应商不能为空!")
    private Long SubUnitNumId;

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public Long getSubUnitNumId() {
        return SubUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        SubUnitNumId = subUnitNumId;
    }
}
