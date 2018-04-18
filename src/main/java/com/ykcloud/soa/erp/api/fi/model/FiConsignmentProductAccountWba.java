package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/4/18 11:31
 */
public class FiConsignmentProductAccountWba implements Serializable {

    private static final long serialVersionUID = 168984921682033967L;
    private Long itemNumId;
    private Long divNumId;
    private String barcode;
    private String itemName;
    private Long productOriginNumId;
    private Double conversionQty;
    private Long  conversionUnitNumId;
    private String conversionStyleDesc;
    private Long supplyUnitNumId;
    private Long physicalNumId;
    private Date orderDate;
    private Date recDate;
    private Long typeNumId;
    private String billTypeNumId;
    private Long triggerBillid;
    private Long triggerBillLine;
    private Long assistLine;
    private Long batchSeries;
    private String promotionGrade;
    private Double price;
    private String supPromotionGrade;
    private String firstBatchSeries;
    private Date firstRecDate;
    private Long firstSupplyUnitNumId;
    private Double supPrice;
    private String supProduceDate;
    private Long tradePrice;
    private Long batchPrice;
    private Double reservedQty;
    private Double amount;
    private Double taxamount;
    private Double costamount;
    private Long balanceFunction;
    private Long carrySign;
    private String series;
    private Long tenantNumId;
    private Long dataSign;
    private Date createDtme;
    private Date lastUpdtme;
    private Long createUserId;
    private Long lastUpdateUserId;
    private String cancelsign;


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

    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
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

    public String getPromotionGrade() {
        return promotionGrade;
    }

    public void setPromotionGrade(String promotionGrade) {
        this.promotionGrade = promotionGrade;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSupPromotionGrade() {
        return supPromotionGrade;
    }

    public void setSupPromotionGrade(String supPromotionGrade) {
        this.supPromotionGrade = supPromotionGrade;
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

    public Long getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(Long tradePrice) {
        this.tradePrice = tradePrice;
    }

    public Long getBatchPrice() {
        return batchPrice;
    }

    public void setBatchPrice(Long batchPrice) {
        this.batchPrice = batchPrice;
    }

    public Double getReservedQty() {
        return reservedQty;
    }

    public void setReservedQty(Double reservedQty) {
        this.reservedQty = reservedQty;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(Double taxamount) {
        this.taxamount = taxamount;
    }

    public Double getCostamount() {
        return costamount;
    }

    public void setCostamount(Double costamount) {
        this.costamount = costamount;
    }

    public Long getBalanceFunction() {
        return balanceFunction;
    }

    public void setBalanceFunction(Long balanceFunction) {
        this.balanceFunction = balanceFunction;
    }

    public Long getCarrySign() {
        return carrySign;
    }

    public void setCarrySign(Long carrySign) {
        this.carrySign = carrySign;
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
