package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.gb.soa.omp.ccommon.api.annotation.ApiField;

/**
 * 进价调整单导入明细
 * @author tz.x
 * @date 2018年7月9日上午10:03:17
 */
public class ChangeCostImportDetail implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotBlank(message  = "调价业务单号不能为空!")
	private String reservedId;
	
	@NotNull(message = "调整类型不能为空!")
	private Long typeNumId;
	
	@ApiField(description = "备注")
	private String remark;
	
	@NotNull(message = "签订日期不能为空!")
	private Date makeDate;
	
	@ApiField(description = "起始日期")
	private Date beginDay;
	
	@ApiField(description = "截止日期")
	private Date endDay;
	
	@ApiField(description = "适用销售起始日期")
	private Date salesBeginDay;
	
	@ApiField(description = "适用销售截至日期")
	private Date salesEndDay;
	
	@ApiField(description = "调整销售成本标识")
	private Long upSellFlag;
	
	@NotNull(message = "单据状态不能为空!")
	private Long statusNumId;
	
	@NotNull(message = "商品部类不能为空!")
	private Long divID;
	
	@ApiField(description = "调整库存成本标识")
	private Long upCostFlag;
	
	@ApiField(description = "是否同时修改最新进货价")
	private Long latelyCostFlag;
	
	@NotBlank(message = "商品商家编码不能为空!")
	private String itemid;
	
	@NotNull(message = "原进价不能为空!")
	private Double ordCost;
	
	@NotNull(message = "新进价不能为空!")
	private Double newCost;
	
	@NotNull(message = "供应商不能为空!")
	private String supplyUnitId;
	
	public Double getNewCost() {
		return newCost;
	}

	public void setNewCost(Double newCost) {
		this.newCost = newCost;
	}

	public String getSupplyUnitId() {
		return supplyUnitId;
	}

	public void setSupplyUnitId(String supplyUnitId) {
		this.supplyUnitId = supplyUnitId;
	}

	public String getReservedId() {
		return reservedId;
	}

	public void setReservedId(String reservedId) {
		this.reservedId = reservedId;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public Date getSalesBeginDay() {
		return salesBeginDay;
	}

	public void setSalesBeginDay(Date salesBeginDay) {
		this.salesBeginDay = salesBeginDay;
	}

	public Date getSalesEndDay() {
		return salesEndDay;
	}

	public void setSalesEndDay(Date salesEndDay) {
		this.salesEndDay = salesEndDay;
	}

	public Long getUpSellFlag() {
		return upSellFlag;
	}

	public void setUpSellFlag(Long upSellFlag) {
		this.upSellFlag = upSellFlag;
	}

	public Long getStatusNumId() {
		return statusNumId;
	}

	public void setStatusNumId(Long statusNumId) {
		this.statusNumId = statusNumId;
	}

	public Long getDivID() {
		return divID;
	}

	public void setDivID(Long divID) {
		this.divID = divID;
	}

	public Long getUpCostFlag() {
		return upCostFlag;
	}

	public void setUpCostFlag(Long upCostFlag) {
		this.upCostFlag = upCostFlag;
	}

	public Long getLatelyCostFlag() {
		return latelyCostFlag;
	}

	public void setLatelyCostFlag(Long latelyCostFlag) {
		this.latelyCostFlag = latelyCostFlag;
	}

	public Double getOrdCost() {
		return ordCost;
	}

	public void setOrdCost(Double ordCost) {
		this.ordCost = ordCost;
	}

}
