package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ImportWmBlStocktakingDtlError;

public class WmBlStocktakingDtlImportResponse extends MessagePack {

	private static final long serialVersionUID = 1L;

	private List<ImportWmBlStocktakingDtlError> importWmBlStocktakingDtlErrors;

	public List<ImportWmBlStocktakingDtlError> getImportWmBlStocktakingDtlErrors() {
		return importWmBlStocktakingDtlErrors;
	}

	public void setImportWmBlStocktakingDtlErrors(List<ImportWmBlStocktakingDtlError> importWmBlStocktakingDtlErrors) {
		this.importWmBlStocktakingDtlErrors = importWmBlStocktakingDtlErrors;
	}

}
