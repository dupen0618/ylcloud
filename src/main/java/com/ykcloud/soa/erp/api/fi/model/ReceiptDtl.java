package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:可结算验收入库明细(验收入库汇总单体(到供应商批次))
 * @author Song
 * @Date 2018年4月4日 下午3:25:31
 */
public class ReceiptDtl implements Serializable {

	private static final long serialVersionUID = 1L;

	private String series;// 行号

	private Long sub_unit_num_id;// 门店

	private Double conversion_qty;// 件装数

	private Long version_unit_num_id;// 件装单位

	private Long conversion_style_desc;// 件装规格

	private Double package_qty;// 件数

	private Double cite_qty;// 引用数量

	private Double qty;// 数量

	private Date first_rec_date;// 首次验收入库日期

	private Double total_amount;// 金额

	private Double tax_rate;// 税率

	private Double tax_amount;// 税金

	private Long create_user_id;// 操作人

	private Long type_num_id;// 业务类型

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Long getSub_unit_num_id() {
		return sub_unit_num_id;
	}

	public void setSub_unit_num_id(Long sub_unit_num_id) {
		this.sub_unit_num_id = sub_unit_num_id;
	}

	public Double getConversion_qty() {
		return conversion_qty;
	}

	public void setConversion_qty(Double conversion_qty) {
		this.conversion_qty = conversion_qty;
	}

	public Long getVersion_unit_num_id() {
		return version_unit_num_id;
	}

	public void setVersion_unit_num_id(Long version_unit_num_id) {
		this.version_unit_num_id = version_unit_num_id;
	}

	public Long getConversion_style_desc() {
		return conversion_style_desc;
	}

	public void setConversion_style_desc(Long conversion_style_desc) {
		this.conversion_style_desc = conversion_style_desc;
	}

	public Double getPackage_qty() {
		return package_qty;
	}

	public void setPackage_qty(Double package_qty) {
		this.package_qty = package_qty;
	}

	public Double getCite_qty() {
		return cite_qty;
	}

	public void setCite_qty(Double cite_qty) {
		this.cite_qty = cite_qty;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Date getFirst_rec_date() {
		return first_rec_date;
	}

	public void setFirst_rec_date(Date first_rec_date) {
		this.first_rec_date = first_rec_date;
	}

	public Double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(Double total_amount) {
		this.total_amount = total_amount;
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

	public Long getCreate_user_id() {
		return create_user_id;
	}

	public void setCreate_user_id(Long create_user_id) {
		this.create_user_id = create_user_id;
	}

	public Long getType_num_id() {
		return type_num_id;
	}

	public void setType_num_id(Long type_num_id) {
		this.type_num_id = type_num_id;
	}

}
