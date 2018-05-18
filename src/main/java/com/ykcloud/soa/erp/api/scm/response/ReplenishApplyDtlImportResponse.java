package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ImportReplenishApplyDtlError;

public class ReplenishApplyDtlImportResponse extends MessagePack {
	private static final long serialVersionUID = 1L;
	
	private List<ImportReplenishApplyDtlError> importErrors;

	public List<ImportReplenishApplyDtlError> getImportErrors() {
		return importErrors;
	}

	public void setImportErrors(List<ImportReplenishApplyDtlError> importErrors) {
		this.importErrors = importErrors;
	}

	
	
	

}
