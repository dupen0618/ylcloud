
package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.util.Date;


/**
 * wm_bl_receipt_import_dtl导入明细
 * @author 殷剑
 * @date 2018年5月9日下午2:12:01
 */
public class ImportWmBlReceiptDtl implements Serializable {

	private static final long serialVersionUID = -1594232303597743492L;

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
	private Long subUnitId;
	
	/**
	 * 门店名称
	 */
	private String subUnitName;
	
	/**
	 * 商品编号
	 */
	private Long itemNumId;
	
	/**
	 * 商品sku
	 */
	private String itemid;
	
//	/**
//	 * 商品条码
//	 */
//	private String barcode;
	
	/**
	 * 数量
	 */
	private Double qty;
	
	/**
	 * 建立批次日期
	 */
	private Date produceDate;
	
//	/**
//	 * 件数
//	 */
//	private Double packageQty;
	
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

	public Long getSubUnitId() {
		return subUnitId;
	}

	public void setSubUnitId(Long subUnitId) {
		this.subUnitId = subUnitId;
	}

	public String getSubUnitName() {
		return subUnitName;
	}

	public void setSubUnitName(String subUnitName) {
		this.subUnitName = subUnitName;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
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
	
//	/**
//	 * 门店名称
//	 */
//	private String supplyUnitName;
	
	
}
