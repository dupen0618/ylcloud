package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;

public class SdBlSoDtl implements Serializable {

    private String series;

    private String soNumId;

    private Long tenantNumId;

    private Long subUnitNumId;

    private Long orderDate;

    private Long statusNumId;

    private Long typeNumId;

    private Long itemNumId;

    private Long divNumId;

    private Double qty;

    private String receiptLine;//验收单行号

    private Double lockQty;//锁库数量

    private Long userNumId;

    private Long SETTLEMENT_TYPE;

    private Long supply_unit_num_id;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSoNumId() {
        return soNumId;
    }

    public void setSoNumId(String soNumId) {
        this.soNumId = soNumId;
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

    public Long getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Long orderDate) {
        this.orderDate = orderDate;
    }

    public Long getStatusNumId() {
        return statusNumId;
    }

    public void setStatusNumId(Long statusNumId) {
        this.statusNumId = statusNumId;
    }

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public Long getDivNumId() {
        return divNumId;
    }

    public void setDivNumId(Long divNumId) {
        this.divNumId = divNumId;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public String getReceiptLine() {
        return receiptLine;
    }

    public void setReceiptLine(String receiptLine) {
        this.receiptLine = receiptLine;
    }

    public Double getLockQty() {
        return lockQty;
    }

    public void setLockQty(Double lockQty) {
        this.lockQty = lockQty;
    }

    public Long getUserNumId() {
        return userNumId;
    }

    public void setUserNumId(Long userNumId) {

        this.userNumId = userNumId;
    }

    public Long getSETTLEMENT_TYPE() {
        return SETTLEMENT_TYPE;
    }

    public void setSETTLEMENT_TYPE(Long SETTLEMENT_TYPE) {
        this.SETTLEMENT_TYPE = SETTLEMENT_TYPE;
    }

    public Long getSupply_unit_num_id() {
        return supply_unit_num_id;
    }

    public void setSupply_unit_num_id(Long supply_unit_num_id) {
        this.supply_unit_num_id = supply_unit_num_id;
    }
}
