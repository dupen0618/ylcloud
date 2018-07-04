package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;

/**
 * 生成金额调整结果所需字段
 *
 * @author Sealin
 * @date 2018-07-03
 */
public class AdjustResultForGenerate implements Serializable {
    private static final long serialVersionUID = -4986848627033571152L;
    private String barcode;
    private Double batchPoPrice;
    private String batchPromotionGrade;
    private Long batchSupplyUnitNumId;
    private Long carrySign;
    private Long classifyNumId;
    private Double conversionQty;
    private String conversionStyleDesc;
    private Long conversionUnitNumId;
    private Long divNumId;
    private String itemName;
    private Long itemNumId;
    private String itemid;
    private Double adjustPrice;
    private Double costPrice;
    private Double packageQty;
    private Long productOriginNumId;
    private String cancelsign;
    private String batchSeries;
    private Double qty;
    private Long physical;
    private Long supplyUnitNumId;
    private Double adjustAmount;
    private Long settlementType;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Double getBatchPoPrice() {
        return batchPoPrice;
    }

    public void setBatchPoPrice(Double batchPoPrice) {
        this.batchPoPrice = batchPoPrice;
    }

    public String getBatchPromotionGrade() {
        return batchPromotionGrade;
    }

    public void setBatchPromotionGrade(String batchPromotionGrade) {
        this.batchPromotionGrade = batchPromotionGrade;
    }

    public Long getBatchSupplyUnitNumId() {
        return batchSupplyUnitNumId;
    }

    public void setBatchSupplyUnitNumId(Long batchSupplyUnitNumId) {
        this.batchSupplyUnitNumId = batchSupplyUnitNumId;
    }

    public Long getCarrySign() {
        return carrySign;
    }

    public void setCarrySign(Long carrySign) {
        this.carrySign = carrySign;
    }

    public Long getClassifyNumId() {
        return classifyNumId;
    }

    public void setClassifyNumId(Long classifyNumId) {
        this.classifyNumId = classifyNumId;
    }

    public Double getConversionQty() {
        return conversionQty;
    }

    public void setConversionQty(Double conversionQty) {
        this.conversionQty = conversionQty;
    }

    public String getConversionStyleDesc() {
        return conversionStyleDesc;
    }

    public void setConversionStyleDesc(String conversionStyleDesc) {
        this.conversionStyleDesc = conversionStyleDesc;
    }

    public Long getConversionUnitNumId() {
        return conversionUnitNumId;
    }

    public void setConversionUnitNumId(Long conversionUnitNumId) {
        this.conversionUnitNumId = conversionUnitNumId;
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

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public Double getAdjustPrice() {
        return adjustPrice;
    }

    public void setAdjustPrice(Double adjustPrice) {
        this.adjustPrice = adjustPrice;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getPackageQty() {
        return packageQty;
    }

    public void setPackageQty(Double packageQty) {
        this.packageQty = packageQty;
    }

    public Long getProductOriginNumId() {
        return productOriginNumId;
    }

    public void setProductOriginNumId(Long productOriginNumId) {
        this.productOriginNumId = productOriginNumId;
    }

    public String getCancelsign() {
        return cancelsign;
    }

    public void setCancelsign(String cancelsign) {
        this.cancelsign = cancelsign;
    }

    public String getBatchSeries() {
        return batchSeries;
    }

    public void setBatchSeries(String batchSeries) {
        this.batchSeries = batchSeries;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Long getPhysical() {
        return physical;
    }

    public void setPhysical(Long physical) {
        this.physical = physical;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Double getAdjustAmount() {
        return adjustAmount;
    }

    public void setAdjustAmount(Double adjustAmount) {
        this.adjustAmount = adjustAmount;
    }

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }
}
