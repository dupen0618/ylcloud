package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class SoDtlQtyAndPackingQtyGetBySoNumIdAndItemIdReponse extends MessagePack {

	private Long qty;
	
	private Long packingQty;

	public Long getQty() {
		return qty;
	}

	public void setQty(Long qty) {
		this.qty = qty;
	}

	public Long getPackingQty() {
		return packingQty;
	}

	public void setPackingQty(Long packingQty) {
		this.packingQty = packingQty;
	}
	
	
}
