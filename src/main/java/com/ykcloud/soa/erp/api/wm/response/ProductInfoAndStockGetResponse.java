package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.BProduct;

import java.util.List;


public class ProductInfoAndStockGetResponse extends MessagePack {

	private static final long serialVersionUID = 1L;
	
	private List<BProduct> list;

	public List<BProduct> getList() {
		return list;
	}

	public void setList(List<BProduct> list) {
		this.list = list;
	}
}
