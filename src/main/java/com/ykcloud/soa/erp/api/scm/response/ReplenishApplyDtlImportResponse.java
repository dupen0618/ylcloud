package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ImportReplenishApplyDtlError;

public class ReplenishApplyDtlImportResponse extends MessagePack {
	private static final long serialVersionUID = 1L;
	
	private List<ImportReplenishApplyDtlError> errors;

	public List<ImportReplenishApplyDtlError> getErrors() {
		return errors;
	}

	public void setErrors(List<ImportReplenishApplyDtlError> errors) {
		this.errors = errors;
	}
	
	

}
