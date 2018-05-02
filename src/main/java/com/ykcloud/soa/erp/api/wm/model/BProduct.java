package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

public class BProduct implements Serializable {
	private Long itemNumId;// 商品主键
	private String itemName;// 商品名称
	private String itemid;// 商家编号
	private String simItemName;// 商品中文简称
	private String enItemName;// 商品英文名称
	private String enSmpItemName;// 商品英文简称
	private String barcode;
	private Long divNumId;// 部类编号
	private String divName;// 部类名称
	private Long pty1NumId;// 商品大类
	private String pty1Name;// 商品大类名称
	private Long pty2NumId;// 商品中类
	private String pty2Name;// 商品大类名称
	private Long pty3NumId;// 商品小类
	private String pty3Name;// 商品小类名称
	private Long basicUnitNumId;// 商品基本单位
	private String basicUnitName;// 商品基本单位名称
	private String styleDesc;// 销售规格
	private Double conversionQty;// 件装数
	private Long conversionUnitNumId;// 件装单位
	private String conversionUnitName;// 件装单位名称
	private String conversionStyleDesc;// 件装描述
	private Long storeType;// 存储条件
	private String storeTypeName;// 存储条件名称
	private Long qualityDays;// 保质期天数
	private Long gpItemNumId;// 母商品
	private Long purchaseTypeNumId; // 采购途径 1:国内 2 国际
	private Long typeNumId;// 商品类型 1:正常品 2:母商品 3:子商品 4:销售码 5:虚拟商品
	private Long freshType;// 生鲜属性 0=正常商品 1=普通生鲜 2=原材料 3=转化成品 4=分割成品 5=组合成品 6=加工成品 7=生鲜耗材
	private Double avalQty;
	private Double costPrice;
	private Double costTaxRate; // 进项税率
	private Double costTax; //税额
	private Long productOriginNumId;//原产地
	private String productOriginName;//原产地名称
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
	public String getSimItemName() {
		return simItemName;
	}
	public void setSimItemName(String simItemName) {
		this.simItemName = simItemName;
	}
	public String getEnItemName() {
		return enItemName;
	}
	public void setEnItemName(String enItemName) {
		this.enItemName = enItemName;
	}
	public String getEnSmpItemName() {
		return enSmpItemName;
	}
	public void setEnSmpItemName(String enSmpItemName) {
		this.enSmpItemName = enSmpItemName;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public Long getDivNumId() {
		return divNumId;
	}
	public void setDivNumId(Long divNumId) {
		this.divNumId = divNumId;
	}
	public String getDivName() {
		return divName;
	}
	public void setDivName(String divName) {
		this.divName = divName;
	}
	public Long getPty1NumId() {
		return pty1NumId;
	}
	public void setPty1NumId(Long pty1NumId) {
		this.pty1NumId = pty1NumId;
	}
	public String getPty1Name() {
		return pty1Name;
	}
	public void setPty1Name(String pty1Name) {
		this.pty1Name = pty1Name;
	}
	public Long getPty2NumId() {
		return pty2NumId;
	}
	public void setPty2NumId(Long pty2NumId) {
		this.pty2NumId = pty2NumId;
	}
	public String getPty2Name() {
		return pty2Name;
	}
	public void setPty2Name(String pty2Name) {
		this.pty2Name = pty2Name;
	}
	public Long getPty3NumId() {
		return pty3NumId;
	}
	public void setPty3NumId(Long pty3NumId) {
		this.pty3NumId = pty3NumId;
	}
	public String getPty3Name() {
		return pty3Name;
	}
	public void setPty3Name(String pty3Name) {
		this.pty3Name = pty3Name;
	}
	public Long getBasicUnitNumId() {
		return basicUnitNumId;
	}
	public void setBasicUnitNumId(Long basicUnitNumId) {
		this.basicUnitNumId = basicUnitNumId;
	}
	public String getBasicUnitName() {
		return basicUnitName;
	}
	public void setBasicUnitName(String basicUnitName) {
		this.basicUnitName = basicUnitName;
	}
	public String getStyleDesc() {
		return styleDesc;
	}
	public void setStyleDesc(String styleDesc) {
		this.styleDesc = styleDesc;
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
	public String getConversionUnitName() {
		return conversionUnitName;
	}
	public void setConversionUnitName(String conversionUnitName) {
		this.conversionUnitName = conversionUnitName;
	}
	public String getConversionStyleDesc() {
		return conversionStyleDesc;
	}
	public void setConversionStyleDesc(String conversionStyleDesc) {
		this.conversionStyleDesc = conversionStyleDesc;
	}
	public Long getStoreType() {
		return storeType;
	}
	public void setStoreType(Long storeType) {
		this.storeType = storeType;
	}
	public String getStoreTypeName() {
		return storeTypeName;
	}
	public void setStoreTypeName(String storeTypeName) {
		this.storeTypeName = storeTypeName;
	}
	public Long getQualityDays() {
		return qualityDays;
	}
	public void setQualityDays(Long qualityDays) {
		this.qualityDays = qualityDays;
	}
	public Long getGpItemNumId() {
		return gpItemNumId;
	}
	public void setGpItemNumId(Long gpItemNumId) {
		this.gpItemNumId = gpItemNumId;
	}
	public Long getPurchaseTypeNumId() {
		return purchaseTypeNumId;
	}
	public void setPurchaseTypeNumId(Long purchaseTypeNumId) {
		this.purchaseTypeNumId = purchaseTypeNumId;
	}
	public Long getTypeNumId() {
		return typeNumId;
	}
	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}
	public Long getFreshType() {
		return freshType;
	}
	public void setFreshType(Long freshType) {
		this.freshType = freshType;
	}
	public Double getAvalQty() {
		return avalQty;
	}
	public void setAvalQty(Double avalQty) {
		this.avalQty = avalQty;
	}

	public Double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public Double getCostTaxRate() {
		return costTaxRate;
	}

	public void setCostTaxRate(Double costTaxRate) {
		this.costTaxRate = costTaxRate;
	}

	public Double getCostTax() {
		return costTax;
	}

	public void setCostTax(Double costTax) {
		this.costTax = costTax;
	}

	public Long getProductOriginNumId() {
		return productOriginNumId;
	}

	public void setProductOriginNumId(Long productOriginNumId) {
		this.productOriginNumId = productOriginNumId;
	}

	public String getProductOriginName() {
		return productOriginName;
	}

	public void setProductOriginName(String productOriginName) {
		this.productOriginName = productOriginName;
	}
}
