package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

/**
 * @Author Hewei
 * @Date 2018/4/25 19:02
 */
public class InAccountByWorkRawRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "订单编号不能为空！")
    String workNumId;
    @NotNull(message = "单据类型不能为空！")
    Long typeNumId;
    @NotNull(message="门店编号不能为空")
    Long subUnitNumId;

    Long balaFuncId;

    public String getWorkNumId() {
        return workNumId;
    }

    public void setWorkNumId(String workNumId) {
        this.workNumId = workNumId;
    }

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }

    public Long getBalaFuncId() {
        return balaFuncId;
    }

    public void setBalaFuncId(Long balaFuncId) {
        this.balaFuncId = balaFuncId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}
