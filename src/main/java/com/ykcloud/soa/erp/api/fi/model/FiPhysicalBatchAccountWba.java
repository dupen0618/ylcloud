package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/4/10 13:34
 */
public class FiPhysicalBatchAccountWba implements Serializable {
    private static final long serialVersionUID = -992418502169450128L;
    private Long series;
    private Long tenantNumId;
    private Long subUnitNumId;
    private Long itemNumId;
    private Long divNumId;
    private String barcode;
    private String itemName;
    private Long productOriginNumId;
    private Double conversionQty;
    private Long conversionUnitNumId;
    private String conversionStyleDesc;
    private Long supplyUnitNumId;
    private Long physicalNumId;
    private Date orderDate;
    private String typeNumId;
    private String billTypeNumId;
    private Long triggerBillid;
    private Long triggerBillLine;
    private Long assistLine;
    private Long batchSeries;
    private Long promotionGrade;
    private Date recDate;
    private Double amount;
    private Double price;
    private Long supPromotionGrade;
    private Long firstBatchSeries;
    private Date firstRecDate;
    private Long firstSupplyUnitNumId;
    private Double supPrice;
    private String supProduceDate;
    private Double reservedQty;
    private Double tradePrice;
    private Double batchPrice;
    private Double reservedAmount;
    private Long balanceFunction;
    private Long createUserId;
    private Long lastUpdateUserId;
    private Date createDtme;
    private Date lastUpdtme;
    private Long carrySign;
    private Long dataSign;
    private String itemid;

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
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

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
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

    public String getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(String typeNumId) {
        this.typeNumId = typeNumId;
    }

    public String getBillTypeNumId() {
        return billTypeNumId;
    }

    public void setBillTypeNumId(String billTypeNumId) {
        this.billTypeNumId = billTypeNumId;
    }

    public Long getTriggerBillid() {
        return triggerBillid;
    }

    public void setTriggerBillid(Long triggerBillid) {
        this.triggerBillid = triggerBillid;
    }

    public Long getTriggerBillLine() {
        return triggerBillLine;
    }

    public void setTriggerBillLine(Long triggerBillLine) {
        this.triggerBillLine = triggerBillLine;
    }

    public Long getAssistLine() {
        return assistLine;
    }

    public void setAssistLine(Long assistLine) {
        this.assistLine = assistLine;
    }

    public Long getBatchSeries() {
        return batchSeries;
    }

    public void setBatchSeries(Long batchSeries) {
        this.batchSeries = batchSeries;
    }

    public Long getPromotionGrade() {
        return promotionGrade;
    }

    public void setPromotionGrade(Long promotionGrade) {
        this.promotionGrade = promotionGrade;
    }

    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getSupPromotionGrade() {
        return supPromotionGrade;
    }

    public void setSupPromotionGrade(Long supPromotionGrade) {
        this.supPromotionGrade = supPromotionGrade;
    }

    public Long getFirstBatchSeries() {
        return firstBatchSeries;
    }

    public void setFirstBatchSeries(Long firstBatchSeries) {
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

    public Double getSupPrice() {
        return supPrice;
    }

    public void setSupPrice(Double supPrice) {
        this.supPrice = supPrice;
    }

    public String getSupProduceDate() {
        return supProduceDate;
    }

    public void setSupProduceDate(String supProduceDate) {
        this.supProduceDate = supProduceDate;
    }

    public Double getReservedQty() {
        return reservedQty;
    }

    public void setReservedQty(Double reservedQty) {
        this.reservedQty = reservedQty;
    }

    public Double getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(Double tradePrice) {
        this.tradePrice = tradePrice;
    }

    public Double getBatchPrice() {
        return batchPrice;
    }

    public void setBatchPrice(Double batchPrice) {
        this.batchPrice = batchPrice;
    }

    public Double getReservedAmount() {
        return reservedAmount;
    }

    public void setReservedAmount(Double reservedAmount) {
        this.reservedAmount = reservedAmount;
    }

    public Long getBalanceFunction() {
        return balanceFunction;
    }

    public void setBalanceFunction(Long balanceFunction) {
        this.balanceFunction = balanceFunction;
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

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }
}
