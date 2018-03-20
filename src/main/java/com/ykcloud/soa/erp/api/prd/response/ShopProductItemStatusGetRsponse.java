package com.ykcloud.soa.erp.api.prd.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class ShopProductItemStatusGetRsponse extends MessagePack {
	private static final long serialVersionUID = 4128725581778518937L;
	private Long subUnitNumId;
	private Long itemNumId;

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
