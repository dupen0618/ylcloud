package com.ykcloud.soa.erp.api.wm.model;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/3/29 11:35
 */
public class WmPhysicalAccountWba extends AbstractRequest{
    private long tenantNumId;
    private long subUnitNumId;
    private long itemNumId;
    private long divNumId;
    private String barcode;
    private String itemName;
    private long productOriginNumId;
    private long conversionQty;
    private long conversionUnitNumId;
    private String conversionStyleDesc;
    private long pmtMaterial;
    private long supplyUnitNumId;
    private long physicalNumId;
    private long classifyNumId;
    private Date orderDate;
    private long typeNumId;
    private long billTypeNumId;
    private long triggerBillid;
    private long triggerBillLine;
    private long assistLine;
    private long locNumId;
    private long packageQty;
    private long reservedQty;
    private Date recDate;
    private Long series;
    private Long createUserId;
    private Long lastUpdateUserId;
    private Date createDtme;
    private Date lastUpdtme;
    private Long carrySign;
    private Long dataSign;

    public Long getTenantNumId() {
        return tenantNumId;
    }

    public void setTenantNumId(long tenantNumId) {
        this.tenantNumId = tenantNumId;
    }

    public long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public long getDivNumId() {
        return divNumId;
    }

    public void setDivNumId(long divNumId) {
        this.divNumId = divNumId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public long getProductOriginNumId() {
        return productOriginNumId;
    }

    public void setProductOriginNumId(long productOriginNumId) {
        this.productOriginNumId = productOriginNumId;
    }

    public long getConversionQty() {
        return conversionQty;
    }

    public void setConversionQty(long conversionQty) {
        this.conversionQty = conversionQty;
    }

    public long getConversionUnitNumId() {
        return conversionUnitNumId;
    }

    public void setConversionUnitNumId(long conversionUnitNumId) {
        this.conversionUnitNumId = conversionUnitNumId;
    }

    public String getConversionStyleDesc() {
        return conversionStyleDesc;
    }

    public void setConversionStyleDesc(String conversionStyleDesc) {
        this.conversionStyleDesc = conversionStyleDesc;
    }

    public long getPmtMaterial() {
        return pmtMaterial;
    }

    public void setPmtMaterial(long pmtMaterial) {
        this.pmtMaterial = pmtMaterial;
    }

    public long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public long getPhysicalNumId() {
        return physicalNumId;
    }

    public void setPhysicalNumId(long physicalNumId) {
        this.physicalNumId = physicalNumId;
    }

    public long getClassifyNumId() {
        return classifyNumId;
    }

    public void setClassifyNumId(long classifyNumId) {
        this.classifyNumId = classifyNumId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(long typeNumId) {
        this.typeNumId = typeNumId;
    }

    public long getBillTypeNumId() {
        return billTypeNumId;
    }

    public void setBillTypeNumId(long billTypeNumId) {
        this.billTypeNumId = billTypeNumId;
    }

    public long getTriggerBillid() {
        return triggerBillid;
    }

    public void setTriggerBillid(long triggerBillid) {
        this.triggerBillid = triggerBillid;
    }

    public long getTriggerBillLine() {
        return triggerBillLine;
    }

    public void setTriggerBillLine(long triggerBillLine) {
        this.triggerBillLine = triggerBillLine;
    }

    public long getAssistLine() {
        return assistLine;
    }

    public void setAssistLine(long assistLine) {
        this.assistLine = assistLine;
    }

    public long getLocNumId() {
        return locNumId;
    }

    public void setLocNumId(long locNumId) {
        this.locNumId = locNumId;
    }

    public long getPackageQty() {
        return packageQty;
    }

    public void setPackageQty(long packageQty) {
        this.packageQty = packageQty;
    }

    public long getReservedQty() {
        return reservedQty;
    }

    public void setReservedQty(long reservedQty) {
        this.reservedQty = reservedQty;
    }

    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
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
}
