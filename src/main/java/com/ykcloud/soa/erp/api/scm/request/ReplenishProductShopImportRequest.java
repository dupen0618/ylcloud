package com.ykcloud.soa.erp.api.scm.request;

import java.util.List;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.ImportReplenishProductShop;

public class ReplenishProductShopImportRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 1L;

	private List<ImportReplenishProductShop> importReplenishProductShop;

	public List<ImportReplenishProductShop> getImportReplenishProductShop() {
		return importReplenishProductShop;
	}

	public void setImportReplenishProductShop(List<ImportReplenishProductShop> importReplenishProductShop) {
		this.importReplenishProductShop = importReplenishProductShop;
	}

}
