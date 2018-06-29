package com.ykcloud.soa.erp.api.scm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

public class ProtocolShopCopyRequest extends AbstractRequest {

    /**
     *
     */
    private static final long serialVersionUID = -6618339163788634917L;

    @NotNull(message = "旧门店编号不能为空")
    public Long oldSubUnitNumId;
    @NotNull(message = "新门店编号不能为空")
    public Long newSubUnitNumId;

    public Long getOldSubUnitNumId() {
        return oldSubUnitNumId;
    }

    public void setOldSubUnitNumId(Long oldSubUnitNumId) {
        this.oldSubUnitNumId = oldSubUnitNumId;
    }

    public Long getNewSubUnitNumId() {
        return newSubUnitNumId;
    }

    public void setNewSubUnitNumId(Long newSubUnitNumId) {
        this.newSubUnitNumId = newSubUnitNumId;
    }

}
