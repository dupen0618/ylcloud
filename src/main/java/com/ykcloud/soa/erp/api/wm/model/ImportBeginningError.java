package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

/**
 * 期初库存导入错误明细
 * @author tz.x
 * @date 2018年6月8日下午1:40:02
 */
public class ImportBeginningError implements Serializable {

	private static final long serialVersionUID = 4306731004830198521L;
	
	/**
	 * 行号
	 */
	private String series;

	/**
	 * 外部供应商
	 */
	private String unitId;
	
	/**
	 * 补货门店
	 */
	private String subUnitId;
	
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
	
	/**
	 * 出错信息
	 */
	private String importError;

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getSubUnitId() {
		return subUnitId;
	}

	public void setSubUnitId(String subUnitId) {
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

}
