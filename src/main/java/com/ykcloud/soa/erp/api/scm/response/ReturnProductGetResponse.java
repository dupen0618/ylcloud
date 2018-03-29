package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

//前台根据商品编号获取退货商品相关信息(价格）的出参类
public class ReturnProductGetResponse extends MessagePack {

	private Long itemNumId; // 商品编号

	private String itemName; // 商品名称

	private String barcode; // 条形码

	private Long divNumId; // 部类

	private String divName; // 部类名称

	private Long basicUnitNumId;// 商品基本单位

	private String basicUnitName; // 商品基本单位名称

	private String styleDesc; // 销售规格

	private Long qualityDays; // 保质期天数

	private Long gpItemNumId;// 母商品

	private Long settlementType;// 结算方式1：购销，2：代销，3：联销

	private String settlementTypeName;// 结算方式名称

	private Long logisticsType; // 物流方式

	private String logisticsTypeName;// 物流方式名称

	private Long productOriginNumId; // 原产地

	private String productOriginName; // 原产地名称

	private Long storeType; // 储存方式1：常温 2：冷藏 3：冷冻

	private String storeTypeName;// 储存方式名称

	private Long storageNumId; // 出货逻辑仓

	private Long supplyUnitNumId;// 供应商编号

	private String supplyUnitName; // 供应商名称

	private Double cost; // 价格

	private Long costTaxRate;// 进项税率

	private Double conversionQty;// 件装数

	private Long conversionUnitNumId;// 件装单位

	private String conversionUnitName;// 件装单位名称

	private String conversionStyleDesc; // 件装规格

	private Double stockQty; // 库存数

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

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public String getSupplyUnitName() {
		return supplyUnitName;
	}

	public void setSupplyUnitName(String supplyUnitName) {
		this.supplyUnitName = supplyUnitName;
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

	public Double getStockQty() {
		return stockQty;
	}

	public void setStockQty(Double stockQty) {
		this.stockQty = stockQty;
	}
	
	

}
