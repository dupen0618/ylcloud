package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

/**
 * @Author:ALi
 * @Description: 修改验收入库主表
 * @Date:
 */
public class ItemSellDailyHdrStatusNumIdUpdateRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -3101956261800131597L;
    @NotNull(message = "单据编号不能为空！")
    private String reservedNo;
    @NotNull(message = "结算状态不能为空! ")
    Long statusNumId;
    @NotNull(message = "门店不能为空！")
    private Long subUnitNumId; // 门店

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public Long getStatusNumId() {
        return statusNumId;
    }

    public void setStatusNumId(Long statusNumId) {
        this.statusNumId = statusNumId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}
