package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/5/17 17:13
 */
public class WmBlReceiptBudDtl implements Serializable {
    private static final long serialVersionUID = 9135759877702024178L;
    private Long costTypeTemp;

    private String itemid;
    private String reservedNo;
    private Long subUnitNumId;
    private Date supConfirmDate;
    private Long storageNumId;
    private Long physicalNumId;
    private String promotionGrade;
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
    private Double pmtQty;
    private Long pmtMaterial;
    private Double price;
    private Double totalAmount;
    private Double taxRate;
    private Double taxAmount;
    private Double confirmQty;
    private Double confirmPmtQty;
    private Double inConfirmQty;
    private Double inConfirmPmtQty;
    private Long settlementType;
    private Long logisticsType;
    private String supProduceDate;

    /**
     * 订单日期
     */
    private Date orderDate;

    /**
     * 采购单状态
     */
    private Long statusNumId;

    /**
     * 引用数量
     */
    private Double citeQty;

    /**
     * 结转标识
     */
    private Long carrySign;
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

    public Long getCostTypeTemp() {
        return costTypeTemp;
    }

    public void setCostTypeTemp(Long costTypeTemp) {
        this.costTypeTemp = costTypeTemp;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
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

    public Double getPmtQty() {
        return pmtQty;
    }

    public void setPmtQty(Double pmtQty) {
        this.pmtQty = pmtQty;
    }

    public Long getPmtMaterial() {
        return pmtMaterial;
    }

    public void setPmtMaterial(Long pmtMaterial) {
        this.pmtMaterial = pmtMaterial;
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

    public Double getConfirmQty() {
        return confirmQty;
    }

    public void setConfirmQty(Double confirmQty) {
        this.confirmQty = confirmQty;
    }

    public Double getConfirmPmtQty() {
        return confirmPmtQty;
    }

    public void setConfirmPmtQty(Double confirmPmtQty) {
        this.confirmPmtQty = confirmPmtQty;
    }

    public Double getInConfirmQty() {
        return inConfirmQty;
    }

    public void setInConfirmQty(Double inConfirmQty) {
        this.inConfirmQty = inConfirmQty;
    }

    public Double getInConfirmPmtQty() {
        return inConfirmPmtQty;
    }

    public void setInConfirmPmtQty(Double inConfirmPmtQty) {
        this.inConfirmPmtQty = inConfirmPmtQty;
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

    public String getSupProduceDate() {
        return supProduceDate;
    }

    public void setSupProduceDate(String supProduceDate) {
        this.supProduceDate = supProduceDate;
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
