package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

import java.util.Date;

public class ProductPurchasePriceGetResponse extends MessagePack {
    private Long typeNumId;//501-永久 502-临时 503-DM 0-最新进价
    private Double cost;//价格
    private Long costTaxRate;//进项税率
    private Date tempBeginDay;//DM/临时调价起始日期
    private Date tempEndDay;//DM/临时调价结束日期
    private Long promotionGrade;//促销档期（503DM促销时返回）

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
