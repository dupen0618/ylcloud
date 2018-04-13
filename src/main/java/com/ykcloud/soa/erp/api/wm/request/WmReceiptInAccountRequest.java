package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

/**
 * @Author Hewei
 * @Date 2018/4/10 9:49
 */
public class WmReceiptInAccountRequest extends AbstractUserSessionRequest {
    @NotNull(message = "订单编号不能为空！")
    String reservedNo;
    @NotNull(message = "单据类型不能为空！")
    String typeNum;

    String balaFuncId;
    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public String getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(String typeNum) {
        this.typeNum = typeNum;
    }

    public String getBalaFuncId() {
        return balaFuncId;
    }

    public void setBalaFuncId(String balaFuncId) {
        this.balaFuncId = balaFuncId;
    }
}
