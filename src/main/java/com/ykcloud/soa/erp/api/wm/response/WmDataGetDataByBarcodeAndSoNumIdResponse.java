package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class WmDataGetDataByBarcodeAndSoNumIdResponse extends MessagePack {
	
	private Long itemNumId;
	
	private String itemName;
	
	private Double conversionQty;
	
	private String custSubUnitName;
	
	private String containerSerlno;
	
	private String containerLabserlno;
	
	private Double containerProductPackingQty;
	
	private Double containerPackingQty;
	
	private Double soLockQty;
	
	private Double soPackingQty;
	
	private Double soProductLockQty;
	
	private Double soProductPackingQty;

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getConversionQty() {
		return conversionQty;
	}

	public void setConversionQty(Double conversionQty) {
		this.conversionQty = conversionQty;
	}

	public String getCustSubUnitName() {
		return custSubUnitName;
	}

	public void setCustSubUnitName(String custSubUnitName) {
		this.custSubUnitName = custSubUnitName;
	}

	public String getContainerSerlno() {
		return containerSerlno;
	}

	public void setContainerSerlno(String containerSerlno) {
		this.containerSerlno = containerSerlno;
	}

	public String getContainerLabserlno() {
		return containerLabserlno;
	}

	public void setContainerLabserlno(String containerLabserlno) {
		this.containerLabserlno = containerLabserlno;
	}

	public Double getContainerProductPackingQty() {
		return containerProductPackingQty;
	}

	public void setContainerProductPackingQty(Double containerProductPackingQty) {
		this.containerProductPackingQty = containerProductPackingQty;
	}

	public Double getContainerPackingQty() {
		return containerPackingQty;
	}

	public void setContainerPackingQty(Double containerPackingQty) {
		this.containerPackingQty = containerPackingQty;
	}

	public Double getSoLockQty() {
		return soLockQty;
	}

	public void setSoLockQty(Double soLockQty) {
		this.soLockQty = soLockQty;
	}

	public Double getSoPackingQty() {
		return soPackingQty;
	}

	public void setSoPackingQty(Double soPackingQty) {
		this.soPackingQty = soPackingQty;
	}

	public Double getSoProductLockQty() {
		return soProductLockQty;
	}

	public void setSoProductLockQty(Double soProductLockQty) {
		this.soProductLockQty = soProductLockQty;
	}

	public Double getSoProductPackingQty() {
		return soProductPackingQty;
	}

	public void setSoProductPackingQty(Double soProductPackingQty) {
		this.soProductPackingQty = soProductPackingQty;
	}
	
	

}
