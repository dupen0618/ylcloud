package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

import java.util.Date;

public class ProductPurchasePriceGetResponse extends MessagePack {
    private Long typeNumId;
    private Double cost;
    private Long costTaxRate;
    private Date tempBeginDay;
    private Date tempEndDay;
    private Long promotionGrade;

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Long getCostTaxRate() {
        return costTaxRate;
    }

    public void setCostTaxRate(Long costTaxRate) {
        this.costTaxRate = costTaxRate;
    }

    public Date getTempBeginDay() {
        return tempBeginDay;
    }

    public void setTempBeginDay(Date tempBeginDay) {
        this.tempBeginDay = tempBeginDay;
    }

    public Date getTempEndDay() {
        return tempEndDay;
    }

    public void setTempEndDay(Date tempEndDay) {
        this.tempEndDay = tempEndDay;
    }

    public Long getPromotionGrade() {
        return promotionGrade;
    }

    public void setPromotionGrade(Long promotionGrade) {
        this.promotionGrade = promotionGrade;
    }
}
