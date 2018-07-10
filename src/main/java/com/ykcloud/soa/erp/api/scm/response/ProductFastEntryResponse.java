package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ReplenishProduct;

public class ProductFastEntryResponse extends MessagePack {

	/**
	 * 快速录入出参
	 */
	private static final long serialVersionUID = 1L;
	
	private List<ReplenishProduct> replenishProducts;

	public List<ReplenishProduct> getReplenishProducts() {
		return replenishProducts;
	}

	public void setReplenishProducts(List<ReplenishProduct> replenishProducts) {
		this.replenishProducts = replenishProducts;
	}

	
	

}
