package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * 调整总部发出商品
 *
 * @author Sealin Created on 2018-06-23
 */
public class AccEmitForSupplyGenerate implements Serializable {
    private static final long serialVersionUID = -3516568015324849198L;
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

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public Double getAdjustPrice() {
        return adjustPrice;
    }

    public void setAdjustPrice(Double adjustPrice) {
        this.adjustPrice = adjustPrice;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Double getQty() {
        return Qty;
    }

    public void setQty(Double qty) {
        Qty = qty;
    }

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }

    public Long getPhysicalNumId() {
        return physicalNumId;
    }

    public void setPhysicalNumId(Long physicalNumId) {
        this.physicalNumId = physicalNumId;
    }

    public Long getProductOriginId() {
        return productOriginId;
    }

    public void setProductOriginId(Long productOriginId) {
        this.productOriginId = productOriginId;
    }

    public String getBatchSeries() {
        return batchSeries;
    }

    public void setBatchSeries(String batchSeries) {
        this.batchSeries = batchSeries;
    }

    public Double getPackageQty() {
        return packageQty;
    }

    public void setPackageQty(Double packageQty) {
        this.packageQty = packageQty;
    }

    public Double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Long getBatchPromotionGrade() {
        return batchPromotionGrade;
    }

    public void setBatchPromotionGrade(Long batchPromotionGrade) {
        this.batchPromotionGrade = batchPromotionGrade;
    }

    public Double getBatchPoPrice() {
        return batchPoPrice;
    }

    public void setBatchPoPrice(Double batchPoPrice) {
        this.batchPoPrice = batchPoPrice;
    }

    public Long getFirstSupplyUnitNumId() {
        return firstSupplyUnitNumId;
    }

    public void setFirstSupplyUnitNumId(Long firstSupplyUnitNumId) {
        this.firstSupplyUnitNumId = firstSupplyUnitNumId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccEmitForSupplyGenerate)) {
            return false;
        }
        AccEmitForSupplyGenerate that = (AccEmitForSupplyGenerate) o;
        return Objects.equals(itemNumId, that.itemNumId) && Objects.equals(settlementType, that.settlementType)
                && Objects.equals(batchSeries, that.batchSeries);
    }

    @Override
    public int hashCode() {

        return Objects.hash(itemNumId, settlementType, batchSeries);
    }
}
