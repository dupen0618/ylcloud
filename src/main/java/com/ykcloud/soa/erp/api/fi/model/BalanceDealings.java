package com.ykcloud.soa.erp.api.fi.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/*
* @Author:ALi
* @Description: 供应商往来
*/
public class BalanceDealings implements Serializable {
	private static final long serialVersionUID = 1L;
	private String series; // 行号
	private Long subUnitNumId; // 门店 分库标识
	private String subUnitName;//门店名称
	private String reservedNo; // 单据编号 fi_bl_sup_cut_hdr
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date operatDate; // 业务日期
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date orderDate; // 业务日期
	private Long pty_num_3; // 小类
	private String pty_num_3_name; // 小类名称
	private Double old_cost_amount;
	private Double old_Tax_amount;
	private Double old_Tax_rate;
	private Double new_cost_amount;
	private Double new_Tax_amount;
	private Double new_Tax_rate;

	private Double taxAmount; // 税金
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
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
	public Date getOperatDate() {
		return operatDate;
	}
	public void setOperatDate(Date operatDate) {
		this.operatDate = operatDate;
	}
	public Double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public String getSubUnitName() {
		return subUnitName;
	}

	public void setSubUnitName(String subUnitName) {
		this.subUnitName = subUnitName;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Double getOld_cost_amount() {
		return old_cost_amount;
	}

	public void setOld_cost_amount(Double old_cost_amount) {
		this.old_cost_amount = old_cost_amount;
	}

	public Double getOld_Tax_amount() {
		return old_Tax_amount;
	}

	public void setOld_Tax_amount(Double old_Tax_amount) {
		this.old_Tax_amount = old_Tax_amount;
	}

	public Double getOld_Tax_rate() {
		return old_Tax_rate;
	}

	public void setOld_Tax_rate(Double old_Tax_rate) {
		this.old_Tax_rate = old_Tax_rate;
	}

	public Double getNew_cost_amount() {
		return new_cost_amount;
	}

	public void setNew_cost_amount(Double new_cost_amount) {
		this.new_cost_amount = new_cost_amount;
	}

	public Double getNew_Tax_amount() {
		return new_Tax_amount;
	}

	public void setNew_Tax_amount(Double new_Tax_amount) {
		this.new_Tax_amount = new_Tax_amount;
	}

	public Double getNew_Tax_rate() {
		return new_Tax_rate;
	}

	public void setNew_Tax_rate(Double new_Tax_rate) {
		this.new_Tax_rate = new_Tax_rate;
	}

	public Long getPty_num_3() {
		return pty_num_3;
	}

	public void setPty_num_3(Long pty_num_3) {
		this.pty_num_3 = pty_num_3;
	}

	public String getPty_num_3_name() {
		return pty_num_3_name;
	}

	public void setPty_num_3_name(String pty_num_3_name) {
		this.pty_num_3_name = pty_num_3_name;
	}
}
