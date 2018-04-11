package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

/**
 * 退货商品明细
 * @author tz.x
 *
 * @date 2018年4月10日上午9:24:45
 */
public class ApprovalReturnProduct implements Serializable {
	
	private static final long serialVersionUID = 9090942233119517724L;

	/**
	 * 申请单编号
	 */
	private String applyNumId;
	
	/**
	 * 行号
	 */
	private String applyLine;
	
	/**
	 * 订货门店
	 */
	private Long ordSubUnitNumId;
	
	/**
	 * 促销档期
	 */
	private String promotionGrade;
	
	/**
	 * 储存方式
	 */
	private Long storeType;
	
	/**
	 * 物流方式
	 */
	private Long logisticsType;
	
	/**
	 * 商品编号
	 */
	private Long itemNumId;
	
	/**
	 * 部类
	 */
	private Long divNumId;
	
	/**
	 * 条码
	 */
	private String barcode;
	
	/**
	 * 商品名称
	 */
	private String itemName;
	
	/**
	 * 产地
	 */
	private Long productOriginNumId;
	
	/**
	 * 件装数
	 */
	private Double conversionQty;
	
	/**
	 * 件装单位
	 */
	private Double conversionUnitNumId;
	
	/**
	 * 件装规格
	 */
	private String conversionStyleDesc;
	
	/**
	 * 赠品辅料标识
	 */
	private Long pmtMaterial;
	
	/**
	 * 数量
	 */
	private Double qty;
	
	/**
	 * 赠品标识
	 */
	private Long pmtSign;
	
	/**
	 * 交易价
	 */
	private Double tradePrice;
	
	/**
	 * 交易金额
	 */
	private Double totalAmount;
	
	/**
	 * 供应商编号
	 */
	private Long supplyUnitNumId;
	
	/**
	 * 税率
	 */
	private Double taxRate;

	public String getApplyNumId() {
		return applyNumId;
	}

	public void setApplyNumId(String applyNumId) {
		this.applyNumId = applyNumId;
	}

	public String getApplyLine() {
		return applyLine;
	}

	public void setApplyLine(String applyLine) {
		this.applyLine = applyLine;
	}

	public Long getOrdSubUnitNumId() {
		return ordSubUnitNumId;
	}

	public void setOrdSubUnitNumId(Long ordSubUnitNumId) {
		this.ordSubUnitNumId = ordSubUnitNumId;
	}

	public String getPromotionGrade() {
		return promotionGrade;
	}

	public void setPromotionGrade(String promotionGrade) {
		this.promotionGrade = promotionGrade;
	}

	public Long getStoreType() {
		return storeType;
	}

	public void setStoreType(Long storeType) {
		this.storeType = storeType;
	}

	public Long getLogisticsType() {
		return logisticsType;
	}

	public void setLogisticsType(Long logisticsType) {
		this.logisticsType = logisticsType;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getDivNumId() {
		return divNumId;
	}

	public void setDivNumId(Long divNumId) {
		this.divNumId = divNumId;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getProductOriginNumId() {
		return productOriginNumId;
	}

	public void setProductOriginNumId(Long productOriginNumId) {
		this.productOriginNumId = productOriginNumId;
	}

	public Double getConversionQty() {
		return conversionQty;
	}

	public void setConversionQty(Double conversionQty) {
		this.conversionQty = conversionQty;
	}

	public Double getConversionUnitNumId() {
		return conversionUnitNumId;
	}

	public void setConversionUnitNumId(Double conversionUnitNumId) {
		this.conversionUnitNumId = conversionUnitNumId;
	}

	public String getConversionStyleDesc() {
		return conversionStyleDesc;
	}

	public void setConversionStyleDesc(String conversionStyleDesc) {
		this.conversionStyleDesc = conversionStyleDesc;
	}

	public Long getPmtMaterial() {
		return pmtMaterial;
	}

	public void setPmtMaterial(Long pmtMaterial) {
		this.pmtMaterial = pmtMaterial;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Long getPmtSign() {
		return pmtSign;
	}

	public void setPmtSign(Long pmtSign) {
		this.pmtSign = pmtSign;
	}

	public Double getTradePrice() {
		return tradePrice;
	}

	public void setTradePrice(Double tradePrice) {
		this.tradePrice = tradePrice;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

}
