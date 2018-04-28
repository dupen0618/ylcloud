package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

public class packingOrderItemInventoryRequest extends AbstractUserSessionRequest {

    @NotNull(message = "订单编号不能为空！")
    String reservedNo;
    @NotNull(message = "供应商不能为空!")
    private Long SubUnitNumId;
    @NotNull(message = "单据类型不能为空!")
    private String billTypeNumId;
    @NotNull(message = "业务类型不能为空!")
    private Long typeNumId;

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

    public String getBillTypeNumId() {
        return billTypeNumId;
    }

    public void setBillTypeNumId(String billTypeNumId) {
        this.billTypeNumId = billTypeNumId;
    }

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }
}
