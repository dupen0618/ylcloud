package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 9:57:2018/4/2
 */
public class DistributionStorage implements Serializable {
    private static final long serialVersionUID = -8139127343315140519L;

    private Long subUnitNumId;//发货门店

    private Long custSubUnitNumId;//收货门店

    private Long typeNumId;//3：配送到店 4：配送分拨到仓

    private Long storageNumId;//出货逻辑仓

    private Long physicalNumId;//出库物理仓

    private Long recStorageNumId;//收货逻辑仓

    private Long recPhysicalNumId;//收货物理仓


    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getCustSubUnitNumId() {
        return custSubUnitNumId;
    }

    public void setCustSubUnitNumId(Long custSubUnitNumId) {
        this.custSubUnitNumId = custSubUnitNumId;
    }

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }

    public Long getStorageNumId() {
        return storageNumId;
    }

    public void setStorageNumId(Long storageNumId) {
        this.storageNumId = storageNumId;
    }

    public Long getPhysicalNumId() {
        return physicalNumId;
    }

    public void setPhysicalNumId(Long physicalNumId) {
        this.physicalNumId = physicalNumId;
    }

    public Long getRecStorageNumId() {
        return recStorageNumId;
    }

    public void setRecStorageNumId(Long recStorageNumId) {
        this.recStorageNumId = recStorageNumId;
    }

    public Long getRecPhysicalNumId() {
        return recPhysicalNumId;
    }

    public void setRecPhysicalNumId(Long recPhysicalNumId) {
        this.recPhysicalNumId = recPhysicalNumId;
    }
}
