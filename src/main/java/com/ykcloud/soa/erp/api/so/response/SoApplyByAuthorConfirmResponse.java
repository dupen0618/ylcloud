package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.LackInventoryProduct;
//制单确认（仓间调拨、委外分解领用、政领料领用)的出参
public class SoApplyByAuthorConfirmResponse extends MessagePack {
	
	 
		private static final long serialVersionUID = 1L;
		private List<LackInventoryProduct> lackInventoryProducts;//缺货商品列表

		public List<LackInventoryProduct> getLackInventoryProducts() {
			return lackInventoryProducts;
		}

		public void setLackInventoryProducts(List<LackInventoryProduct> lackInventoryProducts) {
			this.lackInventoryProducts = lackInventoryProducts;
		}
	  
	  

}
