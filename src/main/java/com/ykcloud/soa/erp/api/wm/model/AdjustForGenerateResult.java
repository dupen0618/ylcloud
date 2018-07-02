package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

/**
 * 生成调整结果表所需数据
 *
 * @author Sealin
 * @date 2018-07-02
 */
public class AdjustForGenerateResult implements Serializable {
    private static final long serialVersionUID = 8739184183098740331L;
    private String reservedNo;
    private Long physicalNumId;
    private Long itemNumId;
    private Long divNumId;
    private Long classifyNumId;
    private String barcode;
    private String itemName;
    private Long productOriginNumId;
    private Double conversionQty;
    private Long conversionUnitNumId;
    private String conversionStyleDesc;
    private Double packageQty;
    private Double adjustPrice;
    private String batchSeries;
    private Long batchPromotionGrade;
    private Long batchSupplyUnitNumId;
    private Double batchPoPrice;
    private Long carrySign;
    private String cancelsign;
    private String itemid;
    private Long supplyUnitNumId;
    private String remark;
    private Long typeNumId;
    private Long statusNumId;

    public Long getPhysicalNumId() {
        return physicalNumId;
    }

    public void setPhysicalNumId(Long physicalNumId) {
        this.physicalNumId = physicalNumId;
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

    public Long getClassifyNumId() {
        return classifyNumId;
    }

    public void setClassifyNumId(Long classifyNumId) {
        this.classifyNumId = classifyNumId;
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

    public Double getPackageQty() {
        return packageQty;
    }

    public void setPackageQty(Double packageQty) {
        this.packageQty = packageQty;
    }

    public Double getAdjustPrice() {
        return adjustPrice;
    }

    public void setAdjustPrice(Double adjustPrice) {
        this.adjustPrice = adjustPrice;
    }

    public String getBatchSeries() {
        return batchSeries;
    }

    public void setBatchSeries(String batchSeries) {
        this.batchSeries = batchSeries;
    }

    public Long getBatchPromotionGrade() {
        return batchPromotionGrade;
    }

    public void setBatchPromotionGrade(Long batchPromotionGrade) {
        this.batchPromotionGrade = batchPromotionGrade;
    }

    public Long getBatchSupplyUnitNumId() {
        return batchSupplyUnitNumId;
    }

    public void setBatchSupplyUnitNumId(Long batchSupplyUnitNumId) {
        this.batchSupplyUnitNumId = batchSupplyUnitNumId;
    }

    public Double getBatchPoPrice() {
        return batchPoPrice;
    }

    public void setBatchPoPrice(Double batchPoPrice) {
        this.batchPoPrice = batchPoPrice;
    }

    public Long getCarrySign() {
        return carrySign;
    }

    public void setCarrySign(Long carrySign) {
        this.carrySign = carrySign;
    }

    public String getCancelsign() {
        return cancelsign;
    }

    public void setCancelsign(String cancelsign) {
        this.cancelsign = cancelsign;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public Long getStatusNumId() {
        return statusNumId;
    }

    public void setStatusNumId(Long statusNumId) {
        this.statusNumId = statusNumId;
    }
}
