package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

public class DistributionProduct implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long itemNumId;// 商品编号

	private String itemName;// 商品名称

	private String barcode;// 条码

	private Long divNumId;// 部类

	private String divName;// 部类名称

	private Long basicUnitNumId;// 商品基本单位

	private String basicUnitName;// 商品基本单位名称

	private String styleDesc;// 销售规格

	private Long qualityDays;// 保质期天数

	private Long gpItemNumId;// 母商品

	private Long settlementType;// 结算方式1：购销，2：代销，3：联销

	private String settlementTypeName;// 结算方式名称

	private Long logisticsType;// 物流方式

	private String logisticsTypeName;// 物流方式名称

	private Long productOriginNumId;// 原产地

	private String productOriginName;// 原产地名称

	private Long storeType;// 储存方式1：常温 2：冷藏 3：冷冻

	private String storeTypeName;// 储存方式名称

	private Long storageNumId;// 配送仓库

	private Double conversionQty;// 件装数

	private Long conversionUnitNumId;// 件装单位

	private String conversionUnitName;// 件装单位名称

	private String conversionStyleDesc;// 件装规格

	private Double salePrice;// 销售价格

	private Double stockQty;// 库存数

	private Double cost;// 配送价格

	private Double openDistQty;// 在配数量

	private Double minQty;// 最小配送数
	
	private String itemid; //商家编号

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

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

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public String getSettlementTypeName() {
		return settlementTypeName;
	}

	public void setSettlementTypeName(String settlementTypeName) {
		this.settlementTypeName = settlementTypeName;
	}

	public Long getLogisticsType() {
		return logisticsType;
	}

	public void setLogisticsType(Long logisticsType) {
		this.logisticsType = logisticsType;
	}

	public String getLogisticsTypeName() {
		return logisticsTypeName;
	}

	public void setLogisticsTypeName(String logisticsTypeName) {
		this.logisticsTypeName = logisticsTypeName;
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

	public Long getStorageNumId() {
		return storageNumId;
	}

	public void setStorageNumId(Long storageNumId) {
		this.storageNumId = storageNumId;
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

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Double getStockQty() {
		return stockQty;
	}

	public void setStockQty(Double stockQty) {
		this.stockQty = stockQty;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Double getOpenDistQty() {
		return openDistQty;
	}

	public void setOpenDistQty(Double openDistQty) {
		this.openDistQty = openDistQty;
	}

	public Double getMinQty() {
		return minQty;
	}

	public void setMinQty(Double minQty) {
		this.minQty = minQty;
	}

}
