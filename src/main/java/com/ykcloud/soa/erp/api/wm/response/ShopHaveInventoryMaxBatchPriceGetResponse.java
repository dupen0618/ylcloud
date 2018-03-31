package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
//取门店有库存最高批次价格，用于直送、直通供应商退货的出参
public class ShopHaveInventoryMaxBatchPriceGetResponse extends MessagePack {
	
	    private  Double price; //价格

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}
	     
	     

}
