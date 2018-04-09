package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;

import com.fasterxml.jackson.databind.util.ArrayBuilders.DoubleBuilder;

/**
 * @Description:获取可结算扣款项明细
 * @author Song
 * @Date 2018年4月4日 下午6:04:35
 */
public class Deduction implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long series;//行号
	
	private Long reservedNo;//扣款单号
	
	private Long sub_unit_num_id;//门店
	
	private Long cut_item;//扣款项目
	
	private String cut_desc;//扣款说明
	
	private Double cut_amount;//扣款金额
	
	private Double tax_rate;//税率
	
	private Double tax_amount;//税金
	
	private int cut_sign;//票扣或账扣；标识：1票扣 2账扣

	public Long getSeries() {
		return series;
	}

	public void setSeries(Long series) {
		this.series = series;
	}

	public Long getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(Long reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getSub_unit_num_id() {
		return sub_unit_num_id;
	}

	public void setSub_unit_num_id(Long sub_unit_num_id) {
		this.sub_unit_num_id = sub_unit_num_id;
	}

	public Long getCut_item() {
		return cut_item;
	}

	public void setCut_item(Long cut_item) {
		this.cut_item = cut_item;
	}

	public String getCut_desc() {
		return cut_desc;
	}

	public void setCut_desc(String cut_desc) {
		this.cut_desc = cut_desc;
	}

	public Double getCut_amount() {
		return cut_amount;
	}

	public void setCut_amount(Double cut_amount) {
		this.cut_amount = cut_amount;
	}

	public Double getTax_rate() {
		return tax_rate;
	}

	public void setTax_rate(Double tax_rate) {
		this.tax_rate = tax_rate;
	}

	public Double getTax_amount() {
		return tax_amount;
	}

	public void setTax_amount(Double tax_amount) {
		this.tax_amount = tax_amount;
	}

	public int getCut_sign() {
		return cut_sign;
	}

	public void setCut_sign(int cut_sign) {
		this.cut_sign = cut_sign;
	}
	
	
	
}
