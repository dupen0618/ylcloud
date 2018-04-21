package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.SoApplyProduct;
//店内调拨、行政领料商品查询的出参
public class ProductInfoForSoApplyGetResponse extends MessagePack {

		private List<SoApplyProduct> soApplyProducts;

		public List<SoApplyProduct> getSoApplyProducts() {
			return soApplyProducts;
		}

		public void setSoApplyProducts(List<SoApplyProduct> soApplyProducts) {
			this.soApplyProducts = soApplyProducts;
		}
		
		
		
				
				
}
