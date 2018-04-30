package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

//在途入账前销账列表
public class InTransitWriteoffBeforeDeposit implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long subUnitNumId;// 补货门店

	private String billId;// soNumId

	private String billLine;// soLine 0-代表此单号下面所有行号

	private Long itemNumId; // 商品编号 0-代表此单号下面所有商品

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getBillLine() {
		return billLine;
	}

	public void setBillLine(String billLine) {
		this.billLine = billLine;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

}
