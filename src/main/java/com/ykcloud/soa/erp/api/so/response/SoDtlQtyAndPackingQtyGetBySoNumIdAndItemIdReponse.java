package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class SoDtlQtyAndPackingQtyGetBySoNumIdAndItemIdReponse extends MessagePack {

	private Double qty;
	
	private Double packingQty;

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getPackingQty() {
		return packingQty;
	}

	public void setPackingQty(Double packingQty) {
		this.packingQty = packingQty;
	}

	
	
	
}
