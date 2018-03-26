package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import java.util.Date;

public class HandReplenishProductGetResponse extends MessagePack {

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

	private Long storageNumId;// 直送、直同收货仓库，配送无意义为0

	private Long fdcSign;// 生鲜标识 1: 生鲜 0:非生鲜

	private Long supplyUnitNumId;// 供应商编号

	private String supplyUnitName;// 供应商名称

	private Double cost;// 价格

	private Double costTaxRate;// 进项税率

	private Long costTypeTemp;// 临时调价类型(502:临时调价 503:DM促销)

	private Date tempBeginDay;// DM/临时调价起始日期

	private Date tempEndDay;// DM/临时调价结束日期

	private String promotionGrade;// 促销档期（503DM促销时返回）

	private Double conversionQty;// 件装数

	private Long conversionUnitNumId;// 件装单位

	private String conversionUnitName;// 件装单位名称

	private String conversionStyleDesc;// 件装规格

	private Double salePrice;// 销售价格

	private Double minQty;// 最小配送数

	private Double stockQty;// 库存数

	private Double balanceCost;// 结存成本

	private Double availbleSaleDays;// 可销天数

	private Date lastSaleDate;// 最近销售日期

	private Date lastReceiveDate;// 最近收货日期

	private Double monthSaleQty;// 月销售量

	private Double lastWeekSaleQty;// 上周销量

	private Double dailySaleQty;// 日销量

	private Double thisWeekSaleQty;// 本周销量

	private Double lastWeekDailySaleQty;// 上周日均销售量

	private Double lastMonthSaleQty;// 上月销量

	private Double thisMonthSaleQty;// 本月销量

	private Double backwardOneWeekSaleQty;// 倒推第一周销售量

	private Double backwardTwoWeekSaleQty;// 倒推第二周销售量

	private Double backwardThreeWeekSaleQty;// 倒推第三周销售量

	private Double backwardFourWeekSaleQty;// 倒推第四周销售量

	private Double openApplyQty;// 在途补货数量

	private Double openOrderQty;// 在途订货数量

	private Double openRationQty;// 在途配送数量

	private Double openDistDeliveryQty;// 仓库配送数

	private Double openBranchDeliveryQty;// 分仓在途数

	private Double returnQty;// return_qty

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

	public String getPromotionGrade() {
		return promotionGrade;
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

	public Double getCostTaxRate() {
		return costTaxRate;
	}

	public void setCostTaxRate(Double costTaxRate) {
		this.costTaxRate = costTaxRate;
	}

	public void setPromotionGrade(String promotionGrade) {
		this.promotionGrade = promotionGrade;
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
		return balanceCost;
	}

	public void setBalanceCost(Double balanceCost) {
		this.balanceCost = balanceCost;
	}

	public Double getAvailbleSaleDays() {
		return availbleSaleDays;
	}

	public void setAvailbleSaleDays(Double availbleSaleDays) {
		this.availbleSaleDays = availbleSaleDays;
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

	public Double getThisWeekSaleQty() {
		return thisWeekSaleQty;
	}

	public void setThisWeekSaleQty(Double thisWeekSaleQty) {
		this.thisWeekSaleQty = thisWeekSaleQty;
	}
}
