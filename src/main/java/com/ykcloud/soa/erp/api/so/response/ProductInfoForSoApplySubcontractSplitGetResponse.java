package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.SoApplyProduct;
//委外分解领料商品查询的出参
public class ProductInfoForSoApplySubcontractSplitGetResponse extends MessagePack {
		
		private List<SoApplyProduct> soApplyProducts;

		public List<SoApplyProduct> getSoApplyProducts() {
			return soApplyProducts;
		}

		public void setSoApplyProducts(List<SoApplyProduct> soApplyProducts) {
			this.soApplyProducts = soApplyProducts;
		}
	     
	     
}
