package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
 /**
  * @author alfred  
  * @date 2018/5/14 23:09
  * @description ScmBlChangeCost,ScmBlChangeCostDtl,ScmBlChangeCostShop
  */
public class ChangeCost implements Serializable
{

    private String reservedNo;//调价单号

    private String reservedId;//调价业务单号

    private Long typeNumId;//调整类型

    private Long supplyUnitNumId;//供应商

    private Date beginDay;//起始日期、生效日期

    private Date endDay;//截止日期

    private Long upCostFlag;//调整库存成本标志

    private Long divNumId;//商品部类

    private Long latelyCostFlag;//是否同时修改最近进货价
    
    private Long itemNumId;//商品主键

    private Double oldCost;//原进价

    private Double newCost;//新进价

    private Double priceDiff;//固定价差
    
    private Long subUnitNumId;//门店编码

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public String getReservedId() {
        return reservedId;
    }

    public void setReservedId(String reservedId) {
        this.reservedId = reservedId;
    }

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Date getBeginDay() {
        return beginDay;
    }

    public void setBeginDay(Date beginDay) {
        this.beginDay = beginDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    public Long getUpCostFlag() {
        return upCostFlag;
    }

    public void setUpCostFlag(Long upCostFlag) {
        this.upCostFlag = upCostFlag;
    }


    public Long getDivNumId() {
        return divNumId;
    }

    public void setDivNumId(Long divNumId) {
        this.divNumId = divNumId;
    }

    public Long getLatelyCostFlag() {
        return latelyCostFlag;
    }

    public void setLatelyCostFlag(Long latelyCostFlag) {
        this.latelyCostFlag = latelyCostFlag;
    }

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public Double getOldCost() {
        return oldCost;
    }

    public void setOldCost(Double oldCost) {
        this.oldCost = oldCost;
    }

    public Double getNewCost() {
        return newCost;
    }

    public void setNewCost(Double newCost) {
        this.newCost = newCost;
    }

    public Double getPriceDiff() {
        return priceDiff;
    }

    public void setPriceDiff(Double priceDiff) {
        this.priceDiff = priceDiff;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}
