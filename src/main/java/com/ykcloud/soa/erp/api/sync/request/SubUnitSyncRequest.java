package com.ykcloud.soa.erp.api.sync.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

public class SubUnitSyncRequest extends AbstractUserSessionRequest {

    @NotNull(message = "上级公司不能为空!")
    private Long superCortNumId;
    @NotNull(message = "上级门店不能为空!")
    private Long superSubUnitNumId;
    @NotNull(message = "是否生成仓库不能为空!")
    private Integer storageOnOff;

    private static final long serialVersionUID = 2577972665723578844L;

    public Long getSuperCortNumId() {
        return superCortNumId;
    }

    public void setSuperCortNumId(Long superCortNumId) {
        this.superCortNumId = superCortNumId;
    }

    public Long getSuperSubUnitNumId() {
        return superSubUnitNumId;
    }

    public void setSuperSubUnitNumId(Long superSubUnitNumId) {
        this.superSubUnitNumId = superSubUnitNumId;
    }

    public Integer getStorageOnOff() {
        return storageOnOff;
    }

    public void setStorageOnOff(Integer storageOnOff) {
        this.storageOnOff = storageOnOff;
    }
}
