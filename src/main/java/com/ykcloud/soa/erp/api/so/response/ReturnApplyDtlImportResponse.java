package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.ImportReturnApplyDtlError;

public class ReturnApplyDtlImportResponse extends MessagePack {
	private static final long serialVersionUID = 1L;
	
	List<ImportReturnApplyDtlError> errors;

}
