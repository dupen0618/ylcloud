package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;
/***
 * 商品属性信息
 * @author bi.cai
 * 20180118
 */
public class GoodsInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    private Long itemNumId; //商品编号
    
    private String barcode;//条码
    
    private String itemName; //商品名称
    
  	private Long barcodeTypeNumId; //条码类型
  	
  	private Long sellTypeNumId;//经营类型 1-买断 2代销 3-联营
  	
  	private Long divNumId;//事业部
  	
	private String unitsName;//销售单位
	
	
	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getBarcodeTypeNumId() {
		return barcodeTypeNumId;
	}

	public void setBarcodeTypeNumId(Long barcodeTypeNumId) {
		this.barcodeTypeNumId = barcodeTypeNumId;
	}

	public Long getSellTypeNumId() {
		return sellTypeNumId;
	}

	public void setSellTypeNumId(Long sellTypeNumId) {
		this.sellTypeNumId = sellTypeNumId;
	}

	public Long getDivNumId() {
		return divNumId;
	}

	public void setDivNumId(Long divNumId) {
		this.divNumId = divNumId;
	}

	public String getUnitsName() {
		return unitsName;
	}

	public void setUnitsName(String unitsName) {
		this.unitsName = unitsName;
	}
}
