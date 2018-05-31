package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

import java.util.Date;

public class ProductPurchasePriceGetResponse extends MessagePack {
	private static final long serialVersionUID = 1L;
	private Long typeNumId;// 501-永久 502-临时 503-DM 0-最新进价
	private Double cost;// 价格
	private Double costTaxRate;// 进项税率
	private Date tempBeginDay;// DM/临时调价起始日期
	private Date tempEndDay;// DM/临时调价结束日期
	private String promotionGrade;// 促销档期（503DM促销时返回）
	private String promotionName; 

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

	public Double getCostTaxRate() {
		return costTaxRate;
	}

	public void setCostTaxRate(Double costTaxRate) {
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

	public String getPromotionGrade() {
		return promotionGrade;
	}

	public void setPromotionGrade(String promotionGrade) {
		this.promotionGrade = promotionGrade;
	}

	public String getPromotionName() {
		return promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}
	
}
