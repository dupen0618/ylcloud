package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/5/31 15:37
 */
public class WmBlShipBatchDtl implements Serializable {
    private static final long serialVersionUID = 213884987182989429L;

    private String series;
    private String reservedNo;
    private String soLine;
    private String soNumId;
    private Long tenantNumId;
    private Long subUnitNumId;
    private Date shipDate;
    private Long physicalNumId;
    private String promotionGrade;
    private String supPromotionGrade;
    private Long itemNumId;
    private Long divNumId;
    private String itemName;
    private String barcode;
    private Long productOriginNumId;
    private Double conversionQty;
    private Long conversionUnitNumId;
    private String conversionStyleDesc;
    private Double qty;
    private Double citeQty;
    private Long pmtSign;
    private Double taxRate;
    private Double tradePrice;
    private Double totalAmount;
    private Double taxAmount;
    private String batchSeries;
    private String batchPromotionGrade;
    private Long batchSupplyUnitNumId;
    private Double batchPoPrice;
    private String firstBatchSeries;
    private Date firstRecDate;
    private Long firstSupplyUnitNumId;
    private Double supPrice;
    private String supProduceDate;
    private Long settlementType;
    private Long logisticsType;
    private Long createUserId;
    private Long lastUpdateUserId;
    private Date createDtme;
    private Date lastUpdtme;
    private Long carrySign;
    private Long dataSign;
    private String cancelsign;
    private String itemid;
    private Double packageQty;
    private Double receiptQty;//返配、领料退库需求数量
    private Double inReceiptQty;//返配、领料退库内部确认数量
    private Long costTypeTemp;
    private Double costPrice;
    private Double costAmount;
    private Double costTaxAmount;

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

    public String getSoLine() {
        return soLine;
    }

    public void setSoLine(String soLine) {
        this.soLine = soLine;
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

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
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

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getCiteQty() {
        return citeQty;
    }

    public void setCiteQty(Double citeQty) {
        this.citeQty = citeQty;
    }

    public Long getPmtSign() {
        return pmtSign;
    }

    public void setPmtSign(Long pmtSign) {
        this.pmtSign = pmtSign;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Double getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(Double tradePrice) {
        this.tradePrice = tradePrice;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
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

    public Double getPackageQty() {
        return packageQty;
    }

    public void setPackageQty(Double packageQty) {
        this.packageQty = packageQty;
    }

    public Double getReceiptQty() {
        return receiptQty;
    }

    public void setReceiptQty(Double receiptQty) {
        this.receiptQty = receiptQty;
    }

    public Double getInReceiptQty() {
        return inReceiptQty;
    }

    public void setInReceiptQty(Double inReceiptQty) {
        this.inReceiptQty = inReceiptQty;
    }

    public Long getCostTypeTemp() {
        return costTypeTemp;
    }

    public void setCostTypeTemp(Long costTypeTemp) {
        this.costTypeTemp = costTypeTemp;
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

    public Double getCostTaxAmount() {
        return costTaxAmount;
    }

    public void setCostTaxAmount(Double costTaxAmount) {
        this.costTaxAmount = costTaxAmount;
    }
}
