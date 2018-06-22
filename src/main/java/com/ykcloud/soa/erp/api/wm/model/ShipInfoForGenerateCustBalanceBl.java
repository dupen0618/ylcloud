package com.ykcloud.soa.erp.api.wm.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 封装了出库单信息，用于生成购销客户结算单
 * @author: henry.wang
 * @date: 2018/6/1 10:34
 **/
public class ShipInfoForGenerateCustBalanceBl implements Serializable {

	private static final long serialVersionUID = 1L;

	private String reservedNo;//出库单号
	private Date shipDate;//出库日期
	private Long subUnitNumId;//结算门店
	private Long unitNumId;//结算门店业务单元
	private Long custSubUnitNumId;//结算客户
	private Long custUnitNumId;//结算客户业务单元
	private Long typeNumId;//业务类型
	private Long itemNumId;//商品编号
	private Long divNumId;//商品部类
	private String barcode;//商品条码
	private String itemName;//商品名称
	private Long productOriginNumId;//产地
	private Double conversionQty;//件装数
	private Long conversionUnitNumId;//件装单位
	private String conversionStyleDesc;//件装规格
	private Double qty;//数量
	private Double taxRate;//税率
	private Double tradePrice;//结算价格
	private Double totalAmount;//结算金额
	private Double taxAmount;//税额
	private String batchSeries;//批次行号
	private Long batchPromotionGrade;//批次促销档期
	private Long batchSupplyUnitNumId;//批次供应商
	private Double batchPoPrice;//批次采购价格
	private Date recDate;//入账日期
	private String itemid;//商品商家编码

	private String firstBatchSeries;

	private Date firstRecDate;

	private Long firstSupplyUnitNumId;

	private Double supPrice;
	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getUnitNumId() {
		return unitNumId;
	}

	public void setUnitNumId(Long unitNumId) {
		this.unitNumId = unitNumId;
	}

	public Long getCustSubUnitNumId() {
		return custSubUnitNumId;
	}

	public void setCustSubUnitNumId(Long custSubUnitNumId) {
		this.custSubUnitNumId = custSubUnitNumId;
	}

	public Long getCustUnitNumId() {
		return custUnitNumId;
	}

	public void setCustUnitNumId(Long custUnitNumId) {
		this.custUnitNumId = custUnitNumId;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
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

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
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

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
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

	public Date getRecDate() {
		return recDate;
	}

	public void setRecDate(Date recDate) {
		this.recDate = recDate;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public String getFirstBatchSeries() {
		return firstBatchSeries;
	}

	public void setFirstBatchSeries(String firstBatchSeries) {
		this.firstBatchSeries = firstBatchSeries;
	}

	public Date getFirstRecDate() {
		return firstRecDate;
	}

	public void setFirstRecDate(Date firstRecDate) {
		this.firstRecDate = firstRecDate;
	}

	public Long getFirstSupplyUnitNumId() {
		return firstSupplyUnitNumId;
	}

	public void setFirstSupplyUnitNumId(Long firstSupplyUnitNumId) {
		this.firstSupplyUnitNumId = firstSupplyUnitNumId;
	}

	public Double getSupPrice() {
		return supPrice;
	}

	public void setSupPrice(Double supPrice) {
		this.supPrice = supPrice;
	}
}
