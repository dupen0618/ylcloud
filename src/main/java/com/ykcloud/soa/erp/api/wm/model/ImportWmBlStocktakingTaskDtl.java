package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

public class ImportWmBlStocktakingTaskDtl implements Serializable {

	/**
	 * 导入盘点计划单表体
	 */
	private static final long serialVersionUID = 1L;

	private String reservedNo;

	private Long divNumId;

	private Long ptyNum1;

	private Long ptyNum2;

	private Long ptyNum3;

	private Integer settlementType;

	private Long itemNumId;

	private String itemid;

	private String barcode;

	private String itemName;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getDivNumId() {
		return divNumId;
	}

	public void setDivNumId(Long divNumId) {
		this.divNumId = divNumId;
	}

	public Long getPtyNum1() {
		return ptyNum1;
	}

	public void setPtyNum1(Long ptyNum1) {
		this.ptyNum1 = ptyNum1;
	}

	public Long getPtyNum2() {
		return ptyNum2;
	}

	public void setPtyNum2(Long ptyNum2) {
		this.ptyNum2 = ptyNum2;
	}

	public Long getPtyNum3() {
		return ptyNum3;
	}

	public void setPtyNum3(Long ptyNum3) {
		this.ptyNum3 = ptyNum3;
	}

	public Integer getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Integer settlementType) {
		this.settlementType = settlementType;
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

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
