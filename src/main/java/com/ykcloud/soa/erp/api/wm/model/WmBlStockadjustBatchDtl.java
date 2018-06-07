package com.ykcloud.soa.erp.api.wm.model;

import java.util.Date;

public class WmBlStockadjustBatchDtl {
    private static final long serialVersionUID = 1L;

    private String series;
    private String reservedNo;
    private Long tenantNumId;
    private Long subUnitNumId;
    private Date justDate;
    private Long storageNumId;
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
    private Long locNumId;
    private Double costPrice;
    private Double costAmount;
    private Double taxRate;
    private Double taxAmount;
    private Long settlementType;
    private Long logisticsType;
    private String batchSeries;
    private String batchPromotionGrade;
    private Long batchSupplyUnitNumId;
    private Double batchPoPrice;
    private String supPromotionGrade;
    private String firstBatchSeries;
    private Date firstRecDate;
    private Long firstSupplyUnitNumId;
    private Double supPrice;
    private String supProduceDate;
    private String itemid;
    private Long supplyUnitNumId;
	private Long ptyNum1;
	private Long ptyNum2;
	private Long ptyNum3;
	private Long departNumId;

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

    public Date getJustDate() {
        return justDate;
    }

    public void setJustDate(Date justDate) {
        this.justDate = justDate;
    }

    public Long getStorageNumId() {
        return storageNumId;
    }

    public void setStorageNumId(Long storageNumId) {
        this.storageNumId = storageNumId;
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

    public Long getLocNumId() {
        return locNumId;
    }

    public void setLocNumId(Long locNumId) {
        this.locNumId = locNumId;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(Double costAmount) {
        this.costAmount = costAmount;
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

    public String getBatchSeries() {
        return batchSeries;
    }

    public void setBatchSeries(String batchSeries) {
        this.batchSeries = batchSeries;
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

    public Double getBatchPoPrice() {
        return batchPoPrice;
    }

    public void setBatchPoPrice(Double batchPoPrice) {
        this.batchPoPrice = batchPoPrice;
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
}
