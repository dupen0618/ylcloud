package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

public class FiBlSupBalanceDtl implements Serializable  {

	private static final long serialVersionUID = 1L;

	private String series;
	/**
	 * 结算单号
	 */
	private String balance_no;

	/**
	 * 门店
	 */
	private Long sub_unit_num_id;

	/**
	 * 结算日期
	 */
	private Date balance_date;

	/**
	 * 单据编号
	 */
	private String reserved_no;

	/**
	 * 单据类型
	 */
	private Long reserved_type_num_id;

	/**
	 * 业务类型
	 */
	private Long type_num_id;

	/**
	 * 业务日期
	 */
	private Date operat_date;


	/**
	 * 商品
	 */
	private Long item_num_id;

	/**
	 * 商品中心（部门）
	 */
	private Long div_num_id;

	/**
	 * 商品条码
	 */
	private String barcode;

	/**
	 * 商品品名
	 */
	private String item_name;

	/**
	 * 产地
	 */
	private Long product_origin_num_id;

	/**
	 * 件装单位
	 */
	private Double conversion_qty;

	/**
	 * 件装规格
	 */
	private String conversion_style_desc;

	/**
	 * 结算价格
	 */
	private Double price;

	/**
	 * 结算金额
	 */
	private Double amount;

	/**
	 * 批次行号
	 */
	private String batch_series;

	/**
	 * 批次促销档期
	 */
	private Long batch_promotion_grade;

	/**
	 * 批次供应商
	 */
	private Long batch_supply_unit_num_id;

	/**
	 * 批次采购价格
	 */
	private Double batch_po_price;

	/**
	 * 税率
	 */
	private Double tax_rate;

	/**
	 * 税金
	 */
	private Double tax_amount;

	/**
	 * 与本币结算汇率
	 */
	private Double exchange_rate;

	/**
	 * 结转标识
	 */
	private Long carry_sign;

	/**
	 * 商品商家编码
	 */
	private String itemid;

	public String getBalance_no() {
		return balance_no;
	}

	public void setBalance_no(String balance_no) {
		this.balance_no = balance_no;
	}

	public Long getSub_unit_num_id() {
		return sub_unit_num_id;
	}

	public void setSub_unit_num_id(Long sub_unit_num_id) {
		this.sub_unit_num_id = sub_unit_num_id;
	}

	public Date getBalance_date() {
		return balance_date;
	}

	public void setBalance_date(Date balance_date) {
		this.balance_date = balance_date;
	}

	public String getReserved_no() {
		return reserved_no;
	}

	public void setReserved_no(String reserved_no) {
		this.reserved_no = reserved_no;
	}

	public Long getReserved_type_num_id() {
		return reserved_type_num_id;
	}

	public void setReserved_type_num_id(Long reserved_type_num_id) {
		this.reserved_type_num_id = reserved_type_num_id;
	}

	public Long getType_num_id() {
		return type_num_id;
	}

	public void setType_num_id(Long type_num_id) {
		this.type_num_id = type_num_id;
	}

	public Date getOperat_date() {
		return operat_date;
	}

	public void setOperat_date(Date operat_date) {
		this.operat_date = operat_date;
	}

	public Long getItem_num_id() {
		return item_num_id;
	}

	public void setItem_num_id(Long item_num_id) {
		this.item_num_id = item_num_id;
	}

	public Long getDiv_num_id() {
		return div_num_id;
	}

	public void setDiv_num_id(Long div_num_id) {
		this.div_num_id = div_num_id;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public Long getProduct_origin_num_id() {
		return product_origin_num_id;
	}

	public void setProduct_origin_num_id(Long product_origin_num_id) {
		this.product_origin_num_id = product_origin_num_id;
	}

	public Double getConversion_qty() {
		return conversion_qty;
	}

	public void setConversion_qty(Double conversion_qty) {
		this.conversion_qty = conversion_qty;
	}

	public String getConversion_style_desc() {
		return conversion_style_desc;
	}

	public void setConversion_style_desc(String conversion_style_desc) {
		this.conversion_style_desc = conversion_style_desc;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getBatch_series() {
		return batch_series;
	}

	public void setBatch_series(String batch_series) {
		this.batch_series = batch_series;
	}

	public Long getBatch_promotion_grade() {
		return batch_promotion_grade;
	}

	public void setBatch_promotion_grade(Long batch_promotion_grade) {
		this.batch_promotion_grade = batch_promotion_grade;
	}

	public Long getBatch_supply_unit_num_id() {
		return batch_supply_unit_num_id;
	}

	public void setBatch_supply_unit_num_id(Long batch_supply_unit_num_id) {
		this.batch_supply_unit_num_id = batch_supply_unit_num_id;
	}

	public Double getBatch_po_price() {
		return batch_po_price;
	}

	public void setBatch_po_price(Double batch_po_price) {
		this.batch_po_price = batch_po_price;
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

	public Double getExchange_rate() {
		return exchange_rate;
	}

	public void setExchange_rate(Double exchange_rate) {
		this.exchange_rate = exchange_rate;
	}

	public Long getCarry_sign() {
		return carry_sign;
	}

	public void setCarry_sign(Long carry_sign) {
		this.carry_sign = carry_sign;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	
}
