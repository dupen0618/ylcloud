package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FiBlSupBalance implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String series;   //行号
	
	private Long tenantNumId; //租户
	
	private Long subUnitNumId; //门店编号
	
	private String reservedNo; //单号
	
	private Long typeNumId;    //业务类型
	
	private Date operatDate;   //业务日期
	
	private Long itemNumId;   //商品编号
	
	private Long divNumId;     //商品中心
	
	private String barcode;   //商品条码
	
	private String itemName;  //商品品名
	
	private Long productOrigiNumId; //原产地编号
	
	private Double conversionQty;   //件装单位
	
	private String conversionStyleDesc; //件装规格
	
	private Double price;          //结算价格
	
	private Double amount;        //结算金额
	
	private String batchSeries;  //批次行号
	
	private Long batchPromotionGrade; //批次促销档期
	
	private Long batchSupplyUnitNumId; //批次供应商
	
	private Double batchPoPrice;    //批次采购价格
	
	private Double taxRate;       // 税率
	
    private Double taxAmount;   //税金

    private Long carrySign;    //结转标识

    private Long dataSign;     //生产或测试标识

    private String itemid;     //商品商家编码

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Long getTenantNumId() {
		return tenantNumId;
	}

	public void setTenantNumId(Long tenantNumId) {
		this.tenantNumId = tenantNumId;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
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

	public Long getProductOrigiNumId() {
		return productOrigiNumId;
	}

	public void setProductOrigiNumId(Long productOrigiNumId) {
		this.productOrigiNumId = productOrigiNumId;
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

	public Long getCarrySign() {
		return carrySign;
	}

	public void setCarrySign(Long carrySign) {
		this.carrySign = carrySign;
	}

	public Long getDataSign() {
		return dataSign;
	}

	public void setDataSign(Long dataSign) {
		this.dataSign = dataSign;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
}
