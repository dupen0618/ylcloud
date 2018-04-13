package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.BatchPrice;
//取门店有库存最高批次价格，用于直送、直通供应商退货的出参

public class ShopHaveInventoryMaxBatchPriceGetResponse extends MessagePack {
	private static final long serialVersionUID = 1L;

	private BatchPrice batchPrice;

	public BatchPrice getBatchPrice() {
		return batchPrice;
	}

	public void setBatchPrice(BatchPrice batchPrice) {
		this.batchPrice = batchPrice;
	}
	

	
}
