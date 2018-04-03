package com.ykcloud.soa.erp.api.scm.model;
/**
*PoDtl履行数量操作类
@author hank.zhu
@date 2018年4月3日 下午2:53:34 新建
**/
public class PoDtlRecQtyAndSeries {
	private Double recQty;//履行数量
	private String series;//序列号
	public Double getRecQty() {
		return recQty;
	}
	public void setRecQty(Double recQty) {
		this.recQty = recQty;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	
}
