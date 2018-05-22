package com.ykcloud.soa.erp.api.so.response;

import java.io.Serializable;

/**
 * 店间调拨商品集合
 * @author tz.x
 *
 * @date 2018年4月23日下午3:06:26
 */
public class ProductForShopTransfer implements Serializable {
	
	private static final long serialVersionUID = -7437509378376568072L;
	
	/**
	 * 物流方式
	 */
	private Long logisticsType;
	
	/**
	 * 采购途径
	 */
	private Long purchaseTypeNumId;
	
	/**
	 * 税率
	 */
	private Double taxRate;

	/**
	 * 商品编号
	 */
	private Long itemNumId;
	
	/**
	 * 商品名称
	 */
	private String itemName;
	
	/**
	 * 商品条码
	 */
	private String barcode;
	
	/**
	 * 部类
	 */
	private Long divNumId;
	
	/**
	 * 部类名称
	 */
	private String divName;
	
	/**
	 * 商品基本单位
	 */
	private Long basicUnitNumId;
	
	/**
	 * 商品基本单位名称
	 */
	private String basicUnitName;
	
	/**
	 * 销售规格
	 */
	private String styleDesc;
	
	/**
	 * 保质期天数
	 */
	private Long qualityDays;
	
	/**
	 * 母商品
	 */
	private Long gpItemNumId;
	
	/**
	 * 结算方式1：购销，2：代销，3：联销
	 */
	private Long settlementType;
	
	/**
	 * 结算方式名称
	 */
	private String settlementTypeName;
	
	/**
	 * 原产地
	 */
	private Long productOriginNumId;
	
	/**
	 * 原产地名称
	 */
	private String productOriginName;
	
	/**
	 * 储存方式1：常温 2：冷藏 3：冷冻
	 */
	private Long storeType;
	
	/**
	 * 储存方式名称
	 */
	private	String storeTypeName;
	
	/**
	 * 件装数
	 */
	private Double conversionQty;
	
	/**
	 * 件装单位
	 */
	private Long conversionUnitNumId;
	
	/**
	 * 件装单位名称
	 */
	private String conversionUnitName;
	
	/**
	 * 件装规格
	 */
	private String conversionStyleDesc;
	
	/**
	 * 价格
	 */
	private Double tradePrice;
	
	/**
	 * 库存数
	 */
	private Double stockQty;
	
	private String itemid;

	public Long getLogisticsType() {
		return logisticsType;
	}

	public void setLogisticsType(Long logisticsType) {
		this.logisticsType = logisticsType;
	}

	public Long getPurchaseTypeNumId() {
		return purchaseTypeNumId;
	}

	public void setPurchaseTypeNumId(Long purchaseTypeNumId) {
		this.purchaseTypeNumId = purchaseTypeNumId;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
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

	public Double getTradePrice() {
		return tradePrice;
	}

	public void setTradePrice(Double tradePrice) {
		this.tradePrice = tradePrice;
	}

	public Double getStockQty() {
		return stockQty;
	}

	public void setStockQty(Double stockQty) {
		this.stockQty = stockQty;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	
}
