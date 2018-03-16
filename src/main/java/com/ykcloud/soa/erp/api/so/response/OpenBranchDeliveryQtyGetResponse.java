package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class OpenBranchDeliveryQtyGetResponse extends MessagePack {
	
	private Double openBranchDeliveryQty; //分仓在途数量

	public Double getOpenBranchDeliveryQty() {
		return openBranchDeliveryQty;
	}

	public void setOpenBranchDeliveryQty(Double openBranchDeliveryQty) {
		this.openBranchDeliveryQty = openBranchDeliveryQty;
	}

	
	
	

}
