package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/5/17 17:09
 */
public class WmBlShipDtl implements Serializable {
    private static final long serialVersionUID = 6430659732975675494L;
    private String reservedNo;
    private String traySerlno;
    private String soNumId;
    private String tmlNumId;
    private String tmlLine;
    private Long subUnitNumId;
    private Long physicalNumId;
    private String promotionGrade;
    private Long itemNumId;
    private Long divNumId;
    private String itemid;
    private String itemName;
    private String barcode;
    private Long productOriginNumId;
    private Double conversionQty;
    private Long conversionUnitNumId;
    private String conversionStyleDesc;
    private Long pmtMaterial;
    private double qty;
    private Double pmtQty;
    private double rate;
    private Double tradePrice;
    private Double totalAmount;
    private Double taxAmount;
    private Long settlementType;
    private Long logisticsType;
    private Long carrySign;
    private Double packageQty;
    private Double citeQty;
    private Double receiptQty;//返配、领料退库需求数量
    private Double inReceiptQty;//返配、领料退库内部确认数量
    private Double receiptPmtQty;//返配、领料退库赠品需求数量
    private Double inReceiptPmtQty;//返配、领料退库赠品内部确认数量
    private Date shipDate;

    private Long recPhysicalNumId;//收货物理仓

    private Long recStorageNumId;//收货逻辑仓
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

    public String getTraySerlno() {
        return traySerlno;
    }

    public void setTraySerlno(String traySerlno) {
        this.traySerlno = traySerlno;
    }

    public String getSoNumId() {
        return soNumId;
    }

    public void setSoNumId(String soNumId) {
        this.soNumId = soNumId;
    }

    public String getTmlNumId() {
        return tmlNumId;
    }

    public void setTmlNumId(String tmlNumId) {
        this.tmlNumId = tmlNumId;
    }

    public String getTmlLine() {
        return tmlLine;
    }

    public void setTmlLine(String tmlLine) {
        this.tmlLine = tmlLine;
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

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
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

    public Long getPmtMaterial() {
        return pmtMaterial;
    }

    public void setPmtMaterial(Long pmtMaterial) {
        this.pmtMaterial = pmtMaterial;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public Double getPmtQty() {
        return pmtQty;
    }

    public void setPmtQty(Double pmtQty) {
        this.pmtQty = pmtQty;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
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

    public Long getCarrySign() {
        return carrySign;
    }

    public void setCarrySign(Long carrySign) {
        this.carrySign = carrySign;
    }

    public Double getPackageQty() {
        return packageQty;
    }

    public void setPackageQty(Double packageQty) {
        this.packageQty = packageQty;
    }

    public Double getCiteQty() {
        return citeQty;
    }

    public void setCiteQty(Double citeQty) {
        this.citeQty = citeQty;
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

    public Double getReceiptPmtQty() {
        return receiptPmtQty;
    }

    public void setReceiptPmtQty(Double receiptPmtQty) {
        this.receiptPmtQty = receiptPmtQty;
    }

    public Double getInReceiptPmtQty() {
        return inReceiptPmtQty;
    }

    public void setInReceiptPmtQty(Double inReceiptPmtQty) {
        this.inReceiptPmtQty = inReceiptPmtQty;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public Long getRecPhysicalNumId() {
        return recPhysicalNumId;
    }

    public void setRecPhysicalNumId(Long recPhysicalNumId) {
        this.recPhysicalNumId = recPhysicalNumId;
    }

    public Long getRecStorageNumId() {
        return recStorageNumId;
    }

    public void setRecStorageNumId(Long recStorageNumId) {
        this.recStorageNumId = recStorageNumId;
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
