package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.BProduct;


public class ProductInfoAndStockGetResponse extends MessagePack {

	private static final long serialVersionUID = 1L;
	
	private BProduct bProduct;

	public BProduct getbProduct() {
		return bProduct;
	}

	public void setbProduct(BProduct bProduct) {
		this.bProduct = bProduct;
	}
}
