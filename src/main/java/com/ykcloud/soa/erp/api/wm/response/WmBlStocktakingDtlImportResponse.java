package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ImportWmBlStocktakingDtlError;

public class WmBlStocktakingDtlImportResponse extends MessagePack {

	private static final long serialVersionUID = 1L;

	private List<ImportWmBlStocktakingDtlError> importError;

	public List<ImportWmBlStocktakingDtlError> getImportError() {
		return importError;
	}

	public void setImportError(List<ImportWmBlStocktakingDtlError> importError) {
		this.importError = importError;
	}

}
