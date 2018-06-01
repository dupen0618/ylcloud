package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/3/27 10:09
 */
public class WmBlReceiptBudBatchDtl implements Serializable {
    private static final long serialVersionUID = -6332439506199822839L;
    private Long supplyUnitNumId;
    private Long costTypeTemp;
    private String reservedNo;
    private Long subUnitNumId;
    private Date supConfirmDate;
    private Long storageNumId;
    private Long physicalNumId;
    private String promotionGrade;
    private String supPromotionGrade;
    private Long itemNumId;
    private Long divNumId;
    private String barcode;
    private String itemName;
    private Long productOriginNumId;
    private Double conversionQty;
    private Long conversionUnitNumId;
    private String conversionStyleDesc;
    private Double packageQty;
    private Double qty;
    private Long pmtSign;
    private Double exchangeRate;
    private Long settlementType;
    private Long logisticsType;
    private Long firstSupplyUnitNumId;
    private String firstBatchid;
    private Date firstRecDate;
    private Double supPrice;
    private Long poLine;
    private String batchid;
    private Double price;
    private Double totalAmount;
    private Double taxRate;
    private Double taxAmount;
    private String actualProductionDate;
    private Double confirmQty;
    private String supProduceDate;
    private Long carrySign;
    private Double inConfirmQty;
    private Date orderDate;
    private Long statusNumId;
    private Double citeQty;
    private String batchSeries;
    private String firstBatchSeries;
    private String itemid;

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Long getCostTypeTemp() {
        return costTypeTemp;
    }

    public void setCostTypeTemp(Long costTypeTemp) {
        this.costTypeTemp = costTypeTemp;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getSupConfirmDate() {
        return supConfirmDate;
    }

    public void setSupConfirmDate(Date supConfirmDate) {
        this.supConfirmDate = supConfirmDate;
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

    public String getPromotionGrade() {
        return promotionGrade;
    }

    public void setPromotionGrade(String promotionGrade) {
        this.promotionGrade = promotionGrade;
    }

    public String getSupPromotionGrade() {
        return supPromotionGrade;
    }

    public void setSupPromotionGrade(String supPromotionGrade) {
        this.supPromotionGrade = supPromotionGrade;
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

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Long getPmtSign() {
        return pmtSign;
    }

    public void setPmtSign(Long pmtSign) {
        this.pmtSign = pmtSign;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
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

    public Long getFirstSupplyUnitNumId() {
        return firstSupplyUnitNumId;
    }

    public void setFirstSupplyUnitNumId(Long firstSupplyUnitNumId) {
        this.firstSupplyUnitNumId = firstSupplyUnitNumId;
    }

    public String getFirstBatchid() {
        return firstBatchid;
    }

    public void setFirstBatchid(String firstBatchid) {
        this.firstBatchid = firstBatchid;
    }

    public Date getFirstRecDate() {
        return firstRecDate;
    }

    public void setFirstRecDate(Date firstRecDate) {
        this.firstRecDate = firstRecDate;
    }

    public Double getSupPrice() {
        return supPrice;
    }

    public void setSupPrice(Double supPrice) {
        this.supPrice = supPrice;
    }

    public Long getPoLine() {
        return poLine;
    }

    public void setPoLine(Long poLine) {
        this.poLine = poLine;
    }

    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getActualProductionDate() {
        return actualProductionDate;
    }

    public void setActualProductionDate(String actualProductionDate) {
        this.actualProductionDate = actualProductionDate;
    }

    public Double getConfirmQty() {
        return confirmQty;
    }

    public void setConfirmQty(Double confirmQty) {
        this.confirmQty = confirmQty;
    }

    public String getSupProduceDate() {
        return supProduceDate;
    }

    public void setSupProduceDate(String supProduceDate) {
        this.supProduceDate = supProduceDate;
    }

    public Long getCarrySign() {
        return carrySign;
    }

    public void setCarrySign(Long carrySign) {
        this.carrySign = carrySign;
    }

    public Double getInConfirmQty() {
        return inConfirmQty;
    }

    public void setInConfirmQty(Double inConfirmQty) {
        this.inConfirmQty = inConfirmQty;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getStatusNumId() {
        return statusNumId;
    }

    public void setStatusNumId(Long statusNumId) {
        this.statusNumId = statusNumId;
    }

    public Double getCiteQty() {
        return citeQty;
    }

    public void setCiteQty(Double citeQty) {
        this.citeQty = citeQty;
    }

    public String getBatchSeries() {
        return batchSeries;
    }

    public void setBatchSeries(String batchSeries) {
        this.batchSeries = batchSeries;
    }

    public String getFirstBatchSeries() {
        return firstBatchSeries;
    }

    public void setFirstBatchSeries(String firstBatchSeries) {
        this.firstBatchSeries = firstBatchSeries;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }
}
