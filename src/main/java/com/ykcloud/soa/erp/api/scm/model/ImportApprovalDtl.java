package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

/**
 * 订货审批单导入明细
 * @author tz.x
 * @date 2018年5月9日下午2:12:01
 */
public class ImportApprovalDtl implements Serializable {
	
	private static final long serialVersionUID = 4088430661582883734L;
	
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
	private String itemid;
	
	/**
	 * 商品条码
	 */
	private String barcode;
	
	/**
	 * 数量
	 */
	private Double qty;
	
	/**
	 * 件数
	 */
	private Double packageQty;

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

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getPackageQty() {
		return packageQty;
	}

	public void setPackageQty(Double packageQty) {
		this.packageQty = packageQty;
	}

}
