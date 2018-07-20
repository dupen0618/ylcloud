package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ProductShopImportError;

public class ProductShopImportResponse extends MessagePack {

	private static final long serialVersionUID = 8207737852745827526L;
	
	List<ProductShopImportError> ProductShopImportErrors;

	public List<ProductShopImportError> getProductShopImportErrors() {
		return ProductShopImportErrors;
	}

	public void setProductShopImportErrors(List<ProductShopImportError> productShopImportErrors) {
		ProductShopImportErrors = productShopImportErrors;
	}
	
	

}
