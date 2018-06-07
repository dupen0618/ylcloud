/**
 * 
 */
package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 期初库库导入错误明细
 * @author 殷剑
 * @date 2018/6/6 20:30
 */
public class ImportBeginError implements Serializable {

	private static final long serialVersionUID = 7757171713507109887L;
	
	/**
	 * 外部供应商
	 */
	private String unitId;
	
	/**
	 * 门店
	 */
	private Long subUnitId;
	
	/**
	 * 商品编号
	 */
	private Long itemNumId;
	
	/**
	 * 商品sku
	 */
	private String itemid;
	
	/**
	 * 商品条码
	 */
	private String barcode;
	
	//促销标识
	private Long pmtSign;
	
	//税率
	private Double taxRate;
	
	//生产日期
	private Date produceDate;
	
	//结算方式
	private Long settlementType;
	
	//数量
	private Double qty;
	
	/**
	 * 出错信息
	 */
	private String importError;
	
	
	public Long getSubUnitId() {
		return subUnitId;
	}

	public void setSubUnitId(Long subUnitId) {
		this.subUnitId = subUnitId;
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

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getImportError() {
		return importError;
	}

	public void setImportError(String importError) {
		this.importError = importError;
	}

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public Long getPmtSign() {
		return pmtSign;
	}

	public void setPmtSign(Long pmtSign) {
		this.pmtSign = pmtSign;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
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

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}
	
}

