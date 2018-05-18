package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/5/17 17:02
 */
public class WmBlShipHdr implements Serializable {
    private static final long serialVersionUID = 420918571431357472L;
    private String series;

    private String reservedNo;

    private String poNumId;

    private String receiptNo;

    private String soNumId;

    private String tmlNumId;

    private Long tenantNumId;

    private Long subUnitNumId;

    private Date shipDate;

    private Long unitNumId;

    private Long custUnitNumId;

    private Long custSubUnitNumId;

    private Long statusNumId;

    private Long soFromType;

    private Long typeNumId;

    private Long storageNumId;

    private Long physicalNumId;

    private Long budNumId;

    private Long recStorageNumId;

    private Long recPhysicalNumId;

    private String recUser;

    private String recTel;

    private String wmsToB2bShipNo;

    private String wmsToB2bReceiptNo;

    private Long recvAdrNumId;

    private Date recDate;

    private String carrierUnit;

    private String consignmentNo;

    private String remark;

    private String cancelsign;

    private Long createUserId;

    private Long lastUpdateUserId;

    private Date createDtme;

    private Date lastUpdtme;

    private Long carrySign;

    private Long dataSign;

    private String applyNumId;

    private Long confirmType;//rf验收更新成1，pc验收更新成2；默认为0
    private Long crossSubCompanySign;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

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

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public String getSoNumId() {
        return soNumId;
    }

    public void setSoNumId(String soNumId) {
        this.soNumId = soNumId;
    }

    public String getTmlNumId() {
        return tmlNumId;
    }

    public void setTmlNumId(String tmlNumId) {
        this.tmlNumId = tmlNumId;
    }

    public Long getTenantNumId() {
        return tenantNumId;
    }

    public void setTenantNumId(Long tenantNumId) {
        this.tenantNumId = tenantNumId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public Long getUnitNumId() {
        return unitNumId;
    }

    public void setUnitNumId(Long unitNumId) {
        this.unitNumId = unitNumId;
    }

    public Long getCustUnitNumId() {
        return custUnitNumId;
    }

    public void setCustUnitNumId(Long custUnitNumId) {
        this.custUnitNumId = custUnitNumId;
    }

    public Long getCustSubUnitNumId() {
        return custSubUnitNumId;
    }

    public void setCustSubUnitNumId(Long custSubUnitNumId) {
        this.custSubUnitNumId = custSubUnitNumId;
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

    public Long getBudNumId() {
        return budNumId;
    }

    public void setBudNumId(Long budNumId) {
        this.budNumId = budNumId;
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

    public String getRecUser() {
        return recUser;
    }

    public void setRecUser(String recUser) {
        this.recUser = recUser;
    }

    public String getRecTel() {
        return recTel;
    }

    public void setRecTel(String recTel) {
        this.recTel = recTel;
    }

    public String getWmsToB2bShipNo() {
        return wmsToB2bShipNo;
    }

    public void setWmsToB2bShipNo(String wmsToB2bShipNo) {
        this.wmsToB2bShipNo = wmsToB2bShipNo;
    }

    public String getWmsToB2bReceiptNo() {
        return wmsToB2bReceiptNo;
    }

    public void setWmsToB2bReceiptNo(String wmsToB2bReceiptNo) {
        this.wmsToB2bReceiptNo = wmsToB2bReceiptNo;
    }

    public Long getRecvAdrNumId() {
        return recvAdrNumId;
    }

    public void setRecvAdrNumId(Long recvAdrNumId) {
        this.recvAdrNumId = recvAdrNumId;
    }

    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }

    public String getCarrierUnit() {
        return carrierUnit;
    }

    public void setCarrierUnit(String carrierUnit) {
        this.carrierUnit = carrierUnit;
    }

    public String getConsignmentNo() {
        return consignmentNo;
    }

    public void setConsignmentNo(String consignmentNo) {
        this.consignmentNo = consignmentNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCancelsign() {
        return cancelsign;
    }

    public void setCancelsign(String cancelsign) {
        this.cancelsign = cancelsign;
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

    public Long getCarrySign() {
        return carrySign;
    }

    public void setCarrySign(Long carrySign) {
        this.carrySign = carrySign;
    }

    public Long getDataSign() {
        return dataSign;
    }

    public void setDataSign(Long dataSign) {
        this.dataSign = dataSign;
    }

    public String getApplyNumId() {
        return applyNumId;
    }

    public void setApplyNumId(String applyNumId) {
        this.applyNumId = applyNumId;
    }

    public Long getConfirmType() {
        return confirmType;
    }

    public void setConfirmType(Long confirmType) {
        this.confirmType = confirmType;
    }

    public Long getCrossSubCompanySign() {
        return crossSubCompanySign;
    }

    public void setCrossSubCompanySign(Long crossSubCompanySign) {
        this.crossSubCompanySign = crossSubCompanySign;
    }
}
