package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

//日销售门店商品销售数量及促销销售数量统计的出参类
public class ShopProductDailySellQtyGetResponse extends MessagePack {

	private static final long serialVersionUID = 1L;

	private Double qty; // 日销量

	private Double dmQty; // DM销量

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getDmQty() {
		return dmQty;
	}

	public void setDmQty(Double dmQty) {
		this.dmQty = dmQty;
	}

}
