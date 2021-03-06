package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ImportProtocol implements Serializable {
	
	/**
	 * 导入采购协议
	 */
	private static final long serialVersionUID = 1L;
	@NotEmpty(message="采购业务单号不能为空!")
	private String reservedId;  //采购业务单号  1,2都不能为空
	
	private String supplyCortId; //供应商核算   2不可为空
	
	@NotEmpty(message="供应商编号不能为空!")   
	private String supplyUnitId;  //供应商  12都不能为空
	
	//@NotEmpty(message="签订日期不能为空!")  原来不可为空,ld可为空1不为空 2可为空
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date makeDate; //签订日期
	
	@NotEmpty(message="起始日期不能为空!")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date beginDay; //起始日期
	
	@NotEmpty(message="结束日期不能为空!")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date endDay;   //结束日期
	
	private String makeEmpeId; //业务员    
	
	@NotEmpty(message="商品商家编码不能为空!")
	private String itemid; //商品商家编码
	
	//原可以为空,现在不可为空
	private String itemName;//中文全称    2不可为空
	
	private String enItemName; //英文全称  
	
	private String simItemName; //中文简称 
	
	private String enSmpItemName;//英文简称  
	
	private Double retailPrice;  //售价   2不可为空
	
	private Double referencePrice;//参考价格  
	
	private String styleDesc;//销售规格   2不能为空
	
	@NotEmpty(message="小类不能为空!")
	private String pty3SimNo;//小类       
	
	@NotEmpty(message="条码类型不能为空!")
	private Long barcodeTypeNumId;//条码类型
	
	@NotEmpty(message="商品条码不能为空!")
	private String barcode1;    //商品条码
	
	@NotEmpty(message="原产地不能为空!")
	private String productOriginId; //原产地
	
	@NotEmpty(message="商品品牌不能为空!")
	private String brandSimNo;      //商品品牌
	
	private Double grossProfitRate;  //毛利率
	
	private Double weight;//重量
	
	@NotEmpty(message="重量单位不能为空!")
	private Long weightUnitNumId; //重量单位
	
	private Double cost;//进价          2不能为空
	
	private Double costTaxRate;//进价税率  2不能为空
	
	private Double saleTaxRate; //销项税率     2不能为空
	
	@NotEmpty(message="库存管理类型不能为空!")
	private Long stockType;//库存管理类型
	
	private Double backOffRate;//倒扣率
	
	@NotEmpty(message="物流方式不能为空!")
	private Long logisticsNumId;//物流类型
	
	private Double baseCost;//基本报价
	
	private String barcode2;  //条码2
	
	@NotEmpty(message="基本销售计量单位不能为空!")
	private String basicUnitId;//基本销售计量单位
	
	private Double conversionRate;//字母转换率
	
	private Date enableDate;//启用日期
	
	private String packagingMaterials;//包装材料
	
	private String salesPackaging;   //销售材料
	
	private Long storageRequirements; //存储条件
	
	private String edibleMethod;//适用方法
	
	private Long freshDays;//保鲜期
	
	private Long qualityDays;//保质期
	
	private Double minStorageTemperature; //最低存储温度
	
	private Double maxStorageTemperature; //最高存储温度
	
	private Long storeType;    //存储类型
	
	private Double relativeHumidity;   //相对湿度
	
	private String ingredient;//原料成分
	
	private String seasonMonthFlag;//适用年月    2,不能为空
	
	private Long tryDays; //试销期
	
	private Double trySaleQty; //试销数量
	
	private Long checkProductionDaysSign; //收货是否检查生产日期  2不能为空
	
	private Long receiptProductionDays; //可收货生产天数
	
	private Double trySaleValue;  //试销金额
	
	private String ingredientOrigin;//原产地名称
	
	private Long isHolidayGift;   //是否节日礼品  2要不能为空
	
	private Date giftBeginDay;//节日开码日期
	
	private Date giftEndDay;  //节日关码日期
	
	private Long isOnlineSales;//是否线上销售
	
	private Long purchaseTypeNumId; //采购途径   2不能为空
	
	@NotEmpty(message="加工类型不能为空!")
	private Long isProcessing;  //加工类型
	
	@NotEmpty(message="成本方案不能为空!")
	private Long costPlanNumId;//成本方案
	
	@NotEmpty(message="盘点方案不能为空!")
	private Long checkPlanNumId;//盘点方案
	
	@NotEmpty(message="入库方案不能为空!")
	private Long warehouseingPlanNumId; //入库方案
	
	@NotEmpty(message="领料方案不能为空!")
	private Long pickingPlanNumId;//领料方案
	
	@NotEmpty(message="行政部门不能为空!")
	private Long departNumId;//行政部门
	
	@NotEmpty(message="所属仓库部门不能为空!")
	private Long storageDeptNumId;//所属仓库部门
	
	private String homeMade;   //现场自制
	
	private Long styleNumId; //款式编号
	
	private String styleName; //款式名称
	
	private Double sellPriceRate; //销售价格因子  2,不能为空
	
	@NotEmpty(message="商品类型不能为空!")
	private Long typeNumId; //商品类型
	
	@NotEmpty(message="生鲜属性不能为空!")
	private Long freshType; //生鲜属性
	
	private Long gpItemNumId; //母商品
	
	@NotEmpty(message="颜色不能为空!")
	private String colorSimNo; //颜色
	
	@NotEmpty(message="尺寸不能为空!")
	private String sizeSimNo;  //尺寸
	
	@NotEmpty(message="归集码不能为空!")
	private Long classifyNumId;//归集码
	
	private Long isSingleItems; //是否单品
	
	private Long modifyPrice;  //是否修改价额
	
	private String mix;  //配料
	
	private Long isSsPb; //
	
    private Long pty16NumId;
    
    private Long pty17NumId;
    
    private Long bbdate; //保本期
    
    private Long bldate; //保利
    
    private String productPicture;
    
    private String fm;

	public String getFm() {
		return fm;
	}

	public void setFm(String fm) {
		this.fm = fm;
	}

	public String getProductPicture() {
		return productPicture;
	}

	public void setProductPicture(String productPicture) {
		this.productPicture = productPicture;
	}

	public String getReservedId() {
		return reservedId;
	}

	public void setReservedId(String reservedId) {
		this.reservedId = reservedId;
	}

	public String getSupplyCortId() {
		return supplyCortId;
	}

	public void setSupplyCortId(String supplyCortId) {
		this.supplyCortId = supplyCortId;
	}

	public String getSupplyUnitId() {
		return supplyUnitId;
	}

	public void setSupplyUnitId(String supplyUnitId) {
		this.supplyUnitId = supplyUnitId;
	}

	public Date getMakeDate() {
		return makeDate;
	}

	public void setMakeDate(Date makeDate) {
		this.makeDate = makeDate;
	}

	public Date getBeginDay() {
		return beginDay;
	}

	public void setBeginDay(Date beginDay) {
		this.beginDay = beginDay;
	}

	public Date getEndDay() {
		return endDay;
	}

	public void setEndDay(Date endDay) {
		this.endDay = endDay;
	}

	public String getMakeEmpeId() {
		return makeEmpeId;
	}

	public void setMakeEmpeId(String makeEmpeId) {
		this.makeEmpeId = makeEmpeId;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getEnItemName() {
		return enItemName;
	}

	public void setEnItemName(String enItemName) {
		this.enItemName = enItemName;
	}

	public String getSimItemName() {
		return simItemName;
	}

	public void setSimItemName(String simItemName) {
		this.simItemName = simItemName;
	}

	public String getEnSmpItemName() {
		return enSmpItemName;
	}

	public void setEnSmpItemName(String enSmpItemName) {
		this.enSmpItemName = enSmpItemName;
	}

	public Double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Double getReferencePrice() {
		return referencePrice;
	}

	public void setReferencePrice(Double referencePrice) {
		this.referencePrice = referencePrice;
	}

	public String getStyleDesc() {
		return styleDesc;
	}

	public void setStyleDesc(String styleDesc) {
		this.styleDesc = styleDesc;
	}

	public String getPty3SimNo() {
		return pty3SimNo;
	}

	public void setPty3SimNo(String pty3SimNo) {
		this.pty3SimNo = pty3SimNo;
	}

	public Long getBarcodeTypeNumId() {
		return barcodeTypeNumId;
	}

	public void setBarcodeTypeNumId(Long barcodeTypeNumId) {
		this.barcodeTypeNumId = barcodeTypeNumId;
	}

	public String getBarcode1() {
		return barcode1;
	}

	public void setBarcode1(String barcode1) {
		this.barcode1 = barcode1;
	}

	public String getProductOriginId() {
		return productOriginId;
	}

	public void setProductOriginId(String productOriginId) {
		this.productOriginId = productOriginId;
	}

	

	public String getBrandSimNo() {
		return brandSimNo;
	}

	public void setBrandSimNo(String brandSimNo) {
		this.brandSimNo = brandSimNo;
	}

	public Double getGrossProfitRate() {
		return grossProfitRate;
	}

	public void setGrossProfitRate(Double grossProfitRate) {
		this.grossProfitRate = grossProfitRate;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	

	public Long getWeightUnitNumId() {
		return weightUnitNumId;
	}

	public void setWeightUnitNumId(Long weightUnitNumId) {
		this.weightUnitNumId = weightUnitNumId;
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

	public Double getSaleTaxRate() {
		return saleTaxRate;
	}

	public void setSaleTaxRate(Double saleTaxRate) {
		this.saleTaxRate = saleTaxRate;
	}

	public Long getStockType() {
		return stockType;
	}

	public void setStockType(Long stockType) {
		this.stockType = stockType;
	}

	public Double getBackOffRate() {
		return backOffRate;
	}

	public void setBackOffRate(Double backOffRate) {
		this.backOffRate = backOffRate;
	}

	public Long getLogisticsNumId() {
		return logisticsNumId;
	}

	public void setLogisticsNumId(Long logisticsNumId) {
		this.logisticsNumId = logisticsNumId;
	}

	public Double getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(Double baseCost) {
		this.baseCost = baseCost;
	}

	public String getBarcode2() {
		return barcode2;
	}

	public void setBarcode2(String barcode2) {
		this.barcode2 = barcode2;
	}

	public String getBasicUnitId() {
		return basicUnitId;
	}

	public void setBasicUnitId(String basicUnitId) {
		this.basicUnitId = basicUnitId;
	}

	public Double getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(Double conversionRate) {
		this.conversionRate = conversionRate;
	}

	public Date getEnableDate() {
		return enableDate;
	}

	public void setEnableDate(Date enableDate) {
		this.enableDate = enableDate;
	}

	public String getPackagingMaterials() {
		return packagingMaterials;
	}

	public void setPackagingMaterials(String packagingMaterials) {
		this.packagingMaterials = packagingMaterials;
	}

	public String getSalesPackaging() {
		return salesPackaging;
	}

	public void setSalesPackaging(String salesPackaging) {
		this.salesPackaging = salesPackaging;
	}

	public Long getStorageRequirements() {
		return storageRequirements;
	}

	public void setStorageRequirements(Long storageRequirements) {
		this.storageRequirements = storageRequirements;
	}

	public String getEdibleMethod() {
		return edibleMethod;
	}

	public void setEdibleMethod(String edibleMethod) {
		this.edibleMethod = edibleMethod;
	}

	public Long getFreshDays() {
		return freshDays;
	}

	public void setFreshDays(Long freshDays) {
		this.freshDays = freshDays;
	}

	public Long getQualityDays() {
		return qualityDays;
	}

	public void setQualityDays(Long qualityDays) {
		this.qualityDays = qualityDays;
	}

	public Double getMinStorageTemperature() {
		return minStorageTemperature;
	}

	public void setMinStorageTemperature(Double minStorageTemperature) {
		this.minStorageTemperature = minStorageTemperature;
	}

	public Double getMaxStorageTemperature() {
		return maxStorageTemperature;
	}

	public void setMaxStorageTemperature(Double maxStorageTemperature) {
		this.maxStorageTemperature = maxStorageTemperature;
	}

	public Long getStoreType() {
		return storeType;
	}

	public void setStoreType(Long storeType) {
		this.storeType = storeType;
	}

	public Double getRelativeHumidity() {
		return relativeHumidity;
	}

	public void setRelativeHumidity(Double relativeHumidity) {
		this.relativeHumidity = relativeHumidity;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public String getSeasonMonthFlag() {
		return seasonMonthFlag;
	}

	public void setSeasonMonthFlag(String seasonMonthFlag) {
		this.seasonMonthFlag = seasonMonthFlag;
	}

	public Long getTryDays() {
		return tryDays;
	}

	public void setTryDays(Long tryDays) {
		this.tryDays = tryDays;
	}

	public Double getTrySaleQty() {
		return trySaleQty;
	}

	public void setTrySaleQty(Double trySaleQty) {
		this.trySaleQty = trySaleQty;
	}

	public Long getCheckProductionDaysSign() {
		return checkProductionDaysSign;
	}

	public void setCheckProductionDaysSign(Long checkProductionDaysSign) {
		this.checkProductionDaysSign = checkProductionDaysSign;
	}

	public Long getReceiptProductionDays() {
		return receiptProductionDays;
	}

	public void setReceiptProductionDays(Long receiptProductionDays) {
		this.receiptProductionDays = receiptProductionDays;
	}

	public Double getTrySaleValue() {
		return trySaleValue;
	}

	public void setTrySaleValue(Double trySaleValue) {
		this.trySaleValue = trySaleValue;
	}

	public String getIngredientOrigin() {
		return ingredientOrigin;
	}

	public void setIngredientOrigin(String ingredientOrigin) {
		this.ingredientOrigin = ingredientOrigin;
	}

	public Long getIsHolidayGift() {
		return isHolidayGift;
	}

	public void setIsHolidayGift(Long isHolidayGift) {
		this.isHolidayGift = isHolidayGift;
	}

	public Date getGiftBeginDay() {
		return giftBeginDay;
	}

	public void setGiftBeginDay(Date giftBeginDay) {
		this.giftBeginDay = giftBeginDay;
	}

	public Date getGiftEndDay() {
		return giftEndDay;
	}

	public void setGiftEndDay(Date giftEndDay) {
		this.giftEndDay = giftEndDay;
	}

	public Long getIsOnlineSales() {
		return isOnlineSales;
	}

	public void setIsOnlineSales(Long isOnlineSales) {
		this.isOnlineSales = isOnlineSales;
	}

	public Long getPurchaseTypeNumId() {
		return purchaseTypeNumId;
	}

	public void setPurchaseTypeNumId(Long purchaseTypeNumId) {
		this.purchaseTypeNumId = purchaseTypeNumId;
	}

	public Long getIsProcessing() {
		return isProcessing;
	}

	public void setIsProcessing(Long isProcessing) {
		this.isProcessing = isProcessing;
	}

	public Long getCostPlanNumId() {
		return costPlanNumId;
	}

	public void setCostPlanNumId(Long costPlanNumId) {
		this.costPlanNumId = costPlanNumId;
	}

	public Long getCheckPlanNumId() {
		return checkPlanNumId;
	}

	public void setCheckPlanNumId(Long checkPlanNumId) {
		this.checkPlanNumId = checkPlanNumId;
	}

	public Long getWarehouseingPlanNumId() {
		return warehouseingPlanNumId;
	}

	public void setWarehouseingPlanNumId(Long warehouseingPlanNumId) {
		this.warehouseingPlanNumId = warehouseingPlanNumId;
	}

	public Long getPickingPlanNumId() {
		return pickingPlanNumId;
	}

	public void setPickingPlanNumId(Long pickingPlanNumId) {
		this.pickingPlanNumId = pickingPlanNumId;
	}

	public Long getDepartNumId() {
		return departNumId;
	}

	public void setDepartNumId(Long departNumId) {
		this.departNumId = departNumId;
	}

	public Long getStorageDeptNumId() {
		return storageDeptNumId;
	}

	public void setStorageDeptNumId(Long storageDeptNumId) {
		this.storageDeptNumId = storageDeptNumId;
	}

	public String getHomeMade() {
		return homeMade;
	}

	public void setHomeMade(String homeMade) {
		this.homeMade = homeMade;
	}

	public Long getStyleNumId() {
		return styleNumId;
	}

	public void setStyleNumId(Long styleNumId) {
		this.styleNumId = styleNumId;
	}

	public String getStyleName() {
		return styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	public Double getSellPriceRate() {
		return sellPriceRate;
	}

	public void setSellPriceRate(Double sellPriceRate) {
		this.sellPriceRate = sellPriceRate;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Long getFreshType() {
		return freshType;
	}

	public void setFreshType(Long freshType) {
		this.freshType = freshType;
	}

	public Long getGpItemNumId() {
		return gpItemNumId;
	}

	public void setGpItemNumId(Long gpItemNumId) {
		this.gpItemNumId = gpItemNumId;
	}

	public String getColorSimNo() {
		return colorSimNo;
	}

	public void setColorSimNo(String colorSimNo) {
		this.colorSimNo = colorSimNo;
	}

	public String getSizeSimNo() {
		return sizeSimNo;
	}

	public void setSizeSimNo(String sizeSimNo) {
		this.sizeSimNo = sizeSimNo;
	}

	public Long getClassifyNumId() {
		return classifyNumId;
	}

	public void setClassifyNumId(Long classifyNumId) {
		this.classifyNumId = classifyNumId;
	}

	public Long getIsSingleItems() {
		return isSingleItems;
	}

	public void setIsSingleItems(Long isSingleItems) {
		this.isSingleItems = isSingleItems;
	}

	public Long getModifyPrice() {
		return modifyPrice;
	}

	public void setModifyPrice(Long modifyPrice) {
		this.modifyPrice = modifyPrice;
	}

	public String getMix() {
		return mix;
	}

	public void setMix(String mix) {
		this.mix = mix;
	}

	public Long getIsSsPb() {
		return isSsPb;
	}

	public void setIsSsPb(Long isSsPb) {
		this.isSsPb = isSsPb;
	}

	public Long getPty16NumId() {
		return pty16NumId;
	}

	public void setPty16NumId(Long pty16NumId) {
		this.pty16NumId = pty16NumId;
	}

	public Long getPty17NumId() {
		return pty17NumId;
	}

	public void setPty17NumId(Long pty17NumId) {
		this.pty17NumId = pty17NumId;
	}

	public Long getBbdate() {
		return bbdate;
	}

	public void setBbdate(Long bbdate) {
		this.bbdate = bbdate;
	}

	public Long getBldate() {
		return bldate;
	}

	public void setBldate(Long bldate) {
		this.bldate = bldate;
	}

	
    

   

	

}
