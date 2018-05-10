package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

/**
 * 订货审批单导入错误明细
 * @author tz.x
 * @date 2018年5月9日下午2:17:28
 */
public class ImportError implements Serializable {

	private static final long serialVersionUID = 7757171713507109887L;
	
	/**
	 * 补货门店
	 */
	private Long ordSubUnitNumId;
	
	/**
	 * 商品编号
	 */
	private Long itemNumId;
	
	/**
	 * 商品sku
	 */
	private Long itemid;
	
	/**
	 * 商品条码
	 */
	private String barcode;
	
	/**
	 * 出错信息
	 */
	private String error;

	public Long getOrdSubUnitNumId() {
		return ordSubUnitNumId;
	}

	public void setOrdSubUnitNumId(Long ordSubUnitNumId) {
		this.ordSubUnitNumId = ordSubUnitNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getItemid() {
		return itemid;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
