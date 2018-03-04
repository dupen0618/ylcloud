package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

//获取供应商品赠品数量
public class GiftQtyByGiftRelationGetResponse extends MessagePack {

	private static final long serialVersionUID = -3621634900229807547L;
	
	//赠品数量
	private Double giftQty;

	public Double getGiftQty() {
		return giftQty;
	}

	public void setGiftQty(Double giftQty) {
		this.giftQty = giftQty;
	}
	

}
