package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ImportWmBlStocktakingDtlError;

public class WmBlStocktakingDtlImportResponse extends MessagePack {

	private static final long serialVersionUID = 1L;

	private List<ImportWmBlStocktakingDtlError> importErrors;

	public List<ImportWmBlStocktakingDtlError> getImportErrors() {
		return importErrors;
	}

	public void setImportErrors(List<ImportWmBlStocktakingDtlError> importErrors) {
		this.importErrors = importErrors;
	}

}
