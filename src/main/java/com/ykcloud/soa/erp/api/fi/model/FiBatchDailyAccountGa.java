package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;

import java.util.Date;


public class FiBatchDailyAccountGa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5490899880524360585L;
	
	private Long batchSeries;
	/**
	 *租户
	**/	
	private Long tenantNumid;
	/**
	 *门店
	**/	
	private Long subUnitnumid;
	/**
	 *批次单据号
	**/	
	private Long reservedNo;
	/**
	 *批次业务类型
	**/	
	private Integer typeNumid;
	/**
	 *批次单据类型
	**/	
	private Integer batchTypenumid;
	/**
	 *批次发生日期
	**/	
	private Date orderDate;
	/**
	 *批次单据行号
	**/	
	private Long reservedLine;
	/**
	 *批次促销档期
	**/	
	private Long promotionGrade;
	/**
	 *批次供应商
	**/	
	private Integer supplyUnitnumid;
	/**
	 *销售成本2
	**/	
	private String sellCost2;
	/**
	 *无税销售成本1
	**/	
	private String noTaxsellcost1;
	/**
	 *无税销售成本2
	**/	
	private String noTaxsellcost2;
	/**
	 *内部销售数量
	**/	
	private String inSellqty;
	/**
	 *内部销售金额
	**/	
	private String inSellamount;
	/**
	 *内部销项税金
	**/	
	private String inSelltaxamount;
	/**
	 *内部销售成本1
	**/	
	private String inSellcost1;
	/**
	 *内部销售成本2
	**/	
	private String inSellcost2;
	/**
	 *其他无税成本
	**/	
	private String otherNotaxcost;
	/**
	 *其他成本
	**/	
	private String otherCost;
	/**
	 *批次采购价格
	**/	
	private String price;
	/**
	 *待分摊销售数量
	**/	
	private String forSharesellqty;
	/**
	 *待分摊销售金额
	**/	
	private String forSharesellamount;
	/**
	 *供应商促销档期
	**/	
	private Integer supPromotiongrade;
	/**
	 *首次入库批次行号
	**/	
	private Long firstBatchseries;
	/**
	 *首次验收入库日期
	**/	
	private Date firstRecdate;
	/**
	 *首次供应商
	**/	
	private Integer firstSupplyunitnumid;
	/**
	 *供应商采购价格
	**/	
	private String supPrice;
	/**
	 *供应商确认生产日期
	**/	
	private String supProducedate;
	/**
	 *商品
	**/	
	private Long itemNumid;
	/**
	 *商品中心（部门）
	**/	
	private Integer divNumid;
	/**
	 *商品条码
	**/	
	private String barcode;
	/**
	 *商品品名
	**/	
	private String itemName;
	/**
	 *产地
	**/	
	private Integer productOriginnumid;
	/**
	 *件数
	**/	
	private String conversionQty;
	/**
	 *件装单位
	**/	
	private Long conversionUnitnumid;
	/**
	 *件装规格
	**/	
	private String conversionStyledesc;
	/**
	 *进项税率
	**/	
	private String inTaxrate;
	/**
	 *销项税率
	**/	
	private String outTaxrate;
	/**
	 *销售毛利
	**/	
	private String saleGrossprofit;
	/**
	 *进货数量
	**/	
	private String inQty;
	/**
	 *进货金额1
	**/	
	private String inAmount1;
	/**
	 *进货金额2
	**/	
	private String inAmount2;
	/**
	 *进项税金1
	**/	
	private String inTaxamount1;
	/**
	 *进项税金2
	**/	
	private String inTaxamount2;
	/**
	 *退补金额
	**/	
	private String returnAmount;
	/**
	 *退补税金
	**/	
	private String returnTaxamount;
	/**
	 *退补成本
	**/	
	private String returnCost;
	/**
	 *内部进货数量
	**/	
	private String insideQty;
	/**
	 *内部进货金额1
	**/	
	private String insideAmount1;
	/**
	 *内部进货金额2
	**/	
	private String insideAmount2;
	/**
	 *内部进货税金
	**/	
	private String insideTaxamount1;
	/**
	 *拨入数量
	**/	
	private String allotInqty;
	/**
	 *拨入金额1
	**/	
	private String allotInamount1;
	/**
	 *拨入金额2
	**/	
	private String allotInamount2;
	/**
	 *拨入税金1
	**/	
	private String allotIntaxamount1;
	/**
	 *拨入税金2
	**/	
	private String allotIntaxamount2;
	/**
	 *加工拨入数量
	**/	
	private String workInqty;
	/**
	 *加工拨入金额1
	**/	
	private String workInamount1;
	/**
	 *加工拨入金额2
	**/	
	private String workInamount2;
	/**
	 *加工拨入税金1
	**/	
	private String workIntaxamount1;
	/**
	 *加工拨入税金2
	**/	
	private String workIntaxamount2;
	/**
	 *升溢数量
	**/	
	private String riseQty;
	/**
	 *升溢金额1
	**/	
	private String riseAmount1;
	/**
	 *升溢金额2
	**/	
	private String riseAmount2;
	/**
	 *升溢税金1
	**/	
	private String riseTaxamount1;
	/**
	 *升溢税金2
	**/	
	private String riseTaxamount2;
	/**
	 *损耗数量
	**/	
	private String lossQty;
	/**
	 *损耗金额1
	**/	
	private String lossAmount1;
	/**
	 *损耗金额2
	**/	
	private String lossAmount2;
	/**
	 *损耗税金1
	**/	
	private String lossTaxamount1;
	/**
	 *损耗税金2
	**/	
	private String lossTaxamount2;
	/**
	 *生鲜损耗数量
	**/	
	private String freshLossqty;
	/**
	 *生鲜损耗金额1
	**/	
	private String freshLossamount1;
	/**
	 *生鲜损耗金额2
	**/	
	private String freshLossamount2;
	/**
	 *生鲜损耗税金1
	**/	
	private String freshLosstaxamount1;
	/**
	 *生鲜损耗税金2
	**/	
	private String freshLosstaxamount2;
	/**
	 *拨出数量
	**/	
	private String allotOutqty;
	/**
	 *拨出金额1
	**/	
	private String allotOutamount1;
	/**
	 *拨出金额2
	**/	
	private String allotOutamount2;
	/**
	 *拨出税金1
	**/	
	private String allotOuttaxamount1;
	/**
	 *拨出税金2
	**/	
	private String allotOuttaxamount2;
	/**
	 *加工拨出数量
	**/	
	private String workOutqty;
	/**
	 *加工拨出金额1
	**/	
	private String workOutamount1;
	/**
	 *加工拨出金额2
	**/	
	private String workOutamount2;
	/**
	 *加工拨出税金1
	**/	
	private String workOuttaxamount1;
	/**
	 *加工拨出税金2
	**/	
	private String workOuttaxamount2;
	/**
	 *转赠品数量
	**/	
	private String turnPmtqty;
	/**
	 *转赠品金额1
	**/	
	private String turnPmtamount1;
	/**
	 *转赠品金额2
	**/	
	private String turnPmtamount2;
	/**
	 *转赠品税金1
	**/	
	private String turnPmttaxamount1;
	/**
	 *转赠品税金2
	**/	
	private String turnPmttaxamount2;
	/**
	 *销售数量
	**/	
	private String sellQty;
	/**
	 *销售单价
	**/	
	private String sellAmount;
	/**
	 *销项税金
	**/	
	private String sellTaxamount;
	/**
	 *销售成本1
	**/	
	private String sellCost1;
	/**
	 *待分摊销项税金
	**/	
	private String forShareselltaxamount;
	/**
	 *待分摊销售成本1
	**/	
	private String forSharesellcost1;
	/**
	 *待分摊销售成本2
	**/	
	private String forSharesellcost2;
	/**
	 *期末数量
	**/	
	private String FINALQTY;
	/**
	 *期末金额
	**/	
	private String FINALCOST;
	/**
	 *创建人
	**/	
	private Long createUserid;
	/**
	 *更新人
	**/	
	private Long lastUpdateuserid;
	/**
	 *创建时间
	**/	
	private Date createDtme;
	/**
	 *期初金额1
	**/	
	private String expectFirstamount1;
	/**
	 *期初数量
	**/	
	private String expectFirstqty;
	/**
	 *更新时间
	**/	
	private Date lastUpdtme;
	/**
	 *结转标识
	**/	
	private Integer carrySign;
	/**
	 *生产或测试标识
	**/	
	private Integer dataSign;
	/**
	 *商品大类
	**/	
	private Long ptyNum1;
	/**
	 *商品中类
	**/	
	private Long ptyNum2;
	/**
	 *商品小类
	**/	
	private Long ptyNum3;
	/**
	 *商品小类
	**/	
	private Long departNumid;
	/**
	 *商品商家编码
	**/	
	private String itemid;
	/**
	 *调整数量
	**/	
	private String ADJUSTQTY;
	/**
	 *调整金额
	**/	
	private Double ADJUSTAMOUNT;
	/**
	 *调整税金
	**/	
	private String ADJUSTTAXAMOUNT;
	/**
	 *退供应商数量
	**/	
	private String REFUNDQTY;
	/**
	 *退供应商金额
	**/	
	private String REFUNDAMOUNT;
	/**
	 *退供应商税金
	**/	
	private String REFUNDTAXAMOUNT;
	/**
	 *
	**/	
	private String txc;
	/**
	 *
	**/	
	private Long PHYSICALNUMID;
	
	public Long getBatchSeries() {
		return batchSeries;
	}
	public void setBatchSeries(Long batchSeries) {
		this.batchSeries = batchSeries;
	}
	public Long getTenantNumid(){
		return tenantNumid;
	}
	public void setTenantNumid(Long tenantNumid){
		this.tenantNumid = tenantNumid;
	}
	public Long getSubUnitnumid(){
		return subUnitnumid;
	}
	public void setSubUnitnumid(Long subUnitnumid){
		this.subUnitnumid = subUnitnumid;
	}
	public Long getReservedNo(){
		return reservedNo;
	}
	public void setReservedNo(Long reservedNo){
		this.reservedNo = reservedNo;
	}
	public Integer getTypeNumid(){
		return typeNumid;
	}
	public void setTypeNumid(Integer typeNumid){
		this.typeNumid = typeNumid;
	}
	public Integer getBatchTypenumid(){
		return batchTypenumid;
	}
	public void setBatchTypenumid(Integer batchTypenumid){
		this.batchTypenumid = batchTypenumid;
	}
	public Date getOrderDate(){
		return orderDate;
	}
	public void setOrderDate(Date orderDate){
		this.orderDate = orderDate;
	}
	public Long getReservedLine(){
		return reservedLine;
	}
	public void setReservedLine(Long reservedLine){
		this.reservedLine = reservedLine;
	}
	public Long getPromotionGrade(){
		return promotionGrade;
	}
	public void setPromotionGrade(Long promotionGrade){
		this.promotionGrade = promotionGrade;
	}
	public Integer getSupplyUnitnumid(){
		return supplyUnitnumid;
	}
	public void setSupplyUnitnumid(Integer supplyUnitnumid){
		this.supplyUnitnumid = supplyUnitnumid;
	}
	public String getSellCost2(){
		return sellCost2;
	}
	public void setSellCost2(String sellCost2){
		this.sellCost2 = sellCost2;
	}
	public String getNoTaxsellcost1(){
		return noTaxsellcost1;
	}
	public void setNoTaxsellcost1(String noTaxsellcost1){
		this.noTaxsellcost1 = noTaxsellcost1;
	}
	public String getNoTaxsellcost2(){
		return noTaxsellcost2;
	}
	public void setNoTaxsellcost2(String noTaxsellcost2){
		this.noTaxsellcost2 = noTaxsellcost2;
	}
	public String getInSellqty(){
		return inSellqty;
	}
	public void setInSellqty(String inSellqty){
		this.inSellqty = inSellqty;
	}
	public String getInSellamount(){
		return inSellamount;
	}
	public void setInSellamount(String inSellamount){
		this.inSellamount = inSellamount;
	}
	public String getInSelltaxamount(){
		return inSelltaxamount;
	}
	public void setInSelltaxamount(String inSelltaxamount){
		this.inSelltaxamount = inSelltaxamount;
	}
	public String getInSellcost1(){
		return inSellcost1;
	}
	public void setInSellcost1(String inSellcost1){
		this.inSellcost1 = inSellcost1;
	}
	public String getInSellcost2(){
		return inSellcost2;
	}
	public void setInSellcost2(String inSellcost2){
		this.inSellcost2 = inSellcost2;
	}
	public String getOtherNotaxcost(){
		return otherNotaxcost;
	}
	public void setOtherNotaxcost(String otherNotaxcost){
		this.otherNotaxcost = otherNotaxcost;
	}
	public String getOtherCost(){
		return otherCost;
	}
	public void setOtherCost(String otherCost){
		this.otherCost = otherCost;
	}
	public String getPrice(){
		return price;
	}
	public void setPrice(String price){
		this.price = price;
	}
	public String getForSharesellqty(){
		return forSharesellqty;
	}
	public void setForSharesellqty(String forSharesellqty){
		this.forSharesellqty = forSharesellqty;
	}
	public String getForSharesellamount(){
		return forSharesellamount;
	}
	public void setForSharesellamount(String forSharesellamount){
		this.forSharesellamount = forSharesellamount;
	}
	public Integer getSupPromotiongrade(){
		return supPromotiongrade;
	}
	public void setSupPromotiongrade(Integer supPromotiongrade){
		this.supPromotiongrade = supPromotiongrade;
	}
	public Long getFirstBatchseries(){
		return firstBatchseries;
	}
	public void setFirstBatchseries(Long firstBatchseries){
		this.firstBatchseries = firstBatchseries;
	}
	public Date getFirstRecdate(){
		return firstRecdate;
	}
	public void setFirstRecdate(Date firstRecdate){
		this.firstRecdate = firstRecdate;
	}
	public Integer getFirstSupplyunitnumid(){
		return firstSupplyunitnumid;
	}
	public void setFirstSupplyunitnumid(Integer firstSupplyunitnumid){
		this.firstSupplyunitnumid = firstSupplyunitnumid;
	}
	public String getSupPrice(){
		return supPrice;
	}
	public void setSupPrice(String supPrice){
		this.supPrice = supPrice;
	}
	public String getSupProducedate(){
		return supProducedate;
	}
	public void setSupProducedate(String supProducedate){
		this.supProducedate = supProducedate;
	}
	public Long getItemNumid(){
		return itemNumid;
	}
	public void setItemNumid(Long itemNumid){
		this.itemNumid = itemNumid;
	}
	public Integer getDivNumid(){
		return divNumid;
	}
	public void setDivNumid(Integer divNumid){
		this.divNumid = divNumid;
	}
	public String getBarcode(){
		return barcode;
	}
	public void setBarcode(String barcode){
		this.barcode = barcode;
	}
	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	public Integer getProductOriginnumid(){
		return productOriginnumid;
	}
	public void setProductOriginnumid(Integer productOriginnumid){
		this.productOriginnumid = productOriginnumid;
	}
	public String getConversionQty(){
		return conversionQty;
	}
	public void setConversionQty(String conversionQty){
		this.conversionQty = conversionQty;
	}
	public Long getConversionUnitnumid(){
		return conversionUnitnumid;
	}
	public void setConversionUnitnumid(Long conversionUnitnumid){
		this.conversionUnitnumid = conversionUnitnumid;
	}
	public String getConversionStyledesc(){
		return conversionStyledesc;
	}
	public void setConversionStyledesc(String conversionStyledesc){
		this.conversionStyledesc = conversionStyledesc;
	}
	public String getInTaxrate(){
		return inTaxrate;
	}
	public void setInTaxrate(String inTaxrate){
		this.inTaxrate = inTaxrate;
	}
	public String getOutTaxrate(){
		return outTaxrate;
	}
	public void setOutTaxrate(String outTaxrate){
		this.outTaxrate = outTaxrate;
	}
	public String getSaleGrossprofit(){
		return saleGrossprofit;
	}
	public void setSaleGrossprofit(String saleGrossprofit){
		this.saleGrossprofit = saleGrossprofit;
	}
	public String getInQty(){
		return inQty;
	}
	public void setInQty(String inQty){
		this.inQty = inQty;
	}
	public String getInAmount1(){
		return inAmount1;
	}
	public void setInAmount1(String inAmount1){
		this.inAmount1 = inAmount1;
	}
	public String getInAmount2(){
		return inAmount2;
	}
	public void setInAmount2(String inAmount2){
		this.inAmount2 = inAmount2;
	}
	public String getInTaxamount1(){
		return inTaxamount1;
	}
	public void setInTaxamount1(String inTaxamount1){
		this.inTaxamount1 = inTaxamount1;
	}
	public String getInTaxamount2(){
		return inTaxamount2;
	}
	public void setInTaxamount2(String inTaxamount2){
		this.inTaxamount2 = inTaxamount2;
	}
	public String getReturnAmount(){
		return returnAmount;
	}
	public void setReturnAmount(String returnAmount){
		this.returnAmount = returnAmount;
	}
	public String getReturnTaxamount(){
		return returnTaxamount;
	}
	public void setReturnTaxamount(String returnTaxamount){
		this.returnTaxamount = returnTaxamount;
	}
	public String getReturnCost(){
		return returnCost;
	}
	public void setReturnCost(String returnCost){
		this.returnCost = returnCost;
	}
	public String getInsideQty(){
		return insideQty;
	}
	public void setInsideQty(String insideQty){
		this.insideQty = insideQty;
	}
	public String getInsideAmount1(){
		return insideAmount1;
	}
	public void setInsideAmount1(String insideAmount1){
		this.insideAmount1 = insideAmount1;
	}
	public String getInsideAmount2(){
		return insideAmount2;
	}
	public void setInsideAmount2(String insideAmount2){
		this.insideAmount2 = insideAmount2;
	}
	public String getInsideTaxamount1(){
		return insideTaxamount1;
	}
	public void setInsideTaxamount1(String insideTaxamount1){
		this.insideTaxamount1 = insideTaxamount1;
	}
	public String getAllotInqty(){
		return allotInqty;
	}
	public void setAllotInqty(String allotInqty){
		this.allotInqty = allotInqty;
	}
	public String getAllotInamount1(){
		return allotInamount1;
	}
	public void setAllotInamount1(String allotInamount1){
		this.allotInamount1 = allotInamount1;
	}
	public String getAllotInamount2(){
		return allotInamount2;
	}
	public void setAllotInamount2(String allotInamount2){
		this.allotInamount2 = allotInamount2;
	}
	public String getAllotIntaxamount1(){
		return allotIntaxamount1;
	}
	public void setAllotIntaxamount1(String allotIntaxamount1){
		this.allotIntaxamount1 = allotIntaxamount1;
	}
	public String getAllotIntaxamount2(){
		return allotIntaxamount2;
	}
	public void setAllotIntaxamount2(String allotIntaxamount2){
		this.allotIntaxamount2 = allotIntaxamount2;
	}
	public String getWorkInqty(){
		return workInqty;
	}
	public void setWorkInqty(String workInqty){
		this.workInqty = workInqty;
	}
	public String getWorkInamount1(){
		return workInamount1;
	}
	public void setWorkInamount1(String workInamount1){
		this.workInamount1 = workInamount1;
	}
	public String getWorkInamount2(){
		return workInamount2;
	}
	public void setWorkInamount2(String workInamount2){
		this.workInamount2 = workInamount2;
	}
	public String getWorkIntaxamount1(){
		return workIntaxamount1;
	}
	public void setWorkIntaxamount1(String workIntaxamount1){
		this.workIntaxamount1 = workIntaxamount1;
	}
	public String getWorkIntaxamount2(){
		return workIntaxamount2;
	}
	public void setWorkIntaxamount2(String workIntaxamount2){
		this.workIntaxamount2 = workIntaxamount2;
	}
	public String getRiseQty(){
		return riseQty;
	}
	public void setRiseQty(String riseQty){
		this.riseQty = riseQty;
	}
	public String getRiseAmount1(){
		return riseAmount1;
	}
	public void setRiseAmount1(String riseAmount1){
		this.riseAmount1 = riseAmount1;
	}
	public String getRiseAmount2(){
		return riseAmount2;
	}
	public void setRiseAmount2(String riseAmount2){
		this.riseAmount2 = riseAmount2;
	}
	public String getRiseTaxamount1(){
		return riseTaxamount1;
	}
	public void setRiseTaxamount1(String riseTaxamount1){
		this.riseTaxamount1 = riseTaxamount1;
	}
	public String getRiseTaxamount2(){
		return riseTaxamount2;
	}
	public void setRiseTaxamount2(String riseTaxamount2){
		this.riseTaxamount2 = riseTaxamount2;
	}
	public String getLossQty(){
		return lossQty;
	}
	public void setLossQty(String lossQty){
		this.lossQty = lossQty;
	}
	public String getLossAmount1(){
		return lossAmount1;
	}
	public void setLossAmount1(String lossAmount1){
		this.lossAmount1 = lossAmount1;
	}
	public String getLossAmount2(){
		return lossAmount2;
	}
	public void setLossAmount2(String lossAmount2){
		this.lossAmount2 = lossAmount2;
	}
	public String getLossTaxamount1(){
		return lossTaxamount1;
	}
	public void setLossTaxamount1(String lossTaxamount1){
		this.lossTaxamount1 = lossTaxamount1;
	}
	public String getLossTaxamount2(){
		return lossTaxamount2;
	}
	public void setLossTaxamount2(String lossTaxamount2){
		this.lossTaxamount2 = lossTaxamount2;
	}
	public String getFreshLossqty(){
		return freshLossqty;
	}
	public void setFreshLossqty(String freshLossqty){
		this.freshLossqty = freshLossqty;
	}
	public String getFreshLossamount1(){
		return freshLossamount1;
	}
	public void setFreshLossamount1(String freshLossamount1){
		this.freshLossamount1 = freshLossamount1;
	}
	public String getFreshLossamount2(){
		return freshLossamount2;
	}
	public void setFreshLossamount2(String freshLossamount2){
		this.freshLossamount2 = freshLossamount2;
	}
	public String getFreshLosstaxamount1(){
		return freshLosstaxamount1;
	}
	public void setFreshLosstaxamount1(String freshLosstaxamount1){
		this.freshLosstaxamount1 = freshLosstaxamount1;
	}
	public String getFreshLosstaxamount2(){
		return freshLosstaxamount2;
	}
	public void setFreshLosstaxamount2(String freshLosstaxamount2){
		this.freshLosstaxamount2 = freshLosstaxamount2;
	}
	public String getAllotOutqty(){
		return allotOutqty;
	}
	public void setAllotOutqty(String allotOutqty){
		this.allotOutqty = allotOutqty;
	}
	public String getAllotOutamount1(){
		return allotOutamount1;
	}
	public void setAllotOutamount1(String allotOutamount1){
		this.allotOutamount1 = allotOutamount1;
	}
	public String getAllotOutamount2(){
		return allotOutamount2;
	}
	public void setAllotOutamount2(String allotOutamount2){
		this.allotOutamount2 = allotOutamount2;
	}
	public String getAllotOuttaxamount1(){
		return allotOuttaxamount1;
	}
	public void setAllotOuttaxamount1(String allotOuttaxamount1){
		this.allotOuttaxamount1 = allotOuttaxamount1;
	}
	public String getAllotOuttaxamount2(){
		return allotOuttaxamount2;
	}
	public void setAllotOuttaxamount2(String allotOuttaxamount2){
		this.allotOuttaxamount2 = allotOuttaxamount2;
	}
	public String getWorkOutqty(){
		return workOutqty;
	}
	public void setWorkOutqty(String workOutqty){
		this.workOutqty = workOutqty;
	}
	public String getWorkOutamount1(){
		return workOutamount1;
	}
	public void setWorkOutamount1(String workOutamount1){
		this.workOutamount1 = workOutamount1;
	}
	public String getWorkOutamount2(){
		return workOutamount2;
	}
	public void setWorkOutamount2(String workOutamount2){
		this.workOutamount2 = workOutamount2;
	}
	public String getWorkOuttaxamount1(){
		return workOuttaxamount1;
	}
	public void setWorkOuttaxamount1(String workOuttaxamount1){
		this.workOuttaxamount1 = workOuttaxamount1;
	}
	public String getWorkOuttaxamount2(){
		return workOuttaxamount2;
	}
	public void setWorkOuttaxamount2(String workOuttaxamount2){
		this.workOuttaxamount2 = workOuttaxamount2;
	}
	public String getTurnPmtqty(){
		return turnPmtqty;
	}
	public void setTurnPmtqty(String turnPmtqty){
		this.turnPmtqty = turnPmtqty;
	}
	public String getTurnPmtamount1(){
		return turnPmtamount1;
	}
	public void setTurnPmtamount1(String turnPmtamount1){
		this.turnPmtamount1 = turnPmtamount1;
	}
	public String getTurnPmtamount2(){
		return turnPmtamount2;
	}
	public void setTurnPmtamount2(String turnPmtamount2){
		this.turnPmtamount2 = turnPmtamount2;
	}
	public String getTurnPmttaxamount1(){
		return turnPmttaxamount1;
	}
	public void setTurnPmttaxamount1(String turnPmttaxamount1){
		this.turnPmttaxamount1 = turnPmttaxamount1;
	}
	public String getTurnPmttaxamount2(){
		return turnPmttaxamount2;
	}
	public void setTurnPmttaxamount2(String turnPmttaxamount2){
		this.turnPmttaxamount2 = turnPmttaxamount2;
	}
	public String getSellQty(){
		return sellQty;
	}
	public void setSellQty(String sellQty){
		this.sellQty = sellQty;
	}
	public String getSellAmount(){
		return sellAmount;
	}
	public void setSellAmount(String sellAmount){
		this.sellAmount = sellAmount;
	}
	public String getSellTaxamount(){
		return sellTaxamount;
	}
	public void setSellTaxamount(String sellTaxamount){
		this.sellTaxamount = sellTaxamount;
	}
	public String getSellCost1(){
		return sellCost1;
	}
	public void setSellCost1(String sellCost1){
		this.sellCost1 = sellCost1;
	}
	public String getForShareselltaxamount(){
		return forShareselltaxamount;
	}
	public void setForShareselltaxamount(String forShareselltaxamount){
		this.forShareselltaxamount = forShareselltaxamount;
	}
	public String getForSharesellcost1(){
		return forSharesellcost1;
	}
	public void setForSharesellcost1(String forSharesellcost1){
		this.forSharesellcost1 = forSharesellcost1;
	}
	public String getForSharesellcost2(){
		return forSharesellcost2;
	}
	public void setForSharesellcost2(String forSharesellcost2){
		this.forSharesellcost2 = forSharesellcost2;
	}
	public String getFINALQTY(){
		return FINALQTY;
	}
	public void setFINALQTY(String FINALQTY){
		this.FINALQTY = FINALQTY;
	}
	public String getFINALCOST(){
		return FINALCOST;
	}
	public void setFINALCOST(String FINALCOST){
		this.FINALCOST = FINALCOST;
	}
	public Long getCreateUserid(){
		return createUserid;
	}
	public void setCreateUserid(Long createUserid){
		this.createUserid = createUserid;
	}
	public Long getLastUpdateuserid(){
		return lastUpdateuserid;
	}
	public void setLastUpdateuserid(Long lastUpdateuserid){
		this.lastUpdateuserid = lastUpdateuserid;
	}
	public Date getCreateDtme(){
		return createDtme;
	}
	public void setCreateDtme(Date createDtme){
		this.createDtme = createDtme;
	}
	public String getExpectFirstamount1(){
		return expectFirstamount1;
	}
	public void setExpectFirstamount1(String expectFirstamount1){
		this.expectFirstamount1 = expectFirstamount1;
	}
	public String getExpectFirstqty(){
		return expectFirstqty;
	}
	public void setExpectFirstqty(String expectFirstqty){
		this.expectFirstqty = expectFirstqty;
	}
	public Date getLastUpdtme(){
		return lastUpdtme;
	}
	public void setLastUpdtme(Date lastUpdtme){
		this.lastUpdtme = lastUpdtme;
	}
	public Integer getCarrySign(){
		return carrySign;
	}
	public void setCarrySign(Integer carrySign){
		this.carrySign = carrySign;
	}
	public Integer getDataSign(){
		return dataSign;
	}
	public void setDataSign(Integer dataSign){
		this.dataSign = dataSign;
	}
	public Long getPtyNum1(){
		return ptyNum1;
	}
	public void setPtyNum1(Long ptyNum1){
		this.ptyNum1 = ptyNum1;
	}
	public Long getPtyNum2(){
		return ptyNum2;
	}
	public void setPtyNum2(Long ptyNum2){
		this.ptyNum2 = ptyNum2;
	}
	public Long getPtyNum3(){
		return ptyNum3;
	}
	public void setPtyNum3(Long ptyNum3){
		this.ptyNum3 = ptyNum3;
	}
	public Long getDepartNumid(){
		return departNumid;
	}
	public void setDepartNumid(Long departNumid){
		this.departNumid = departNumid;
	}
	public String getItemid(){
		return itemid;
	}
	public void setItemid(String itemid){
		this.itemid = itemid;
	}
	public String getADJUSTQTY(){
		return ADJUSTQTY;
	}
	public void setADJUSTQTY(String ADJUSTQTY){
		this.ADJUSTQTY = ADJUSTQTY;
	}
	public Double getADJUSTAMOUNT() {
		return ADJUSTAMOUNT;
	}
	public void setADJUSTAMOUNT(Double aDJUSTAMOUNT) {
		ADJUSTAMOUNT = aDJUSTAMOUNT;
	}
	public String getADJUSTTAXAMOUNT(){
		return ADJUSTTAXAMOUNT;
	}
	public void setADJUSTTAXAMOUNT(String ADJUSTTAXAMOUNT){
		this.ADJUSTTAXAMOUNT = ADJUSTTAXAMOUNT;
	}
	public String getREFUNDQTY(){
		return REFUNDQTY;
	}
	public void setREFUNDQTY(String REFUNDQTY){
		this.REFUNDQTY = REFUNDQTY;
	}
	public String getREFUNDAMOUNT(){
		return REFUNDAMOUNT;
	}
	public void setREFUNDAMOUNT(String REFUNDAMOUNT){
		this.REFUNDAMOUNT = REFUNDAMOUNT;
	}
	public String getREFUNDTAXAMOUNT(){
		return REFUNDTAXAMOUNT;
	}
	public void setREFUNDTAXAMOUNT(String REFUNDTAXAMOUNT){
		this.REFUNDTAXAMOUNT = REFUNDTAXAMOUNT;
	}
	public String getTxc(){
		return txc;
	}
	public void setTxc(String txc){
		this.txc = txc;
	}
	public Long getPHYSICALNUMID(){
		return PHYSICALNUMID;
	}
	public void setPHYSICALNUMID(Long PHYSICALNUMID){
		this.PHYSICALNUMID = PHYSICALNUMID;
	}
}
