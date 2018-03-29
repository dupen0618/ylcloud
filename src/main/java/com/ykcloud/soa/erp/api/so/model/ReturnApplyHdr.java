package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 14:09:2018/3/29
 */
public class ReturnApplyHdr implements Serializable {

    private static final long serialVersionUID = 7030264033673568907L;

    private Long subUnitNumId;//门店编号

    private Date orderDate;//申请日期

    private Long badGoodsSign;//是否好货

    private Long typeNumId;//业务类型

    private Long physicalNumId;//出货物理仓库

    private Long storageNumId;//出货逻辑仓

    private Long recStorageNumId;//收货逻辑仓

    private Long recPhySicalNumId;//收货物理仓


    public Long getRecStorageNumId() {
        return recStorageNumId;
    }

    public void setRecStorageNumId(Long recStorageNumId) {
        this.recStorageNumId = recStorageNumId;
    }

    public Long getRecPhySicalNumId() {
        return recPhySicalNumId;
    }

    public void setRecPhySicalNumId(Long recPhySicalNumId) {
        this.recPhySicalNumId = recPhySicalNumId;
    }

    public Long getPhysicalNumId() {
        return physicalNumId;
    }

    public void setPhysicalNumId(Long physicalNumId) {
        this.physicalNumId = physicalNumId;
    }

    public Long getStorageNumId() {
        return storageNumId;
    }

    public void setStorageNumId(Long storageNumId) {
        this.storageNumId = storageNumId;
    }

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getBadGoodsSign() {
        return badGoodsSign;
    }

    public void setBadGoodsSign(Long badGoodsSign) {
        this.badGoodsSign = badGoodsSign;
    }
}
