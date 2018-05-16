package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.ImportSoApplyDtlError;

public class ReturnApplyDtlImportResponse extends MessagePack {
	private static final long serialVersionUID = 1L;
	
	List<ImportSoApplyDtlError> errors;

	public List<ImportSoApplyDtlError> getErrors() {
		return errors;
	}

	public void setErrors(List<ImportSoApplyDtlError> errors) {
		this.errors = errors;
	}
	
	


	

}
