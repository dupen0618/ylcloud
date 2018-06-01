package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

/**
 * @Description:退货审批单
 * @author Song
 * @Date 2018年5月31日 下午8:02:10
 */
public class ImportReturnApprovalDtl implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long itemNumId;  //商品编号
	
	private String itemid;   //商家编号
	
	private String barcode;  //条形码
	
	private Double qty;    //数量
	
	private Double packageQty; //件数

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
