package com.ykcloud.soa.erp.api.wm.model;
/*
 * PROJECT NAME: omp_bcommon
 * PACKAGE NAME: com.gb.soa.omp.dto
 * FILE    NAME: ScmAccInvownStkdto.java
 * COPYRIGHT: Copyright(c) © 2016 Goodbaby Company Ltd. All Rights Reserved
 */
import java.io.Serializable;

/**
 * 库存redis更新实体
 * @author xiaoliu.zhu
 * @date 2016年5月11日 下午3:01:10
 * @version <b>1.0.0</b>
 */
public class ScmAccInvOwnStk implements Serializable{

    private static final long serialVersionUID = -6257977489391902499L;


    private String series;

    private Long itemNumId;

    private Long locPtyNumId;

    private Long storageNumId;

    private Long avalQty;

    private Long lockQty;

    private Long stkNumId;

    private Long divNumId;

    private Long ownerNumId;

    private Long subUnitNumId;

    private Long cortNumId;

    private Long virtualQty;

    private Long physicQty;

    private Long tenantNumId;

    private Long dataSign;

    /**
     * 获得series
     * @return String
     */
    public String getSeries() {
        return series;
    }

    /**
     * 设置series
     * @param series
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /**
     * 获得itemNumId
     * @return Long
     */
    public Long getItemNumId() {
        return itemNumId;
    }

    /**
     * 设置itemNumId
     * @param itemNumId
     */
    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    /**
     * 获得locPtyNumId
     * @return Long
     */
    public Long getLocPtyNumId() {
        return locPtyNumId;
    }

    /**
     * 设置locPtyNumId
     * @param locPtyNumId
     */
    public void setLocPtyNumId(Long locPtyNumId) {
        this.locPtyNumId = locPtyNumId;
    }

    /**
     * 获得storageNumId
     * @return Long
     */
    public Long getStorageNumId() {
        return storageNumId;
    }

    /**
     * 设置storageNumId
     * @param storageNumId
     */
    public void setStorageNumId(Long storageNumId) {
        this.storageNumId = storageNumId;
    }

    /**
     * 获得avalQty
     * @return Long
     */
    public Long getAvalQty() {
        return avalQty;
    }

    /**
     * 设置avalQty
     * @param avalQty
     */
    public void setAvalQty(Long avalQty) {
        this.avalQty = avalQty;
    }

    /**
     * 获得lockQty
     * @return Long
     */
    public Long getLockQty() {
        return lockQty;
    }

    /**
     * 设置lockQty
     * @param lockQty
     */
    public void setLockQty(Long lockQty) {
        this.lockQty = lockQty;
    }

    /**
     * 获得divNumId
     * @return Long
     */
    public Long getDivNumId() {
        return divNumId;
    }

    /**
     * 获得stkNumId
     * @return Long
     */
    public Long getStkNumId() {
        return stkNumId;
    }

    /**
     * 设置stkNumId
     * @param stkNumId
     */
    public void setStkNumId(Long stkNumId) {
        this.stkNumId = stkNumId;
    }

    /**
     * 设置divNumId
     * @param divNumId
     */
    public void setDivNumId(Long divNumId) {
        this.divNumId = divNumId;
    }

    /**
     * 获得ownerNumId
     * @return Long
     */
    public Long getOwnerNumId() {
        return ownerNumId;
    }

    /**
     * 设置ownerNumId
     * @param ownerNumId
     */
    public void setOwnerNumId(Long ownerNumId) {
        this.ownerNumId = ownerNumId;
    }

    /**
     * 获得subUnitNumId
     * @return Long
     */
    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    /**
     * 设置subUnitNumId
     * @param subUnitNumId
     */
    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    /**
     * 获得cortNumId
     * @return Long
     */
    public Long getCortNumId() {
        return cortNumId;
    }

    /**
     * 设置cortNumId
     * @param cortNumId
     */
    public void setCortNumId(Long cortNumId) {
        this.cortNumId = cortNumId;
    }

    /**
     * 获得virtualQty
     * @return Long
     */
    public Long getVirtualQty() {
        return virtualQty;
    }

    /**
     * 设置virtualQty
     * @param virtualQty
     */
    public void setVirtualQty(Long virtualQty) {
        this.virtualQty = virtualQty;
    }

    /**
     * 获得physicQty
     * @return Long
     */
    public Long getPhysicQty() {
        return physicQty;
    }

    /**
     * 设置physicQty
     * @param physicQty
     */
    public void setPhysicQty(Long physicQty) {
        this.physicQty = physicQty;
    }

    /**
     * 获得tenantNumId
     * @return Long
     */
    public Long getTenantNumId() {
        return tenantNumId;
    }

    /**
     * 设置tenantNumId
     * @param tenantNumId
     */
    public void setTenantNumId(Long tenantNumId) {
        this.tenantNumId = tenantNumId;
    }

    /**
     * 获得dataSign
     * @return Long
     */
    public Long getDataSign() {
        return dataSign;
    }

    /**
     * 设置dataSign
     * @param dataSign
     */
    public void setDataSign(Long dataSign) {
        this.dataSign = dataSign;
    }

}
