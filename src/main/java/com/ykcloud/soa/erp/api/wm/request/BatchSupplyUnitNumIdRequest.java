package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

/**
 * @Author:ALi
 * @Description: 获得供应商
 * @Date:
 */
public class BatchSupplyUnitNumIdRequest extends AbstractRequest {
    private static final long serialVersionUID = -2565804606566389459L;
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}
