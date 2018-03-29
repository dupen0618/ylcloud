package com.ykcloud.soa.erp.api.scm.model;

/**
 * 采购明细列表
 * @author tz.x
 *
 * @date 2018年3月27日下午2:36:44
 * @see
 */
public class PoDtlForGenerateReceipt {
	
	/**
	 * 促销档期，来自采购单身，暂不用，扩展用
	 */
	private String promotionGrade;
	
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
	private Long conversionUnitNumId;
	
	/**
	 * 件装规格
	 */
	private String conversionStyleDesc;
	
	/**
	 * 件数
	 */
	private Double packageQty;
	
	/**
	 * 数量
	 */
	private Double qty;
	
	/**
	 * 赠品标识
	 */
	private Long pmtSign;
	
	/**
	 * 币别
	 */
	private Long currency;
	
	/**
	 * 采购批次号
	 */
	private String batchid;
	
	/**
	 * 采购价格
	 */
	private Double price;
	
	/**
	 * 金额
	 */
	private Double totalAmount;
	
	/**
	 * 税率
	 */
	private Double taxRate;
	
	/**
	 * 税金
	 */
	private Double taxAmount;

	public String getPromotionGrade() {
		return promotionGrade;
	}

	public void setPromotionGrade(String promotionGrade) {
		this.promotionGrade = promotionGrade;
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

	public Double getPackageQty() {
		return packageQty;
	}

	public void setPackageQty(Double packageQty) {
		this.packageQty = packageQty;
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

	public Long getCurrency() {
		return currency;
	}

	public void setCurrency(Long currency) {
		this.currency = currency;
	}

	public String getBatchid() {
		return batchid;
	}

	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

}