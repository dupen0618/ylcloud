package com.ykcloud.soa.erp.api.scm.response;

import java.util.Date;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/***
*
@author hank.zhu
@date 2018年3月9日 下午4:10:27 新建
*/
//补货申请单 商品相关参考数据包装类
public class HandRepmentProductGetResponse extends MessagePack {
	private static final long serialVersionUID = 1L;
	private Long itemNumId;
	private String itemName;
	private String barcode;
	private Long divNumId;
	private String basicUnitNumId;
	private String basicUnitName;
	private String styleDesc;
	private Long qualityDays;
	private Long gpItemNumId;
	private Long settlementType;
	private String settlementTypeName;
	private Long logisticsType;
	private String logisticsTypeName;
	private Long productOriginNumId;
	private String productOriginName;
	private Long storeType;
	private String storeTypeName;
	private Long storageNumId;
	private Long fdcSign;
	private Long supplyUnitNumId;
	private String supplyUnitName;
	private Double cost;
	private Long costTaxRate;
	private Long costTypeTemp;
	private Date tempBeginDay;
	private Date tempEndDay;
	private Long promotionGrade;
	private Double conversionQty;
	private Long conversionUnitNumId;
	private String conversionUnitName;
	private String conversionStyleDesc;
	private Double salePrice;
	private Double minQty;
	private Double stockQty;
	private Double BalanceCost;
	private Long availbleSaleDay;
	private Date lastSaleDate;
	private Date lastReceiveDate;
	private Double monthSaleQty;
	private Double lastWeekSaleQty;
	private Double dailySaleQty;
    private Double lastWeekDailySaleQty;
    private Double lastMonthSaleQty;
    private Double thisMonthSaleQty;
    private Double backwardOneWeekSaleQty;
    private Double backwardTwoWeekSaleQty;
    private Double backwardThreeWeekSaleQty;
    private Double backwardFourWeekSaleQty;
    private Double openApplyQty;
    private Double openOrderQty;
    private Double openRationQty; 	
    private Double openDistDeliveryQty;
    private Double openBranchDeliveryQty;
    private Double returnQty;
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
	public String getBasicUnitNumId() {
		return basicUnitNumId;
	}
	public void setBasicUnitNumId(String basicUnitNumId) {
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
	public Long getFdcSign() {
		return fdcSign;
	}
	public void setFdcSign(Long fdcSign) {
		this.fdcSign = fdcSign;
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
	public Long getCostTypeTemp() {
		return costTypeTemp;
	}
	public void setCostTypeTemp(Long costTypeTemp) {
		this.costTypeTemp = costTypeTemp;
	}
	public Date getTempBeginDay() {
		return tempBeginDay;
	}
	public void setTempBeginDay(Date tempBeginDay) {
		this.tempBeginDay = tempBeginDay;
	}
	public Date getTempEndDay() {
		return tempEndDay;
	}
	public void setTempEndDay(Date tempEndDay) {
		this.tempEndDay = tempEndDay;
	}
	public Long getPromotionGrade() {
		return promotionGrade;
	}
	public void setPromotionGrade(Long promotionGrade) {
		this.promotionGrade = promotionGrade;
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
	public Double getMinQty() {
		return minQty;
	}
	public void setMinQty(Double minQty) {
		this.minQty = minQty;
	}
	public Double getStockQty() {
		return stockQty;
	}
	public void setStockQty(Double stockQty) {
		this.stockQty = stockQty;
	}
	public Double getBalanceCost() {
		return BalanceCost;
	}
	public void setBalanceCost(Double balanceCost) {
		BalanceCost = balanceCost;
	}
	public Long getAvailbleSaleDay() {
		return availbleSaleDay;
	}
	public void setAvailbleSaleDay(Long availbleSaleDay) {
		this.availbleSaleDay = availbleSaleDay;
	}
	public Date getLastSaleDate() {
		return lastSaleDate;
	}
	public void setLastSaleDate(Date lastSaleDate) {
		this.lastSaleDate = lastSaleDate;
	}
	public Date getLastReceiveDate() {
		return lastReceiveDate;
	}
	public void setLastReceiveDate(Date lastReceiveDate) {
		this.lastReceiveDate = lastReceiveDate;
	}
	public Double getMonthSaleQty() {
		return monthSaleQty;
	}
	public void setMonthSaleQty(Double monthSaleQty) {
		this.monthSaleQty = monthSaleQty;
	}
	public Double getLastWeekSaleQty() {
		return lastWeekSaleQty;
	}
	public void setLastWeekSaleQty(Double lastWeekSaleQty) {
		this.lastWeekSaleQty = lastWeekSaleQty;
	}
	public Double getDailySaleQty() {
		return dailySaleQty;
	}
	public void setDailySaleQty(Double dailySaleQty) {
		this.dailySaleQty = dailySaleQty;
	}
	public Double getLastWeekDailySaleQty() {
		return lastWeekDailySaleQty;
	}
	public void setLastWeekDailySaleQty(Double lastWeekDailySaleQty) {
		this.lastWeekDailySaleQty = lastWeekDailySaleQty;
	}
	public Double getLastMonthSaleQty() {
		return lastMonthSaleQty;
	}
	public void setLastMonthSaleQty(Double lastMonthSaleQty) {
		this.lastMonthSaleQty = lastMonthSaleQty;
	}
	public Double getThisMonthSaleQty() {
		return thisMonthSaleQty;
	}
	public void setThisMonthSaleQty(Double thisMonthSaleQty) {
		this.thisMonthSaleQty = thisMonthSaleQty;
	}
	public Double getBackwardOneWeekSaleQty() {
		return backwardOneWeekSaleQty;
	}
	public void setBackwardOneWeekSaleQty(Double backwardOneWeekSaleQty) {
		this.backwardOneWeekSaleQty = backwardOneWeekSaleQty;
	}
	public Double getBackwardTwoWeekSaleQty() {
		return backwardTwoWeekSaleQty;
	}
	public void setBackwardTwoWeekSaleQty(Double backwardTwoWeekSaleQty) {
		this.backwardTwoWeekSaleQty = backwardTwoWeekSaleQty;
	}
	public Double getBackwardThreeWeekSaleQty() {
		return backwardThreeWeekSaleQty;
	}
	public void setBackwardThreeWeekSaleQty(Double backwardThreeWeekSaleQty) {
		this.backwardThreeWeekSaleQty = backwardThreeWeekSaleQty;
	}
	public Double getBackwardFourWeekSaleQty() {
		return backwardFourWeekSaleQty;
	}
	public void setBackwardFourWeekSaleQty(Double backwardFourWeekSaleQty) {
		this.backwardFourWeekSaleQty = backwardFourWeekSaleQty;
	}
	public Double getOpenApplyQty() {
		return openApplyQty;
	}
	public void setOpenApplyQty(Double openApplyQty) {
		this.openApplyQty = openApplyQty;
	}
	public Double getOpenOrderQty() {
		return openOrderQty;
	}
	public void setOpenOrderQty(Double openOrderQty) {
		this.openOrderQty = openOrderQty;
	}
	public Double getOpenRationQty() {
		return openRationQty;
	}
	public void setOpenRationQty(Double openRationQty) {
		this.openRationQty = openRationQty;
	}
	public Double getOpenDistDeliveryQty() {
		return openDistDeliveryQty;
	}
	public void setOpenDistDeliveryQty(Double openDistDeliveryQty) {
		this.openDistDeliveryQty = openDistDeliveryQty;
	}
	public Double getOpenBranchDeliveryQty() {
		return openBranchDeliveryQty;
	}
	public void setOpenBranchDeliveryQty(Double openBranchDeliveryQty) {
		this.openBranchDeliveryQty = openBranchDeliveryQty;
	}
	public Double getReturnQty() {
		return returnQty;
	}
	public void setReturnQty(Double returnQty) {
		this.returnQty = returnQty;
	}
    
    
    
	
	
	
	
	
	

}
