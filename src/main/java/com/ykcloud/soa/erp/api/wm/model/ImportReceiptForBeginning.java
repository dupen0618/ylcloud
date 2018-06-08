package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 期初库存导入明细
 * @author tz.x
 * @date 2018年6月7日下午4:33:05
 */
public class ImportReceiptForBeginning implements Serializable {

	private static final long serialVersionUID = 830953621236548125L;
	
	/**
	 * 供应商id
	 */
	private String unitId;
	
	/**
	 * 供应商名称
	 */
	private String unitName;
	
	/**
	 * 补货门店
	 */
	private String subUnitId;
	
	/**
	 * 门店名称
	 */
	private String subUnitName;
	
	/**
	 * 商品sku
	 */
	private String itemid;
	
	/**
	 * 数量
	 */
	private Double qty;
	
	/**
	 * 建立批次日期
	 */
	private Date produceDate;
	
	/**
	 * 结算方式
	 */
	private Long settlementType;
	
	/**
	 * 促销标识
	 */
	private Long pmtSign;
	
	/**
	 * 采购价格（含税)
	 */
	private Double price;
	
	/**
	 * 税率
	 */
	private Double taxRate;

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getSubUnitId() {
		return subUnitId;
	}

	public void setSubUnitId(String subUnitId) {
		this.subUnitId = subUnitId;
	}

	public String getSubUnitName() {
		return subUnitName;
	}

	public void setSubUnitName(String subUnitName) {
		this.subUnitName = subUnitName;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Date getProduceDate() {
		return produceDate;
	}

	public void setProduceDate(Date produceDate) {
		this.produceDate = produceDate;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public Long getPmtSign() {
		return pmtSign;
	}

	public void setPmtSign(Long pmtSign) {
		this.pmtSign = pmtSign;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

}
