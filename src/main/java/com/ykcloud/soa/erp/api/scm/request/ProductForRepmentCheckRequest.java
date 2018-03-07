package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class ProductForRepmentCheckRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;
	@NotNull(message = "适用季节编号不能为空！")
	private String seasonMonthFlag;

	@NotEmpty(message = "补货动作不能为空！")
	private String action;

	@NotNull(message = "商品状态ID不能为空！")
	private Long itemStatusId;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@NotNull(message = "供应编号不能为空！")
	private Long supplyUnitNumId;

	@NotNull(message = "商品编号不能为空！")
	private Long itemNumId;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空！")
	private Date orderDate;

	public String getSeasonMonthFlag() {
		return seasonMonthFlag;
	}

	public void setSeasonMonthFlag(String seasonMonthFlag) {
		this.seasonMonthFlag = seasonMonthFlag;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Long getItemStatusId() {
		return itemStatusId;
	}

	public void setItemStatusId(Long itemStatusId) {
		this.itemStatusId = itemStatusId;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

}
