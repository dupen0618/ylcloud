package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class DirectWayOpenDistDeliveryQtyGetResponse extends MessagePack {
	
	private Double openDistDeliveryQty;  //仓库配送数

	public Double getOpenDistDeliveryQty() {
		return openDistDeliveryQty;
	}

	public void setOpenDistDeliveryQty(Double openDistDeliveryQty) {
		this.openDistDeliveryQty = openDistDeliveryQty;
	}
	
	

}
