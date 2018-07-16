package com.ykcloud.soa.erp.api.scm.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

/**
 * 
 * @author gaoyun.shen
 *
 * @date 2018年6月22日 下午4:25:20
 * 
 * @Description 门店商品销售属性 excel导入 实体
 */
public class ProductShop {
	@NotNull(message = "商品商家编码不能为空!")
	private String itemid;// 商品商家编码

	@NotNull(message = "适用机构不能为空!")
	private String subUnitId;// 适用机构

	@NotNull(message = "零售价不能为空!")
	private Double retailPrice;// 零售价

	@NotNull(message = "执行售价不能为空!")
	private Double price;// 执行售价

	private Double lastPrice;// 最后一次销售价格

	private String reservedIdForever;// 永久调价单号
	
	private String reservedNoForever;// 永久调价单号

	private Date beginDayForever;// 永久调价起始日期

	private Date endDayForever;// 永久调价截止日期

	private Long typeTemp;// 临时调价单类型(503：DM促销,:502：临时调售价)

	private String reservedIdTemp;// 临时调价单号

	private String reservedNoTemp;// 临时调价单号

	private Date beginDayTemp;// 临时调价起始日期

	private Date endDayTemp;// 临时调价截止日期

	private Double vipPrice;// 会员价

	private String reservedIdVip;// 会员调价单号
	
	private String reservedNoVip;// 会员调价单号

	private Date beginDayVip;// 会员调价起始日期

	private Date endDayVip;// 会员调价截止日期
	
	@NotNull(message = "商品适用季节不能为空!")
	private String seasonMonthFlag;// 商品适用季节'123456789abc',表示全年销售,1200000000bc 标识 11至次年2月销售

	@NotNull(message = "默认供应商经营类型不能为空!")
	private Long settlementType;// 默认供应商经营类型

	@NotNull(message = "库存管理类型不能为空!")
	private Long stockType;// 库存管理类型

	@NotNull(message = "所属仓库部门不能为空!")
	private Long storageDeptNumId;// 所属仓库部门

	@NotNull(message = "部门编号不能为空!")
	private Long departNumId;// 部门编号

	private Long bomNumId;// Bom编码

	private Long modifyPrice;// 是否可以改价

	@NotNull(message = "商品状态ID不能为空!")
	private Long itemStatusId;// 商品状态ID

	private Long itemGrade;// 商品等级

	@NotNull(message = "默认供应商编码不能为空!")
	private Long supplyUnitId;// 默认供应商编码
	

	public String getReservedNoForever() {
		return reservedNoForever;
	}

	public void setReservedNoForever(String reservedNoForever) {
		this.reservedNoForever = reservedNoForever;
	}


	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}


	public String getSubUnitId() {
		return subUnitId;
	}

	public void setSubUnitId(String subUnitId) {
		this.subUnitId = subUnitId;
	}

	public Double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(Double lastPrice) {
		this.lastPrice = lastPrice;
	}

	public String getReservedIdForever() {
		return reservedIdForever;
	}

	public void setReservedIdForever(String reservedIdForever) {
		this.reservedIdForever = reservedIdForever;
	}

	public Date getBeginDayForever() {
		return beginDayForever;
	}

	public void setBeginDayForever(Date beginDayForever) {
		this.beginDayForever = beginDayForever;
	}

	public Date getEndDayForever() {
		return endDayForever;
	}

	public void setEndDayForever(Date endDayForever) {
		this.endDayForever = endDayForever;
	}

	public Long getTypeTemp() {
		return typeTemp;
	}

	public void setTypeTemp(Long typeTemp) {
		this.typeTemp = typeTemp;
	}


	public Date getBeginDayTemp() {
		return beginDayTemp;
	}

	public void setBeginDayTemp(Date beginDayTemp) {
		this.beginDayTemp = beginDayTemp;
	}

	public Date getEndDayTemp() {
		return endDayTemp;
	}

	public void setEndDayTemp(Date endDayTemp) {
		this.endDayTemp = endDayTemp;
	}

	public Double getVipPrice() {
		return vipPrice;
	}

	public void setVipPrice(Double vipPrice) {
		this.vipPrice = vipPrice;
	}


	public String getReservedIdTemp() {
		return reservedIdTemp;
	}

	public void setReservedIdTemp(String reservedIdTemp) {
		this.reservedIdTemp = reservedIdTemp;
	}

	public String getReservedNoTemp() {
		return reservedNoTemp;
	}

	public void setReservedNoTemp(String reservedNoTemp) {
		this.reservedNoTemp = reservedNoTemp;
	}

	public String getReservedIdVip() {
		return reservedIdVip;
	}

	public void setReservedIdVip(String reservedIdVip) {
		this.reservedIdVip = reservedIdVip;
	}

	public String getReservedNoVip() {
		return reservedNoVip;
	}

	public void setReservedNoVip(String reservedNoVip) {
		this.reservedNoVip = reservedNoVip;
	}

	public Date getBeginDayVip() {
		return beginDayVip;
	}

	public void setBeginDayVip(Date beginDayVip) {
		this.beginDayVip = beginDayVip;
	}

	public Date getEndDayVip() {
		return endDayVip;
	}

	public void setEndDayVip(Date endDayVip) {
		this.endDayVip = endDayVip;
	}

	public String getSeasonMonthFlag() {
		return seasonMonthFlag;
	}

	public void setSeasonMonthFlag(String seasonMonthFlag) {
		this.seasonMonthFlag = seasonMonthFlag;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public Long getStockType() {
		return stockType;
	}

	public void setStockType(Long stockType) {
		this.stockType = stockType;
	}

	public Long getStorageDeptNumId() {
		return storageDeptNumId;
	}

	public void setStorageDeptNumId(Long storageDeptNumId) {
		this.storageDeptNumId = storageDeptNumId;
	}

	public Long getDepartNumId() {
		return departNumId;
	}

	public void setDepartNumId(Long departNumId) {
		this.departNumId = departNumId;
	}

	public Long getBomNumId() {
		return bomNumId;
	}

	public void setBomNumId(Long bomNumId) {
		this.bomNumId = bomNumId;
	}

	public Long getModifyPrice() {
		return modifyPrice;
	}

	public void setModifyPrice(Long modifyPrice) {
		this.modifyPrice = modifyPrice;
	}

	public Long getItemStatusId() {
		return itemStatusId;
	}

	public void setItemStatusId(Long itemStatusId) {
		this.itemStatusId = itemStatusId;
	}

	public Long getItemGrade() {
		return itemGrade;
	}

	public void setItemGrade(Long itemGrade) {
		this.itemGrade = itemGrade;
	}

	public Long getSupplyUnitId() {
		return supplyUnitId;
	}

	public void setSupplyUnitId(Long supplyUnitId) {
		this.supplyUnitId = supplyUnitId;
	}

	@Override
	public String toString() {
		return this.itemid + "," + this.subUnitId;
	}
}
