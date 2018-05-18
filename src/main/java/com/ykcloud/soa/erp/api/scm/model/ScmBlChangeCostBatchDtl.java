package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;
import java.util.Date;


public class ScmBlChangeCostBatchDtl implements Serializable{

	/**
	 * @Author: 殷剑
	 * @Description:用于操作scm_bl_change_cost_batch_dtl表的Model
	 */
	private static final long serialVersionUID = -5490899880524360585L;
	
	private Long series;
	/**
	 *进价调整单号
	**/	
	private Long reservedNo;
	/**
	 *租户
	**/	
	private Long tenantNumid;
	/**
	 *门店
	**/	
	private Long subUnitnumid;
	/**
	 *调整日期
	**/	
	private Date makeDate;
	/**
	 *物理仓库
	**/	
	private Long physicalNumid;
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
	 *件装单位
	**/	
	private String conversionQty;
	/**
	 *件装规格
	**/	
	private String conversionStyledesc;
	/**
	 *调整前进价
	**/	
	private String ordCost;
	/**
	 *调整后进价
	**/	
	private String newCost;
	/**
	 *调整数量
	**/	
	private String qty;
	/**
	 *调整金额
	**/	
	private String amount;
	/**
	 *批次行号
	**/	
	private Long batchSeries;
	/**
	 *批次促销档期
	**/	
	private Long batchPromotiongrade;
	/**
	 *批次供应商
	**/	
	private Integer batchSupplyunitnumid;
	/**
	 *批次采购价格
	**/	
	private String batchPoprice;
	/**
	 *供应商促销档期
	**/	
	private Long supPromotiongrade;
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
	private String supPriec;
	/**
	 *供应商确认生产日期
	**/	
	private String supProducedate;
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
	 *商品商家编码
	**/	
	private String itemid;
	public Long getSeries(){
		return series;
	}
	public void setSeries(Long series){
		this.series = series;
	}
	public Long getReservedNo(){
		return reservedNo;
	}
	public void setReservedNo(Long reservedNo){
		this.reservedNo = reservedNo;
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
	public Date getMakeDate(){
		return makeDate;
	}
	public void setMakeDate(Date makeDate){
		this.makeDate = makeDate;
	}
	public Long getPhysicalNumid(){
		return physicalNumid;
	}
	public void setPhysicalNumid(Long physicalNumid){
		this.physicalNumid = physicalNumid;
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
	public String getConversionStyledesc(){
		return conversionStyledesc;
	}
	public void setConversionStyledesc(String conversionStyledesc){
		this.conversionStyledesc = conversionStyledesc;
	}
	public String getOrdCost(){
		return ordCost;
	}
	public void setOrdCost(String ordCost){
		this.ordCost = ordCost;
	}
	public String getNewCost(){
		return newCost;
	}
	public void setNewCost(String newCost){
		this.newCost = newCost;
	}
	public String getQty(){
		return qty;
	}
	public void setQty(String qty){
		this.qty = qty;
	}
	public String getAmount(){
		return amount;
	}
	public void setAmount(String amount){
		this.amount = amount;
	}
	public Long getBatchSeries(){
		return batchSeries;
	}
	public void setBatchSeries(Long batchSeries){
		this.batchSeries = batchSeries;
	}
	public Long getBatchPromotiongrade(){
		return batchPromotiongrade;
	}
	public void setBatchPromotiongrade(Long batchPromotiongrade){
		this.batchPromotiongrade = batchPromotiongrade;
	}
	public Integer getBatchSupplyunitnumid(){
		return batchSupplyunitnumid;
	}
	public void setBatchSupplyunitnumid(Integer batchSupplyunitnumid){
		this.batchSupplyunitnumid = batchSupplyunitnumid;
	}
	public String getBatchPoprice(){
		return batchPoprice;
	}
	public void setBatchPoprice(String batchPoprice){
		this.batchPoprice = batchPoprice;
	}
	public Long getSupPromotiongrade(){
		return supPromotiongrade;
	}
	public void setSupPromotiongrade(Long supPromotiongrade){
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
	public String getSupPriec(){
		return supPriec;
	}
	public void setSupPriec(String supPriec){
		this.supPriec = supPriec;
	}
	public String getSupProducedate(){
		return supProducedate;
	}
	public void setSupProducedate(String supProducedate){
		this.supProducedate = supProducedate;
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
	public String getItemid(){
		return itemid;
	}
	public void setItemid(String itemid){
		this.itemid = itemid;
	}
}
