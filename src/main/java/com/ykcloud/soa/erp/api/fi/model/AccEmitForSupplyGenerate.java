package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 调整总部发出商品
 *
 * @author Sealin Created on 2018-06-23
 */
public class AccEmitForSupplyGenerate implements Serializable {
    private static final long serialVersionUID = 8093399978337539932L;
    /**
     * 商品ID
     */
    private Long itemNumId;
    /**
     * 调整后的金额
     */
    private Double adjustPrice;
    /**
     * 税率
     */
    private Double taxRate;
    /**
     * 订单日期
     */
    private Date orderDate;
    /**
     * 数量
     */
    private Double Qty;
    /**
     * 业务类型
     */
    private Long settlementType;

    /**
     * 物理仓
     */
    private Long physicalNumId;

    /**
     * 产地
     */
    private Long productOriginId;
    /**
     * 批次表中的series
     */
    private String batchSeries;
    private Double packageQty;
    private Double oldPrice;
    private Long batchPromotionGrade;
    private Double batchPoPrice;
    private Long firstSupplyUnitNumId;

    /**
     * 获取 itemNumId
     *
     * @author Sealin
     */
    public Long getItemNumId() {
        return itemNumId;
    }

    /**
     * 设置 itemNumId
     *
     * @author Sealin
     */
    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    /**
     * 获取 adjustPrice
     *
     * @author Sealin
     */
    public Double getAdjustPrice() {
        return adjustPrice;
    }

    /**
     * 设置 adjustPrice
     *
     * @author Sealin
     */
    public void setAdjustPrice(Double adjustPrice) {
        this.adjustPrice = adjustPrice;
    }

    /**
     * 获取 taxRate
     *
     * @author Sealin
     */
    public Double getTaxRate() {
        return taxRate;
    }

    /**
     * 设置 taxRate
     *
     * @author Sealin
     */
    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * 获取 orderDate
     *
     * @author Sealin
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * 设置 orderDate
     *
     * @author Sealin
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * 获取 Qty
     *
     * @author Sealin
     */
    public Double getQty() {
        return Qty;
    }

    /**
     * 设置 Qty
     *
     * @author Sealin
     */
    public void setQty(Double qty) {
        Qty = qty;
    }

    /**
     * 获取 settlementType
     *
     * @author Sealin
     */
    public Long getSettlementType() {
        return settlementType;
    }

    /**
     * 设置 settlementType
     *
     * @author Sealin
     */
    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }

    /**
     * 获取 physicalNumId
     *
     * @author Sealin
     */
    public Long getPhysicalNumId() {
        return physicalNumId;
    }

    /**
     * 设置 physicalNumId
     *
     * @author Sealin
     */
    public void setPhysicalNumId(Long physicalNumId) {
        this.physicalNumId = physicalNumId;
    }

    /**
     * 获取 productOriginId
     *
     * @author Sealin
     */
    public Long getProductOriginId() {
        return productOriginId;
    }

    /**
     * 设置 productOriginId
     *
     * @author Sealin
     */
    public void setProductOriginId(Long productOriginId) {
        this.productOriginId = productOriginId;
    }

    /**
     * 获取 batchSeries
     *
     * @author Sealin
     */
    public String getBatchSeries() {
        return batchSeries;
    }

    /**
     * 设置 batchSeries
     *
     * @author Sealin
     */
    public void setBatchSeries(String batchSeries) {
        this.batchSeries = batchSeries;
    }

    /**
     * 获取 packageQty
     *
     * @author Sealin
     */
    public Double getPackageQty() {
        return packageQty;
    }

    /**
     * 设置 packageQty
     *
     * @author Sealin
     */
    public void setPackageQty(Double packageQty) {
        this.packageQty = packageQty;
    }

    /**
     * 获取 oldPrice
     *
     * @author Sealin
     */
    public Double getOldPrice() {
        return oldPrice;
    }

    /**
     * 设置 oldPrice
     *
     * @author Sealin
     */
    public void setOldPrice(Double oldPrice) {
        this.oldPrice = oldPrice;
    }

    /**
     * 获取 batchPromotionGrade
     *
     * @author Sealin
     */
    public Long getBatchPromotionGrade() {
        return batchPromotionGrade;
    }

    /**
     * 设置 batchPromotionGrade
     *
     * @author Sealin
     */
    public void setBatchPromotionGrade(Long batchPromotionGrade) {
        this.batchPromotionGrade = batchPromotionGrade;
    }

    /**
     * 获取 batchPoPrice
     *
     * @author Sealin
     */
    public Double getBatchPoPrice() {
        return batchPoPrice;
    }

    /**
     * 设置 batchPoPrice
     *
     * @author Sealin
     */
    public void setBatchPoPrice(Double batchPoPrice) {
        this.batchPoPrice = batchPoPrice;
    }

    /**
     * 获取 firstSupplyUnitNumId
     *
     * @author Sealin
     */
    public Long getFirstSupplyUnitNumId() {
        return firstSupplyUnitNumId;
    }

    /**
     * 设置 firstSupplyUnitNumId
     *
     * @author Sealin
     */
    public void setFirstSupplyUnitNumId(Long firstSupplyUnitNumId) {
        this.firstSupplyUnitNumId = firstSupplyUnitNumId;
    }
}
