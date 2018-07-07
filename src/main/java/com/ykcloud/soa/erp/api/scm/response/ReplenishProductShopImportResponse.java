package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ImportReplenishProductShopError;

public class ReplenishProductShopImportResponse extends MessagePack {

	/**
	 * 导入自动补货参数出参
	 */
	private static final long serialVersionUID = 1L;

	private List<ImportReplenishProductShopError> importProtocalErrors;

	public List<ImportReplenishProductShopError> getImportProtocalErrors() {
		return importProtocalErrors;
	}

	public void setImportProtocalErrors(List<ImportReplenishProductShopError> importProtocalErrors) {
		this.importProtocalErrors = importProtocalErrors;
	}

}
