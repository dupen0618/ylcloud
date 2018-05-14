package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 20:41:2018/5/11
 */
public class VirtualWmBlBatchDtl implements Serializable {
    private static final long serialVersionUID = -4599211870948419658L;

    private String reservedNo;
    private Long typeNumId;
    private Long batchTypeNumId;
    private String reservedLine;
    private Long subUnitNumId;
    private Long physicalNumId;
    private Date orderDate;
    private Long lockSign;
    private String promotionGrade;
    private Long itemNumId;
    private Long divNumId;
    private String itemName;
    private String barcode;
    private Long productOriginNumId;
    private Double conversionQty;
    private Long conversionUnitNumId;
    private String conversionStyleDesc;
    private Double price;
    private String supProduceDate;
    private String actualProductionDate;
    private Long ztSign;
    private Long pmtSign;
    private Long inOrder;
    private Double qty;
    private Double taxRate;
    private String batchId;
    private Long settlementType;
    private Long logisticsType;
    private String virtualBatchId;
    private String firstBatchSeries;
    private Date firstRecDate;
    private Long firstSupplyUnitNumId;
    private String supPromotionGrade;
    private Long supplyUnitNumId;
    private Double supPrice;
    private Double packageQty;
    private Long carrySign;
    private String itemid;
    private Long ptyNum1;
    private Long ptyNum2;
    private Long ptyNum3;
    private Long departNumId;
    private Long costTypeTemp;
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

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }

    public Long getBatchTypeNumId() {
        return batchTypeNumId;
    }

    public void setBatchTypeNumId(Long batchTypeNumId) {
        this.batchTypeNumId = batchTypeNumId;
    }

    public String getReservedLine() {
        return reservedLine;
    }

    public void setReservedLine(String reservedLine) {
        this.reservedLine = reservedLine;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getPhysicalNumId() {
        return physicalNumId;
    }

    public void setPhysicalNumId(Long physicalNumId) {
        this.physicalNumId = physicalNumId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getLockSign() {
        return lockSign;
    }

    public void setLockSign(Long lockSign) {
        this.lockSign = lockSign;
    }

    public String getPromotionGrade() {
        return promotionGrade;
    }

    public void setPromotionGrade(String promotionGrade) {
        this.promotionGrade = promotionGrade;
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

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Long getProductOriginNumId() {
        return productOriginNumId;
    }

    public void setProductOriginNumId(Long productOriginNumId) {
        this.productOriginNumId = productOriginNumId;
    }

    public Double getConversionQty() {
        return conversionQty;
    }

    public void setConversionQty(Double conversionQty) {
        this.conversionQty = conversionQty;
    }

    public Long getConversionUnitNumId() {
        return conversionUnitNumId;
    }

    public void setConversionUnitNumId(Long conversionUnitNumId) {
        this.conversionUnitNumId = conversionUnitNumId;
    }

    public String getConversionStyleDesc() {
        return conversionStyleDesc;
    }

    public void setConversionStyleDesc(String conversionStyleDesc) {
        this.conversionStyleDesc = conversionStyleDesc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSupProduceDate() {
        return supProduceDate;
    }

    public void setSupProduceDate(String supProduceDate) {
        this.supProduceDate = supProduceDate;
    }

    public String getActualProductionDate() {
        return actualProductionDate;
    }

    public void setActualProductionDate(String actualProductionDate) {
        this.actualProductionDate = actualProductionDate;
    }

    public Long getZtSign() {
        return ztSign;
    }

    public void setZtSign(Long ztSign) {
        this.ztSign = ztSign;
    }

    public Long getPmtSign() {
        return pmtSign;
    }

    public void setPmtSign(Long pmtSign) {
        this.pmtSign = pmtSign;
    }

    public Long getInOrder() {
        return inOrder;
    }

    public void setInOrder(Long inOrder) {
        this.inOrder = inOrder;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
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

    public String getVirtualBatchId() {
        return virtualBatchId;
    }

    public void setVirtualBatchId(String virtualBatchId) {
        this.virtualBatchId = virtualBatchId;
    }

    public String getFirstBatchSeries() {
        return firstBatchSeries;
    }

    public void setFirstBatchSeries(String firstBatchSeries) {
        this.firstBatchSeries = firstBatchSeries;
    }

    public Date getFirstRecDate() {
        return firstRecDate;
    }

    public void setFirstRecDate(Date firstRecDate) {
        this.firstRecDate = firstRecDate;
    }

    public Long getFirstSupplyUnitNumId() {
        return firstSupplyUnitNumId;
    }

    public void setFirstSupplyUnitNumId(Long firstSupplyUnitNumId) {
        this.firstSupplyUnitNumId = firstSupplyUnitNumId;
    }

    public String getSupPromotionGrade() {
        return supPromotionGrade;
    }

    public void setSupPromotionGrade(String supPromotionGrade) {
        this.supPromotionGrade = supPromotionGrade;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Double getSupPrice() {
        return supPrice;
    }

    public void setSupPrice(Double supPrice) {
        this.supPrice = supPrice;
    }

    public Double getPackageQty() {
        return packageQty;
    }

    public void setPackageQty(Double packageQty) {
        this.packageQty = packageQty;
    }

    public Long getCarrySign() {
        return carrySign;
    }

    public void setCarrySign(Long carrySign) {
        this.carrySign = carrySign;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public Long getPtyNum1() {
        return ptyNum1;
    }

    public void setPtyNum1(Long ptyNum1) {
        this.ptyNum1 = ptyNum1;
    }

    public Long getPtyNum2() {
        return ptyNum2;
    }

    public void setPtyNum2(Long ptyNum2) {
        this.ptyNum2 = ptyNum2;
    }

    public Long getPtyNum3() {
        return ptyNum3;
    }

    public void setPtyNum3(Long ptyNum3) {
        this.ptyNum3 = ptyNum3;
    }

    public Long getDepartNumId() {
        return departNumId;
    }

    public void setDepartNumId(Long departNumId) {
        this.departNumId = departNumId;
    }

    public Long getCostTypeTemp() {
        return costTypeTemp;
    }

    public void setCostTypeTemp(Long costTypeTemp) {
        this.costTypeTemp = costTypeTemp;
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
