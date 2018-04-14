package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class WmShipDtlWithNoBatchUpdateResponse extends MessagePack {

	private static final long serialVersionUID = 1L;

	//托盘商品数量，就是传人的itemNumId对应的商品数量
	private Double containerProductPackingQty;
	
	//托盘里所有商品的数量
	private Double containerPackingQty;
	
	//订单数量，就是传人的itemNumId对应的lock商品数量
	private Double soLockQty;
	
	//订单数量，就是传人的itemNumId对应的packing商品数量
	private Double soPackingQty;
	
	//订单总数量的lock数量
	private Double soProductLockQty;
	
	//订单总数量的packing数量k数量
	private Double soProductPackingQty;

	
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

	public Double getSoProductLockQty() {
		return soProductLockQty;
	}

	public void setSoProductLockQty(Double soProductLockQty) {
		this.soProductLockQty = soProductLockQty;
	}

	public Double getSoPackingQty() {
		return soPackingQty;
	}

	public void setSoPackingQty(Double soPackingQty) {
		this.soPackingQty = soPackingQty;
	}

	public Double getSoProductPackingQty() {
		return soProductPackingQty;
	}

	public void setSoProductPackingQty(Double soProductPackingQty) {
		this.soProductPackingQty = soProductPackingQty;
	}
	
	
	
	
	
}
