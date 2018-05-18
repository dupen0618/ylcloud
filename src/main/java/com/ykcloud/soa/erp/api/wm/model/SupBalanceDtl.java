package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @Description:
 * @author Song
 * @Date 2018年4月17日 下午1:05:21
 */
public class SupBalanceDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 行号
     */
    private String series;

    /**
     * 单据编号
     */
    private String reservedNo;

    /**
     * 业务类型
     */
    private Long typeNumId;
	/**
	 * 业务类型名称
	 */
	private String typeName;

    /**
     * 业务日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date operatDate;

    /**
     * 商品
     */
    private Long itemNumId;

    /**
     * 商品中心（部门）
     */
    private Long divNumId;
	/**
	 * 商品中心（部门）名称
	 */
	private String divName;


	/**
     * 商品条码
     */
    private String barcode;

    /**
     * 商品品名
     */
    private String itemName;

    /**
     * 产地
     */
    private Long productOriginNumId;
	/**
	 * 产地名称
	 */
	private String productOriginName;

    /**
     * 件装单位
     */
    private Double conversionQty;

    /**
     * 件装规格
     */
    private String conversionStyleDesc;

    /**
     * 结算价格
     */
    private Double price;

    /**
     * 结算金额
     */
    private Double amount;

    /**
     * 批次行号
     */
    private String batchSeries;

    /**
     * 批次促销档期
     */
    private Long batchPromotionGrade;

    /**
     * 批次供应商
     */
    private Long batchSupplyUnitNumId;

    /**
     * 批次采购价格
     */
    private Double batchPoPrice;

    /**
     * 税率
     */
    private Double taxRate;

    /**
     * 税金
     */
    private Double taxAmount;


    /**
     * 商品商家编码
     */
    private String itemid;

    /**
     *原价格
     */
    private  Double retailPrice;

    /**
     *结算方式
     */
    private  Long  settlementType;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date orderDate;
	/**
	 * 门店
	 */
	private Long subUnitNumId;
	/**
	 * 门店名称
	 */
	private String subUnitName;
	/**
	 * 单据类型
	 */
	private Long reservedTypeNumId;
	/**
	 * 单据类型名字
	 */
	private String reservedTypeNumIdName;


	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}


	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Date getOperatDate() {
		return operatDate;
	}

	public void setOperatDate(Date operatDate) {
		this.operatDate = operatDate;
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

	public String getConversionStyleDesc() {
		return conversionStyleDesc;
	}

	public void setConversionStyleDesc(String conversionStyleDesc) {
		this.conversionStyleDesc = conversionStyleDesc;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getBatchSeries() {
		return batchSeries;
	}

	public void setBatchSeries(String batchSeries) {
		this.batchSeries = batchSeries;
	}

	public Long getBatchPromotionGrade() {
		return batchPromotionGrade;
	}

	public void setBatchPromotionGrade(Long batchPromotionGrade) {
		this.batchPromotionGrade = batchPromotionGrade;
	}

	public Long getBatchSupplyUnitNumId() {
		return batchSupplyUnitNumId;
	}

	public void setBatchSupplyUnitNumId(Long batchSupplyUnitNumId) {
		this.batchSupplyUnitNumId = batchSupplyUnitNumId;
	}

	public Double getBatchPoPrice() {
		return batchPoPrice;
	}

	public void setBatchPoPrice(Double batchPoPrice) {
		this.batchPoPrice = batchPoPrice;
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

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public Double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getDivName() {
		return divName;
	}

	public void setDivName(String divName) {
		this.divName = divName;
	}

	public String getProductOriginName() {
		return productOriginName;
	}

	public void setProductOriginName(String productOriginName) {
		this.productOriginName = productOriginName;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getReservedTypeNumId() {
		return reservedTypeNumId;
	}

	public void setReservedTypeNumId(Long reservedTypeNumId) {
		this.reservedTypeNumId = reservedTypeNumId;
	}

	public String getReservedTypeNumIdName() {
		return reservedTypeNumIdName;
	}

	public void setReservedTypeNumIdName(String reservedTypeNumIdName) {
		this.reservedTypeNumIdName = reservedTypeNumIdName;
	}

	public String getSubUnitName() {
		return subUnitName;
	}

	public void setSubUnitName(String subUnitName) {
		this.subUnitName = subUnitName;
	}
}