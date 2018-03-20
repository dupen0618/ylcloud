package com.ykcloud.soa.erp.api.prd.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class LatestPurchasePriceGetRespone extends MessagePack {
	private static final long serialVersionUID = -126191557654779552L;

	private Long typeNumId;

    private Double cost; //价格

    private Long costTaxRate; //进项税率
   // private Long promotionGrade;


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

}
