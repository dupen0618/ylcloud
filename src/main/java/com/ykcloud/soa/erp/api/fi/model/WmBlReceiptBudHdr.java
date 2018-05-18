package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/5/17 17:11
 */
public class WmBlReceiptBudHdr implements Serializable {
    private static final long serialVersionUID = 3596622084965953565L;
    private String reservedNo;
    private String poNumId;
    private String tranReservedNumId;
    private Long subUnitNumId;
    private Long ordSubUnitNumId;
    private Date orderDate;
    private Long supplyUnitNumId;
    private Long statusNumId;
    private Long soFromType;
    private Long typeNumId;
    private Long storageNumId;
    private Long physicalNumId;
    private Long sendStorageNumId;
    private Long sendPhysicalNumId;
    private Long zoneNumId;
    private String wmsReservedNo;
    private String wmsTranReservedNumId;
    private Date supConfirmDate;
    private Date recDate;
    private String supRecesNo;
    private String supSysNo;
    private String remark;
    private Long storeType;
    private Long settlementType;
    private Long logisticsType;
    private String promotionGrade;
    private Long confirmType;
    private Long carrySign;
    private Long purchaseTypeNumId;
    private Long voucherNumId;
    private Long crossSubCompanySign;
    // 行号
    private String series;
    // 租户编号
    private Long tenantNumId;
    // 0: 正式 1：测试
    private Long dataSign;
    // 创建时间
    private Date createDtme;
    // 最后更新时间
    private Date lastUpdtme;
    // 创建用户
    private Long createUserId;
    // 更新用户
    private Long lastUpdateUserId;
    // 删除标识
    private String cancelsign;

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public String getPoNumId() {
        return poNumId;
    }

    public void setPoNumId(String poNumId) {
        this.poNumId = poNumId;
    }

    public String getTranReservedNumId() {
        return tranReservedNumId;
    }

    public void setTranReservedNumId(String tranReservedNumId) {
        this.tranReservedNumId = tranReservedNumId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getOrdSubUnitNumId() {
        return ordSubUnitNumId;
    }

    public void setOrdSubUnitNumId(Long ordSubUnitNumId) {
        this.ordSubUnitNumId = ordSubUnitNumId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Long getStatusNumId() {
        return statusNumId;
    }

    public void setStatusNumId(Long statusNumId) {
        this.statusNumId = statusNumId;
    }

    public Long getSoFromType() {
        return soFromType;
    }

    public void setSoFromType(Long soFromType) {
        this.soFromType = soFromType;
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

    public Long getSendStorageNumId() {
        return sendStorageNumId;
    }

    public void setSendStorageNumId(Long sendStorageNumId) {
        this.sendStorageNumId = sendStorageNumId;
    }

    public Long getSendPhysicalNumId() {
        return sendPhysicalNumId;
    }

    public void setSendPhysicalNumId(Long sendPhysicalNumId) {
        this.sendPhysicalNumId = sendPhysicalNumId;
    }

    public Long getZoneNumId() {
        return zoneNumId;
    }

    public void setZoneNumId(Long zoneNumId) {
        this.zoneNumId = zoneNumId;
    }

    public String getWmsReservedNo() {
        return wmsReservedNo;
    }

    public void setWmsReservedNo(String wmsReservedNo) {
        this.wmsReservedNo = wmsReservedNo;
    }

    public String getWmsTranReservedNumId() {
        return wmsTranReservedNumId;
    }

    public void setWmsTranReservedNumId(String wmsTranReservedNumId) {
        this.wmsTranReservedNumId = wmsTranReservedNumId;
    }

    public Date getSupConfirmDate() {
        return supConfirmDate;
    }

    public void setSupConfirmDate(Date supConfirmDate) {
        this.supConfirmDate = supConfirmDate;
    }

    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }

    public String getSupRecesNo() {
        return supRecesNo;
    }

    public void setSupRecesNo(String supRecesNo) {
        this.supRecesNo = supRecesNo;
    }

    public String getSupSysNo() {
        return supSysNo;
    }

    public void setSupSysNo(String supSysNo) {
        this.supSysNo = supSysNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getStoreType() {
        return storeType;
    }

    public void setStoreType(Long storeType) {
        this.storeType = storeType;
    }

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }

    public Long getLogisticsType() {
        return logisticsType;
    }

    public void setLogisticsType(Long logisticsType) {
        this.logisticsType = logisticsType;
    }

    public String getPromotionGrade() {
        return promotionGrade;
    }

    public void setPromotionGrade(String promotionGrade) {
        this.promotionGrade = promotionGrade;
    }

    public Long getConfirmType() {
        return confirmType;
    }

    public void setConfirmType(Long confirmType) {
        this.confirmType = confirmType;
    }

    public Long getCarrySign() {
        return carrySign;
    }

    public void setCarrySign(Long carrySign) {
        this.carrySign = carrySign;
    }

    public Long getPurchaseTypeNumId() {
        return purchaseTypeNumId;
    }

    public void setPurchaseTypeNumId(Long purchaseTypeNumId) {
        this.purchaseTypeNumId = purchaseTypeNumId;
    }

    public Long getVoucherNumId() {
        return voucherNumId;
    }

    public void setVoucherNumId(Long voucherNumId) {
        this.voucherNumId = voucherNumId;
    }

    public Long getCrossSubCompanySign() {
        return crossSubCompanySign;
    }

    public void setCrossSubCompanySign(Long crossSubCompanySign) {
        this.crossSubCompanySign = crossSubCompanySign;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Long getTenantNumId() {
        return tenantNumId;
    }

    public void setTenantNumId(Long tenantNumId) {
        this.tenantNumId = tenantNumId;
    }

    public Long getDataSign() {
        return dataSign;
    }

    public void setDataSign(Long dataSign) {
        this.dataSign = dataSign;
    }

    public Date getCreateDtme() {
        return createDtme;
    }

    public void setCreateDtme(Date createDtme) {
        this.createDtme = createDtme;
    }

    public Date getLastUpdtme() {
        return lastUpdtme;
    }

    public void setLastUpdtme(Date lastUpdtme) {
        this.lastUpdtme = lastUpdtme;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public void setLastUpdateUserId(Long lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public String getCancelsign() {
        return cancelsign;
    }

    public void setCancelsign(String cancelsign) {
        this.cancelsign = cancelsign;
    }
}
