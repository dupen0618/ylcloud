package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 调整总部发出商品
 *
 * @author Sealin Created on 2018-06-23
 */
public class AccEmitForSupplyGenerate implements Serializable {
    private static final long serialVersionUID = 6086424926039883394L;
    /**
     * 商品ID
     */
    private Long itemNumId;
    /**
     * 调整金额
     */
    private Double adjustAmount;
    /**
     * 调整税金
     */
    private Double adjustTaxAmount;
    /**
     * 调整后的单价
     */
    private Double adjustPrice;
    /**
     * 调整后的税金总额(算好传过来避免再查询一次批次税率)
     */
    private Double finalTaxAmount;
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
    private String batchSeries;
    private Double packageQty;
    private Double oldPrice;
    private Long batchPromotionGrade;
    private Double batchPoPrice;

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
     * 获取 adjustAmount
     *
     * @author Sealin
     */
    public Double getAdjustAmount() {
        return adjustAmount;
    }

    /**
     * 设置 adjustAmount
     *
     * @author Sealin
     */
    public void setAdjustAmount(Double adjustAmount) {
        this.adjustAmount = adjustAmount;
    }

    /**
     * 获取 adjustTaxAmount
     *
     * @author Sealin
     */
    public Double getAdjustTaxAmount() {
        return adjustTaxAmount;
    }

    /**
     * 设置 adjustTaxAmount
     *
     * @author Sealin
     */
    public void setAdjustTaxAmount(Double adjustTaxAmount) {
        this.adjustTaxAmount = adjustTaxAmount;
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
     * 获取 finalTaxAmount
     *
     * @author Sealin
     */
    public Double getFinalTaxAmount() {
        return finalTaxAmount;
    }

    /**
     * 设置 finalTaxAmount
     *
     * @author Sealin
     */
    public void setFinalTaxAmount(Double finalTaxAmount) {
        this.finalTaxAmount = finalTaxAmount;
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
     * 获取 QTY
     *
     * @author Sealin
     */
    public Double getQty() {
        return Qty;
    }

    /**
     * 设置 QTY
     *
     * @author Sealin
     */
    public void setQty(Double Qty) {
        this.Qty = Qty;
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
     * @param batchPoPrice
     */
    public void setBatchPoPrice(Double batchPoPrice) {
        this.batchPoPrice = batchPoPrice;
    }
}
