package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

/**
*
@author hank.zhu
@date 2018年4月2日 下午3:12:07 新建
**/
public class Product implements Serializable{
	private static final long serialVersionUID = 4421375547490050148L;
	private Long itemNumId;// 商品主键
	private String itemName;// 商品名称
	private Long basicUnitNumId;// 商品基本单位
	private Double conversionQty;// 件装数
	private Long conversionUnitNumId;// 件装单位
	private String conversionStyleDesc;// 件装描述
	private Long qualityDays;//保质期天数
	public Long getItemNumId() {
		return itemNumId;
	}
	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Long getBasicUnitNumId() {
		return basicUnitNumId;
	}
	public void setBasicUnitNumId(Long basicUnitNumId) {
		this.basicUnitNumId = basicUnitNumId;
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
	public Long getQualityDays() {
		return qualityDays;
	}
	public void setQualityDays(Long qualityDays) {
		this.qualityDays = qualityDays;
	}
	
}
