package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

public class CiteDtl implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long typeNumId;   //1：直通退货调拨(验收单） 2：直通退仓（负出库单）
	
	private String citeReservedNo; //出库/验收单号
	
	private String  citeLine;  //出库/验收单行号
	
	private Long itemNumId;   //商品编号
	
	private Double qty;  //数量
	
	private Double pmtQty; //赠品数量

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public String getCiteReservedNo() {
		return citeReservedNo;
	}

	public void setCiteReservedNo(String citeReservedNo) {
		this.citeReservedNo = citeReservedNo;
	}

	public String getCiteLine() {
		return citeLine;
	}

	public void setCiteLine(String citeLine) {
		this.citeLine = citeLine;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getPmtQty() {
		return pmtQty;
	}

	public void setPmtQty(Double pmtQty) {
		this.pmtQty = pmtQty;
	}
	
	
	
	

}
